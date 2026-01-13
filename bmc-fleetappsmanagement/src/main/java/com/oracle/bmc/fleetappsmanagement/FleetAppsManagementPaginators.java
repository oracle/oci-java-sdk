/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FleetAppsManagement where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementPaginators {
    private final FleetAppsManagement client;

    public FleetAppsManagementPaginators(FleetAppsManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAnnouncements operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAnnouncementsResponse> listAnnouncementsResponseIterator(
            final ListAnnouncementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAnnouncementsRequest.Builder,
                ListAnnouncementsRequest,
                ListAnnouncementsResponse>(
                new java.util.function.Supplier<ListAnnouncementsRequest.Builder>() {
                    @Override
                    public ListAnnouncementsRequest.Builder get() {
                        return ListAnnouncementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAnnouncementsResponse, String>() {
                    @Override
                    public String apply(ListAnnouncementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAnnouncementsRequest.Builder>,
                        ListAnnouncementsRequest>() {
                    @Override
                    public ListAnnouncementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAnnouncementsRequest.Builder>
                                    input) {
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
                        ListAnnouncementsRequest, ListAnnouncementsResponse>() {
                    @Override
                    public ListAnnouncementsResponse apply(ListAnnouncementsRequest request) {
                        return client.listAnnouncements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary} objects contained in responses
     * from the listAnnouncements operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary>
            listAnnouncementsRecordIterator(final ListAnnouncementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAnnouncementsRequest.Builder,
                ListAnnouncementsRequest,
                ListAnnouncementsResponse,
                com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary>(
                new java.util.function.Supplier<ListAnnouncementsRequest.Builder>() {
                    @Override
                    public ListAnnouncementsRequest.Builder get() {
                        return ListAnnouncementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAnnouncementsResponse, String>() {
                    @Override
                    public String apply(ListAnnouncementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAnnouncementsRequest.Builder>,
                        ListAnnouncementsRequest>() {
                    @Override
                    public ListAnnouncementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAnnouncementsRequest.Builder>
                                    input) {
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
                        ListAnnouncementsRequest, ListAnnouncementsResponse>() {
                    @Override
                    public ListAnnouncementsResponse apply(ListAnnouncementsRequest request) {
                        return client.listAnnouncements(request);
                    }
                },
                new java.util.function.Function<
                        ListAnnouncementsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.AnnouncementSummary>
                            apply(ListAnnouncementsResponse response) {
                        return response.getAnnouncementCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFleetCredentials operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetCredentialsResponse> listFleetCredentialsResponseIterator(
            final ListFleetCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetCredentialsRequest.Builder,
                ListFleetCredentialsRequest,
                ListFleetCredentialsResponse>(
                new java.util.function.Supplier<ListFleetCredentialsRequest.Builder>() {
                    @Override
                    public ListFleetCredentialsRequest.Builder get() {
                        return ListFleetCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetCredentialsResponse, String>() {
                    @Override
                    public String apply(ListFleetCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetCredentialsRequest.Builder>,
                        ListFleetCredentialsRequest>() {
                    @Override
                    public ListFleetCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetCredentialsRequest.Builder>
                                    input) {
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
                        ListFleetCredentialsRequest, ListFleetCredentialsResponse>() {
                    @Override
                    public ListFleetCredentialsResponse apply(ListFleetCredentialsRequest request) {
                        return client.listFleetCredentials(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSummary} objects contained in
     * responses from the listFleetCredentials operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSummary>
            listFleetCredentialsRecordIterator(final ListFleetCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetCredentialsRequest.Builder,
                ListFleetCredentialsRequest,
                ListFleetCredentialsResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSummary>(
                new java.util.function.Supplier<ListFleetCredentialsRequest.Builder>() {
                    @Override
                    public ListFleetCredentialsRequest.Builder get() {
                        return ListFleetCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetCredentialsResponse, String>() {
                    @Override
                    public String apply(ListFleetCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetCredentialsRequest.Builder>,
                        ListFleetCredentialsRequest>() {
                    @Override
                    public ListFleetCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetCredentialsRequest.Builder>
                                    input) {
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
                        ListFleetCredentialsRequest, ListFleetCredentialsResponse>() {
                    @Override
                    public ListFleetCredentialsResponse apply(ListFleetCredentialsRequest request) {
                        return client.listFleetCredentials(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetCredentialsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model
                                        .FleetCredentialSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSummary>
                            apply(ListFleetCredentialsResponse response) {
                        return response.getFleetCredentialCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFleetProducts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetProductsResponse> listFleetProductsResponseIterator(
            final ListFleetProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetProductsRequest.Builder,
                ListFleetProductsRequest,
                ListFleetProductsResponse>(
                new java.util.function.Supplier<ListFleetProductsRequest.Builder>() {
                    @Override
                    public ListFleetProductsRequest.Builder get() {
                        return ListFleetProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetProductsResponse, String>() {
                    @Override
                    public String apply(ListFleetProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetProductsRequest.Builder>,
                        ListFleetProductsRequest>() {
                    @Override
                    public ListFleetProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetProductsRequest.Builder>
                                    input) {
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
                        ListFleetProductsRequest, ListFleetProductsResponse>() {
                    @Override
                    public ListFleetProductsResponse apply(ListFleetProductsRequest request) {
                        return client.listFleetProducts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary} objects contained in responses
     * from the listFleetProducts operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary>
            listFleetProductsRecordIterator(final ListFleetProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetProductsRequest.Builder,
                ListFleetProductsRequest,
                ListFleetProductsResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary>(
                new java.util.function.Supplier<ListFleetProductsRequest.Builder>() {
                    @Override
                    public ListFleetProductsRequest.Builder get() {
                        return ListFleetProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetProductsResponse, String>() {
                    @Override
                    public String apply(ListFleetProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetProductsRequest.Builder>,
                        ListFleetProductsRequest>() {
                    @Override
                    public ListFleetProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetProductsRequest.Builder>
                                    input) {
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
                        ListFleetProductsRequest, ListFleetProductsResponse>() {
                    @Override
                    public ListFleetProductsResponse apply(ListFleetProductsRequest request) {
                        return client.listFleetProducts(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetProductsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetProductSummary>
                            apply(ListFleetProductsResponse response) {
                        return response.getFleetProductCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFleetProperties operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetPropertiesResponse> listFleetPropertiesResponseIterator(
            final ListFleetPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetPropertiesRequest.Builder,
                ListFleetPropertiesRequest,
                ListFleetPropertiesResponse>(
                new java.util.function.Supplier<ListFleetPropertiesRequest.Builder>() {
                    @Override
                    public ListFleetPropertiesRequest.Builder get() {
                        return ListFleetPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetPropertiesResponse, String>() {
                    @Override
                    public String apply(ListFleetPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetPropertiesRequest.Builder>,
                        ListFleetPropertiesRequest>() {
                    @Override
                    public ListFleetPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetPropertiesRequest.Builder>
                                    input) {
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
                        ListFleetPropertiesRequest, ListFleetPropertiesResponse>() {
                    @Override
                    public ListFleetPropertiesResponse apply(ListFleetPropertiesRequest request) {
                        return client.listFleetProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary} objects contained in responses
     * from the listFleetProperties operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary>
            listFleetPropertiesRecordIterator(final ListFleetPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetPropertiesRequest.Builder,
                ListFleetPropertiesRequest,
                ListFleetPropertiesResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary>(
                new java.util.function.Supplier<ListFleetPropertiesRequest.Builder>() {
                    @Override
                    public ListFleetPropertiesRequest.Builder get() {
                        return ListFleetPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetPropertiesResponse, String>() {
                    @Override
                    public String apply(ListFleetPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetPropertiesRequest.Builder>,
                        ListFleetPropertiesRequest>() {
                    @Override
                    public ListFleetPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetPropertiesRequest.Builder>
                                    input) {
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
                        ListFleetPropertiesRequest, ListFleetPropertiesResponse>() {
                    @Override
                    public ListFleetPropertiesResponse apply(ListFleetPropertiesRequest request) {
                        return client.listFleetProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetPropertiesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetPropertySummary>
                            apply(ListFleetPropertiesResponse response) {
                        return response.getFleetPropertyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFleetResources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetResourcesResponse> listFleetResourcesResponseIterator(
            final ListFleetResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetResourcesRequest.Builder,
                ListFleetResourcesRequest,
                ListFleetResourcesResponse>(
                new java.util.function.Supplier<ListFleetResourcesRequest.Builder>() {
                    @Override
                    public ListFleetResourcesRequest.Builder get() {
                        return ListFleetResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetResourcesResponse, String>() {
                    @Override
                    public String apply(ListFleetResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetResourcesRequest.Builder>,
                        ListFleetResourcesRequest>() {
                    @Override
                    public ListFleetResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetResourcesRequest.Builder>
                                    input) {
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
                        ListFleetResourcesRequest, ListFleetResourcesResponse>() {
                    @Override
                    public ListFleetResourcesResponse apply(ListFleetResourcesRequest request) {
                        return client.listFleetResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary} objects contained in responses
     * from the listFleetResources operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary>
            listFleetResourcesRecordIterator(final ListFleetResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetResourcesRequest.Builder,
                ListFleetResourcesRequest,
                ListFleetResourcesResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary>(
                new java.util.function.Supplier<ListFleetResourcesRequest.Builder>() {
                    @Override
                    public ListFleetResourcesRequest.Builder get() {
                        return ListFleetResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetResourcesResponse, String>() {
                    @Override
                    public String apply(ListFleetResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetResourcesRequest.Builder>,
                        ListFleetResourcesRequest>() {
                    @Override
                    public ListFleetResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetResourcesRequest.Builder>
                                    input) {
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
                        ListFleetResourcesRequest, ListFleetResourcesResponse>() {
                    @Override
                    public ListFleetResourcesResponse apply(ListFleetResourcesRequest request) {
                        return client.listFleetResources(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetResourceSummary>
                            apply(ListFleetResourcesResponse response) {
                        return response.getFleetResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFleetTargets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetTargetsResponse> listFleetTargetsResponseIterator(
            final ListFleetTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetTargetsRequest.Builder, ListFleetTargetsRequest, ListFleetTargetsResponse>(
                new java.util.function.Supplier<ListFleetTargetsRequest.Builder>() {
                    @Override
                    public ListFleetTargetsRequest.Builder get() {
                        return ListFleetTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetTargetsResponse, String>() {
                    @Override
                    public String apply(ListFleetTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetTargetsRequest.Builder>,
                        ListFleetTargetsRequest>() {
                    @Override
                    public ListFleetTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetTargetsRequest.Builder>
                                    input) {
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
                        ListFleetTargetsRequest, ListFleetTargetsResponse>() {
                    @Override
                    public ListFleetTargetsResponse apply(ListFleetTargetsRequest request) {
                        return client.listFleetTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary} objects contained in responses
     * from the listFleetTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>
            listFleetTargetsRecordIterator(final ListFleetTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetTargetsRequest.Builder,
                ListFleetTargetsRequest,
                ListFleetTargetsResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>(
                new java.util.function.Supplier<ListFleetTargetsRequest.Builder>() {
                    @Override
                    public ListFleetTargetsRequest.Builder get() {
                        return ListFleetTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetTargetsResponse, String>() {
                    @Override
                    public String apply(ListFleetTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetTargetsRequest.Builder>,
                        ListFleetTargetsRequest>() {
                    @Override
                    public ListFleetTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetTargetsRequest.Builder>
                                    input) {
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
                        ListFleetTargetsRequest, ListFleetTargetsResponse>() {
                    @Override
                    public ListFleetTargetsResponse apply(ListFleetTargetsRequest request) {
                        return client.listFleetTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetTargetsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>
                            apply(ListFleetTargetsResponse response) {
                        return response.getFleetTargetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFleets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetsResponse> listFleetsResponseIterator(
            final ListFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetsRequest.Builder, ListFleetsRequest, ListFleetsResponse>(
                new java.util.function.Supplier<ListFleetsRequest.Builder>() {
                    @Override
                    public ListFleetsRequest.Builder get() {
                        return ListFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetsResponse, String>() {
                    @Override
                    public String apply(ListFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetsRequest.Builder>,
                        ListFleetsRequest>() {
                    @Override
                    public ListFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListFleetsRequest, ListFleetsResponse>() {
                    @Override
                    public ListFleetsResponse apply(ListFleetsRequest request) {
                        return client.listFleets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetSummary} objects contained in responses from
     * the listFleets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetSummary> listFleetsRecordIterator(
            final ListFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetsRequest.Builder,
                ListFleetsRequest,
                ListFleetsResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetSummary>(
                new java.util.function.Supplier<ListFleetsRequest.Builder>() {
                    @Override
                    public ListFleetsRequest.Builder get() {
                        return ListFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetsResponse, String>() {
                    @Override
                    public String apply(ListFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetsRequest.Builder>,
                        ListFleetsRequest>() {
                    @Override
                    public ListFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListFleetsRequest, ListFleetsResponse>() {
                    @Override
                    public ListFleetsResponse apply(ListFleetsRequest request) {
                        return client.listFleets(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetsResponse,
                        java.util.List<com.oracle.bmc.fleetappsmanagement.model.FleetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.FleetSummary>
                            apply(ListFleetsResponse response) {
                        return response.getFleetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInventoryResources operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInventoryResourcesResponse> listInventoryResourcesResponseIterator(
            final ListInventoryResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInventoryResourcesRequest.Builder,
                ListInventoryResourcesRequest,
                ListInventoryResourcesResponse>(
                new java.util.function.Supplier<ListInventoryResourcesRequest.Builder>() {
                    @Override
                    public ListInventoryResourcesRequest.Builder get() {
                        return ListInventoryResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInventoryResourcesResponse, String>() {
                    @Override
                    public String apply(ListInventoryResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInventoryResourcesRequest.Builder>,
                        ListInventoryResourcesRequest>() {
                    @Override
                    public ListInventoryResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInventoryResourcesRequest.Builder>
                                    input) {
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
                        ListInventoryResourcesRequest, ListInventoryResourcesResponse>() {
                    @Override
                    public ListInventoryResourcesResponse apply(
                            ListInventoryResourcesRequest request) {
                        return client.listInventoryResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.InventoryResourceSummary} objects contained in
     * responses from the listInventoryResources operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.InventoryResourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.InventoryResourceSummary>
            listInventoryResourcesRecordIterator(final ListInventoryResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInventoryResourcesRequest.Builder,
                ListInventoryResourcesRequest,
                ListInventoryResourcesResponse,
                com.oracle.bmc.fleetappsmanagement.model.InventoryResourceSummary>(
                new java.util.function.Supplier<ListInventoryResourcesRequest.Builder>() {
                    @Override
                    public ListInventoryResourcesRequest.Builder get() {
                        return ListInventoryResourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInventoryResourcesResponse, String>() {
                    @Override
                    public String apply(ListInventoryResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInventoryResourcesRequest.Builder>,
                        ListInventoryResourcesRequest>() {
                    @Override
                    public ListInventoryResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInventoryResourcesRequest.Builder>
                                    input) {
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
                        ListInventoryResourcesRequest, ListInventoryResourcesResponse>() {
                    @Override
                    public ListInventoryResourcesResponse apply(
                            ListInventoryResourcesRequest request) {
                        return client.listInventoryResources(request);
                    }
                },
                new java.util.function.Function<
                        ListInventoryResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model
                                        .InventoryResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model
                                            .InventoryResourceSummary>
                            apply(ListInventoryResourcesResponse response) {
                        return response.getInventoryResourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTargets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTargetsResponse> listTargetsResponseIterator(
            final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTargetsRequest.Builder, ListTargetsRequest, ListTargetsResponse>(
                new java.util.function.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary} objects contained in responses
     * from the listTargets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>
            listTargetsRecordIterator(final ListTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTargetsRequest.Builder,
                ListTargetsRequest,
                ListTargetsResponse,
                com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>(
                new java.util.function.Supplier<ListTargetsRequest.Builder>() {
                    @Override
                    public ListTargetsRequest.Builder get() {
                        return ListTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTargetsResponse, String>() {
                    @Override
                    public String apply(ListTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTargetsRequest.Builder>,
                        ListTargetsRequest>() {
                    @Override
                    public ListTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTargetsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListTargetsRequest, ListTargetsResponse>() {
                    @Override
                    public ListTargetsResponse apply(ListTargetsRequest request) {
                        return client.listTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListTargetsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.FleetTargetSummary>
                            apply(ListTargetsResponse response) {
                        return response.getFleetTargetCollection().getItems();
                    }
                });
    }
}

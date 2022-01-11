/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Subscription where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@lombok.RequiredArgsConstructor
public class SubscriptionPaginators {
    private final Subscription client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAssignedSubscriptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAssignedSubscriptionsResponse> listAssignedSubscriptionsResponseIterator(
            final ListAssignedSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssignedSubscriptionsRequest.Builder, ListAssignedSubscriptionsRequest,
                ListAssignedSubscriptionsResponse>(
                new com.google.common.base.Supplier<ListAssignedSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAssignedSubscriptionsRequest.Builder get() {
                        return ListAssignedSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAssignedSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAssignedSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssignedSubscriptionsRequest.Builder>,
                        ListAssignedSubscriptionsRequest>() {
                    @Override
                    public ListAssignedSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssignedSubscriptionsRequest.Builder>
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
                        ListAssignedSubscriptionsRequest, ListAssignedSubscriptionsResponse>() {
                    @Override
                    public ListAssignedSubscriptionsResponse apply(
                            ListAssignedSubscriptionsRequest request) {
                        return client.listAssignedSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionSummary} objects
     * contained in responses from the listAssignedSubscriptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionSummary>
            listAssignedSubscriptionsRecordIterator(
                    final ListAssignedSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssignedSubscriptionsRequest.Builder, ListAssignedSubscriptionsRequest,
                ListAssignedSubscriptionsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscriptionSummary>(
                new com.google.common.base.Supplier<ListAssignedSubscriptionsRequest.Builder>() {
                    @Override
                    public ListAssignedSubscriptionsRequest.Builder get() {
                        return ListAssignedSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAssignedSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListAssignedSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssignedSubscriptionsRequest.Builder>,
                        ListAssignedSubscriptionsRequest>() {
                    @Override
                    public ListAssignedSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssignedSubscriptionsRequest.Builder>
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
                        ListAssignedSubscriptionsRequest, ListAssignedSubscriptionsResponse>() {
                    @Override
                    public ListAssignedSubscriptionsResponse apply(
                            ListAssignedSubscriptionsRequest request) {
                        return client.listAssignedSubscriptions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAssignedSubscriptionsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .AssignedSubscriptionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .AssignedSubscriptionSummary>
                            apply(ListAssignedSubscriptionsResponse response) {
                        return response.getAssignedSubscriptionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAvailableRegions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAvailableRegionsResponse> listAvailableRegionsResponseIterator(
            final ListAvailableRegionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableRegionsRequest.Builder, ListAvailableRegionsRequest,
                ListAvailableRegionsResponse>(
                new com.google.common.base.Supplier<ListAvailableRegionsRequest.Builder>() {
                    @Override
                    public ListAvailableRegionsRequest.Builder get() {
                        return ListAvailableRegionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailableRegionsResponse, String>() {
                    @Override
                    public String apply(ListAvailableRegionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableRegionsRequest.Builder>,
                        ListAvailableRegionsRequest>() {
                    @Override
                    public ListAvailableRegionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableRegionsRequest.Builder>
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
                        ListAvailableRegionsRequest, ListAvailableRegionsResponse>() {
                    @Override
                    public ListAvailableRegionsResponse apply(ListAvailableRegionsRequest request) {
                        return client.listAvailableRegions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.AvailableRegionSummary} objects
     * contained in responses from the listAvailableRegions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.AvailableRegionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.AvailableRegionSummary>
            listAvailableRegionsRecordIterator(final ListAvailableRegionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableRegionsRequest.Builder, ListAvailableRegionsRequest,
                ListAvailableRegionsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.AvailableRegionSummary>(
                new com.google.common.base.Supplier<ListAvailableRegionsRequest.Builder>() {
                    @Override
                    public ListAvailableRegionsRequest.Builder get() {
                        return ListAvailableRegionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAvailableRegionsResponse, String>() {
                    @Override
                    public String apply(ListAvailableRegionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableRegionsRequest.Builder>,
                        ListAvailableRegionsRequest>() {
                    @Override
                    public ListAvailableRegionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableRegionsRequest.Builder>
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
                        ListAvailableRegionsRequest, ListAvailableRegionsResponse>() {
                    @Override
                    public ListAvailableRegionsResponse apply(ListAvailableRegionsRequest request) {
                        return client.listAvailableRegions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAvailableRegionsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .AvailableRegionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .AvailableRegionSummary>
                            apply(ListAvailableRegionsResponse response) {
                        return response.getAvailableRegionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSubscriptionMappings operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSubscriptionMappingsResponse> listSubscriptionMappingsResponseIterator(
            final ListSubscriptionMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSubscriptionMappingsRequest.Builder, ListSubscriptionMappingsRequest,
                ListSubscriptionMappingsResponse>(
                new com.google.common.base.Supplier<ListSubscriptionMappingsRequest.Builder>() {
                    @Override
                    public ListSubscriptionMappingsRequest.Builder get() {
                        return ListSubscriptionMappingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubscriptionMappingsResponse, String>() {
                    @Override
                    public String apply(ListSubscriptionMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubscriptionMappingsRequest.Builder>,
                        ListSubscriptionMappingsRequest>() {
                    @Override
                    public ListSubscriptionMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubscriptionMappingsRequest.Builder>
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
                        ListSubscriptionMappingsRequest, ListSubscriptionMappingsResponse>() {
                    @Override
                    public ListSubscriptionMappingsResponse apply(
                            ListSubscriptionMappingsRequest request) {
                        return client.listSubscriptionMappings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMappingSummary} objects
     * contained in responses from the listSubscriptionMappings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMappingSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMappingSummary>
            listSubscriptionMappingsRecordIterator(final ListSubscriptionMappingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSubscriptionMappingsRequest.Builder, ListSubscriptionMappingsRequest,
                ListSubscriptionMappingsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMappingSummary>(
                new com.google.common.base.Supplier<ListSubscriptionMappingsRequest.Builder>() {
                    @Override
                    public ListSubscriptionMappingsRequest.Builder get() {
                        return ListSubscriptionMappingsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubscriptionMappingsResponse, String>() {
                    @Override
                    public String apply(ListSubscriptionMappingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubscriptionMappingsRequest.Builder>,
                        ListSubscriptionMappingsRequest>() {
                    @Override
                    public ListSubscriptionMappingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubscriptionMappingsRequest.Builder>
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
                        ListSubscriptionMappingsRequest, ListSubscriptionMappingsResponse>() {
                    @Override
                    public ListSubscriptionMappingsResponse apply(
                            ListSubscriptionMappingsRequest request) {
                        return client.listSubscriptionMappings(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSubscriptionMappingsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .SubscriptionMappingSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .SubscriptionMappingSummary>
                            apply(ListSubscriptionMappingsResponse response) {
                        return response.getSubscriptionMappingCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSubscriptions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSubscriptionsResponse> listSubscriptionsResponseIterator(
            final ListSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSubscriptionsRequest.Builder, ListSubscriptionsRequest,
                ListSubscriptionsResponse>(
                new com.google.common.base.Supplier<ListSubscriptionsRequest.Builder>() {
                    @Override
                    public ListSubscriptionsRequest.Builder get() {
                        return ListSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubscriptionsRequest.Builder>,
                        ListSubscriptionsRequest>() {
                    @Override
                    public ListSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubscriptionsRequest.Builder>
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
                        ListSubscriptionsRequest, ListSubscriptionsResponse>() {
                    @Override
                    public ListSubscriptionsResponse apply(ListSubscriptionsRequest request) {
                        return client.listSubscriptions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionSummary} objects
     * contained in responses from the listSubscriptions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionSummary>
            listSubscriptionsRecordIterator(final ListSubscriptionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSubscriptionsRequest.Builder, ListSubscriptionsRequest,
                ListSubscriptionsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionSummary>(
                new com.google.common.base.Supplier<ListSubscriptionsRequest.Builder>() {
                    @Override
                    public ListSubscriptionsRequest.Builder get() {
                        return ListSubscriptionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSubscriptionsResponse, String>() {
                    @Override
                    public String apply(ListSubscriptionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSubscriptionsRequest.Builder>,
                        ListSubscriptionsRequest>() {
                    @Override
                    public ListSubscriptionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSubscriptionsRequest.Builder>
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
                        ListSubscriptionsRequest, ListSubscriptionsResponse>() {
                    @Override
                    public ListSubscriptionsResponse apply(ListSubscriptionsRequest request) {
                        return client.listSubscriptions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSubscriptionsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .SubscriptionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .SubscriptionSummary>
                            apply(ListSubscriptionsResponse response) {
                        return response.getSubscriptionCollection().getItems();
                    }
                });
    }
}

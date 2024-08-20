/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FleetAppsManagementAdmin where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementAdminPaginators {
    private final FleetAppsManagementAdmin client;

    public FleetAppsManagementAdminPaginators(FleetAppsManagementAdmin client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOnboardingPolicies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOnboardingPoliciesResponse> listOnboardingPoliciesResponseIterator(
            final ListOnboardingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnboardingPoliciesRequest.Builder,
                ListOnboardingPoliciesRequest,
                ListOnboardingPoliciesResponse>(
                new java.util.function.Supplier<ListOnboardingPoliciesRequest.Builder>() {
                    @Override
                    public ListOnboardingPoliciesRequest.Builder get() {
                        return ListOnboardingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnboardingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListOnboardingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnboardingPoliciesRequest.Builder>,
                        ListOnboardingPoliciesRequest>() {
                    @Override
                    public ListOnboardingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnboardingPoliciesRequest.Builder>
                                    input) {
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
                        ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>() {
                    @Override
                    public ListOnboardingPoliciesResponse apply(
                            ListOnboardingPoliciesRequest request) {
                        return client.listOnboardingPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicySummary} objects contained in
     * responses from the listOnboardingPolicies operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicySummary>
            listOnboardingPoliciesRecordIterator(final ListOnboardingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnboardingPoliciesRequest.Builder,
                ListOnboardingPoliciesRequest,
                ListOnboardingPoliciesResponse,
                com.oracle.bmc.fleetappsmanagement.model.OnboardingPolicySummary>(
                new java.util.function.Supplier<ListOnboardingPoliciesRequest.Builder>() {
                    @Override
                    public ListOnboardingPoliciesRequest.Builder get() {
                        return ListOnboardingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnboardingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListOnboardingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnboardingPoliciesRequest.Builder>,
                        ListOnboardingPoliciesRequest>() {
                    @Override
                    public ListOnboardingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnboardingPoliciesRequest.Builder>
                                    input) {
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
                        ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>() {
                    @Override
                    public ListOnboardingPoliciesResponse apply(
                            ListOnboardingPoliciesRequest request) {
                        return client.listOnboardingPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListOnboardingPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model
                                        .OnboardingPolicySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model
                                            .OnboardingPolicySummary>
                            apply(ListOnboardingPoliciesResponse response) {
                        return response.getOnboardingPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOnboardings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOnboardingsResponse> listOnboardingsResponseIterator(
            final ListOnboardingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOnboardingsRequest.Builder, ListOnboardingsRequest, ListOnboardingsResponse>(
                new java.util.function.Supplier<ListOnboardingsRequest.Builder>() {
                    @Override
                    public ListOnboardingsRequest.Builder get() {
                        return ListOnboardingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnboardingsResponse, String>() {
                    @Override
                    public String apply(ListOnboardingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnboardingsRequest.Builder>,
                        ListOnboardingsRequest>() {
                    @Override
                    public ListOnboardingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnboardingsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListOnboardingsRequest, ListOnboardingsResponse>() {
                    @Override
                    public ListOnboardingsResponse apply(ListOnboardingsRequest request) {
                        return client.listOnboardings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary} objects contained in responses
     * from the listOnboardings operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary>
            listOnboardingsRecordIterator(final ListOnboardingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOnboardingsRequest.Builder,
                ListOnboardingsRequest,
                ListOnboardingsResponse,
                com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary>(
                new java.util.function.Supplier<ListOnboardingsRequest.Builder>() {
                    @Override
                    public ListOnboardingsRequest.Builder get() {
                        return ListOnboardingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOnboardingsResponse, String>() {
                    @Override
                    public String apply(ListOnboardingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOnboardingsRequest.Builder>,
                        ListOnboardingsRequest>() {
                    @Override
                    public ListOnboardingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOnboardingsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListOnboardingsRequest, ListOnboardingsResponse>() {
                    @Override
                    public ListOnboardingsResponse apply(ListOnboardingsRequest request) {
                        return client.listOnboardings(request);
                    }
                },
                new java.util.function.Function<
                        ListOnboardingsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetappsmanagement.model.OnboardingSummary>
                            apply(ListOnboardingsResponse response) {
                        return response.getOnboardingCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProperties
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPropertiesResponse> listPropertiesResponseIterator(
            final ListPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPropertiesRequest.Builder, ListPropertiesRequest, ListPropertiesResponse>(
                new java.util.function.Supplier<ListPropertiesRequest.Builder>() {
                    @Override
                    public ListPropertiesRequest.Builder get() {
                        return ListPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPropertiesResponse, String>() {
                    @Override
                    public String apply(ListPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPropertiesRequest.Builder>,
                        ListPropertiesRequest>() {
                    @Override
                    public ListPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPropertiesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListPropertiesRequest, ListPropertiesResponse>() {
                    @Override
                    public ListPropertiesResponse apply(ListPropertiesRequest request) {
                        return client.listProperties(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetappsmanagement.model.PropertySummary} objects contained in responses from
     * the listProperties operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetappsmanagement.model.PropertySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetappsmanagement.model.PropertySummary>
            listPropertiesRecordIterator(final ListPropertiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPropertiesRequest.Builder,
                ListPropertiesRequest,
                ListPropertiesResponse,
                com.oracle.bmc.fleetappsmanagement.model.PropertySummary>(
                new java.util.function.Supplier<ListPropertiesRequest.Builder>() {
                    @Override
                    public ListPropertiesRequest.Builder get() {
                        return ListPropertiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPropertiesResponse, String>() {
                    @Override
                    public String apply(ListPropertiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPropertiesRequest.Builder>,
                        ListPropertiesRequest>() {
                    @Override
                    public ListPropertiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPropertiesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListPropertiesRequest, ListPropertiesResponse>() {
                    @Override
                    public ListPropertiesResponse apply(ListPropertiesRequest request) {
                        return client.listProperties(request);
                    }
                },
                new java.util.function.Function<
                        ListPropertiesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetappsmanagement.model.PropertySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetappsmanagement.model.PropertySummary>
                            apply(ListPropertiesResponse response) {
                        return response.getPropertyCollection().getItems();
                    }
                });
    }
}

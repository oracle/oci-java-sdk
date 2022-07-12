/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa;

import com.oracle.bmc.waa.requests.*;
import com.oracle.bmc.waa.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Waa where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
public class WaaPaginators {
    private final Waa client;

    public WaaPaginators(Waa client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWebAppAccelerationPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWebAppAccelerationPoliciesResponse>
            listWebAppAccelerationPoliciesResponseIterator(
                    final ListWebAppAccelerationPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWebAppAccelerationPoliciesRequest.Builder,
                ListWebAppAccelerationPoliciesRequest, ListWebAppAccelerationPoliciesResponse>(
                new java.util.function.Supplier<ListWebAppAccelerationPoliciesRequest.Builder>() {
                    @Override
                    public ListWebAppAccelerationPoliciesRequest.Builder get() {
                        return ListWebAppAccelerationPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWebAppAccelerationPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWebAppAccelerationPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppAccelerationPoliciesRequest.Builder>,
                        ListWebAppAccelerationPoliciesRequest>() {
                    @Override
                    public ListWebAppAccelerationPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppAccelerationPoliciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationPoliciesRequest,
                        ListWebAppAccelerationPoliciesResponse>() {
                    @Override
                    public ListWebAppAccelerationPoliciesResponse apply(
                            ListWebAppAccelerationPoliciesRequest request) {
                        return client.listWebAppAccelerationPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary} objects
     * contained in responses from the listWebAppAccelerationPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary>
            listWebAppAccelerationPoliciesRecordIterator(
                    final ListWebAppAccelerationPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWebAppAccelerationPoliciesRequest.Builder,
                ListWebAppAccelerationPoliciesRequest, ListWebAppAccelerationPoliciesResponse,
                com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary>(
                new java.util.function.Supplier<ListWebAppAccelerationPoliciesRequest.Builder>() {
                    @Override
                    public ListWebAppAccelerationPoliciesRequest.Builder get() {
                        return ListWebAppAccelerationPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWebAppAccelerationPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWebAppAccelerationPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppAccelerationPoliciesRequest.Builder>,
                        ListWebAppAccelerationPoliciesRequest>() {
                    @Override
                    public ListWebAppAccelerationPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppAccelerationPoliciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationPoliciesRequest,
                        ListWebAppAccelerationPoliciesResponse>() {
                    @Override
                    public ListWebAppAccelerationPoliciesResponse apply(
                            ListWebAppAccelerationPoliciesRequest request) {
                        return client.listWebAppAccelerationPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waa.model.WebAppAccelerationPolicySummary>
                            apply(ListWebAppAccelerationPoliciesResponse response) {
                        return response.getWebAppAccelerationPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWebAppAccelerations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWebAppAccelerationsResponse> listWebAppAccelerationsResponseIterator(
            final ListWebAppAccelerationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWebAppAccelerationsRequest.Builder, ListWebAppAccelerationsRequest,
                ListWebAppAccelerationsResponse>(
                new java.util.function.Supplier<ListWebAppAccelerationsRequest.Builder>() {
                    @Override
                    public ListWebAppAccelerationsRequest.Builder get() {
                        return ListWebAppAccelerationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWebAppAccelerationsResponse, String>() {
                    @Override
                    public String apply(ListWebAppAccelerationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppAccelerationsRequest.Builder>,
                        ListWebAppAccelerationsRequest>() {
                    @Override
                    public ListWebAppAccelerationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppAccelerationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>() {
                    @Override
                    public ListWebAppAccelerationsResponse apply(
                            ListWebAppAccelerationsRequest request) {
                        return client.listWebAppAccelerations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waa.model.WebAppAccelerationSummary} objects
     * contained in responses from the listWebAppAccelerations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waa.model.WebAppAccelerationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waa.model.WebAppAccelerationSummary>
            listWebAppAccelerationsRecordIterator(final ListWebAppAccelerationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWebAppAccelerationsRequest.Builder, ListWebAppAccelerationsRequest,
                ListWebAppAccelerationsResponse,
                com.oracle.bmc.waa.model.WebAppAccelerationSummary>(
                new java.util.function.Supplier<ListWebAppAccelerationsRequest.Builder>() {
                    @Override
                    public ListWebAppAccelerationsRequest.Builder get() {
                        return ListWebAppAccelerationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWebAppAccelerationsResponse, String>() {
                    @Override
                    public String apply(ListWebAppAccelerationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWebAppAccelerationsRequest.Builder>,
                        ListWebAppAccelerationsRequest>() {
                    @Override
                    public ListWebAppAccelerationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWebAppAccelerationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationsRequest, ListWebAppAccelerationsResponse>() {
                    @Override
                    public ListWebAppAccelerationsResponse apply(
                            ListWebAppAccelerationsRequest request) {
                        return client.listWebAppAccelerations(request);
                    }
                },
                new java.util.function.Function<
                        ListWebAppAccelerationsResponse,
                        java.util.List<com.oracle.bmc.waa.model.WebAppAccelerationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waa.model.WebAppAccelerationSummary> apply(
                            ListWebAppAccelerationsResponse response) {
                        return response.getWebAppAccelerationCollection().getItems();
                    }
                });
    }
}

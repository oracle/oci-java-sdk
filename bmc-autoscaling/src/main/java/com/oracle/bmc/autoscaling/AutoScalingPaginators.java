/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling;

import com.oracle.bmc.autoscaling.requests.*;
import com.oracle.bmc.autoscaling.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of AutoScaling where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class AutoScalingPaginators {
    private final AutoScaling client;

    public AutoScalingPaginators(AutoScaling client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutoScalingConfigurations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurationsResponseIterator(
                    final ListAutoScalingConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutoScalingConfigurationsRequest.Builder,
                ListAutoScalingConfigurationsRequest,
                ListAutoScalingConfigurationsResponse>(
                new java.util.function.Supplier<ListAutoScalingConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest.Builder get() {
                        return ListAutoScalingConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingConfigurationsRequest.Builder>,
                        ListAutoScalingConfigurationsRequest>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingConfigurationsRequest.Builder>
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
                        ListAutoScalingConfigurationsRequest,
                        ListAutoScalingConfigurationsResponse>() {
                    @Override
                    public ListAutoScalingConfigurationsResponse apply(
                            ListAutoScalingConfigurationsRequest request) {
                        return client.listAutoScalingConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.autoscaling.model.AutoScalingConfigurationSummary} objects contained in
     * responses from the listAutoScalingConfigurations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.autoscaling.model.AutoScalingConfigurationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.autoscaling.model.AutoScalingConfigurationSummary>
            listAutoScalingConfigurationsRecordIterator(
                    final ListAutoScalingConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutoScalingConfigurationsRequest.Builder,
                ListAutoScalingConfigurationsRequest,
                ListAutoScalingConfigurationsResponse,
                com.oracle.bmc.autoscaling.model.AutoScalingConfigurationSummary>(
                new java.util.function.Supplier<ListAutoScalingConfigurationsRequest.Builder>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest.Builder get() {
                        return ListAutoScalingConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingConfigurationsRequest.Builder>,
                        ListAutoScalingConfigurationsRequest>() {
                    @Override
                    public ListAutoScalingConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingConfigurationsRequest.Builder>
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
                        ListAutoScalingConfigurationsRequest,
                        ListAutoScalingConfigurationsResponse>() {
                    @Override
                    public ListAutoScalingConfigurationsResponse apply(
                            ListAutoScalingConfigurationsRequest request) {
                        return client.listAutoScalingConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListAutoScalingConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.autoscaling.model
                                        .AutoScalingConfigurationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.autoscaling.model
                                            .AutoScalingConfigurationSummary>
                            apply(ListAutoScalingConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAutoScalingPolicies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAutoScalingPoliciesResponse> listAutoScalingPoliciesResponseIterator(
            final ListAutoScalingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAutoScalingPoliciesRequest.Builder,
                ListAutoScalingPoliciesRequest,
                ListAutoScalingPoliciesResponse>(
                new java.util.function.Supplier<ListAutoScalingPoliciesRequest.Builder>() {
                    @Override
                    public ListAutoScalingPoliciesRequest.Builder get() {
                        return ListAutoScalingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingPoliciesRequest.Builder>,
                        ListAutoScalingPoliciesRequest>() {
                    @Override
                    public ListAutoScalingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingPoliciesRequest.Builder>
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
                        ListAutoScalingPoliciesRequest, ListAutoScalingPoliciesResponse>() {
                    @Override
                    public ListAutoScalingPoliciesResponse apply(
                            ListAutoScalingPoliciesRequest request) {
                        return client.listAutoScalingPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary} objects contained in responses
     * from the listAutoScalingPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary>
            listAutoScalingPoliciesRecordIterator(final ListAutoScalingPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAutoScalingPoliciesRequest.Builder,
                ListAutoScalingPoliciesRequest,
                ListAutoScalingPoliciesResponse,
                com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary>(
                new java.util.function.Supplier<ListAutoScalingPoliciesRequest.Builder>() {
                    @Override
                    public ListAutoScalingPoliciesRequest.Builder get() {
                        return ListAutoScalingPoliciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAutoScalingPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAutoScalingPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAutoScalingPoliciesRequest.Builder>,
                        ListAutoScalingPoliciesRequest>() {
                    @Override
                    public ListAutoScalingPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAutoScalingPoliciesRequest.Builder>
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
                        ListAutoScalingPoliciesRequest, ListAutoScalingPoliciesResponse>() {
                    @Override
                    public ListAutoScalingPoliciesResponse apply(
                            ListAutoScalingPoliciesRequest request) {
                        return client.listAutoScalingPolicies(request);
                    }
                },
                new java.util.function.Function<
                        ListAutoScalingPoliciesResponse,
                        java.util.List<
                                com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.autoscaling.model.AutoScalingPolicySummary>
                            apply(ListAutoScalingPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

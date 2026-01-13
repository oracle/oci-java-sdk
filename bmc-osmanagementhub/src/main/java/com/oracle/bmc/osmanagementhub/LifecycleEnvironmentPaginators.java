/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LifecycleEnvironment where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class LifecycleEnvironmentPaginators {
    private final LifecycleEnvironment client;

    public LifecycleEnvironmentPaginators(LifecycleEnvironment client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLifecycleEnvironments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLifecycleEnvironmentsResponse> listLifecycleEnvironmentsResponseIterator(
            final ListLifecycleEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLifecycleEnvironmentsRequest.Builder,
                ListLifecycleEnvironmentsRequest,
                ListLifecycleEnvironmentsResponse>(
                new java.util.function.Supplier<ListLifecycleEnvironmentsRequest.Builder>() {
                    @Override
                    public ListLifecycleEnvironmentsRequest.Builder get() {
                        return ListLifecycleEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLifecycleEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListLifecycleEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleEnvironmentsRequest.Builder>,
                        ListLifecycleEnvironmentsRequest>() {
                    @Override
                    public ListLifecycleEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleEnvironmentsRequest.Builder>
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
                        ListLifecycleEnvironmentsRequest, ListLifecycleEnvironmentsResponse>() {
                    @Override
                    public ListLifecycleEnvironmentsResponse apply(
                            ListLifecycleEnvironmentsRequest request) {
                        return client.listLifecycleEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentSummary} objects contained in
     * responses from the listLifecycleEnvironments operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentSummary>
            listLifecycleEnvironmentsRecordIterator(
                    final ListLifecycleEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLifecycleEnvironmentsRequest.Builder,
                ListLifecycleEnvironmentsRequest,
                ListLifecycleEnvironmentsResponse,
                com.oracle.bmc.osmanagementhub.model.LifecycleEnvironmentSummary>(
                new java.util.function.Supplier<ListLifecycleEnvironmentsRequest.Builder>() {
                    @Override
                    public ListLifecycleEnvironmentsRequest.Builder get() {
                        return ListLifecycleEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLifecycleEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListLifecycleEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleEnvironmentsRequest.Builder>,
                        ListLifecycleEnvironmentsRequest>() {
                    @Override
                    public ListLifecycleEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleEnvironmentsRequest.Builder>
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
                        ListLifecycleEnvironmentsRequest, ListLifecycleEnvironmentsResponse>() {
                    @Override
                    public ListLifecycleEnvironmentsResponse apply(
                            ListLifecycleEnvironmentsRequest request) {
                        return client.listLifecycleEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListLifecycleEnvironmentsResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .LifecycleEnvironmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .LifecycleEnvironmentSummary>
                            apply(ListLifecycleEnvironmentsResponse response) {
                        return response.getLifecycleEnvironmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLifecycleStageInstalledPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLifecycleStageInstalledPackagesResponse>
            listLifecycleStageInstalledPackagesResponseIterator(
                    final ListLifecycleStageInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLifecycleStageInstalledPackagesRequest.Builder,
                ListLifecycleStageInstalledPackagesRequest,
                ListLifecycleStageInstalledPackagesResponse>(
                new java.util.function.Supplier<
                        ListLifecycleStageInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesRequest.Builder get() {
                        return ListLifecycleStageInstalledPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListLifecycleStageInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(ListLifecycleStageInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleStageInstalledPackagesRequest.Builder>,
                        ListLifecycleStageInstalledPackagesRequest>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleStageInstalledPackagesRequest.Builder>
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
                        ListLifecycleStageInstalledPackagesRequest,
                        ListLifecycleStageInstalledPackagesResponse>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesResponse apply(
                            ListLifecycleStageInstalledPackagesRequest request) {
                        return client.listLifecycleStageInstalledPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary} objects contained in responses
     * from the listLifecycleStageInstalledPackages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>
            listLifecycleStageInstalledPackagesRecordIterator(
                    final ListLifecycleStageInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLifecycleStageInstalledPackagesRequest.Builder,
                ListLifecycleStageInstalledPackagesRequest,
                ListLifecycleStageInstalledPackagesResponse,
                com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>(
                new java.util.function.Supplier<
                        ListLifecycleStageInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesRequest.Builder get() {
                        return ListLifecycleStageInstalledPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListLifecycleStageInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(ListLifecycleStageInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleStageInstalledPackagesRequest.Builder>,
                        ListLifecycleStageInstalledPackagesRequest>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleStageInstalledPackagesRequest.Builder>
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
                        ListLifecycleStageInstalledPackagesRequest,
                        ListLifecycleStageInstalledPackagesResponse>() {
                    @Override
                    public ListLifecycleStageInstalledPackagesResponse apply(
                            ListLifecycleStageInstalledPackagesRequest request) {
                        return client.listLifecycleStageInstalledPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListLifecycleStageInstalledPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>
                            apply(ListLifecycleStageInstalledPackagesResponse response) {
                        return response.getInstalledPackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listLifecycleStages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListLifecycleStagesResponse> listLifecycleStagesResponseIterator(
            final ListLifecycleStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLifecycleStagesRequest.Builder,
                ListLifecycleStagesRequest,
                ListLifecycleStagesResponse>(
                new java.util.function.Supplier<ListLifecycleStagesRequest.Builder>() {
                    @Override
                    public ListLifecycleStagesRequest.Builder get() {
                        return ListLifecycleStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLifecycleStagesResponse, String>() {
                    @Override
                    public String apply(ListLifecycleStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleStagesRequest.Builder>,
                        ListLifecycleStagesRequest>() {
                    @Override
                    public ListLifecycleStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleStagesRequest.Builder>
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
                        ListLifecycleStagesRequest, ListLifecycleStagesResponse>() {
                    @Override
                    public ListLifecycleStagesResponse apply(ListLifecycleStagesRequest request) {
                        return client.listLifecycleStages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary} objects contained in responses
     * from the listLifecycleStages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary>
            listLifecycleStagesRecordIterator(final ListLifecycleStagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLifecycleStagesRequest.Builder,
                ListLifecycleStagesRequest,
                ListLifecycleStagesResponse,
                com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary>(
                new java.util.function.Supplier<ListLifecycleStagesRequest.Builder>() {
                    @Override
                    public ListLifecycleStagesRequest.Builder get() {
                        return ListLifecycleStagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListLifecycleStagesResponse, String>() {
                    @Override
                    public String apply(ListLifecycleStagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLifecycleStagesRequest.Builder>,
                        ListLifecycleStagesRequest>() {
                    @Override
                    public ListLifecycleStagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLifecycleStagesRequest.Builder>
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
                        ListLifecycleStagesRequest, ListLifecycleStagesResponse>() {
                    @Override
                    public ListLifecycleStagesResponse apply(ListLifecycleStagesRequest request) {
                        return client.listLifecycleStages(request);
                    }
                },
                new java.util.function.Function<
                        ListLifecycleStagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.LifecycleStageSummary>
                            apply(ListLifecycleStagesResponse response) {
                        return response.getLifecycleStageCollection().getItems();
                    }
                });
    }
}

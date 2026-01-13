/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagedInstance where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
public class ManagedInstancePaginators {
    private final ManagedInstance client;

    public ManagedInstancePaginators(ManagedInstance client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceAvailablePackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceAvailablePackagesResponse>
            listManagedInstanceAvailablePackagesResponseIterator(
                    final ListManagedInstanceAvailablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceAvailablePackagesRequest.Builder,
                ListManagedInstanceAvailablePackagesRequest,
                ListManagedInstanceAvailablePackagesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesRequest.Builder get() {
                        return ListManagedInstanceAvailablePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailablePackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceAvailablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailablePackagesRequest.Builder>,
                        ListManagedInstanceAvailablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailablePackagesRequest.Builder>
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
                        ListManagedInstanceAvailablePackagesRequest,
                        ListManagedInstanceAvailablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesResponse apply(
                            ListManagedInstanceAvailablePackagesRequest request) {
                        return client.listManagedInstanceAvailablePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary} objects contained in responses
     * from the listManagedInstanceAvailablePackages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary>
            listManagedInstanceAvailablePackagesRecordIterator(
                    final ListManagedInstanceAvailablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceAvailablePackagesRequest.Builder,
                ListManagedInstanceAvailablePackagesRequest,
                ListManagedInstanceAvailablePackagesResponse,
                com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesRequest.Builder get() {
                        return ListManagedInstanceAvailablePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailablePackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceAvailablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailablePackagesRequest.Builder>,
                        ListManagedInstanceAvailablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailablePackagesRequest.Builder>
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
                        ListManagedInstanceAvailablePackagesRequest,
                        ListManagedInstanceAvailablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceAvailablePackagesResponse apply(
                            ListManagedInstanceAvailablePackagesRequest request) {
                        return client.listManagedInstanceAvailablePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailablePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.AvailablePackageSummary>
                            apply(ListManagedInstanceAvailablePackagesResponse response) {
                        return response.getAvailablePackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceAvailableSoftwareSources operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceAvailableSoftwareSourcesResponse>
            listManagedInstanceAvailableSoftwareSourcesResponseIterator(
                    final ListManagedInstanceAvailableSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceAvailableSoftwareSourcesRequest.Builder,
                ListManagedInstanceAvailableSoftwareSourcesRequest,
                ListManagedInstanceAvailableSoftwareSourcesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailableSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesRequest.Builder get() {
                        return ListManagedInstanceAvailableSoftwareSourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceAvailableSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailableSoftwareSourcesRequest.Builder>,
                        ListManagedInstanceAvailableSoftwareSourcesRequest>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailableSoftwareSourcesRequest
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
                        ListManagedInstanceAvailableSoftwareSourcesRequest,
                        ListManagedInstanceAvailableSoftwareSourcesResponse>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesResponse apply(
                            ListManagedInstanceAvailableSoftwareSourcesRequest request) {
                        return client.listManagedInstanceAvailableSoftwareSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary} objects contained in
     * responses from the listManagedInstanceAvailableSoftwareSources operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary>
            listManagedInstanceAvailableSoftwareSourcesRecordIterator(
                    final ListManagedInstanceAvailableSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceAvailableSoftwareSourcesRequest.Builder,
                ListManagedInstanceAvailableSoftwareSourcesRequest,
                ListManagedInstanceAvailableSoftwareSourcesResponse,
                com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailableSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesRequest.Builder get() {
                        return ListManagedInstanceAvailableSoftwareSourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceAvailableSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailableSoftwareSourcesRequest.Builder>,
                        ListManagedInstanceAvailableSoftwareSourcesRequest>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailableSoftwareSourcesRequest
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
                        ListManagedInstanceAvailableSoftwareSourcesRequest,
                        ListManagedInstanceAvailableSoftwareSourcesResponse>() {
                    @Override
                    public ListManagedInstanceAvailableSoftwareSourcesResponse apply(
                            ListManagedInstanceAvailableSoftwareSourcesRequest request) {
                        return client.listManagedInstanceAvailableSoftwareSources(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableSoftwareSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .AvailableSoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .AvailableSoftwareSourceSummary>
                            apply(ListManagedInstanceAvailableSoftwareSourcesResponse response) {
                        return response.getAvailableSoftwareSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceAvailableWindowsUpdates operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceAvailableWindowsUpdatesResponse>
            listManagedInstanceAvailableWindowsUpdatesResponseIterator(
                    final ListManagedInstanceAvailableWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceAvailableWindowsUpdatesRequest.Builder,
                ListManagedInstanceAvailableWindowsUpdatesRequest,
                ListManagedInstanceAvailableWindowsUpdatesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailableWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesRequest.Builder get() {
                        return ListManagedInstanceAvailableWindowsUpdatesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceAvailableWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailableWindowsUpdatesRequest.Builder>,
                        ListManagedInstanceAvailableWindowsUpdatesRequest>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailableWindowsUpdatesRequest
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
                        ListManagedInstanceAvailableWindowsUpdatesRequest,
                        ListManagedInstanceAvailableWindowsUpdatesResponse>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesResponse apply(
                            ListManagedInstanceAvailableWindowsUpdatesRequest request) {
                        return client.listManagedInstanceAvailableWindowsUpdates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.AvailableWindowsUpdateSummary} objects contained in
     * responses from the listManagedInstanceAvailableWindowsUpdates operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.AvailableWindowsUpdateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.AvailableWindowsUpdateSummary>
            listManagedInstanceAvailableWindowsUpdatesRecordIterator(
                    final ListManagedInstanceAvailableWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceAvailableWindowsUpdatesRequest.Builder,
                ListManagedInstanceAvailableWindowsUpdatesRequest,
                ListManagedInstanceAvailableWindowsUpdatesResponse,
                com.oracle.bmc.osmanagementhub.model.AvailableWindowsUpdateSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceAvailableWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesRequest.Builder get() {
                        return ListManagedInstanceAvailableWindowsUpdatesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceAvailableWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceAvailableWindowsUpdatesRequest.Builder>,
                        ListManagedInstanceAvailableWindowsUpdatesRequest>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceAvailableWindowsUpdatesRequest
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
                        ListManagedInstanceAvailableWindowsUpdatesRequest,
                        ListManagedInstanceAvailableWindowsUpdatesResponse>() {
                    @Override
                    public ListManagedInstanceAvailableWindowsUpdatesResponse apply(
                            ListManagedInstanceAvailableWindowsUpdatesRequest request) {
                        return client.listManagedInstanceAvailableWindowsUpdates(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceAvailableWindowsUpdatesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .AvailableWindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .AvailableWindowsUpdateSummary>
                            apply(ListManagedInstanceAvailableWindowsUpdatesResponse response) {
                        return response.getAvailableWindowsUpdateCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceErrata operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceErrataResponse> listManagedInstanceErrataResponseIterator(
            final ListManagedInstanceErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceErrataRequest.Builder,
                ListManagedInstanceErrataRequest,
                ListManagedInstanceErrataResponse>(
                new java.util.function.Supplier<ListManagedInstanceErrataRequest.Builder>() {
                    @Override
                    public ListManagedInstanceErrataRequest.Builder get() {
                        return ListManagedInstanceErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceErrataResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceErrataRequest.Builder>,
                        ListManagedInstanceErrataRequest>() {
                    @Override
                    public ListManagedInstanceErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceErrataRequest.Builder>
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
                        ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>() {
                    @Override
                    public ListManagedInstanceErrataResponse apply(
                            ListManagedInstanceErrataRequest request) {
                        return client.listManagedInstanceErrata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceErratumSummary} objects contained in
     * responses from the listManagedInstanceErrata operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceErratumSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceErratumSummary>
            listManagedInstanceErrataRecordIterator(
                    final ListManagedInstanceErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceErrataRequest.Builder,
                ListManagedInstanceErrataRequest,
                ListManagedInstanceErrataResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceErratumSummary>(
                new java.util.function.Supplier<ListManagedInstanceErrataRequest.Builder>() {
                    @Override
                    public ListManagedInstanceErrataRequest.Builder get() {
                        return ListManagedInstanceErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceErrataResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceErrataRequest.Builder>,
                        ListManagedInstanceErrataRequest>() {
                    @Override
                    public ListManagedInstanceErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceErrataRequest.Builder>
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
                        ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>() {
                    @Override
                    public ListManagedInstanceErrataResponse apply(
                            ListManagedInstanceErrataRequest request) {
                        return client.listManagedInstanceErrata(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceErrataResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceErratumSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceErratumSummary>
                            apply(ListManagedInstanceErrataResponse response) {
                        return response.getManagedInstanceErratumSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceInstalledPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceInstalledPackagesResponse>
            listManagedInstanceInstalledPackagesResponseIterator(
                    final ListManagedInstanceInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceInstalledPackagesRequest.Builder,
                ListManagedInstanceInstalledPackagesRequest,
                ListManagedInstanceInstalledPackagesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesRequest.Builder get() {
                        return ListManagedInstanceInstalledPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceInstalledPackagesRequest.Builder>,
                        ListManagedInstanceInstalledPackagesRequest>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceInstalledPackagesRequest.Builder>
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
                        ListManagedInstanceInstalledPackagesRequest,
                        ListManagedInstanceInstalledPackagesResponse>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesResponse apply(
                            ListManagedInstanceInstalledPackagesRequest request) {
                        return client.listManagedInstanceInstalledPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary} objects contained in responses
     * from the listManagedInstanceInstalledPackages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>
            listManagedInstanceInstalledPackagesRecordIterator(
                    final ListManagedInstanceInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceInstalledPackagesRequest.Builder,
                ListManagedInstanceInstalledPackagesRequest,
                ListManagedInstanceInstalledPackagesResponse,
                com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesRequest.Builder get() {
                        return ListManagedInstanceInstalledPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceInstalledPackagesRequest.Builder>,
                        ListManagedInstanceInstalledPackagesRequest>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceInstalledPackagesRequest.Builder>
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
                        ListManagedInstanceInstalledPackagesRequest,
                        ListManagedInstanceInstalledPackagesResponse>() {
                    @Override
                    public ListManagedInstanceInstalledPackagesResponse apply(
                            ListManagedInstanceInstalledPackagesRequest request) {
                        return client.listManagedInstanceInstalledPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.InstalledPackageSummary>
                            apply(ListManagedInstanceInstalledPackagesResponse response) {
                        return response.getInstalledPackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceInstalledWindowsUpdates operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceInstalledWindowsUpdatesResponse>
            listManagedInstanceInstalledWindowsUpdatesResponseIterator(
                    final ListManagedInstanceInstalledWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceInstalledWindowsUpdatesRequest.Builder,
                ListManagedInstanceInstalledWindowsUpdatesRequest,
                ListManagedInstanceInstalledWindowsUpdatesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceInstalledWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesRequest.Builder get() {
                        return ListManagedInstanceInstalledWindowsUpdatesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceInstalledWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceInstalledWindowsUpdatesRequest.Builder>,
                        ListManagedInstanceInstalledWindowsUpdatesRequest>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceInstalledWindowsUpdatesRequest
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
                        ListManagedInstanceInstalledWindowsUpdatesRequest,
                        ListManagedInstanceInstalledWindowsUpdatesResponse>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesResponse apply(
                            ListManagedInstanceInstalledWindowsUpdatesRequest request) {
                        return client.listManagedInstanceInstalledWindowsUpdates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.InstalledWindowsUpdateSummary} objects contained in
     * responses from the listManagedInstanceInstalledWindowsUpdates operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.InstalledWindowsUpdateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.InstalledWindowsUpdateSummary>
            listManagedInstanceInstalledWindowsUpdatesRecordIterator(
                    final ListManagedInstanceInstalledWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceInstalledWindowsUpdatesRequest.Builder,
                ListManagedInstanceInstalledWindowsUpdatesRequest,
                ListManagedInstanceInstalledWindowsUpdatesResponse,
                com.oracle.bmc.osmanagementhub.model.InstalledWindowsUpdateSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceInstalledWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesRequest.Builder get() {
                        return ListManagedInstanceInstalledWindowsUpdatesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceInstalledWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceInstalledWindowsUpdatesRequest.Builder>,
                        ListManagedInstanceInstalledWindowsUpdatesRequest>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceInstalledWindowsUpdatesRequest
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
                        ListManagedInstanceInstalledWindowsUpdatesRequest,
                        ListManagedInstanceInstalledWindowsUpdatesResponse>() {
                    @Override
                    public ListManagedInstanceInstalledWindowsUpdatesResponse apply(
                            ListManagedInstanceInstalledWindowsUpdatesRequest request) {
                        return client.listManagedInstanceInstalledWindowsUpdates(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceInstalledWindowsUpdatesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .InstalledWindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .InstalledWindowsUpdateSummary>
                            apply(ListManagedInstanceInstalledWindowsUpdatesResponse response) {
                        return response.getInstalledWindowsUpdateCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceModules operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceModulesResponse> listManagedInstanceModulesResponseIterator(
            final ListManagedInstanceModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceModulesRequest.Builder,
                ListManagedInstanceModulesRequest,
                ListManagedInstanceModulesResponse>(
                new java.util.function.Supplier<ListManagedInstanceModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceModulesRequest.Builder get() {
                        return ListManagedInstanceModulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceModulesRequest.Builder>,
                        ListManagedInstanceModulesRequest>() {
                    @Override
                    public ListManagedInstanceModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceModulesRequest.Builder>
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
                        ListManagedInstanceModulesRequest, ListManagedInstanceModulesResponse>() {
                    @Override
                    public ListManagedInstanceModulesResponse apply(
                            ListManagedInstanceModulesRequest request) {
                        return client.listManagedInstanceModules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceModuleSummary} objects contained in
     * responses from the listManagedInstanceModules operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceModuleSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceModuleSummary>
            listManagedInstanceModulesRecordIterator(
                    final ListManagedInstanceModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceModulesRequest.Builder,
                ListManagedInstanceModulesRequest,
                ListManagedInstanceModulesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceModuleSummary>(
                new java.util.function.Supplier<ListManagedInstanceModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceModulesRequest.Builder get() {
                        return ListManagedInstanceModulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceModulesRequest.Builder>,
                        ListManagedInstanceModulesRequest>() {
                    @Override
                    public ListManagedInstanceModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceModulesRequest.Builder>
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
                        ListManagedInstanceModulesRequest, ListManagedInstanceModulesResponse>() {
                    @Override
                    public ListManagedInstanceModulesResponse apply(
                            ListManagedInstanceModulesRequest request) {
                        return client.listManagedInstanceModules(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceModulesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceModuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceModuleSummary>
                            apply(ListManagedInstanceModulesResponse response) {
                        return response.getManagedInstanceModuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceUpdatablePackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceUpdatablePackagesResponse>
            listManagedInstanceUpdatablePackagesResponseIterator(
                    final ListManagedInstanceUpdatablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceUpdatablePackagesRequest.Builder,
                ListManagedInstanceUpdatablePackagesRequest,
                ListManagedInstanceUpdatablePackagesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceUpdatablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesRequest.Builder get() {
                        return ListManagedInstanceUpdatablePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceUpdatablePackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceUpdatablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceUpdatablePackagesRequest.Builder>,
                        ListManagedInstanceUpdatablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceUpdatablePackagesRequest.Builder>
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
                        ListManagedInstanceUpdatablePackagesRequest,
                        ListManagedInstanceUpdatablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesResponse apply(
                            ListManagedInstanceUpdatablePackagesRequest request) {
                        return client.listManagedInstanceUpdatablePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary} objects contained in responses
     * from the listManagedInstanceUpdatablePackages operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary>
            listManagedInstanceUpdatablePackagesRecordIterator(
                    final ListManagedInstanceUpdatablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceUpdatablePackagesRequest.Builder,
                ListManagedInstanceUpdatablePackagesRequest,
                ListManagedInstanceUpdatablePackagesResponse,
                com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceUpdatablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesRequest.Builder get() {
                        return ListManagedInstanceUpdatablePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceUpdatablePackagesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceUpdatablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceUpdatablePackagesRequest.Builder>,
                        ListManagedInstanceUpdatablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceUpdatablePackagesRequest.Builder>
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
                        ListManagedInstanceUpdatablePackagesRequest,
                        ListManagedInstanceUpdatablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceUpdatablePackagesResponse apply(
                            ListManagedInstanceUpdatablePackagesRequest request) {
                        return client.listManagedInstanceUpdatablePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceUpdatablePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.UpdatablePackageSummary>
                            apply(ListManagedInstanceUpdatablePackagesResponse response) {
                        return response.getUpdatablePackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstances operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstancesResponse> listManagedInstancesResponseIterator(
            final ListManagedInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstancesRequest.Builder,
                ListManagedInstancesRequest,
                ListManagedInstancesResponse>(
                new java.util.function.Supplier<ListManagedInstancesRequest.Builder>() {
                    @Override
                    public ListManagedInstancesRequest.Builder get() {
                        return ListManagedInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstancesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesRequest.Builder>,
                        ListManagedInstancesRequest>() {
                    @Override
                    public ListManagedInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesRequest.Builder>
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
                        ListManagedInstancesRequest, ListManagedInstancesResponse>() {
                    @Override
                    public ListManagedInstancesResponse apply(ListManagedInstancesRequest request) {
                        return client.listManagedInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary} objects contained in responses
     * from the listManagedInstances operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>
            listManagedInstancesRecordIterator(final ListManagedInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstancesRequest.Builder,
                ListManagedInstancesRequest,
                ListManagedInstancesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>(
                new java.util.function.Supplier<ListManagedInstancesRequest.Builder>() {
                    @Override
                    public ListManagedInstancesRequest.Builder get() {
                        return ListManagedInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstancesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesRequest.Builder>,
                        ListManagedInstancesRequest>() {
                    @Override
                    public ListManagedInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesRequest.Builder>
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
                        ListManagedInstancesRequest, ListManagedInstancesResponse>() {
                    @Override
                    public ListManagedInstancesResponse apply(ListManagedInstancesRequest request) {
                        return client.listManagedInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstancesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model.ManagedInstanceSummary>
                            apply(ListManagedInstancesResponse response) {
                        return response.getManagedInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWindowsUpdates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWindowsUpdatesResponse> listWindowsUpdatesResponseIterator(
            final ListWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWindowsUpdatesRequest.Builder,
                ListWindowsUpdatesRequest,
                ListWindowsUpdatesResponse>(
                new java.util.function.Supplier<ListWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListWindowsUpdatesRequest.Builder get() {
                        return ListWindowsUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(ListWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWindowsUpdatesRequest.Builder>,
                        ListWindowsUpdatesRequest>() {
                    @Override
                    public ListWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWindowsUpdatesRequest.Builder>
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
                        ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>() {
                    @Override
                    public ListWindowsUpdatesResponse apply(ListWindowsUpdatesRequest request) {
                        return client.listWindowsUpdates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary} objects contained in responses
     * from the listWindowsUpdates operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary>
            listWindowsUpdatesRecordIterator(final ListWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWindowsUpdatesRequest.Builder,
                ListWindowsUpdatesRequest,
                ListWindowsUpdatesResponse,
                com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary>(
                new java.util.function.Supplier<ListWindowsUpdatesRequest.Builder>() {
                    @Override
                    public ListWindowsUpdatesRequest.Builder get() {
                        return ListWindowsUpdatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWindowsUpdatesResponse, String>() {
                    @Override
                    public String apply(ListWindowsUpdatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWindowsUpdatesRequest.Builder>,
                        ListWindowsUpdatesRequest>() {
                    @Override
                    public ListWindowsUpdatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWindowsUpdatesRequest.Builder>
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
                        ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>() {
                    @Override
                    public ListWindowsUpdatesResponse apply(ListWindowsUpdatesRequest request) {
                        return client.listWindowsUpdates(request);
                    }
                },
                new java.util.function.Function<
                        ListWindowsUpdatesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagementhub.model.WindowsUpdateSummary>
                            apply(ListWindowsUpdatesResponse response) {
                        return response.getWindowsUpdateCollection().getItems();
                    }
                });
    }
}

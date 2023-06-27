/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ManagedInstanceGroup where multiple pages of data may be fetched. Two
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
public class ManagedInstanceGroupPaginators {
    private final ManagedInstanceGroup client;

    public ManagedInstanceGroupPaginators(ManagedInstanceGroup client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroupAvailableModules operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupAvailableModulesResponse>
            listManagedInstanceGroupAvailableModulesResponseIterator(
                    final ListManagedInstanceGroupAvailableModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupAvailableModulesRequest.Builder,
                ListManagedInstanceGroupAvailableModulesRequest,
                ListManagedInstanceGroupAvailableModulesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailableModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailableModulesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupAvailableModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailableModulesRequest.Builder>,
                        ListManagedInstanceGroupAvailableModulesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailableModulesRequest.Builder>
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
                        ListManagedInstanceGroupAvailableModulesRequest,
                        ListManagedInstanceGroupAvailableModulesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesResponse apply(
                            ListManagedInstanceGroupAvailableModulesRequest request) {
                        return client.listManagedInstanceGroupAvailableModules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleSummary} objects
     * contained in responses from the listManagedInstanceGroupAvailableModules operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleSummary>
            listManagedInstanceGroupAvailableModulesRecordIterator(
                    final ListManagedInstanceGroupAvailableModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupAvailableModulesRequest.Builder,
                ListManagedInstanceGroupAvailableModulesRequest,
                ListManagedInstanceGroupAvailableModulesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailableModuleSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailableModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailableModulesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupAvailableModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailableModulesRequest.Builder>,
                        ListManagedInstanceGroupAvailableModulesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailableModulesRequest.Builder>
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
                        ListManagedInstanceGroupAvailableModulesRequest,
                        ListManagedInstanceGroupAvailableModulesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailableModulesResponse apply(
                            ListManagedInstanceGroupAvailableModulesRequest request) {
                        return client.listManagedInstanceGroupAvailableModules(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableModulesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceGroupAvailableModuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceGroupAvailableModuleSummary>
                            apply(ListManagedInstanceGroupAvailableModulesResponse response) {
                        return response.getManagedInstanceGroupAvailableModuleCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroupAvailablePackages operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupAvailablePackagesResponse>
            listManagedInstanceGroupAvailablePackagesResponseIterator(
                    final ListManagedInstanceGroupAvailablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupAvailablePackagesRequest.Builder,
                ListManagedInstanceGroupAvailablePackagesRequest,
                ListManagedInstanceGroupAvailablePackagesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailablePackagesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailablePackagesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupAvailablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailablePackagesRequest.Builder>,
                        ListManagedInstanceGroupAvailablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailablePackagesRequest
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
                        ListManagedInstanceGroupAvailablePackagesRequest,
                        ListManagedInstanceGroupAvailablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesResponse apply(
                            ListManagedInstanceGroupAvailablePackagesRequest request) {
                        return client.listManagedInstanceGroupAvailablePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailablePackageSummary} objects
     * contained in responses from the listManagedInstanceGroupAvailablePackages operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailablePackageSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.osmanagementhub.model
                            .ManagedInstanceGroupAvailablePackageSummary>
            listManagedInstanceGroupAvailablePackagesRecordIterator(
                    final ListManagedInstanceGroupAvailablePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupAvailablePackagesRequest.Builder,
                ListManagedInstanceGroupAvailablePackagesRequest,
                ListManagedInstanceGroupAvailablePackagesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupAvailablePackageSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailablePackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailablePackagesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailablePackagesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupAvailablePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailablePackagesRequest.Builder>,
                        ListManagedInstanceGroupAvailablePackagesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailablePackagesRequest
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
                        ListManagedInstanceGroupAvailablePackagesRequest,
                        ListManagedInstanceGroupAvailablePackagesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailablePackagesResponse apply(
                            ListManagedInstanceGroupAvailablePackagesRequest request) {
                        return client.listManagedInstanceGroupAvailablePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailablePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceGroupAvailablePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceGroupAvailablePackageSummary>
                            apply(ListManagedInstanceGroupAvailablePackagesResponse response) {
                        return response.getManagedInstanceGroupAvailablePackageCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroupAvailableSoftwareSources operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
            listManagedInstanceGroupAvailableSoftwareSourcesResponseIterator(
                    final ListManagedInstanceGroupAvailableSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder,
                ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                ListManagedInstanceGroupAvailableSoftwareSourcesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailableSoftwareSourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupAvailableSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder>,
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailableSoftwareSourcesRequest
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
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesResponse apply(
                            ListManagedInstanceGroupAvailableSoftwareSourcesRequest request) {
                        return client.listManagedInstanceGroupAvailableSoftwareSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary} objects contained in
     * responses from the listManagedInstanceGroupAvailableSoftwareSources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary>
            listManagedInstanceGroupAvailableSoftwareSourcesRecordIterator(
                    final ListManagedInstanceGroupAvailableSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder,
                ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                ListManagedInstanceGroupAvailableSoftwareSourcesResponse,
                com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder get() {
                        return ListManagedInstanceGroupAvailableSoftwareSourcesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupAvailableSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupAvailableSoftwareSourcesRequest.Builder>,
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupAvailableSoftwareSourcesRequest
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
                        ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse>() {
                    @Override
                    public ListManagedInstanceGroupAvailableSoftwareSourcesResponse apply(
                            ListManagedInstanceGroupAvailableSoftwareSourcesRequest request) {
                        return client.listManagedInstanceGroupAvailableSoftwareSources(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupAvailableSoftwareSourcesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .AvailableSoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .AvailableSoftwareSourceSummary>
                            apply(
                                    ListManagedInstanceGroupAvailableSoftwareSourcesResponse
                                            response) {
                        return response.getAvailableSoftwareSourceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroupInstalledPackages operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupInstalledPackagesResponse>
            listManagedInstanceGroupInstalledPackagesResponseIterator(
                    final ListManagedInstanceGroupInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupInstalledPackagesRequest.Builder,
                ListManagedInstanceGroupInstalledPackagesRequest,
                ListManagedInstanceGroupInstalledPackagesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesRequest.Builder get() {
                        return ListManagedInstanceGroupInstalledPackagesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupInstalledPackagesRequest.Builder>,
                        ListManagedInstanceGroupInstalledPackagesRequest>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupInstalledPackagesRequest
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
                        ListManagedInstanceGroupInstalledPackagesRequest,
                        ListManagedInstanceGroupInstalledPackagesResponse>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesResponse apply(
                            ListManagedInstanceGroupInstalledPackagesRequest request) {
                        return client.listManagedInstanceGroupInstalledPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupInstalledPackageSummary} objects
     * contained in responses from the listManagedInstanceGroupInstalledPackages operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupInstalledPackageSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.osmanagementhub.model
                            .ManagedInstanceGroupInstalledPackageSummary>
            listManagedInstanceGroupInstalledPackagesRecordIterator(
                    final ListManagedInstanceGroupInstalledPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupInstalledPackagesRequest.Builder,
                ListManagedInstanceGroupInstalledPackagesRequest,
                ListManagedInstanceGroupInstalledPackagesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupInstalledPackageSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceGroupInstalledPackagesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesRequest.Builder get() {
                        return ListManagedInstanceGroupInstalledPackagesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupInstalledPackagesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceGroupInstalledPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupInstalledPackagesRequest.Builder>,
                        ListManagedInstanceGroupInstalledPackagesRequest>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupInstalledPackagesRequest
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
                        ListManagedInstanceGroupInstalledPackagesRequest,
                        ListManagedInstanceGroupInstalledPackagesResponse>() {
                    @Override
                    public ListManagedInstanceGroupInstalledPackagesResponse apply(
                            ListManagedInstanceGroupInstalledPackagesRequest request) {
                        return client.listManagedInstanceGroupInstalledPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupInstalledPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceGroupInstalledPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceGroupInstalledPackageSummary>
                            apply(ListManagedInstanceGroupInstalledPackagesResponse response) {
                        return response.getManagedInstanceGroupInstalledPackageCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroupModules operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupModulesResponse>
            listManagedInstanceGroupModulesResponseIterator(
                    final ListManagedInstanceGroupModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupModulesRequest.Builder,
                ListManagedInstanceGroupModulesRequest,
                ListManagedInstanceGroupModulesResponse>(
                new java.util.function.Supplier<ListManagedInstanceGroupModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupModulesRequest.Builder get() {
                        return ListManagedInstanceGroupModulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceGroupModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupModulesRequest.Builder>,
                        ListManagedInstanceGroupModulesRequest>() {
                    @Override
                    public ListManagedInstanceGroupModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupModulesRequest.Builder>
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
                        ListManagedInstanceGroupModulesRequest,
                        ListManagedInstanceGroupModulesResponse>() {
                    @Override
                    public ListManagedInstanceGroupModulesResponse apply(
                            ListManagedInstanceGroupModulesRequest request) {
                        return client.listManagedInstanceGroupModules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupModuleSummary} objects contained in
     * responses from the listManagedInstanceGroupModules operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupModuleSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupModuleSummary>
            listManagedInstanceGroupModulesRecordIterator(
                    final ListManagedInstanceGroupModulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupModulesRequest.Builder,
                ListManagedInstanceGroupModulesRequest,
                ListManagedInstanceGroupModulesResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupModuleSummary>(
                new java.util.function.Supplier<ListManagedInstanceGroupModulesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupModulesRequest.Builder get() {
                        return ListManagedInstanceGroupModulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceGroupModulesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupModulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupModulesRequest.Builder>,
                        ListManagedInstanceGroupModulesRequest>() {
                    @Override
                    public ListManagedInstanceGroupModulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupModulesRequest.Builder>
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
                        ListManagedInstanceGroupModulesRequest,
                        ListManagedInstanceGroupModulesResponse>() {
                    @Override
                    public ListManagedInstanceGroupModulesResponse apply(
                            ListManagedInstanceGroupModulesRequest request) {
                        return client.listManagedInstanceGroupModules(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupModulesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceGroupModuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceGroupModuleSummary>
                            apply(ListManagedInstanceGroupModulesResponse response) {
                        return response.getManagedInstanceGroupModuleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceGroups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceGroupsResponse> listManagedInstanceGroupsResponseIterator(
            final ListManagedInstanceGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceGroupsRequest.Builder,
                ListManagedInstanceGroupsRequest,
                ListManagedInstanceGroupsResponse>(
                new java.util.function.Supplier<ListManagedInstanceGroupsRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupsRequest.Builder get() {
                        return ListManagedInstanceGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupsRequest.Builder>,
                        ListManagedInstanceGroupsRequest>() {
                    @Override
                    public ListManagedInstanceGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupsRequest.Builder>
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
                        ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>() {
                    @Override
                    public ListManagedInstanceGroupsResponse apply(
                            ListManagedInstanceGroupsRequest request) {
                        return client.listManagedInstanceGroups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupSummary} objects contained in
     * responses from the listManagedInstanceGroups operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupSummary>
            listManagedInstanceGroupsRecordIterator(
                    final ListManagedInstanceGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupsRequest.Builder,
                ListManagedInstanceGroupsRequest,
                ListManagedInstanceGroupsResponse,
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroupSummary>(
                new java.util.function.Supplier<ListManagedInstanceGroupsRequest.Builder>() {
                    @Override
                    public ListManagedInstanceGroupsRequest.Builder get() {
                        return ListManagedInstanceGroupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceGroupsResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceGroupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceGroupsRequest.Builder>,
                        ListManagedInstanceGroupsRequest>() {
                    @Override
                    public ListManagedInstanceGroupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceGroupsRequest.Builder>
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
                        ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>() {
                    @Override
                    public ListManagedInstanceGroupsResponse apply(
                            ListManagedInstanceGroupsRequest request) {
                        return client.listManagedInstanceGroups(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceGroupsResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagementhub.model
                                        .ManagedInstanceGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagementhub.model
                                            .ManagedInstanceGroupSummary>
                            apply(ListManagedInstanceGroupsResponse response) {
                        return response.getManagedInstanceGroupCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OsManagement where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class OsManagementPaginators {
    private final OsManagement client;

    public OsManagementPaginators(OsManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailablePackagesForManagedInstance operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailablePackagesForManagedInstanceResponse>
            listAvailablePackagesForManagedInstanceResponseIterator(
                    final ListAvailablePackagesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailablePackagesForManagedInstanceRequest.Builder,
                ListAvailablePackagesForManagedInstanceRequest,
                ListAvailablePackagesForManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListAvailablePackagesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceRequest.Builder get() {
                        return ListAvailablePackagesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailablePackagesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListAvailablePackagesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailablePackagesForManagedInstanceRequest.Builder>,
                        ListAvailablePackagesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailablePackagesForManagedInstanceRequest.Builder>
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
                        ListAvailablePackagesForManagedInstanceRequest,
                        ListAvailablePackagesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceResponse apply(
                            ListAvailablePackagesForManagedInstanceRequest request) {
                        return client.listAvailablePackagesForManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.InstallablePackageSummary} objects contained in responses
     * from the listAvailablePackagesForManagedInstance operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.InstallablePackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.InstallablePackageSummary>
            listAvailablePackagesForManagedInstanceRecordIterator(
                    final ListAvailablePackagesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailablePackagesForManagedInstanceRequest.Builder,
                ListAvailablePackagesForManagedInstanceRequest,
                ListAvailablePackagesForManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.InstallablePackageSummary>(
                new java.util.function.Supplier<
                        ListAvailablePackagesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceRequest.Builder get() {
                        return ListAvailablePackagesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailablePackagesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListAvailablePackagesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailablePackagesForManagedInstanceRequest.Builder>,
                        ListAvailablePackagesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailablePackagesForManagedInstanceRequest.Builder>
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
                        ListAvailablePackagesForManagedInstanceRequest,
                        ListAvailablePackagesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailablePackagesForManagedInstanceResponse apply(
                            ListAvailablePackagesForManagedInstanceRequest request) {
                        return client.listAvailablePackagesForManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailablePackagesForManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.InstallablePackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.InstallablePackageSummary>
                            apply(ListAvailablePackagesForManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailableSoftwareSourcesForManagedInstance operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailableSoftwareSourcesForManagedInstanceResponse>
            listAvailableSoftwareSourcesForManagedInstanceResponseIterator(
                    final ListAvailableSoftwareSourcesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder,
                ListAvailableSoftwareSourcesForManagedInstanceRequest,
                ListAvailableSoftwareSourcesForManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder get() {
                        return ListAvailableSoftwareSourcesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableSoftwareSourcesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListAvailableSoftwareSourcesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder>,
                        ListAvailableSoftwareSourcesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableSoftwareSourcesForManagedInstanceRequest
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
                        ListAvailableSoftwareSourcesForManagedInstanceRequest,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceResponse apply(
                            ListAvailableSoftwareSourcesForManagedInstanceRequest request) {
                        return client.listAvailableSoftwareSourcesForManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.AvailableSoftwareSourceSummary} objects contained in
     * responses from the listAvailableSoftwareSourcesForManagedInstance operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.AvailableSoftwareSourceSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.AvailableSoftwareSourceSummary>
            listAvailableSoftwareSourcesForManagedInstanceRecordIterator(
                    final ListAvailableSoftwareSourcesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder,
                ListAvailableSoftwareSourcesForManagedInstanceRequest,
                ListAvailableSoftwareSourcesForManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.AvailableSoftwareSourceSummary>(
                new java.util.function.Supplier<
                        ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder get() {
                        return ListAvailableSoftwareSourcesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableSoftwareSourcesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListAvailableSoftwareSourcesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableSoftwareSourcesForManagedInstanceRequest.Builder>,
                        ListAvailableSoftwareSourcesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableSoftwareSourcesForManagedInstanceRequest
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
                        ListAvailableSoftwareSourcesForManagedInstanceRequest,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableSoftwareSourcesForManagedInstanceResponse apply(
                            ListAvailableSoftwareSourcesForManagedInstanceRequest request) {
                        return client.listAvailableSoftwareSourcesForManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableSoftwareSourcesForManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model
                                        .AvailableSoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model
                                            .AvailableSoftwareSourceSummary>
                            apply(ListAvailableSoftwareSourcesForManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailableUpdatesForManagedInstance operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailableUpdatesForManagedInstanceResponse>
            listAvailableUpdatesForManagedInstanceResponseIterator(
                    final ListAvailableUpdatesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableUpdatesForManagedInstanceRequest.Builder,
                ListAvailableUpdatesForManagedInstanceRequest,
                ListAvailableUpdatesForManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListAvailableUpdatesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceRequest.Builder get() {
                        return ListAvailableUpdatesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableUpdatesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListAvailableUpdatesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableUpdatesForManagedInstanceRequest.Builder>,
                        ListAvailableUpdatesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableUpdatesForManagedInstanceRequest.Builder>
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
                        ListAvailableUpdatesForManagedInstanceRequest,
                        ListAvailableUpdatesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceResponse apply(
                            ListAvailableUpdatesForManagedInstanceRequest request) {
                        return client.listAvailableUpdatesForManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.AvailableUpdateSummary} objects contained in responses from
     * the listAvailableUpdatesForManagedInstance operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.AvailableUpdateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.AvailableUpdateSummary>
            listAvailableUpdatesForManagedInstanceRecordIterator(
                    final ListAvailableUpdatesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableUpdatesForManagedInstanceRequest.Builder,
                ListAvailableUpdatesForManagedInstanceRequest,
                ListAvailableUpdatesForManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.AvailableUpdateSummary>(
                new java.util.function.Supplier<
                        ListAvailableUpdatesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceRequest.Builder get() {
                        return ListAvailableUpdatesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableUpdatesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListAvailableUpdatesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableUpdatesForManagedInstanceRequest.Builder>,
                        ListAvailableUpdatesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableUpdatesForManagedInstanceRequest.Builder>
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
                        ListAvailableUpdatesForManagedInstanceRequest,
                        ListAvailableUpdatesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableUpdatesForManagedInstanceResponse apply(
                            ListAvailableUpdatesForManagedInstanceRequest request) {
                        return client.listAvailableUpdatesForManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableUpdatesForManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.AvailableUpdateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.AvailableUpdateSummary>
                            apply(ListAvailableUpdatesForManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAvailableWindowsUpdatesForManagedInstance operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAvailableWindowsUpdatesForManagedInstanceResponse>
            listAvailableWindowsUpdatesForManagedInstanceResponseIterator(
                    final ListAvailableWindowsUpdatesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder,
                ListAvailableWindowsUpdatesForManagedInstanceRequest,
                ListAvailableWindowsUpdatesForManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder get() {
                        return ListAvailableWindowsUpdatesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableWindowsUpdatesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListAvailableWindowsUpdatesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder>,
                        ListAvailableWindowsUpdatesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableWindowsUpdatesForManagedInstanceRequest
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
                        ListAvailableWindowsUpdatesForManagedInstanceRequest,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceResponse apply(
                            ListAvailableWindowsUpdatesForManagedInstanceRequest request) {
                        return client.listAvailableWindowsUpdatesForManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary} objects contained in
     * responses from the listAvailableWindowsUpdatesForManagedInstance operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary>
            listAvailableWindowsUpdatesForManagedInstanceRecordIterator(
                    final ListAvailableWindowsUpdatesForManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder,
                ListAvailableWindowsUpdatesForManagedInstanceRequest,
                ListAvailableWindowsUpdatesForManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary>(
                new java.util.function.Supplier<
                        ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder get() {
                        return ListAvailableWindowsUpdatesForManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableWindowsUpdatesForManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListAvailableWindowsUpdatesForManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAvailableWindowsUpdatesForManagedInstanceRequest.Builder>,
                        ListAvailableWindowsUpdatesForManagedInstanceRequest>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAvailableWindowsUpdatesForManagedInstanceRequest
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
                        ListAvailableWindowsUpdatesForManagedInstanceRequest,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse>() {
                    @Override
                    public ListAvailableWindowsUpdatesForManagedInstanceResponse apply(
                            ListAvailableWindowsUpdatesForManagedInstanceRequest request) {
                        return client.listAvailableWindowsUpdatesForManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListAvailableWindowsUpdatesForManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model
                                        .AvailableWindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.AvailableWindowsUpdateSummary>
                            apply(ListAvailableWindowsUpdatesForManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listErrata
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListErrataResponse> listErrataResponseIterator(
            final ListErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListErrataRequest.Builder, ListErrataRequest, ListErrataResponse>(
                new java.util.function.Supplier<ListErrataRequest.Builder>() {
                    @Override
                    public ListErrataRequest.Builder get() {
                        return ListErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListErrataResponse, String>() {
                    @Override
                    public String apply(ListErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListErrataRequest.Builder>,
                        ListErrataRequest>() {
                    @Override
                    public ListErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListErrataRequest.Builder>
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
                new java.util.function.Function<ListErrataRequest, ListErrataResponse>() {
                    @Override
                    public ListErrataResponse apply(ListErrataRequest request) {
                        return client.listErrata(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ErratumSummary} objects contained in responses from the
     * listErrata operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ErratumSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ErratumSummary> listErrataRecordIterator(
            final ListErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListErrataRequest.Builder,
                ListErrataRequest,
                ListErrataResponse,
                com.oracle.bmc.osmanagement.model.ErratumSummary>(
                new java.util.function.Supplier<ListErrataRequest.Builder>() {
                    @Override
                    public ListErrataRequest.Builder get() {
                        return ListErrataRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListErrataResponse, String>() {
                    @Override
                    public String apply(ListErrataResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListErrataRequest.Builder>,
                        ListErrataRequest>() {
                    @Override
                    public ListErrataRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListErrataRequest.Builder>
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
                new java.util.function.Function<ListErrataRequest, ListErrataResponse>() {
                    @Override
                    public ListErrataResponse apply(ListErrataRequest request) {
                        return client.listErrata(request);
                    }
                },
                new java.util.function.Function<
                        ListErrataResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.ErratumSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ErratumSummary> apply(
                            ListErrataResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.osmanagement.model.ErratumSummary} objects contained in responses from the
     * listManagedInstanceErrata operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ErratumSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ErratumSummary>
            listManagedInstanceErrataRecordIterator(
                    final ListManagedInstanceErrataRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceErrataRequest.Builder,
                ListManagedInstanceErrataRequest,
                ListManagedInstanceErrataResponse,
                com.oracle.bmc.osmanagement.model.ErratumSummary>(
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
                        java.util.List<com.oracle.bmc.osmanagement.model.ErratumSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ErratumSummary> apply(
                            ListManagedInstanceErrataResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary} objects contained in responses
     * from the listManagedInstanceGroups operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary>
            listManagedInstanceGroupsRecordIterator(
                    final ListManagedInstanceGroupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceGroupsRequest.Builder,
                ListManagedInstanceGroupsRequest,
                ListManagedInstanceGroupsResponse,
                com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary>(
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
                                com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.ManagedInstanceGroupSummary>
                            apply(ListManagedInstanceGroupsResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.osmanagement.model.ManagedInstanceSummary} objects contained in responses from
     * the listManagedInstances operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ManagedInstanceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ManagedInstanceSummary>
            listManagedInstancesRecordIterator(final ListManagedInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstancesRequest.Builder,
                ListManagedInstancesRequest,
                ListManagedInstancesResponse,
                com.oracle.bmc.osmanagement.model.ManagedInstanceSummary>(
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
                                com.oracle.bmc.osmanagement.model.ManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ManagedInstanceSummary>
                            apply(ListManagedInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModuleStreamProfiles operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModuleStreamProfilesResponse> listModuleStreamProfilesResponseIterator(
            final ListModuleStreamProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamProfilesRequest.Builder,
                ListModuleStreamProfilesRequest,
                ListModuleStreamProfilesResponse>(
                new java.util.function.Supplier<ListModuleStreamProfilesRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesRequest.Builder get() {
                        return ListModuleStreamProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamProfilesResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesRequest.Builder>,
                        ListModuleStreamProfilesRequest>() {
                    @Override
                    public ListModuleStreamProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesRequest.Builder>
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
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>() {
                    @Override
                    public ListModuleStreamProfilesResponse apply(
                            ListModuleStreamProfilesRequest request) {
                        return client.listModuleStreamProfiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary} objects contained in responses
     * from the listModuleStreamProfiles operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary>
            listModuleStreamProfilesRecordIterator(final ListModuleStreamProfilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamProfilesRequest.Builder,
                ListModuleStreamProfilesRequest,
                ListModuleStreamProfilesResponse,
                com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary>(
                new java.util.function.Supplier<ListModuleStreamProfilesRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesRequest.Builder get() {
                        return ListModuleStreamProfilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamProfilesResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamProfilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesRequest.Builder>,
                        ListModuleStreamProfilesRequest>() {
                    @Override
                    public ListModuleStreamProfilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesRequest.Builder>
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
                        ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>() {
                    @Override
                    public ListModuleStreamProfilesResponse apply(
                            ListModuleStreamProfilesRequest request) {
                        return client.listModuleStreamProfiles(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamProfilesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.ModuleStreamProfileSummary>
                            apply(ListModuleStreamProfilesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModuleStreamProfilesOnManagedInstance operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModuleStreamProfilesOnManagedInstanceResponse>
            listModuleStreamProfilesOnManagedInstanceResponseIterator(
                    final ListModuleStreamProfilesOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamProfilesOnManagedInstanceRequest.Builder,
                ListModuleStreamProfilesOnManagedInstanceRequest,
                ListModuleStreamProfilesOnManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListModuleStreamProfilesOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceRequest.Builder get() {
                        return ListModuleStreamProfilesOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamProfilesOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListModuleStreamProfilesOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesOnManagedInstanceRequest.Builder>,
                        ListModuleStreamProfilesOnManagedInstanceRequest>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesOnManagedInstanceRequest
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
                        ListModuleStreamProfilesOnManagedInstanceRequest,
                        ListModuleStreamProfilesOnManagedInstanceResponse>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceResponse apply(
                            ListModuleStreamProfilesOnManagedInstanceRequest request) {
                        return client.listModuleStreamProfilesOnManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ModuleStreamProfileOnManagedInstanceSummary} objects
     * contained in responses from the listModuleStreamProfilesOnManagedInstance operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ModuleStreamProfileOnManagedInstanceSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ModuleStreamProfileOnManagedInstanceSummary>
            listModuleStreamProfilesOnManagedInstanceRecordIterator(
                    final ListModuleStreamProfilesOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamProfilesOnManagedInstanceRequest.Builder,
                ListModuleStreamProfilesOnManagedInstanceRequest,
                ListModuleStreamProfilesOnManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.ModuleStreamProfileOnManagedInstanceSummary>(
                new java.util.function.Supplier<
                        ListModuleStreamProfilesOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceRequest.Builder get() {
                        return ListModuleStreamProfilesOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamProfilesOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListModuleStreamProfilesOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamProfilesOnManagedInstanceRequest.Builder>,
                        ListModuleStreamProfilesOnManagedInstanceRequest>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamProfilesOnManagedInstanceRequest
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
                        ListModuleStreamProfilesOnManagedInstanceRequest,
                        ListModuleStreamProfilesOnManagedInstanceResponse>() {
                    @Override
                    public ListModuleStreamProfilesOnManagedInstanceResponse apply(
                            ListModuleStreamProfilesOnManagedInstanceRequest request) {
                        return client.listModuleStreamProfilesOnManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamProfilesOnManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model
                                        .ModuleStreamProfileOnManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model
                                            .ModuleStreamProfileOnManagedInstanceSummary>
                            apply(ListModuleStreamProfilesOnManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModuleStreams operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModuleStreamsResponse> listModuleStreamsResponseIterator(
            final ListModuleStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamsRequest.Builder,
                ListModuleStreamsRequest,
                ListModuleStreamsResponse>(
                new java.util.function.Supplier<ListModuleStreamsRequest.Builder>() {
                    @Override
                    public ListModuleStreamsRequest.Builder get() {
                        return ListModuleStreamsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamsResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsRequest.Builder>,
                        ListModuleStreamsRequest>() {
                    @Override
                    public ListModuleStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsRequest.Builder>
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
                        ListModuleStreamsRequest, ListModuleStreamsResponse>() {
                    @Override
                    public ListModuleStreamsResponse apply(ListModuleStreamsRequest request) {
                        return client.listModuleStreams(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ModuleStreamSummary} objects contained in responses from
     * the listModuleStreams operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ModuleStreamSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ModuleStreamSummary>
            listModuleStreamsRecordIterator(final ListModuleStreamsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamsRequest.Builder,
                ListModuleStreamsRequest,
                ListModuleStreamsResponse,
                com.oracle.bmc.osmanagement.model.ModuleStreamSummary>(
                new java.util.function.Supplier<ListModuleStreamsRequest.Builder>() {
                    @Override
                    public ListModuleStreamsRequest.Builder get() {
                        return ListModuleStreamsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListModuleStreamsResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsRequest.Builder>,
                        ListModuleStreamsRequest>() {
                    @Override
                    public ListModuleStreamsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsRequest.Builder>
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
                        ListModuleStreamsRequest, ListModuleStreamsResponse>() {
                    @Override
                    public ListModuleStreamsResponse apply(ListModuleStreamsRequest request) {
                        return client.listModuleStreams(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.ModuleStreamSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ModuleStreamSummary>
                            apply(ListModuleStreamsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listModuleStreamsOnManagedInstance operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListModuleStreamsOnManagedInstanceResponse>
            listModuleStreamsOnManagedInstanceResponseIterator(
                    final ListModuleStreamsOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListModuleStreamsOnManagedInstanceRequest.Builder,
                ListModuleStreamsOnManagedInstanceRequest,
                ListModuleStreamsOnManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListModuleStreamsOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceRequest.Builder get() {
                        return ListModuleStreamsOnManagedInstanceRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamsOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsOnManagedInstanceRequest.Builder>,
                        ListModuleStreamsOnManagedInstanceRequest>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsOnManagedInstanceRequest.Builder>
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
                        ListModuleStreamsOnManagedInstanceRequest,
                        ListModuleStreamsOnManagedInstanceResponse>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceResponse apply(
                            ListModuleStreamsOnManagedInstanceRequest request) {
                        return client.listModuleStreamsOnManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary} objects contained in
     * responses from the listModuleStreamsOnManagedInstance operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary>
            listModuleStreamsOnManagedInstanceRecordIterator(
                    final ListModuleStreamsOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListModuleStreamsOnManagedInstanceRequest.Builder,
                ListModuleStreamsOnManagedInstanceRequest,
                ListModuleStreamsOnManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.ModuleStreamOnManagedInstanceSummary>(
                new java.util.function.Supplier<
                        ListModuleStreamsOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceRequest.Builder get() {
                        return ListModuleStreamsOnManagedInstanceRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamsOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListModuleStreamsOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListModuleStreamsOnManagedInstanceRequest.Builder>,
                        ListModuleStreamsOnManagedInstanceRequest>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListModuleStreamsOnManagedInstanceRequest.Builder>
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
                        ListModuleStreamsOnManagedInstanceRequest,
                        ListModuleStreamsOnManagedInstanceResponse>() {
                    @Override
                    public ListModuleStreamsOnManagedInstanceResponse apply(
                            ListModuleStreamsOnManagedInstanceRequest request) {
                        return client.listModuleStreamsOnManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListModuleStreamsOnManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model
                                        .ModuleStreamOnManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model
                                            .ModuleStreamOnManagedInstanceSummary>
                            apply(ListModuleStreamsOnManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPackagesInstalledOnManagedInstance operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPackagesInstalledOnManagedInstanceResponse>
            listPackagesInstalledOnManagedInstanceResponseIterator(
                    final ListPackagesInstalledOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPackagesInstalledOnManagedInstanceRequest.Builder,
                ListPackagesInstalledOnManagedInstanceRequest,
                ListPackagesInstalledOnManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListPackagesInstalledOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceRequest.Builder get() {
                        return ListPackagesInstalledOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListPackagesInstalledOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListPackagesInstalledOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackagesInstalledOnManagedInstanceRequest.Builder>,
                        ListPackagesInstalledOnManagedInstanceRequest>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackagesInstalledOnManagedInstanceRequest.Builder>
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
                        ListPackagesInstalledOnManagedInstanceRequest,
                        ListPackagesInstalledOnManagedInstanceResponse>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceResponse apply(
                            ListPackagesInstalledOnManagedInstanceRequest request) {
                        return client.listPackagesInstalledOnManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.InstalledPackageSummary} objects contained in responses
     * from the listPackagesInstalledOnManagedInstance operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.InstalledPackageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.InstalledPackageSummary>
            listPackagesInstalledOnManagedInstanceRecordIterator(
                    final ListPackagesInstalledOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPackagesInstalledOnManagedInstanceRequest.Builder,
                ListPackagesInstalledOnManagedInstanceRequest,
                ListPackagesInstalledOnManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.InstalledPackageSummary>(
                new java.util.function.Supplier<
                        ListPackagesInstalledOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceRequest.Builder get() {
                        return ListPackagesInstalledOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListPackagesInstalledOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(ListPackagesInstalledOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackagesInstalledOnManagedInstanceRequest.Builder>,
                        ListPackagesInstalledOnManagedInstanceRequest>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackagesInstalledOnManagedInstanceRequest.Builder>
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
                        ListPackagesInstalledOnManagedInstanceRequest,
                        ListPackagesInstalledOnManagedInstanceResponse>() {
                    @Override
                    public ListPackagesInstalledOnManagedInstanceResponse apply(
                            ListPackagesInstalledOnManagedInstanceRequest request) {
                        return client.listPackagesInstalledOnManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListPackagesInstalledOnManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.InstalledPackageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.InstalledPackageSummary>
                            apply(ListPackagesInstalledOnManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listScheduledJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScheduledJobsResponse> listScheduledJobsResponseIterator(
            final ListScheduledJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListScheduledJobsRequest.Builder,
                ListScheduledJobsRequest,
                ListScheduledJobsResponse>(
                new java.util.function.Supplier<ListScheduledJobsRequest.Builder>() {
                    @Override
                    public ListScheduledJobsRequest.Builder get() {
                        return ListScheduledJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledJobsResponse, String>() {
                    @Override
                    public String apply(ListScheduledJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledJobsRequest.Builder>,
                        ListScheduledJobsRequest>() {
                    @Override
                    public ListScheduledJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledJobsRequest.Builder>
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
                        ListScheduledJobsRequest, ListScheduledJobsResponse>() {
                    @Override
                    public ListScheduledJobsResponse apply(ListScheduledJobsRequest request) {
                        return client.listScheduledJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ScheduledJobSummary} objects contained in responses from
     * the listScheduledJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ScheduledJobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>
            listScheduledJobsRecordIterator(final ListScheduledJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListScheduledJobsRequest.Builder,
                ListScheduledJobsRequest,
                ListScheduledJobsResponse,
                com.oracle.bmc.osmanagement.model.ScheduledJobSummary>(
                new java.util.function.Supplier<ListScheduledJobsRequest.Builder>() {
                    @Override
                    public ListScheduledJobsRequest.Builder get() {
                        return ListScheduledJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListScheduledJobsResponse, String>() {
                    @Override
                    public String apply(ListScheduledJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListScheduledJobsRequest.Builder>,
                        ListScheduledJobsRequest>() {
                    @Override
                    public ListScheduledJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListScheduledJobsRequest.Builder>
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
                        ListScheduledJobsRequest, ListScheduledJobsResponse>() {
                    @Override
                    public ListScheduledJobsResponse apply(ListScheduledJobsRequest request) {
                        return client.listScheduledJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListScheduledJobsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>
                            apply(ListScheduledJobsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSoftwareSourcePackages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSoftwareSourcePackagesResponse> listSoftwareSourcePackagesResponseIterator(
            final ListSoftwareSourcePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSoftwareSourcePackagesRequest.Builder,
                ListSoftwareSourcePackagesRequest,
                ListSoftwareSourcePackagesResponse>(
                new java.util.function.Supplier<ListSoftwareSourcePackagesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcePackagesRequest.Builder get() {
                        return ListSoftwareSourcePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcePackagesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcePackagesRequest.Builder>,
                        ListSoftwareSourcePackagesRequest>() {
                    @Override
                    public ListSoftwareSourcePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcePackagesRequest.Builder>
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
                        ListSoftwareSourcePackagesRequest, ListSoftwareSourcePackagesResponse>() {
                    @Override
                    public ListSoftwareSourcePackagesResponse apply(
                            ListSoftwareSourcePackagesRequest request) {
                        return client.listSoftwareSourcePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.SoftwarePackageSummary} objects contained in responses from
     * the listSoftwareSourcePackages operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.SoftwarePackageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.SoftwarePackageSummary>
            listSoftwareSourcePackagesRecordIterator(
                    final ListSoftwareSourcePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSoftwareSourcePackagesRequest.Builder,
                ListSoftwareSourcePackagesRequest,
                ListSoftwareSourcePackagesResponse,
                com.oracle.bmc.osmanagement.model.SoftwarePackageSummary>(
                new java.util.function.Supplier<ListSoftwareSourcePackagesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcePackagesRequest.Builder get() {
                        return ListSoftwareSourcePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcePackagesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcePackagesRequest.Builder>,
                        ListSoftwareSourcePackagesRequest>() {
                    @Override
                    public ListSoftwareSourcePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcePackagesRequest.Builder>
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
                        ListSoftwareSourcePackagesRequest, ListSoftwareSourcePackagesResponse>() {
                    @Override
                    public ListSoftwareSourcePackagesResponse apply(
                            ListSoftwareSourcePackagesRequest request) {
                        return client.listSoftwareSourcePackages(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwareSourcePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.SoftwarePackageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.SoftwarePackageSummary>
                            apply(ListSoftwareSourcePackagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSoftwareSources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSoftwareSourcesResponse> listSoftwareSourcesResponseIterator(
            final ListSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSoftwareSourcesRequest.Builder,
                ListSoftwareSourcesRequest,
                ListSoftwareSourcesResponse>(
                new java.util.function.Supplier<ListSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcesRequest.Builder get() {
                        return ListSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcesRequest.Builder>,
                        ListSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcesRequest.Builder>
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
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwareSourcesResponse apply(ListSoftwareSourcesRequest request) {
                        return client.listSoftwareSources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.SoftwareSourceSummary} objects contained in responses from
     * the listSoftwareSources operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.SoftwareSourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.SoftwareSourceSummary>
            listSoftwareSourcesRecordIterator(final ListSoftwareSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSoftwareSourcesRequest.Builder,
                ListSoftwareSourcesRequest,
                ListSoftwareSourcesResponse,
                com.oracle.bmc.osmanagement.model.SoftwareSourceSummary>(
                new java.util.function.Supplier<ListSoftwareSourcesRequest.Builder>() {
                    @Override
                    public ListSoftwareSourcesRequest.Builder get() {
                        return ListSoftwareSourcesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSoftwareSourcesResponse, String>() {
                    @Override
                    public String apply(ListSoftwareSourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSoftwareSourcesRequest.Builder>,
                        ListSoftwareSourcesRequest>() {
                    @Override
                    public ListSoftwareSourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSoftwareSourcesRequest.Builder>
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
                        ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>() {
                    @Override
                    public ListSoftwareSourcesResponse apply(ListSoftwareSourcesRequest request) {
                        return client.listSoftwareSources(request);
                    }
                },
                new java.util.function.Function<
                        ListSoftwareSourcesResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.SoftwareSourceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.SoftwareSourceSummary>
                            apply(ListSoftwareSourcesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listUpcomingScheduledJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListUpcomingScheduledJobsResponse> listUpcomingScheduledJobsResponseIterator(
            final ListUpcomingScheduledJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUpcomingScheduledJobsRequest.Builder,
                ListUpcomingScheduledJobsRequest,
                ListUpcomingScheduledJobsResponse>(
                new java.util.function.Supplier<ListUpcomingScheduledJobsRequest.Builder>() {
                    @Override
                    public ListUpcomingScheduledJobsRequest.Builder get() {
                        return ListUpcomingScheduledJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUpcomingScheduledJobsResponse, String>() {
                    @Override
                    public String apply(ListUpcomingScheduledJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUpcomingScheduledJobsRequest.Builder>,
                        ListUpcomingScheduledJobsRequest>() {
                    @Override
                    public ListUpcomingScheduledJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUpcomingScheduledJobsRequest.Builder>
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
                        ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>() {
                    @Override
                    public ListUpcomingScheduledJobsResponse apply(
                            ListUpcomingScheduledJobsRequest request) {
                        return client.listUpcomingScheduledJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.ScheduledJobSummary} objects contained in responses from
     * the listUpcomingScheduledJobs operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.ScheduledJobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>
            listUpcomingScheduledJobsRecordIterator(
                    final ListUpcomingScheduledJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUpcomingScheduledJobsRequest.Builder,
                ListUpcomingScheduledJobsRequest,
                ListUpcomingScheduledJobsResponse,
                com.oracle.bmc.osmanagement.model.ScheduledJobSummary>(
                new java.util.function.Supplier<ListUpcomingScheduledJobsRequest.Builder>() {
                    @Override
                    public ListUpcomingScheduledJobsRequest.Builder get() {
                        return ListUpcomingScheduledJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUpcomingScheduledJobsResponse, String>() {
                    @Override
                    public String apply(ListUpcomingScheduledJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUpcomingScheduledJobsRequest.Builder>,
                        ListUpcomingScheduledJobsRequest>() {
                    @Override
                    public ListUpcomingScheduledJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUpcomingScheduledJobsRequest.Builder>
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
                        ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>() {
                    @Override
                    public ListUpcomingScheduledJobsResponse apply(
                            ListUpcomingScheduledJobsRequest request) {
                        return client.listUpcomingScheduledJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListUpcomingScheduledJobsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.ScheduledJobSummary>
                            apply(ListUpcomingScheduledJobsResponse response) {
                        return response.getItems();
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
     * com.oracle.bmc.osmanagement.model.WindowsUpdateSummary} objects contained in responses from
     * the listWindowsUpdates operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.WindowsUpdateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.WindowsUpdateSummary>
            listWindowsUpdatesRecordIterator(final ListWindowsUpdatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWindowsUpdatesRequest.Builder,
                ListWindowsUpdatesRequest,
                ListWindowsUpdatesResponse,
                com.oracle.bmc.osmanagement.model.WindowsUpdateSummary>(
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
                        java.util.List<com.oracle.bmc.osmanagement.model.WindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.WindowsUpdateSummary>
                            apply(ListWindowsUpdatesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWindowsUpdatesInstalledOnManagedInstance operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWindowsUpdatesInstalledOnManagedInstanceResponse>
            listWindowsUpdatesInstalledOnManagedInstanceResponseIterator(
                    final ListWindowsUpdatesInstalledOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder,
                ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                ListWindowsUpdatesInstalledOnManagedInstanceResponse>(
                new java.util.function.Supplier<
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder get() {
                        return ListWindowsUpdatesInstalledOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListWindowsUpdatesInstalledOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder>,
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWindowsUpdatesInstalledOnManagedInstanceRequest
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
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceResponse apply(
                            ListWindowsUpdatesInstalledOnManagedInstanceRequest request) {
                        return client.listWindowsUpdatesInstalledOnManagedInstance(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary} objects contained in
     * responses from the listWindowsUpdatesInstalledOnManagedInstance operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary>
            listWindowsUpdatesInstalledOnManagedInstanceRecordIterator(
                    final ListWindowsUpdatesInstalledOnManagedInstanceRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder,
                ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                ListWindowsUpdatesInstalledOnManagedInstanceResponse,
                com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary>(
                new java.util.function.Supplier<
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder get() {
                        return ListWindowsUpdatesInstalledOnManagedInstanceRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse, String>() {
                    @Override
                    public String apply(
                            ListWindowsUpdatesInstalledOnManagedInstanceResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWindowsUpdatesInstalledOnManagedInstanceRequest.Builder>,
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWindowsUpdatesInstalledOnManagedInstanceRequest
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
                        ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse>() {
                    @Override
                    public ListWindowsUpdatesInstalledOnManagedInstanceResponse apply(
                            ListWindowsUpdatesInstalledOnManagedInstanceRequest request) {
                        return client.listWindowsUpdatesInstalledOnManagedInstance(request);
                    }
                },
                new java.util.function.Function<
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model
                                        .InstalledWindowsUpdateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.InstalledWindowsUpdateSummary>
                            apply(ListWindowsUpdatesInstalledOnManagedInstanceResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.osmanagement.model.WorkRequestError>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.WorkRequestLogEntry} objects contained in responses from
     * the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.osmanagement.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.osmanagement.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osmanagement.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * searchSoftwarePackages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<SearchSoftwarePackagesResponse> searchSoftwarePackagesResponseIterator(
            final SearchSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                SearchSoftwarePackagesRequest.Builder,
                SearchSoftwarePackagesRequest,
                SearchSoftwarePackagesResponse>(
                new java.util.function.Supplier<SearchSoftwarePackagesRequest.Builder>() {
                    @Override
                    public SearchSoftwarePackagesRequest.Builder get() {
                        return SearchSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<SearchSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(SearchSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                SearchSoftwarePackagesRequest.Builder>,
                        SearchSoftwarePackagesRequest>() {
                    @Override
                    public SearchSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            SearchSoftwarePackagesRequest.Builder>
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
                        SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>() {
                    @Override
                    public SearchSoftwarePackagesResponse apply(
                            SearchSoftwarePackagesRequest request) {
                        return client.searchSoftwarePackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary} objects contained in
     * responses from the searchSoftwarePackages operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary>
            searchSoftwarePackagesRecordIterator(final SearchSoftwarePackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                SearchSoftwarePackagesRequest.Builder,
                SearchSoftwarePackagesRequest,
                SearchSoftwarePackagesResponse,
                com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary>(
                new java.util.function.Supplier<SearchSoftwarePackagesRequest.Builder>() {
                    @Override
                    public SearchSoftwarePackagesRequest.Builder get() {
                        return SearchSoftwarePackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<SearchSoftwarePackagesResponse, String>() {
                    @Override
                    public String apply(SearchSoftwarePackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                SearchSoftwarePackagesRequest.Builder>,
                        SearchSoftwarePackagesRequest>() {
                    @Override
                    public SearchSoftwarePackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            SearchSoftwarePackagesRequest.Builder>
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
                        SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>() {
                    @Override
                    public SearchSoftwarePackagesResponse apply(
                            SearchSoftwarePackagesRequest request) {
                        return client.searchSoftwarePackages(request);
                    }
                },
                new java.util.function.Function<
                        SearchSoftwarePackagesResponse,
                        java.util.List<
                                com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osmanagement.model.SoftwarePackageSearchSummary>
                            apply(SearchSoftwarePackagesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

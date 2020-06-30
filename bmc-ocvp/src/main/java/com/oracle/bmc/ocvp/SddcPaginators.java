/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Sddc where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.RequiredArgsConstructor
public class SddcPaginators {
    private final Sddc client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listSddcs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSddcsResponse> listSddcsResponseIterator(final ListSddcsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSddcsRequest.Builder, ListSddcsRequest, ListSddcsResponse>(
                new com.google.common.base.Supplier<ListSddcsRequest.Builder>() {
                    @Override
                    public ListSddcsRequest.Builder get() {
                        return ListSddcsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSddcsResponse, String>() {
                    @Override
                    public String apply(ListSddcsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSddcsRequest.Builder>,
                        ListSddcsRequest>() {
                    @Override
                    public ListSddcsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSddcsRequest.Builder>
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
                new com.google.common.base.Function<ListSddcsRequest, ListSddcsResponse>() {
                    @Override
                    public ListSddcsResponse apply(ListSddcsRequest request) {
                        return client.listSddcs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.ocvp.model.SddcSummary} objects
     * contained in responses from the listSddcs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.ocvp.model.SddcSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.ocvp.model.SddcSummary> listSddcsRecordIterator(
            final ListSddcsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSddcsRequest.Builder, ListSddcsRequest, ListSddcsResponse,
                com.oracle.bmc.ocvp.model.SddcSummary>(
                new com.google.common.base.Supplier<ListSddcsRequest.Builder>() {
                    @Override
                    public ListSddcsRequest.Builder get() {
                        return ListSddcsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSddcsResponse, String>() {
                    @Override
                    public String apply(ListSddcsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSddcsRequest.Builder>,
                        ListSddcsRequest>() {
                    @Override
                    public ListSddcsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSddcsRequest.Builder>
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
                new com.google.common.base.Function<ListSddcsRequest, ListSddcsResponse>() {
                    @Override
                    public ListSddcsResponse apply(ListSddcsRequest request) {
                        return client.listSddcs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSddcsResponse,
                        java.util.List<com.oracle.bmc.ocvp.model.SddcSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ocvp.model.SddcSummary> apply(
                            ListSddcsResponse response) {
                        return response.getSddcCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSupportedVmwareSoftwareVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSupportedVmwareSoftwareVersionsResponse>
            listSupportedVmwareSoftwareVersionsResponseIterator(
                    final ListSupportedVmwareSoftwareVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSupportedVmwareSoftwareVersionsRequest.Builder,
                ListSupportedVmwareSoftwareVersionsRequest,
                ListSupportedVmwareSoftwareVersionsResponse>(
                new com.google.common.base.Supplier<
                        ListSupportedVmwareSoftwareVersionsRequest.Builder>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsRequest.Builder get() {
                        return ListSupportedVmwareSoftwareVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSupportedVmwareSoftwareVersionsResponse, String>() {
                    @Override
                    public String apply(ListSupportedVmwareSoftwareVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedVmwareSoftwareVersionsRequest.Builder>,
                        ListSupportedVmwareSoftwareVersionsRequest>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedVmwareSoftwareVersionsRequest.Builder>
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
                        ListSupportedVmwareSoftwareVersionsRequest,
                        ListSupportedVmwareSoftwareVersionsResponse>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsResponse apply(
                            ListSupportedVmwareSoftwareVersionsRequest request) {
                        return client.listSupportedVmwareSoftwareVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionSummary} objects
     * contained in responses from the listSupportedVmwareSoftwareVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionSummary>
            listSupportedVmwareSoftwareVersionsRecordIterator(
                    final ListSupportedVmwareSoftwareVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSupportedVmwareSoftwareVersionsRequest.Builder,
                ListSupportedVmwareSoftwareVersionsRequest,
                ListSupportedVmwareSoftwareVersionsResponse,
                com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionSummary>(
                new com.google.common.base.Supplier<
                        ListSupportedVmwareSoftwareVersionsRequest.Builder>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsRequest.Builder get() {
                        return ListSupportedVmwareSoftwareVersionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSupportedVmwareSoftwareVersionsResponse, String>() {
                    @Override
                    public String apply(ListSupportedVmwareSoftwareVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSupportedVmwareSoftwareVersionsRequest.Builder>,
                        ListSupportedVmwareSoftwareVersionsRequest>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSupportedVmwareSoftwareVersionsRequest.Builder>
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
                        ListSupportedVmwareSoftwareVersionsRequest,
                        ListSupportedVmwareSoftwareVersionsResponse>() {
                    @Override
                    public ListSupportedVmwareSoftwareVersionsResponse apply(
                            ListSupportedVmwareSoftwareVersionsRequest request) {
                        return client.listSupportedVmwareSoftwareVersions(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSupportedVmwareSoftwareVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.ocvp.model
                                        .SupportedVmwareSoftwareVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.ocvp.model.SupportedVmwareSoftwareVersionSummary>
                            apply(ListSupportedVmwareSoftwareVersionsResponse response) {
                        return response.getSupportedVmwareSoftwareVersionCollection().getItems();
                    }
                });
    }
}

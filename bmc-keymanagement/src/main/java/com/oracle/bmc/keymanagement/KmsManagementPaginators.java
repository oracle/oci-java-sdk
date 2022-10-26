/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of KmsManagement where multiple pages of data may be fetched. Two styles
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsManagementPaginators {
    private final KmsManagement client;

    public KmsManagementPaginators(KmsManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKeyVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKeyVersionsResponse> listKeyVersionsResponseIterator(
            final ListKeyVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKeyVersionsRequest.Builder, ListKeyVersionsRequest, ListKeyVersionsResponse>(
                new java.util.function.Supplier<ListKeyVersionsRequest.Builder>() {
                    @Override
                    public ListKeyVersionsRequest.Builder get() {
                        return ListKeyVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeyVersionsResponse, String>() {
                    @Override
                    public String apply(ListKeyVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyVersionsRequest.Builder>,
                        ListKeyVersionsRequest>() {
                    @Override
                    public ListKeyVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyVersionsRequest.Builder>
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
                new java.util.function.Function<ListKeyVersionsRequest, ListKeyVersionsResponse>() {
                    @Override
                    public ListKeyVersionsResponse apply(ListKeyVersionsRequest request) {
                        return client.listKeyVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.KeyVersionSummary} objects contained in responses from the
     * listKeyVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.KeyVersionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.KeyVersionSummary>
            listKeyVersionsRecordIterator(final ListKeyVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKeyVersionsRequest.Builder,
                ListKeyVersionsRequest,
                ListKeyVersionsResponse,
                com.oracle.bmc.keymanagement.model.KeyVersionSummary>(
                new java.util.function.Supplier<ListKeyVersionsRequest.Builder>() {
                    @Override
                    public ListKeyVersionsRequest.Builder get() {
                        return ListKeyVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeyVersionsResponse, String>() {
                    @Override
                    public String apply(ListKeyVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeyVersionsRequest.Builder>,
                        ListKeyVersionsRequest>() {
                    @Override
                    public ListKeyVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeyVersionsRequest.Builder>
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
                new java.util.function.Function<ListKeyVersionsRequest, ListKeyVersionsResponse>() {
                    @Override
                    public ListKeyVersionsResponse apply(ListKeyVersionsRequest request) {
                        return client.listKeyVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListKeyVersionsResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.KeyVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.KeyVersionSummary>
                            apply(ListKeyVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listKeys
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKeysResponse> listKeysResponseIterator(final ListKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListKeysRequest.Builder, ListKeysRequest, ListKeysResponse>(
                new java.util.function.Supplier<ListKeysRequest.Builder>() {
                    @Override
                    public ListKeysRequest.Builder get() {
                        return ListKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeysResponse, String>() {
                    @Override
                    public String apply(ListKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeysRequest.Builder>,
                        ListKeysRequest>() {
                    @Override
                    public ListKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeysRequest.Builder>
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
                new java.util.function.Function<ListKeysRequest, ListKeysResponse>() {
                    @Override
                    public ListKeysResponse apply(ListKeysRequest request) {
                        return client.listKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.KeySummary} objects contained in responses from the
     * listKeys operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.KeySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.KeySummary> listKeysRecordIterator(
            final ListKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListKeysRequest.Builder,
                ListKeysRequest,
                ListKeysResponse,
                com.oracle.bmc.keymanagement.model.KeySummary>(
                new java.util.function.Supplier<ListKeysRequest.Builder>() {
                    @Override
                    public ListKeysRequest.Builder get() {
                        return ListKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListKeysResponse, String>() {
                    @Override
                    public String apply(ListKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListKeysRequest.Builder>,
                        ListKeysRequest>() {
                    @Override
                    public ListKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListKeysRequest.Builder>
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
                new java.util.function.Function<ListKeysRequest, ListKeysResponse>() {
                    @Override
                    public ListKeysResponse apply(ListKeysRequest request) {
                        return client.listKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListKeysResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.KeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.KeySummary> apply(
                            ListKeysResponse response) {
                        return response.getItems();
                    }
                });
    }
}

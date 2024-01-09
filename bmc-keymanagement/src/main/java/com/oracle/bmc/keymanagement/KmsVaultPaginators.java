/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of KmsVault where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsVaultPaginators {
    private final KmsVault client;

    public KmsVaultPaginators(KmsVault client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVaultReplicas operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVaultReplicasResponse> listVaultReplicasResponseIterator(
            final ListVaultReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVaultReplicasRequest.Builder,
                ListVaultReplicasRequest,
                ListVaultReplicasResponse>(
                new java.util.function.Supplier<ListVaultReplicasRequest.Builder>() {
                    @Override
                    public ListVaultReplicasRequest.Builder get() {
                        return ListVaultReplicasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVaultReplicasResponse, String>() {
                    @Override
                    public String apply(ListVaultReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVaultReplicasRequest.Builder>,
                        ListVaultReplicasRequest>() {
                    @Override
                    public ListVaultReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVaultReplicasRequest.Builder>
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
                        ListVaultReplicasRequest, ListVaultReplicasResponse>() {
                    @Override
                    public ListVaultReplicasResponse apply(ListVaultReplicasRequest request) {
                        return client.listVaultReplicas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.VaultReplicaSummary} objects contained in responses from
     * the listVaultReplicas operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.VaultReplicaSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.VaultReplicaSummary>
            listVaultReplicasRecordIterator(final ListVaultReplicasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVaultReplicasRequest.Builder,
                ListVaultReplicasRequest,
                ListVaultReplicasResponse,
                com.oracle.bmc.keymanagement.model.VaultReplicaSummary>(
                new java.util.function.Supplier<ListVaultReplicasRequest.Builder>() {
                    @Override
                    public ListVaultReplicasRequest.Builder get() {
                        return ListVaultReplicasRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVaultReplicasResponse, String>() {
                    @Override
                    public String apply(ListVaultReplicasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVaultReplicasRequest.Builder>,
                        ListVaultReplicasRequest>() {
                    @Override
                    public ListVaultReplicasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVaultReplicasRequest.Builder>
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
                        ListVaultReplicasRequest, ListVaultReplicasResponse>() {
                    @Override
                    public ListVaultReplicasResponse apply(ListVaultReplicasRequest request) {
                        return client.listVaultReplicas(request);
                    }
                },
                new java.util.function.Function<
                        ListVaultReplicasResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.VaultReplicaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.VaultReplicaSummary>
                            apply(ListVaultReplicasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVaults
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVaultsResponse> listVaultsResponseIterator(
            final ListVaultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVaultsRequest.Builder, ListVaultsRequest, ListVaultsResponse>(
                new java.util.function.Supplier<ListVaultsRequest.Builder>() {
                    @Override
                    public ListVaultsRequest.Builder get() {
                        return ListVaultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVaultsResponse, String>() {
                    @Override
                    public String apply(ListVaultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVaultsRequest.Builder>,
                        ListVaultsRequest>() {
                    @Override
                    public ListVaultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVaultsRequest.Builder>
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
                new java.util.function.Function<ListVaultsRequest, ListVaultsResponse>() {
                    @Override
                    public ListVaultsResponse apply(ListVaultsRequest request) {
                        return client.listVaults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.keymanagement.model.VaultSummary} objects contained in responses from the
     * listVaults operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.keymanagement.model.VaultSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.keymanagement.model.VaultSummary> listVaultsRecordIterator(
            final ListVaultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVaultsRequest.Builder,
                ListVaultsRequest,
                ListVaultsResponse,
                com.oracle.bmc.keymanagement.model.VaultSummary>(
                new java.util.function.Supplier<ListVaultsRequest.Builder>() {
                    @Override
                    public ListVaultsRequest.Builder get() {
                        return ListVaultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListVaultsResponse, String>() {
                    @Override
                    public String apply(ListVaultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVaultsRequest.Builder>,
                        ListVaultsRequest>() {
                    @Override
                    public ListVaultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVaultsRequest.Builder>
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
                new java.util.function.Function<ListVaultsRequest, ListVaultsResponse>() {
                    @Override
                    public ListVaultsResponse apply(ListVaultsRequest request) {
                        return client.listVaults(request);
                    }
                },
                new java.util.function.Function<
                        ListVaultsResponse,
                        java.util.List<com.oracle.bmc.keymanagement.model.VaultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.keymanagement.model.VaultSummary> apply(
                            ListVaultsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

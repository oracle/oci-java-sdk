/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Vaults where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class VaultsPaginators {
    private final Vaults client;

    public VaultsPaginators(Vaults client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSecretVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecretVersionsResponse> listSecretVersionsResponseIterator(
            final ListSecretVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecretVersionsRequest.Builder,
                ListSecretVersionsRequest,
                ListSecretVersionsResponse>(
                new java.util.function.Supplier<ListSecretVersionsRequest.Builder>() {
                    @Override
                    public ListSecretVersionsRequest.Builder get() {
                        return ListSecretVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecretVersionsResponse, String>() {
                    @Override
                    public String apply(ListSecretVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecretVersionsRequest.Builder>,
                        ListSecretVersionsRequest>() {
                    @Override
                    public ListSecretVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecretVersionsRequest.Builder>
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
                        ListSecretVersionsRequest, ListSecretVersionsResponse>() {
                    @Override
                    public ListSecretVersionsResponse apply(ListSecretVersionsRequest request) {
                        return client.listSecretVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.vault.model.SecretVersionSummary} objects contained in responses from the
     * listSecretVersions operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.vault.model.SecretVersionSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.vault.model.SecretVersionSummary>
            listSecretVersionsRecordIterator(final ListSecretVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecretVersionsRequest.Builder,
                ListSecretVersionsRequest,
                ListSecretVersionsResponse,
                com.oracle.bmc.vault.model.SecretVersionSummary>(
                new java.util.function.Supplier<ListSecretVersionsRequest.Builder>() {
                    @Override
                    public ListSecretVersionsRequest.Builder get() {
                        return ListSecretVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecretVersionsResponse, String>() {
                    @Override
                    public String apply(ListSecretVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecretVersionsRequest.Builder>,
                        ListSecretVersionsRequest>() {
                    @Override
                    public ListSecretVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecretVersionsRequest.Builder>
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
                        ListSecretVersionsRequest, ListSecretVersionsResponse>() {
                    @Override
                    public ListSecretVersionsResponse apply(ListSecretVersionsRequest request) {
                        return client.listSecretVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListSecretVersionsResponse,
                        java.util.List<com.oracle.bmc.vault.model.SecretVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.vault.model.SecretVersionSummary> apply(
                            ListSecretVersionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSecrets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSecretsResponse> listSecretsResponseIterator(
            final ListSecretsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSecretsRequest.Builder, ListSecretsRequest, ListSecretsResponse>(
                new java.util.function.Supplier<ListSecretsRequest.Builder>() {
                    @Override
                    public ListSecretsRequest.Builder get() {
                        return ListSecretsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecretsResponse, String>() {
                    @Override
                    public String apply(ListSecretsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecretsRequest.Builder>,
                        ListSecretsRequest>() {
                    @Override
                    public ListSecretsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecretsRequest.Builder>
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
                new java.util.function.Function<ListSecretsRequest, ListSecretsResponse>() {
                    @Override
                    public ListSecretsResponse apply(ListSecretsRequest request) {
                        return client.listSecrets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.vault.model.SecretSummary} objects contained in responses from the listSecrets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.vault.model.SecretSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.vault.model.SecretSummary> listSecretsRecordIterator(
            final ListSecretsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSecretsRequest.Builder,
                ListSecretsRequest,
                ListSecretsResponse,
                com.oracle.bmc.vault.model.SecretSummary>(
                new java.util.function.Supplier<ListSecretsRequest.Builder>() {
                    @Override
                    public ListSecretsRequest.Builder get() {
                        return ListSecretsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSecretsResponse, String>() {
                    @Override
                    public String apply(ListSecretsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSecretsRequest.Builder>,
                        ListSecretsRequest>() {
                    @Override
                    public ListSecretsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSecretsRequest.Builder>
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
                new java.util.function.Function<ListSecretsRequest, ListSecretsResponse>() {
                    @Override
                    public ListSecretsResponse apply(ListSecretsRequest request) {
                        return client.listSecrets(request);
                    }
                },
                new java.util.function.Function<
                        ListSecretsResponse,
                        java.util.List<com.oracle.bmc.vault.model.SecretSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.vault.model.SecretSummary> apply(
                            ListSecretsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

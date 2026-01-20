/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbMulticloudGCPProvider where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class DbMulticloudGCPProviderPaginators {
    private final DbMulticloudGCPProvider client;

    public DbMulticloudGCPProviderPaginators(DbMulticloudGCPProvider client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOracleDbGcpIdentityConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOracleDbGcpIdentityConnectorsResponse>
            listOracleDbGcpIdentityConnectorsResponseIterator(
                    final ListOracleDbGcpIdentityConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOracleDbGcpIdentityConnectorsRequest.Builder,
                ListOracleDbGcpIdentityConnectorsRequest,
                ListOracleDbGcpIdentityConnectorsResponse>(
                new java.util.function.Supplier<
                        ListOracleDbGcpIdentityConnectorsRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsRequest.Builder get() {
                        return ListOracleDbGcpIdentityConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbGcpIdentityConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpIdentityConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpIdentityConnectorsRequest.Builder>,
                        ListOracleDbGcpIdentityConnectorsRequest>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpIdentityConnectorsRequest.Builder>
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
                        ListOracleDbGcpIdentityConnectorsRequest,
                        ListOracleDbGcpIdentityConnectorsResponse>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsResponse apply(
                            ListOracleDbGcpIdentityConnectorsRequest request) {
                        return client.listOracleDbGcpIdentityConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnectorSummary} objects contained in
     * responses from the listOracleDbGcpIdentityConnectors operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnectorSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnectorSummary>
            listOracleDbGcpIdentityConnectorsRecordIterator(
                    final ListOracleDbGcpIdentityConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOracleDbGcpIdentityConnectorsRequest.Builder,
                ListOracleDbGcpIdentityConnectorsRequest,
                ListOracleDbGcpIdentityConnectorsResponse,
                com.oracle.bmc.dbmulticloud.model.OracleDbGcpIdentityConnectorSummary>(
                new java.util.function.Supplier<
                        ListOracleDbGcpIdentityConnectorsRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsRequest.Builder get() {
                        return ListOracleDbGcpIdentityConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbGcpIdentityConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpIdentityConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpIdentityConnectorsRequest.Builder>,
                        ListOracleDbGcpIdentityConnectorsRequest>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpIdentityConnectorsRequest.Builder>
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
                        ListOracleDbGcpIdentityConnectorsRequest,
                        ListOracleDbGcpIdentityConnectorsResponse>() {
                    @Override
                    public ListOracleDbGcpIdentityConnectorsResponse apply(
                            ListOracleDbGcpIdentityConnectorsRequest request) {
                        return client.listOracleDbGcpIdentityConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbGcpIdentityConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.dbmulticloud.model
                                        .OracleDbGcpIdentityConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dbmulticloud.model
                                            .OracleDbGcpIdentityConnectorSummary>
                            apply(ListOracleDbGcpIdentityConnectorsResponse response) {
                        return response.getOracleDbGcpIdentityConnectorSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOracleDbGcpKeyRings operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOracleDbGcpKeyRingsResponse> listOracleDbGcpKeyRingsResponseIterator(
            final ListOracleDbGcpKeyRingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOracleDbGcpKeyRingsRequest.Builder,
                ListOracleDbGcpKeyRingsRequest,
                ListOracleDbGcpKeyRingsResponse>(
                new java.util.function.Supplier<ListOracleDbGcpKeyRingsRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpKeyRingsRequest.Builder get() {
                        return ListOracleDbGcpKeyRingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbGcpKeyRingsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpKeyRingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpKeyRingsRequest.Builder>,
                        ListOracleDbGcpKeyRingsRequest>() {
                    @Override
                    public ListOracleDbGcpKeyRingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpKeyRingsRequest.Builder>
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
                        ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>() {
                    @Override
                    public ListOracleDbGcpKeyRingsResponse apply(
                            ListOracleDbGcpKeyRingsRequest request) {
                        return client.listOracleDbGcpKeyRings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary} objects contained in responses
     * from the listOracleDbGcpKeyRings operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary>
            listOracleDbGcpKeyRingsRecordIterator(final ListOracleDbGcpKeyRingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOracleDbGcpKeyRingsRequest.Builder,
                ListOracleDbGcpKeyRingsRequest,
                ListOracleDbGcpKeyRingsResponse,
                com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary>(
                new java.util.function.Supplier<ListOracleDbGcpKeyRingsRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpKeyRingsRequest.Builder get() {
                        return ListOracleDbGcpKeyRingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbGcpKeyRingsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpKeyRingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpKeyRingsRequest.Builder>,
                        ListOracleDbGcpKeyRingsRequest>() {
                    @Override
                    public ListOracleDbGcpKeyRingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpKeyRingsRequest.Builder>
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
                        ListOracleDbGcpKeyRingsRequest, ListOracleDbGcpKeyRingsResponse>() {
                    @Override
                    public ListOracleDbGcpKeyRingsResponse apply(
                            ListOracleDbGcpKeyRingsRequest request) {
                        return client.listOracleDbGcpKeyRings(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbGcpKeyRingsResponse,
                        java.util.List<
                                com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeyRingSummary>
                            apply(ListOracleDbGcpKeyRingsResponse response) {
                        return response.getOracleDbGcpKeyRingSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOracleDbGcpKeys operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOracleDbGcpKeysResponse> listOracleDbGcpKeysResponseIterator(
            final ListOracleDbGcpKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOracleDbGcpKeysRequest.Builder,
                ListOracleDbGcpKeysRequest,
                ListOracleDbGcpKeysResponse>(
                new java.util.function.Supplier<ListOracleDbGcpKeysRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpKeysRequest.Builder get() {
                        return ListOracleDbGcpKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbGcpKeysResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpKeysRequest.Builder>,
                        ListOracleDbGcpKeysRequest>() {
                    @Override
                    public ListOracleDbGcpKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpKeysRequest.Builder>
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
                        ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>() {
                    @Override
                    public ListOracleDbGcpKeysResponse apply(ListOracleDbGcpKeysRequest request) {
                        return client.listOracleDbGcpKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary} objects contained in responses from
     * the listOracleDbGcpKeys operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary>
            listOracleDbGcpKeysRecordIterator(final ListOracleDbGcpKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOracleDbGcpKeysRequest.Builder,
                ListOracleDbGcpKeysRequest,
                ListOracleDbGcpKeysResponse,
                com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary>(
                new java.util.function.Supplier<ListOracleDbGcpKeysRequest.Builder>() {
                    @Override
                    public ListOracleDbGcpKeysRequest.Builder get() {
                        return ListOracleDbGcpKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbGcpKeysResponse, String>() {
                    @Override
                    public String apply(ListOracleDbGcpKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbGcpKeysRequest.Builder>,
                        ListOracleDbGcpKeysRequest>() {
                    @Override
                    public ListOracleDbGcpKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbGcpKeysRequest.Builder>
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
                        ListOracleDbGcpKeysRequest, ListOracleDbGcpKeysResponse>() {
                    @Override
                    public ListOracleDbGcpKeysResponse apply(ListOracleDbGcpKeysRequest request) {
                        return client.listOracleDbGcpKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbGcpKeysResponse,
                        java.util.List<com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dbmulticloud.model.OracleDbGcpKeySummary>
                            apply(ListOracleDbGcpKeysResponse response) {
                        return response.getOracleDbGcpKeySummaryCollection().getItems();
                    }
                });
    }
}

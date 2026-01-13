/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DbMulticloudAwsProvider where multiple pages of data may be fetched.
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
public class DbMulticloudAwsProviderPaginators {
    private final DbMulticloudAwsProvider client;

    public DbMulticloudAwsProviderPaginators(DbMulticloudAwsProvider client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOracleDbAwsIdentityConnectors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOracleDbAwsIdentityConnectorsResponse>
            listOracleDbAwsIdentityConnectorsResponseIterator(
                    final ListOracleDbAwsIdentityConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOracleDbAwsIdentityConnectorsRequest.Builder,
                ListOracleDbAwsIdentityConnectorsRequest,
                ListOracleDbAwsIdentityConnectorsResponse>(
                new java.util.function.Supplier<
                        ListOracleDbAwsIdentityConnectorsRequest.Builder>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsRequest.Builder get() {
                        return ListOracleDbAwsIdentityConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbAwsIdentityConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbAwsIdentityConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbAwsIdentityConnectorsRequest.Builder>,
                        ListOracleDbAwsIdentityConnectorsRequest>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbAwsIdentityConnectorsRequest.Builder>
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
                        ListOracleDbAwsIdentityConnectorsRequest,
                        ListOracleDbAwsIdentityConnectorsResponse>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsResponse apply(
                            ListOracleDbAwsIdentityConnectorsRequest request) {
                        return client.listOracleDbAwsIdentityConnectors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnectorSummary} objects contained in
     * responses from the listOracleDbAwsIdentityConnectors operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnectorSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnectorSummary>
            listOracleDbAwsIdentityConnectorsRecordIterator(
                    final ListOracleDbAwsIdentityConnectorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOracleDbAwsIdentityConnectorsRequest.Builder,
                ListOracleDbAwsIdentityConnectorsRequest,
                ListOracleDbAwsIdentityConnectorsResponse,
                com.oracle.bmc.dbmulticloud.model.OracleDbAwsIdentityConnectorSummary>(
                new java.util.function.Supplier<
                        ListOracleDbAwsIdentityConnectorsRequest.Builder>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsRequest.Builder get() {
                        return ListOracleDbAwsIdentityConnectorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbAwsIdentityConnectorsResponse, String>() {
                    @Override
                    public String apply(ListOracleDbAwsIdentityConnectorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbAwsIdentityConnectorsRequest.Builder>,
                        ListOracleDbAwsIdentityConnectorsRequest>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbAwsIdentityConnectorsRequest.Builder>
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
                        ListOracleDbAwsIdentityConnectorsRequest,
                        ListOracleDbAwsIdentityConnectorsResponse>() {
                    @Override
                    public ListOracleDbAwsIdentityConnectorsResponse apply(
                            ListOracleDbAwsIdentityConnectorsRequest request) {
                        return client.listOracleDbAwsIdentityConnectors(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbAwsIdentityConnectorsResponse,
                        java.util.List<
                                com.oracle.bmc.dbmulticloud.model
                                        .OracleDbAwsIdentityConnectorSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dbmulticloud.model
                                            .OracleDbAwsIdentityConnectorSummary>
                            apply(ListOracleDbAwsIdentityConnectorsResponse response) {
                        return response.getOracleDbAwsIdentityConnectorSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listOracleDbAwsKeys operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListOracleDbAwsKeysResponse> listOracleDbAwsKeysResponseIterator(
            final ListOracleDbAwsKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOracleDbAwsKeysRequest.Builder,
                ListOracleDbAwsKeysRequest,
                ListOracleDbAwsKeysResponse>(
                new java.util.function.Supplier<ListOracleDbAwsKeysRequest.Builder>() {
                    @Override
                    public ListOracleDbAwsKeysRequest.Builder get() {
                        return ListOracleDbAwsKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbAwsKeysResponse, String>() {
                    @Override
                    public String apply(ListOracleDbAwsKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbAwsKeysRequest.Builder>,
                        ListOracleDbAwsKeysRequest>() {
                    @Override
                    public ListOracleDbAwsKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbAwsKeysRequest.Builder>
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
                        ListOracleDbAwsKeysRequest, ListOracleDbAwsKeysResponse>() {
                    @Override
                    public ListOracleDbAwsKeysResponse apply(ListOracleDbAwsKeysRequest request) {
                        return client.listOracleDbAwsKeys(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary} objects contained in responses from
     * the listOracleDbAwsKeys operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary>
            listOracleDbAwsKeysRecordIterator(final ListOracleDbAwsKeysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOracleDbAwsKeysRequest.Builder,
                ListOracleDbAwsKeysRequest,
                ListOracleDbAwsKeysResponse,
                com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary>(
                new java.util.function.Supplier<ListOracleDbAwsKeysRequest.Builder>() {
                    @Override
                    public ListOracleDbAwsKeysRequest.Builder get() {
                        return ListOracleDbAwsKeysRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOracleDbAwsKeysResponse, String>() {
                    @Override
                    public String apply(ListOracleDbAwsKeysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOracleDbAwsKeysRequest.Builder>,
                        ListOracleDbAwsKeysRequest>() {
                    @Override
                    public ListOracleDbAwsKeysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOracleDbAwsKeysRequest.Builder>
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
                        ListOracleDbAwsKeysRequest, ListOracleDbAwsKeysResponse>() {
                    @Override
                    public ListOracleDbAwsKeysResponse apply(ListOracleDbAwsKeysRequest request) {
                        return client.listOracleDbAwsKeys(request);
                    }
                },
                new java.util.function.Function<
                        ListOracleDbAwsKeysResponse,
                        java.util.List<com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dbmulticloud.model.OracleDbAwsKeySummary>
                            apply(ListOracleDbAwsKeysResponse response) {
                        return response.getOracleDbAwsKeySummaryCollection().getItems();
                    }
                });
    }
}

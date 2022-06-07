/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain;

import com.oracle.bmc.blockchain.requests.*;
import com.oracle.bmc.blockchain.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of BlockchainPlatform where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public class BlockchainPlatformPaginators {
    private final BlockchainPlatform client;

    public BlockchainPlatformPaginators(BlockchainPlatform client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBlockchainPlatformPatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBlockchainPlatformPatchesResponse>
            listBlockchainPlatformPatchesResponseIterator(
                    final ListBlockchainPlatformPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBlockchainPlatformPatchesRequest.Builder, ListBlockchainPlatformPatchesRequest,
                ListBlockchainPlatformPatchesResponse>(
                new com.google.common.base.Supplier<
                        ListBlockchainPlatformPatchesRequest.Builder>() {
                    @Override
                    public ListBlockchainPlatformPatchesRequest.Builder get() {
                        return ListBlockchainPlatformPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBlockchainPlatformPatchesResponse, String>() {
                    @Override
                    public String apply(ListBlockchainPlatformPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockchainPlatformPatchesRequest.Builder>,
                        ListBlockchainPlatformPatchesRequest>() {
                    @Override
                    public ListBlockchainPlatformPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockchainPlatformPatchesRequest.Builder>
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
                        ListBlockchainPlatformPatchesRequest,
                        ListBlockchainPlatformPatchesResponse>() {
                    @Override
                    public ListBlockchainPlatformPatchesResponse apply(
                            ListBlockchainPlatformPatchesRequest request) {
                        return client.listBlockchainPlatformPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary} objects
     * contained in responses from the listBlockchainPlatformPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary>
            listBlockchainPlatformPatchesRecordIterator(
                    final ListBlockchainPlatformPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBlockchainPlatformPatchesRequest.Builder, ListBlockchainPlatformPatchesRequest,
                ListBlockchainPlatformPatchesResponse,
                com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary>(
                new com.google.common.base.Supplier<
                        ListBlockchainPlatformPatchesRequest.Builder>() {
                    @Override
                    public ListBlockchainPlatformPatchesRequest.Builder get() {
                        return ListBlockchainPlatformPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBlockchainPlatformPatchesResponse, String>() {
                    @Override
                    public String apply(ListBlockchainPlatformPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockchainPlatformPatchesRequest.Builder>,
                        ListBlockchainPlatformPatchesRequest>() {
                    @Override
                    public ListBlockchainPlatformPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockchainPlatformPatchesRequest.Builder>
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
                        ListBlockchainPlatformPatchesRequest,
                        ListBlockchainPlatformPatchesResponse>() {
                    @Override
                    public ListBlockchainPlatformPatchesResponse apply(
                            ListBlockchainPlatformPatchesRequest request) {
                        return client.listBlockchainPlatformPatches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBlockchainPlatformPatchesResponse,
                        java.util.List<
                                com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.blockchain.model.BlockchainPlatformPatchSummary>
                            apply(ListBlockchainPlatformPatchesResponse response) {
                        return response.getBlockchainPlatformPatchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBlockchainPlatforms operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListBlockchainPlatformsResponse> listBlockchainPlatformsResponseIterator(
            final ListBlockchainPlatformsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBlockchainPlatformsRequest.Builder, ListBlockchainPlatformsRequest,
                ListBlockchainPlatformsResponse>(
                new com.google.common.base.Supplier<ListBlockchainPlatformsRequest.Builder>() {
                    @Override
                    public ListBlockchainPlatformsRequest.Builder get() {
                        return ListBlockchainPlatformsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBlockchainPlatformsResponse, String>() {
                    @Override
                    public String apply(ListBlockchainPlatformsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockchainPlatformsRequest.Builder>,
                        ListBlockchainPlatformsRequest>() {
                    @Override
                    public ListBlockchainPlatformsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockchainPlatformsRequest.Builder>
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
                        ListBlockchainPlatformsRequest, ListBlockchainPlatformsResponse>() {
                    @Override
                    public ListBlockchainPlatformsResponse apply(
                            ListBlockchainPlatformsRequest request) {
                        return client.listBlockchainPlatforms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.BlockchainPlatformSummary} objects
     * contained in responses from the listBlockchainPlatforms operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.BlockchainPlatformSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.BlockchainPlatformSummary>
            listBlockchainPlatformsRecordIterator(final ListBlockchainPlatformsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBlockchainPlatformsRequest.Builder, ListBlockchainPlatformsRequest,
                ListBlockchainPlatformsResponse,
                com.oracle.bmc.blockchain.model.BlockchainPlatformSummary>(
                new com.google.common.base.Supplier<ListBlockchainPlatformsRequest.Builder>() {
                    @Override
                    public ListBlockchainPlatformsRequest.Builder get() {
                        return ListBlockchainPlatformsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListBlockchainPlatformsResponse, String>() {
                    @Override
                    public String apply(ListBlockchainPlatformsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlockchainPlatformsRequest.Builder>,
                        ListBlockchainPlatformsRequest>() {
                    @Override
                    public ListBlockchainPlatformsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlockchainPlatformsRequest.Builder>
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
                        ListBlockchainPlatformsRequest, ListBlockchainPlatformsResponse>() {
                    @Override
                    public ListBlockchainPlatformsResponse apply(
                            ListBlockchainPlatformsRequest request) {
                        return client.listBlockchainPlatforms(request);
                    }
                },
                new com.google.common.base.Function<
                        ListBlockchainPlatformsResponse,
                        java.util.List<
                                com.oracle.bmc.blockchain.model.BlockchainPlatformSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.BlockchainPlatformSummary>
                            apply(ListBlockchainPlatformsResponse response) {
                        return response.getBlockchainPlatformCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOsns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOsnsResponse> listOsnsResponseIterator(final ListOsnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOsnsRequest.Builder, ListOsnsRequest, ListOsnsResponse>(
                new com.google.common.base.Supplier<ListOsnsRequest.Builder>() {
                    @Override
                    public ListOsnsRequest.Builder get() {
                        return ListOsnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOsnsResponse, String>() {
                    @Override
                    public String apply(ListOsnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOsnsRequest.Builder>,
                        ListOsnsRequest>() {
                    @Override
                    public ListOsnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOsnsRequest.Builder>
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
                new com.google.common.base.Function<ListOsnsRequest, ListOsnsResponse>() {
                    @Override
                    public ListOsnsResponse apply(ListOsnsRequest request) {
                        return client.listOsns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.OsnSummary} objects
     * contained in responses from the listOsns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.OsnSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.OsnSummary> listOsnsRecordIterator(
            final ListOsnsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOsnsRequest.Builder, ListOsnsRequest, ListOsnsResponse,
                com.oracle.bmc.blockchain.model.OsnSummary>(
                new com.google.common.base.Supplier<ListOsnsRequest.Builder>() {
                    @Override
                    public ListOsnsRequest.Builder get() {
                        return ListOsnsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOsnsResponse, String>() {
                    @Override
                    public String apply(ListOsnsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOsnsRequest.Builder>,
                        ListOsnsRequest>() {
                    @Override
                    public ListOsnsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOsnsRequest.Builder>
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
                new com.google.common.base.Function<ListOsnsRequest, ListOsnsResponse>() {
                    @Override
                    public ListOsnsResponse apply(ListOsnsRequest request) {
                        return client.listOsns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOsnsResponse,
                        java.util.List<com.oracle.bmc.blockchain.model.OsnSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.OsnSummary> apply(
                            ListOsnsResponse response) {
                        return response.getOsnCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPeers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPeersResponse> listPeersResponseIterator(final ListPeersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPeersRequest.Builder, ListPeersRequest, ListPeersResponse>(
                new com.google.common.base.Supplier<ListPeersRequest.Builder>() {
                    @Override
                    public ListPeersRequest.Builder get() {
                        return ListPeersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPeersResponse, String>() {
                    @Override
                    public String apply(ListPeersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPeersRequest.Builder>,
                        ListPeersRequest>() {
                    @Override
                    public ListPeersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPeersRequest.Builder>
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
                new com.google.common.base.Function<ListPeersRequest, ListPeersResponse>() {
                    @Override
                    public ListPeersResponse apply(ListPeersRequest request) {
                        return client.listPeers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.PeerSummary} objects
     * contained in responses from the listPeers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.PeerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.PeerSummary> listPeersRecordIterator(
            final ListPeersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPeersRequest.Builder, ListPeersRequest, ListPeersResponse,
                com.oracle.bmc.blockchain.model.PeerSummary>(
                new com.google.common.base.Supplier<ListPeersRequest.Builder>() {
                    @Override
                    public ListPeersRequest.Builder get() {
                        return ListPeersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPeersResponse, String>() {
                    @Override
                    public String apply(ListPeersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPeersRequest.Builder>,
                        ListPeersRequest>() {
                    @Override
                    public ListPeersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPeersRequest.Builder>
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
                new com.google.common.base.Function<ListPeersRequest, ListPeersResponse>() {
                    @Override
                    public ListPeersResponse apply(ListPeersRequest request) {
                        return client.listPeers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPeersResponse,
                        java.util.List<com.oracle.bmc.blockchain.model.PeerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.PeerSummary> apply(
                            ListPeersResponse response) {
                        return response.getPeerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.blockchain.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.blockchain.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.blockchain.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<com.oracle.bmc.blockchain.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.blockchain.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.blockchain.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.blockchain.model.WorkRequestSummary>(
                new com.google.common.base.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestsResponse,
                        java.util.List<com.oracle.bmc.blockchain.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.blockchain.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

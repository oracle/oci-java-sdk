/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate;

import com.oracle.bmc.fleetsoftwareupdate.requests.*;
import com.oracle.bmc.fleetsoftwareupdate.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of FleetSoftwareUpdate where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class FleetSoftwareUpdatePaginators {
    private final FleetSoftwareUpdate client;

    public FleetSoftwareUpdatePaginators(FleetSoftwareUpdate client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFsuActions
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuActionsResponse> listFsuActionsResponseIterator(
            final ListFsuActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuActionsRequest.Builder, ListFsuActionsRequest, ListFsuActionsResponse>(
                new java.util.function.Supplier<ListFsuActionsRequest.Builder>() {
                    @Override
                    public ListFsuActionsRequest.Builder get() {
                        return ListFsuActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuActionsResponse, String>() {
                    @Override
                    public String apply(ListFsuActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuActionsRequest.Builder>,
                        ListFsuActionsRequest>() {
                    @Override
                    public ListFsuActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuActionsRequest.Builder>
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
                new java.util.function.Function<ListFsuActionsRequest, ListFsuActionsResponse>() {
                    @Override
                    public ListFsuActionsResponse apply(ListFsuActionsRequest request) {
                        return client.listFsuActions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary} objects contained in responses
     * from the listFsuActions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary>
            listFsuActionsRecordIterator(final ListFsuActionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuActionsRequest.Builder,
                ListFsuActionsRequest,
                ListFsuActionsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary>(
                new java.util.function.Supplier<ListFsuActionsRequest.Builder>() {
                    @Override
                    public ListFsuActionsRequest.Builder get() {
                        return ListFsuActionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuActionsResponse, String>() {
                    @Override
                    public String apply(ListFsuActionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuActionsRequest.Builder>,
                        ListFsuActionsRequest>() {
                    @Override
                    public ListFsuActionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuActionsRequest.Builder>
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
                new java.util.function.Function<ListFsuActionsRequest, ListFsuActionsResponse>() {
                    @Override
                    public ListFsuActionsResponse apply(ListFsuActionsRequest request) {
                        return client.listFsuActions(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuActionsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.FsuActionSummary>
                            apply(ListFsuActionsResponse response) {
                        return response.getFsuActionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFsuCollectionTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuCollectionTargetsResponse> listFsuCollectionTargetsResponseIterator(
            final ListFsuCollectionTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuCollectionTargetsRequest.Builder,
                ListFsuCollectionTargetsRequest,
                ListFsuCollectionTargetsResponse>(
                new java.util.function.Supplier<ListFsuCollectionTargetsRequest.Builder>() {
                    @Override
                    public ListFsuCollectionTargetsRequest.Builder get() {
                        return ListFsuCollectionTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCollectionTargetsResponse, String>() {
                    @Override
                    public String apply(ListFsuCollectionTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCollectionTargetsRequest.Builder>,
                        ListFsuCollectionTargetsRequest>() {
                    @Override
                    public ListFsuCollectionTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCollectionTargetsRequest.Builder>
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
                        ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>() {
                    @Override
                    public ListFsuCollectionTargetsResponse apply(
                            ListFsuCollectionTargetsRequest request) {
                        return client.listFsuCollectionTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary} objects contained in responses from
     * the listFsuCollectionTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>
            listFsuCollectionTargetsRecordIterator(final ListFsuCollectionTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuCollectionTargetsRequest.Builder,
                ListFsuCollectionTargetsRequest,
                ListFsuCollectionTargetsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>(
                new java.util.function.Supplier<ListFsuCollectionTargetsRequest.Builder>() {
                    @Override
                    public ListFsuCollectionTargetsRequest.Builder get() {
                        return ListFsuCollectionTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCollectionTargetsResponse, String>() {
                    @Override
                    public String apply(ListFsuCollectionTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCollectionTargetsRequest.Builder>,
                        ListFsuCollectionTargetsRequest>() {
                    @Override
                    public ListFsuCollectionTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCollectionTargetsRequest.Builder>
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
                        ListFsuCollectionTargetsRequest, ListFsuCollectionTargetsResponse>() {
                    @Override
                    public ListFsuCollectionTargetsResponse apply(
                            ListFsuCollectionTargetsRequest request) {
                        return client.listFsuCollectionTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuCollectionTargetsResponse,
                        java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>
                            apply(ListFsuCollectionTargetsResponse response) {
                        return response.getTargetSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFsuCollections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuCollectionsResponse> listFsuCollectionsResponseIterator(
            final ListFsuCollectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuCollectionsRequest.Builder,
                ListFsuCollectionsRequest,
                ListFsuCollectionsResponse>(
                new java.util.function.Supplier<ListFsuCollectionsRequest.Builder>() {
                    @Override
                    public ListFsuCollectionsRequest.Builder get() {
                        return ListFsuCollectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCollectionsResponse, String>() {
                    @Override
                    public String apply(ListFsuCollectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCollectionsRequest.Builder>,
                        ListFsuCollectionsRequest>() {
                    @Override
                    public ListFsuCollectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCollectionsRequest.Builder>
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
                        ListFsuCollectionsRequest, ListFsuCollectionsResponse>() {
                    @Override
                    public ListFsuCollectionsResponse apply(ListFsuCollectionsRequest request) {
                        return client.listFsuCollections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary} objects contained in responses
     * from the listFsuCollections operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary>
            listFsuCollectionsRecordIterator(final ListFsuCollectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuCollectionsRequest.Builder,
                ListFsuCollectionsRequest,
                ListFsuCollectionsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary>(
                new java.util.function.Supplier<ListFsuCollectionsRequest.Builder>() {
                    @Override
                    public ListFsuCollectionsRequest.Builder get() {
                        return ListFsuCollectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCollectionsResponse, String>() {
                    @Override
                    public String apply(ListFsuCollectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCollectionsRequest.Builder>,
                        ListFsuCollectionsRequest>() {
                    @Override
                    public ListFsuCollectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCollectionsRequest.Builder>
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
                        ListFsuCollectionsRequest, ListFsuCollectionsResponse>() {
                    @Override
                    public ListFsuCollectionsResponse apply(ListFsuCollectionsRequest request) {
                        return client.listFsuCollections(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuCollectionsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetsoftwareupdate.model.FsuCollectionSummary>
                            apply(ListFsuCollectionsResponse response) {
                        return response.getFsuCollectionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFsuCycles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuCyclesResponse> listFsuCyclesResponseIterator(
            final ListFsuCyclesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuCyclesRequest.Builder, ListFsuCyclesRequest, ListFsuCyclesResponse>(
                new java.util.function.Supplier<ListFsuCyclesRequest.Builder>() {
                    @Override
                    public ListFsuCyclesRequest.Builder get() {
                        return ListFsuCyclesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCyclesResponse, String>() {
                    @Override
                    public String apply(ListFsuCyclesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCyclesRequest.Builder>,
                        ListFsuCyclesRequest>() {
                    @Override
                    public ListFsuCyclesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCyclesRequest.Builder>
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
                new java.util.function.Function<ListFsuCyclesRequest, ListFsuCyclesResponse>() {
                    @Override
                    public ListFsuCyclesResponse apply(ListFsuCyclesRequest request) {
                        return client.listFsuCycles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary} objects contained in responses from
     * the listFsuCycles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary>
            listFsuCyclesRecordIterator(final ListFsuCyclesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuCyclesRequest.Builder,
                ListFsuCyclesRequest,
                ListFsuCyclesResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary>(
                new java.util.function.Supplier<ListFsuCyclesRequest.Builder>() {
                    @Override
                    public ListFsuCyclesRequest.Builder get() {
                        return ListFsuCyclesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuCyclesResponse, String>() {
                    @Override
                    public String apply(ListFsuCyclesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuCyclesRequest.Builder>,
                        ListFsuCyclesRequest>() {
                    @Override
                    public ListFsuCyclesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuCyclesRequest.Builder>
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
                new java.util.function.Function<ListFsuCyclesRequest, ListFsuCyclesResponse>() {
                    @Override
                    public ListFsuCyclesResponse apply(ListFsuCyclesRequest request) {
                        return client.listFsuCycles(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuCyclesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.FsuCycleSummary>
                            apply(ListFsuCyclesResponse response) {
                        return response.getFsuCycleSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFsuDiscoveries operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuDiscoveriesResponse> listFsuDiscoveriesResponseIterator(
            final ListFsuDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuDiscoveriesRequest.Builder,
                ListFsuDiscoveriesRequest,
                ListFsuDiscoveriesResponse>(
                new java.util.function.Supplier<ListFsuDiscoveriesRequest.Builder>() {
                    @Override
                    public ListFsuDiscoveriesRequest.Builder get() {
                        return ListFsuDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListFsuDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuDiscoveriesRequest.Builder>,
                        ListFsuDiscoveriesRequest>() {
                    @Override
                    public ListFsuDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuDiscoveriesRequest.Builder>
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
                        ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>() {
                    @Override
                    public ListFsuDiscoveriesResponse apply(ListFsuDiscoveriesRequest request) {
                        return client.listFsuDiscoveries(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary} objects contained in responses
     * from the listFsuDiscoveries operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary>
            listFsuDiscoveriesRecordIterator(final ListFsuDiscoveriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuDiscoveriesRequest.Builder,
                ListFsuDiscoveriesRequest,
                ListFsuDiscoveriesResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary>(
                new java.util.function.Supplier<ListFsuDiscoveriesRequest.Builder>() {
                    @Override
                    public ListFsuDiscoveriesRequest.Builder get() {
                        return ListFsuDiscoveriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuDiscoveriesResponse, String>() {
                    @Override
                    public String apply(ListFsuDiscoveriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuDiscoveriesRequest.Builder>,
                        ListFsuDiscoveriesRequest>() {
                    @Override
                    public ListFsuDiscoveriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuDiscoveriesRequest.Builder>
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
                        ListFsuDiscoveriesRequest, ListFsuDiscoveriesResponse>() {
                    @Override
                    public ListFsuDiscoveriesResponse apply(ListFsuDiscoveriesRequest request) {
                        return client.listFsuDiscoveries(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuDiscoveriesResponse,
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetsoftwareupdate.model.FsuDiscoverySummary>
                            apply(ListFsuDiscoveriesResponse response) {
                        return response.getFsuDiscoverySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFsuDiscoveryTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuDiscoveryTargetsResponse> listFsuDiscoveryTargetsResponseIterator(
            final ListFsuDiscoveryTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuDiscoveryTargetsRequest.Builder,
                ListFsuDiscoveryTargetsRequest,
                ListFsuDiscoveryTargetsResponse>(
                new java.util.function.Supplier<ListFsuDiscoveryTargetsRequest.Builder>() {
                    @Override
                    public ListFsuDiscoveryTargetsRequest.Builder get() {
                        return ListFsuDiscoveryTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuDiscoveryTargetsResponse, String>() {
                    @Override
                    public String apply(ListFsuDiscoveryTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuDiscoveryTargetsRequest.Builder>,
                        ListFsuDiscoveryTargetsRequest>() {
                    @Override
                    public ListFsuDiscoveryTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuDiscoveryTargetsRequest.Builder>
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
                        ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>() {
                    @Override
                    public ListFsuDiscoveryTargetsResponse apply(
                            ListFsuDiscoveryTargetsRequest request) {
                        return client.listFsuDiscoveryTargets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary} objects contained in responses from
     * the listFsuDiscoveryTargets operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>
            listFsuDiscoveryTargetsRecordIterator(final ListFsuDiscoveryTargetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuDiscoveryTargetsRequest.Builder,
                ListFsuDiscoveryTargetsRequest,
                ListFsuDiscoveryTargetsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>(
                new java.util.function.Supplier<ListFsuDiscoveryTargetsRequest.Builder>() {
                    @Override
                    public ListFsuDiscoveryTargetsRequest.Builder get() {
                        return ListFsuDiscoveryTargetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuDiscoveryTargetsResponse, String>() {
                    @Override
                    public String apply(ListFsuDiscoveryTargetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuDiscoveryTargetsRequest.Builder>,
                        ListFsuDiscoveryTargetsRequest>() {
                    @Override
                    public ListFsuDiscoveryTargetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuDiscoveryTargetsRequest.Builder>
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
                        ListFsuDiscoveryTargetsRequest, ListFsuDiscoveryTargetsResponse>() {
                    @Override
                    public ListFsuDiscoveryTargetsResponse apply(
                            ListFsuDiscoveryTargetsRequest request) {
                        return client.listFsuDiscoveryTargets(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuDiscoveryTargetsResponse,
                        java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.TargetSummary>
                            apply(ListFsuDiscoveryTargetsResponse response) {
                        return response.getTargetSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listFsuJobOutputs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuJobOutputsResponse> listFsuJobOutputsResponseIterator(
            final ListFsuJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuJobOutputsRequest.Builder,
                ListFsuJobOutputsRequest,
                ListFsuJobOutputsResponse>(
                new java.util.function.Supplier<ListFsuJobOutputsRequest.Builder>() {
                    @Override
                    public ListFsuJobOutputsRequest.Builder get() {
                        return ListFsuJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListFsuJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuJobOutputsRequest.Builder>,
                        ListFsuJobOutputsRequest>() {
                    @Override
                    public ListFsuJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuJobOutputsRequest.Builder>
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
                        ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>() {
                    @Override
                    public ListFsuJobOutputsResponse apply(ListFsuJobOutputsRequest request) {
                        return client.listFsuJobOutputs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary} objects contained in responses
     * from the listFsuJobOutputs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary>
            listFsuJobOutputsRecordIterator(final ListFsuJobOutputsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuJobOutputsRequest.Builder,
                ListFsuJobOutputsRequest,
                ListFsuJobOutputsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary>(
                new java.util.function.Supplier<ListFsuJobOutputsRequest.Builder>() {
                    @Override
                    public ListFsuJobOutputsRequest.Builder get() {
                        return ListFsuJobOutputsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuJobOutputsResponse, String>() {
                    @Override
                    public String apply(ListFsuJobOutputsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuJobOutputsRequest.Builder>,
                        ListFsuJobOutputsRequest>() {
                    @Override
                    public ListFsuJobOutputsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuJobOutputsRequest.Builder>
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
                        ListFsuJobOutputsRequest, ListFsuJobOutputsResponse>() {
                    @Override
                    public ListFsuJobOutputsResponse apply(ListFsuJobOutputsRequest request) {
                        return client.listFsuJobOutputs(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuJobOutputsResponse,
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetsoftwareupdate.model.FsuJobOutputSummary>
                            apply(ListFsuJobOutputsResponse response) {
                        return response.getFsuJobOutputSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFsuJobs
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFsuJobsResponse> listFsuJobsResponseIterator(
            final ListFsuJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFsuJobsRequest.Builder, ListFsuJobsRequest, ListFsuJobsResponse>(
                new java.util.function.Supplier<ListFsuJobsRequest.Builder>() {
                    @Override
                    public ListFsuJobsRequest.Builder get() {
                        return ListFsuJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuJobsResponse, String>() {
                    @Override
                    public String apply(ListFsuJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuJobsRequest.Builder>,
                        ListFsuJobsRequest>() {
                    @Override
                    public ListFsuJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuJobsRequest.Builder>
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
                new java.util.function.Function<ListFsuJobsRequest, ListFsuJobsResponse>() {
                    @Override
                    public ListFsuJobsResponse apply(ListFsuJobsRequest request) {
                        return client.listFsuJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary} objects contained in responses from
     * the listFsuJobs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary>
            listFsuJobsRecordIterator(final ListFsuJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFsuJobsRequest.Builder,
                ListFsuJobsRequest,
                ListFsuJobsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary>(
                new java.util.function.Supplier<ListFsuJobsRequest.Builder>() {
                    @Override
                    public ListFsuJobsRequest.Builder get() {
                        return ListFsuJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFsuJobsResponse, String>() {
                    @Override
                    public String apply(ListFsuJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFsuJobsRequest.Builder>,
                        ListFsuJobsRequest>() {
                    @Override
                    public ListFsuJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFsuJobsRequest.Builder>
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
                new java.util.function.Function<ListFsuJobsRequest, ListFsuJobsResponse>() {
                    @Override
                    public ListFsuJobsResponse apply(ListFsuJobsRequest request) {
                        return client.listFsuJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListFsuJobsResponse,
                        java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.FsuJobSummary>
                            apply(ListFsuJobsResponse response) {
                        return response.getFsuJobCollection().getItems();
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
     * com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError} objects contained in responses
     * from the listWorkRequestErrors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError>(
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
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
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
     * com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry>(
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
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary>(
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
                        java.util.List<
                                com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.fleetsoftwareupdate.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

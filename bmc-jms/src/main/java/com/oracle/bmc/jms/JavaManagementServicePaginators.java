/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms;

import com.oracle.bmc.jms.requests.*;
import com.oracle.bmc.jms.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of JavaManagementService where multiple pages of data may be fetched. Two
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class JavaManagementServicePaginators {
    private final JavaManagementService client;

    public JavaManagementServicePaginators(JavaManagementService client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listBlocklists
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListBlocklistsResponse> listBlocklistsResponseIterator(
            final ListBlocklistsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListBlocklistsRequest.Builder, ListBlocklistsRequest, ListBlocklistsResponse>(
                new java.util.function.Supplier<ListBlocklistsRequest.Builder>() {
                    @Override
                    public ListBlocklistsRequest.Builder get() {
                        return ListBlocklistsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBlocklistsResponse, String>() {
                    @Override
                    public String apply(ListBlocklistsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlocklistsRequest.Builder>,
                        ListBlocklistsRequest>() {
                    @Override
                    public ListBlocklistsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlocklistsRequest.Builder>
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
                new java.util.function.Function<ListBlocklistsRequest, ListBlocklistsResponse>() {
                    @Override
                    public ListBlocklistsResponse apply(ListBlocklistsRequest request) {
                        return client.listBlocklists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.jms.model.Blocklist}
     * objects contained in responses from the listBlocklists operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.Blocklist} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.jms.model.Blocklist> listBlocklistsRecordIterator(
            final ListBlocklistsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListBlocklistsRequest.Builder,
                ListBlocklistsRequest,
                ListBlocklistsResponse,
                com.oracle.bmc.jms.model.Blocklist>(
                new java.util.function.Supplier<ListBlocklistsRequest.Builder>() {
                    @Override
                    public ListBlocklistsRequest.Builder get() {
                        return ListBlocklistsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListBlocklistsResponse, String>() {
                    @Override
                    public String apply(ListBlocklistsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListBlocklistsRequest.Builder>,
                        ListBlocklistsRequest>() {
                    @Override
                    public ListBlocklistsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListBlocklistsRequest.Builder>
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
                new java.util.function.Function<ListBlocklistsRequest, ListBlocklistsResponse>() {
                    @Override
                    public ListBlocklistsResponse apply(ListBlocklistsRequest request) {
                        return client.listBlocklists(request);
                    }
                },
                new java.util.function.Function<
                        ListBlocklistsResponse,
                        java.util.List<com.oracle.bmc.jms.model.Blocklist>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.Blocklist> apply(
                            ListBlocklistsResponse response) {
                        return response.getBlocklistCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCryptoAnalysisResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCryptoAnalysisResultsResponse> listCryptoAnalysisResultsResponseIterator(
            final ListCryptoAnalysisResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCryptoAnalysisResultsRequest.Builder,
                ListCryptoAnalysisResultsRequest,
                ListCryptoAnalysisResultsResponse>(
                new java.util.function.Supplier<ListCryptoAnalysisResultsRequest.Builder>() {
                    @Override
                    public ListCryptoAnalysisResultsRequest.Builder get() {
                        return ListCryptoAnalysisResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCryptoAnalysisResultsResponse, String>() {
                    @Override
                    public String apply(ListCryptoAnalysisResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCryptoAnalysisResultsRequest.Builder>,
                        ListCryptoAnalysisResultsRequest>() {
                    @Override
                    public ListCryptoAnalysisResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCryptoAnalysisResultsRequest.Builder>
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
                        ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>() {
                    @Override
                    public ListCryptoAnalysisResultsResponse apply(
                            ListCryptoAnalysisResultsRequest request) {
                        return client.listCryptoAnalysisResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.CryptoAnalysisResultSummary} objects contained in responses from the
     * listCryptoAnalysisResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.CryptoAnalysisResultSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jms.model.CryptoAnalysisResultSummary>
            listCryptoAnalysisResultsRecordIterator(
                    final ListCryptoAnalysisResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCryptoAnalysisResultsRequest.Builder,
                ListCryptoAnalysisResultsRequest,
                ListCryptoAnalysisResultsResponse,
                com.oracle.bmc.jms.model.CryptoAnalysisResultSummary>(
                new java.util.function.Supplier<ListCryptoAnalysisResultsRequest.Builder>() {
                    @Override
                    public ListCryptoAnalysisResultsRequest.Builder get() {
                        return ListCryptoAnalysisResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCryptoAnalysisResultsResponse, String>() {
                    @Override
                    public String apply(ListCryptoAnalysisResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCryptoAnalysisResultsRequest.Builder>,
                        ListCryptoAnalysisResultsRequest>() {
                    @Override
                    public ListCryptoAnalysisResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCryptoAnalysisResultsRequest.Builder>
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
                        ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>() {
                    @Override
                    public ListCryptoAnalysisResultsResponse apply(
                            ListCryptoAnalysisResultsRequest request) {
                        return client.listCryptoAnalysisResults(request);
                    }
                },
                new java.util.function.Function<
                        ListCryptoAnalysisResultsResponse,
                        java.util.List<com.oracle.bmc.jms.model.CryptoAnalysisResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.CryptoAnalysisResultSummary>
                            apply(ListCryptoAnalysisResultsResponse response) {
                        return response.getCryptoAnalysisResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFleets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListFleetsResponse> listFleetsResponseIterator(
            final ListFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFleetsRequest.Builder, ListFleetsRequest, ListFleetsResponse>(
                new java.util.function.Supplier<ListFleetsRequest.Builder>() {
                    @Override
                    public ListFleetsRequest.Builder get() {
                        return ListFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetsResponse, String>() {
                    @Override
                    public String apply(ListFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetsRequest.Builder>,
                        ListFleetsRequest>() {
                    @Override
                    public ListFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetsRequest.Builder>
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
                new java.util.function.Function<ListFleetsRequest, ListFleetsResponse>() {
                    @Override
                    public ListFleetsResponse apply(ListFleetsRequest request) {
                        return client.listFleets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.FleetSummary} objects contained in responses from the listFleets
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.FleetSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.jms.model.FleetSummary> listFleetsRecordIterator(
            final ListFleetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFleetsRequest.Builder,
                ListFleetsRequest,
                ListFleetsResponse,
                com.oracle.bmc.jms.model.FleetSummary>(
                new java.util.function.Supplier<ListFleetsRequest.Builder>() {
                    @Override
                    public ListFleetsRequest.Builder get() {
                        return ListFleetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListFleetsResponse, String>() {
                    @Override
                    public String apply(ListFleetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFleetsRequest.Builder>,
                        ListFleetsRequest>() {
                    @Override
                    public ListFleetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFleetsRequest.Builder>
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
                new java.util.function.Function<ListFleetsRequest, ListFleetsResponse>() {
                    @Override
                    public ListFleetsResponse apply(ListFleetsRequest request) {
                        return client.listFleets(request);
                    }
                },
                new java.util.function.Function<
                        ListFleetsResponse,
                        java.util.List<com.oracle.bmc.jms.model.FleetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.FleetSummary> apply(
                            ListFleetsResponse response) {
                        return response.getFleetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInstallationSites operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInstallationSitesResponse> listInstallationSitesResponseIterator(
            final ListInstallationSitesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstallationSitesRequest.Builder,
                ListInstallationSitesRequest,
                ListInstallationSitesResponse>(
                new java.util.function.Supplier<ListInstallationSitesRequest.Builder>() {
                    @Override
                    public ListInstallationSitesRequest.Builder get() {
                        return ListInstallationSitesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstallationSitesResponse, String>() {
                    @Override
                    public String apply(ListInstallationSitesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstallationSitesRequest.Builder>,
                        ListInstallationSitesRequest>() {
                    @Override
                    public ListInstallationSitesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstallationSitesRequest.Builder>
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
                        ListInstallationSitesRequest, ListInstallationSitesResponse>() {
                    @Override
                    public ListInstallationSitesResponse apply(
                            ListInstallationSitesRequest request) {
                        return client.listInstallationSites(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.InstallationSiteSummary} objects contained in responses from the
     * listInstallationSites operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.InstallationSiteSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.jms.model.InstallationSiteSummary>
            listInstallationSitesRecordIterator(final ListInstallationSitesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstallationSitesRequest.Builder,
                ListInstallationSitesRequest,
                ListInstallationSitesResponse,
                com.oracle.bmc.jms.model.InstallationSiteSummary>(
                new java.util.function.Supplier<ListInstallationSitesRequest.Builder>() {
                    @Override
                    public ListInstallationSitesRequest.Builder get() {
                        return ListInstallationSitesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstallationSitesResponse, String>() {
                    @Override
                    public String apply(ListInstallationSitesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstallationSitesRequest.Builder>,
                        ListInstallationSitesRequest>() {
                    @Override
                    public ListInstallationSitesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstallationSitesRequest.Builder>
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
                        ListInstallationSitesRequest, ListInstallationSitesResponse>() {
                    @Override
                    public ListInstallationSitesResponse apply(
                            ListInstallationSitesRequest request) {
                        return client.listInstallationSites(request);
                    }
                },
                new java.util.function.Function<
                        ListInstallationSitesResponse,
                        java.util.List<com.oracle.bmc.jms.model.InstallationSiteSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.InstallationSiteSummary> apply(
                            ListInstallationSitesResponse response) {
                        return response.getInstallationSiteCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaFamilies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaFamiliesResponse> listJavaFamiliesResponseIterator(
            final ListJavaFamiliesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaFamiliesRequest.Builder, ListJavaFamiliesRequest, ListJavaFamiliesResponse>(
                new java.util.function.Supplier<ListJavaFamiliesRequest.Builder>() {
                    @Override
                    public ListJavaFamiliesRequest.Builder get() {
                        return ListJavaFamiliesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaFamiliesResponse, String>() {
                    @Override
                    public String apply(ListJavaFamiliesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaFamiliesRequest.Builder>,
                        ListJavaFamiliesRequest>() {
                    @Override
                    public ListJavaFamiliesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaFamiliesRequest.Builder>
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
                        ListJavaFamiliesRequest, ListJavaFamiliesResponse>() {
                    @Override
                    public ListJavaFamiliesResponse apply(ListJavaFamiliesRequest request) {
                        return client.listJavaFamilies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.JavaFamilySummary} objects contained in responses from the
     * listJavaFamilies operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.JavaFamilySummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.jms.model.JavaFamilySummary> listJavaFamiliesRecordIterator(
            final ListJavaFamiliesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaFamiliesRequest.Builder,
                ListJavaFamiliesRequest,
                ListJavaFamiliesResponse,
                com.oracle.bmc.jms.model.JavaFamilySummary>(
                new java.util.function.Supplier<ListJavaFamiliesRequest.Builder>() {
                    @Override
                    public ListJavaFamiliesRequest.Builder get() {
                        return ListJavaFamiliesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaFamiliesResponse, String>() {
                    @Override
                    public String apply(ListJavaFamiliesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaFamiliesRequest.Builder>,
                        ListJavaFamiliesRequest>() {
                    @Override
                    public ListJavaFamiliesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaFamiliesRequest.Builder>
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
                        ListJavaFamiliesRequest, ListJavaFamiliesResponse>() {
                    @Override
                    public ListJavaFamiliesResponse apply(ListJavaFamiliesRequest request) {
                        return client.listJavaFamilies(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaFamiliesResponse,
                        java.util.List<com.oracle.bmc.jms.model.JavaFamilySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.JavaFamilySummary> apply(
                            ListJavaFamiliesResponse response) {
                        return response.getJavaFamilyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaReleases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaReleasesResponse> listJavaReleasesResponseIterator(
            final ListJavaReleasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaReleasesRequest.Builder, ListJavaReleasesRequest, ListJavaReleasesResponse>(
                new java.util.function.Supplier<ListJavaReleasesRequest.Builder>() {
                    @Override
                    public ListJavaReleasesRequest.Builder get() {
                        return ListJavaReleasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaReleasesResponse, String>() {
                    @Override
                    public String apply(ListJavaReleasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaReleasesRequest.Builder>,
                        ListJavaReleasesRequest>() {
                    @Override
                    public ListJavaReleasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaReleasesRequest.Builder>
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
                        ListJavaReleasesRequest, ListJavaReleasesResponse>() {
                    @Override
                    public ListJavaReleasesResponse apply(ListJavaReleasesRequest request) {
                        return client.listJavaReleases(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.JavaReleaseSummary} objects contained in responses from the
     * listJavaReleases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.JavaReleaseSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.jms.model.JavaReleaseSummary> listJavaReleasesRecordIterator(
            final ListJavaReleasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaReleasesRequest.Builder,
                ListJavaReleasesRequest,
                ListJavaReleasesResponse,
                com.oracle.bmc.jms.model.JavaReleaseSummary>(
                new java.util.function.Supplier<ListJavaReleasesRequest.Builder>() {
                    @Override
                    public ListJavaReleasesRequest.Builder get() {
                        return ListJavaReleasesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaReleasesResponse, String>() {
                    @Override
                    public String apply(ListJavaReleasesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaReleasesRequest.Builder>,
                        ListJavaReleasesRequest>() {
                    @Override
                    public ListJavaReleasesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaReleasesRequest.Builder>
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
                        ListJavaReleasesRequest, ListJavaReleasesResponse>() {
                    @Override
                    public ListJavaReleasesResponse apply(ListJavaReleasesRequest request) {
                        return client.listJavaReleases(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaReleasesResponse,
                        java.util.List<com.oracle.bmc.jms.model.JavaReleaseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.JavaReleaseSummary> apply(
                            ListJavaReleasesResponse response) {
                        return response.getJavaReleaseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listJreUsage
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJreUsageResponse> listJreUsageResponseIterator(
            final ListJreUsageRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJreUsageRequest.Builder, ListJreUsageRequest, ListJreUsageResponse>(
                new java.util.function.Supplier<ListJreUsageRequest.Builder>() {
                    @Override
                    public ListJreUsageRequest.Builder get() {
                        return ListJreUsageRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJreUsageResponse, String>() {
                    @Override
                    public String apply(ListJreUsageResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJreUsageRequest.Builder>,
                        ListJreUsageRequest>() {
                    @Override
                    public ListJreUsageRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJreUsageRequest.Builder>
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
                new java.util.function.Function<ListJreUsageRequest, ListJreUsageResponse>() {
                    @Override
                    public ListJreUsageResponse apply(ListJreUsageRequest request) {
                        return client.listJreUsage(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.jms.model.JreUsage}
     * objects contained in responses from the listJreUsage operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.JreUsage} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.jms.model.JreUsage> listJreUsageRecordIterator(
            final ListJreUsageRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJreUsageRequest.Builder,
                ListJreUsageRequest,
                ListJreUsageResponse,
                com.oracle.bmc.jms.model.JreUsage>(
                new java.util.function.Supplier<ListJreUsageRequest.Builder>() {
                    @Override
                    public ListJreUsageRequest.Builder get() {
                        return ListJreUsageRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJreUsageResponse, String>() {
                    @Override
                    public String apply(ListJreUsageResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJreUsageRequest.Builder>,
                        ListJreUsageRequest>() {
                    @Override
                    public ListJreUsageRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJreUsageRequest.Builder>
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
                new java.util.function.Function<ListJreUsageRequest, ListJreUsageResponse>() {
                    @Override
                    public ListJreUsageResponse apply(ListJreUsageRequest request) {
                        return client.listJreUsage(request);
                    }
                },
                new java.util.function.Function<
                        ListJreUsageResponse, java.util.List<com.oracle.bmc.jms.model.JreUsage>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.JreUsage> apply(
                            ListJreUsageResponse response) {
                        return response.getJreUsageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkItems
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkItemsResponse> listWorkItemsResponseIterator(
            final ListWorkItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkItemsRequest.Builder, ListWorkItemsRequest, ListWorkItemsResponse>(
                new java.util.function.Supplier<ListWorkItemsRequest.Builder>() {
                    @Override
                    public ListWorkItemsRequest.Builder get() {
                        return ListWorkItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkItemsResponse, String>() {
                    @Override
                    public String apply(ListWorkItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkItemsRequest.Builder>,
                        ListWorkItemsRequest>() {
                    @Override
                    public ListWorkItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkItemsRequest.Builder>
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
                new java.util.function.Function<ListWorkItemsRequest, ListWorkItemsResponse>() {
                    @Override
                    public ListWorkItemsResponse apply(ListWorkItemsRequest request) {
                        return client.listWorkItems(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jms.model.WorkItemSummary} objects contained in responses from the
     * listWorkItems operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.WorkItemSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.jms.model.WorkItemSummary> listWorkItemsRecordIterator(
            final ListWorkItemsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkItemsRequest.Builder,
                ListWorkItemsRequest,
                ListWorkItemsResponse,
                com.oracle.bmc.jms.model.WorkItemSummary>(
                new java.util.function.Supplier<ListWorkItemsRequest.Builder>() {
                    @Override
                    public ListWorkItemsRequest.Builder get() {
                        return ListWorkItemsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkItemsResponse, String>() {
                    @Override
                    public String apply(ListWorkItemsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkItemsRequest.Builder>,
                        ListWorkItemsRequest>() {
                    @Override
                    public ListWorkItemsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkItemsRequest.Builder>
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
                new java.util.function.Function<ListWorkItemsRequest, ListWorkItemsResponse>() {
                    @Override
                    public ListWorkItemsResponse apply(ListWorkItemsRequest request) {
                        return client.listWorkItems(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkItemsResponse,
                        java.util.List<com.oracle.bmc.jms.model.WorkItemSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.WorkItemSummary> apply(
                            ListWorkItemsResponse response) {
                        return response.getWorkItemCollection().getItems();
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
     * com.oracle.bmc.jms.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.jms.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.jms.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.jms.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
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
     * com.oracle.bmc.jms.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.jms.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.jms.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.jms.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.WorkRequestLogEntry> apply(
                            ListWorkRequestLogsResponse response) {
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
     * com.oracle.bmc.jms.model.WorkRequest} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jms.model.WorkRequest} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.jms.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.jms.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.jms.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jms.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

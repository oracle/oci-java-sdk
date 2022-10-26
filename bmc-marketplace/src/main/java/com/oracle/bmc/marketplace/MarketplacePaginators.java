/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Marketplace where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class MarketplacePaginators {
    private final Marketplace client;

    public MarketplacePaginators(Marketplace client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAcceptedAgreements operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAcceptedAgreementsResponse> listAcceptedAgreementsResponseIterator(
            final ListAcceptedAgreementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAcceptedAgreementsRequest.Builder,
                ListAcceptedAgreementsRequest,
                ListAcceptedAgreementsResponse>(
                new java.util.function.Supplier<ListAcceptedAgreementsRequest.Builder>() {
                    @Override
                    public ListAcceptedAgreementsRequest.Builder get() {
                        return ListAcceptedAgreementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAcceptedAgreementsResponse, String>() {
                    @Override
                    public String apply(ListAcceptedAgreementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAcceptedAgreementsRequest.Builder>,
                        ListAcceptedAgreementsRequest>() {
                    @Override
                    public ListAcceptedAgreementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAcceptedAgreementsRequest.Builder>
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
                        ListAcceptedAgreementsRequest, ListAcceptedAgreementsResponse>() {
                    @Override
                    public ListAcceptedAgreementsResponse apply(
                            ListAcceptedAgreementsRequest request) {
                        return client.listAcceptedAgreements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.AcceptedAgreementSummary} objects contained in responses
     * from the listAcceptedAgreements operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.AcceptedAgreementSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.AcceptedAgreementSummary>
            listAcceptedAgreementsRecordIterator(final ListAcceptedAgreementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAcceptedAgreementsRequest.Builder,
                ListAcceptedAgreementsRequest,
                ListAcceptedAgreementsResponse,
                com.oracle.bmc.marketplace.model.AcceptedAgreementSummary>(
                new java.util.function.Supplier<ListAcceptedAgreementsRequest.Builder>() {
                    @Override
                    public ListAcceptedAgreementsRequest.Builder get() {
                        return ListAcceptedAgreementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAcceptedAgreementsResponse, String>() {
                    @Override
                    public String apply(ListAcceptedAgreementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAcceptedAgreementsRequest.Builder>,
                        ListAcceptedAgreementsRequest>() {
                    @Override
                    public ListAcceptedAgreementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAcceptedAgreementsRequest.Builder>
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
                        ListAcceptedAgreementsRequest, ListAcceptedAgreementsResponse>() {
                    @Override
                    public ListAcceptedAgreementsResponse apply(
                            ListAcceptedAgreementsRequest request) {
                        return client.listAcceptedAgreements(request);
                    }
                },
                new java.util.function.Function<
                        ListAcceptedAgreementsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplace.model.AcceptedAgreementSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.AcceptedAgreementSummary>
                            apply(ListAcceptedAgreementsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAgreements
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgreementsResponse> listAgreementsResponseIterator(
            final ListAgreementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgreementsRequest.Builder, ListAgreementsRequest, ListAgreementsResponse>(
                new java.util.function.Supplier<ListAgreementsRequest.Builder>() {
                    @Override
                    public ListAgreementsRequest.Builder get() {
                        return ListAgreementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgreementsResponse, String>() {
                    @Override
                    public String apply(ListAgreementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgreementsRequest.Builder>,
                        ListAgreementsRequest>() {
                    @Override
                    public ListAgreementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgreementsRequest.Builder>
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
                new java.util.function.Function<ListAgreementsRequest, ListAgreementsResponse>() {
                    @Override
                    public ListAgreementsResponse apply(ListAgreementsRequest request) {
                        return client.listAgreements(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.AgreementSummary} objects contained in responses from the
     * listAgreements operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.AgreementSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.AgreementSummary> listAgreementsRecordIterator(
            final ListAgreementsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgreementsRequest.Builder,
                ListAgreementsRequest,
                ListAgreementsResponse,
                com.oracle.bmc.marketplace.model.AgreementSummary>(
                new java.util.function.Supplier<ListAgreementsRequest.Builder>() {
                    @Override
                    public ListAgreementsRequest.Builder get() {
                        return ListAgreementsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgreementsResponse, String>() {
                    @Override
                    public String apply(ListAgreementsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgreementsRequest.Builder>,
                        ListAgreementsRequest>() {
                    @Override
                    public ListAgreementsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgreementsRequest.Builder>
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
                new java.util.function.Function<ListAgreementsRequest, ListAgreementsResponse>() {
                    @Override
                    public ListAgreementsResponse apply(ListAgreementsRequest request) {
                        return client.listAgreements(request);
                    }
                },
                new java.util.function.Function<
                        ListAgreementsResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.AgreementSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.AgreementSummary> apply(
                            ListAgreementsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCategories
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCategoriesResponse> listCategoriesResponseIterator(
            final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCategoriesRequest.Builder, ListCategoriesRequest, ListCategoriesResponse>(
                new java.util.function.Supplier<ListCategoriesRequest.Builder>() {
                    @Override
                    public ListCategoriesRequest.Builder get() {
                        return ListCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCategoriesResponse, String>() {
                    @Override
                    public String apply(ListCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCategoriesRequest.Builder>,
                        ListCategoriesRequest>() {
                    @Override
                    public ListCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCategoriesRequest.Builder>
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
                new java.util.function.Function<ListCategoriesRequest, ListCategoriesResponse>() {
                    @Override
                    public ListCategoriesResponse apply(ListCategoriesRequest request) {
                        return client.listCategories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.CategorySummary} objects contained in responses from the
     * listCategories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.CategorySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.CategorySummary> listCategoriesRecordIterator(
            final ListCategoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCategoriesRequest.Builder,
                ListCategoriesRequest,
                ListCategoriesResponse,
                com.oracle.bmc.marketplace.model.CategorySummary>(
                new java.util.function.Supplier<ListCategoriesRequest.Builder>() {
                    @Override
                    public ListCategoriesRequest.Builder get() {
                        return ListCategoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCategoriesResponse, String>() {
                    @Override
                    public String apply(ListCategoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCategoriesRequest.Builder>,
                        ListCategoriesRequest>() {
                    @Override
                    public ListCategoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCategoriesRequest.Builder>
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
                new java.util.function.Function<ListCategoriesRequest, ListCategoriesResponse>() {
                    @Override
                    public ListCategoriesResponse apply(ListCategoriesRequest request) {
                        return client.listCategories(request);
                    }
                },
                new java.util.function.Function<
                        ListCategoriesResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.CategorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.CategorySummary> apply(
                            ListCategoriesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listListings
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListListingsResponse> listListingsResponseIterator(
            final ListListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListListingsRequest.Builder, ListListingsRequest, ListListingsResponse>(
                new java.util.function.Supplier<ListListingsRequest.Builder>() {
                    @Override
                    public ListListingsRequest.Builder get() {
                        return ListListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingsResponse, String>() {
                    @Override
                    public String apply(ListListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingsRequest.Builder>,
                        ListListingsRequest>() {
                    @Override
                    public ListListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingsRequest.Builder>
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
                new java.util.function.Function<ListListingsRequest, ListListingsResponse>() {
                    @Override
                    public ListListingsResponse apply(ListListingsRequest request) {
                        return client.listListings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.ListingSummary} objects contained in responses from the
     * listListings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.ListingSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.ListingSummary> listListingsRecordIterator(
            final ListListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListListingsRequest.Builder,
                ListListingsRequest,
                ListListingsResponse,
                com.oracle.bmc.marketplace.model.ListingSummary>(
                new java.util.function.Supplier<ListListingsRequest.Builder>() {
                    @Override
                    public ListListingsRequest.Builder get() {
                        return ListListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListListingsResponse, String>() {
                    @Override
                    public String apply(ListListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListListingsRequest.Builder>,
                        ListListingsRequest>() {
                    @Override
                    public ListListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListListingsRequest.Builder>
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
                new java.util.function.Function<ListListingsRequest, ListListingsResponse>() {
                    @Override
                    public ListListingsResponse apply(ListListingsRequest request) {
                        return client.listListings(request);
                    }
                },
                new java.util.function.Function<
                        ListListingsResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.ListingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.ListingSummary> apply(
                            ListListingsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPackages
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPackagesResponse> listPackagesResponseIterator(
            final ListPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPackagesRequest.Builder, ListPackagesRequest, ListPackagesResponse>(
                new java.util.function.Supplier<ListPackagesRequest.Builder>() {
                    @Override
                    public ListPackagesRequest.Builder get() {
                        return ListPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPackagesResponse, String>() {
                    @Override
                    public String apply(ListPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackagesRequest.Builder>,
                        ListPackagesRequest>() {
                    @Override
                    public ListPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackagesRequest.Builder>
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
                new java.util.function.Function<ListPackagesRequest, ListPackagesResponse>() {
                    @Override
                    public ListPackagesResponse apply(ListPackagesRequest request) {
                        return client.listPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.ListingPackageSummary} objects contained in responses from
     * the listPackages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.ListingPackageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.ListingPackageSummary>
            listPackagesRecordIterator(final ListPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPackagesRequest.Builder,
                ListPackagesRequest,
                ListPackagesResponse,
                com.oracle.bmc.marketplace.model.ListingPackageSummary>(
                new java.util.function.Supplier<ListPackagesRequest.Builder>() {
                    @Override
                    public ListPackagesRequest.Builder get() {
                        return ListPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPackagesResponse, String>() {
                    @Override
                    public String apply(ListPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPackagesRequest.Builder>,
                        ListPackagesRequest>() {
                    @Override
                    public ListPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPackagesRequest.Builder>
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
                new java.util.function.Function<ListPackagesRequest, ListPackagesResponse>() {
                    @Override
                    public ListPackagesResponse apply(ListPackagesRequest request) {
                        return client.listPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListPackagesResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.ListingPackageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.ListingPackageSummary>
                            apply(ListPackagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPublicationPackages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicationPackagesResponse> listPublicationPackagesResponseIterator(
            final ListPublicationPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicationPackagesRequest.Builder,
                ListPublicationPackagesRequest,
                ListPublicationPackagesResponse>(
                new java.util.function.Supplier<ListPublicationPackagesRequest.Builder>() {
                    @Override
                    public ListPublicationPackagesRequest.Builder get() {
                        return ListPublicationPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicationPackagesResponse, String>() {
                    @Override
                    public String apply(ListPublicationPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicationPackagesRequest.Builder>,
                        ListPublicationPackagesRequest>() {
                    @Override
                    public ListPublicationPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicationPackagesRequest.Builder>
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
                        ListPublicationPackagesRequest, ListPublicationPackagesResponse>() {
                    @Override
                    public ListPublicationPackagesResponse apply(
                            ListPublicationPackagesRequest request) {
                        return client.listPublicationPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.PublicationPackageSummary} objects contained in responses
     * from the listPublicationPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.PublicationPackageSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.PublicationPackageSummary>
            listPublicationPackagesRecordIterator(final ListPublicationPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicationPackagesRequest.Builder,
                ListPublicationPackagesRequest,
                ListPublicationPackagesResponse,
                com.oracle.bmc.marketplace.model.PublicationPackageSummary>(
                new java.util.function.Supplier<ListPublicationPackagesRequest.Builder>() {
                    @Override
                    public ListPublicationPackagesRequest.Builder get() {
                        return ListPublicationPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicationPackagesResponse, String>() {
                    @Override
                    public String apply(ListPublicationPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicationPackagesRequest.Builder>,
                        ListPublicationPackagesRequest>() {
                    @Override
                    public ListPublicationPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicationPackagesRequest.Builder>
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
                        ListPublicationPackagesRequest, ListPublicationPackagesResponse>() {
                    @Override
                    public ListPublicationPackagesResponse apply(
                            ListPublicationPackagesRequest request) {
                        return client.listPublicationPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListPublicationPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplace.model.PublicationPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplace.model.PublicationPackageSummary>
                            apply(ListPublicationPackagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPublications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicationsResponse> listPublicationsResponseIterator(
            final ListPublicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublicationsRequest.Builder, ListPublicationsRequest, ListPublicationsResponse>(
                new java.util.function.Supplier<ListPublicationsRequest.Builder>() {
                    @Override
                    public ListPublicationsRequest.Builder get() {
                        return ListPublicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicationsResponse, String>() {
                    @Override
                    public String apply(ListPublicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicationsRequest.Builder>,
                        ListPublicationsRequest>() {
                    @Override
                    public ListPublicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicationsRequest.Builder>
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
                        ListPublicationsRequest, ListPublicationsResponse>() {
                    @Override
                    public ListPublicationsResponse apply(ListPublicationsRequest request) {
                        return client.listPublications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.PublicationSummary} objects contained in responses from the
     * listPublications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.PublicationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.PublicationSummary>
            listPublicationsRecordIterator(final ListPublicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublicationsRequest.Builder,
                ListPublicationsRequest,
                ListPublicationsResponse,
                com.oracle.bmc.marketplace.model.PublicationSummary>(
                new java.util.function.Supplier<ListPublicationsRequest.Builder>() {
                    @Override
                    public ListPublicationsRequest.Builder get() {
                        return ListPublicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublicationsResponse, String>() {
                    @Override
                    public String apply(ListPublicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublicationsRequest.Builder>,
                        ListPublicationsRequest>() {
                    @Override
                    public ListPublicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublicationsRequest.Builder>
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
                        ListPublicationsRequest, ListPublicationsResponse>() {
                    @Override
                    public ListPublicationsResponse apply(ListPublicationsRequest request) {
                        return client.listPublications(request);
                    }
                },
                new java.util.function.Function<
                        ListPublicationsResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.PublicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.PublicationSummary>
                            apply(ListPublicationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublishers
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublishersResponse> listPublishersResponseIterator(
            final ListPublishersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublishersRequest.Builder, ListPublishersRequest, ListPublishersResponse>(
                new java.util.function.Supplier<ListPublishersRequest.Builder>() {
                    @Override
                    public ListPublishersRequest.Builder get() {
                        return ListPublishersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublishersResponse, String>() {
                    @Override
                    public String apply(ListPublishersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishersRequest.Builder>,
                        ListPublishersRequest>() {
                    @Override
                    public ListPublishersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishersRequest.Builder>
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
                new java.util.function.Function<ListPublishersRequest, ListPublishersResponse>() {
                    @Override
                    public ListPublishersResponse apply(ListPublishersRequest request) {
                        return client.listPublishers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.PublisherSummary} objects contained in responses from the
     * listPublishers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.PublisherSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.PublisherSummary> listPublishersRecordIterator(
            final ListPublishersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublishersRequest.Builder,
                ListPublishersRequest,
                ListPublishersResponse,
                com.oracle.bmc.marketplace.model.PublisherSummary>(
                new java.util.function.Supplier<ListPublishersRequest.Builder>() {
                    @Override
                    public ListPublishersRequest.Builder get() {
                        return ListPublishersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPublishersResponse, String>() {
                    @Override
                    public String apply(ListPublishersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishersRequest.Builder>,
                        ListPublishersRequest>() {
                    @Override
                    public ListPublishersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishersRequest.Builder>
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
                new java.util.function.Function<ListPublishersRequest, ListPublishersResponse>() {
                    @Override
                    public ListPublishersResponse apply(ListPublishersRequest request) {
                        return client.listPublishers(request);
                    }
                },
                new java.util.function.Function<
                        ListPublishersResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.PublisherSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.PublisherSummary> apply(
                            ListPublishersResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listReportTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReportTypesResponse> listReportTypesResponseIterator(
            final ListReportTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportTypesRequest.Builder, ListReportTypesRequest, ListReportTypesResponse>(
                new java.util.function.Supplier<ListReportTypesRequest.Builder>() {
                    @Override
                    public ListReportTypesRequest.Builder get() {
                        return ListReportTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportTypesResponse, String>() {
                    @Override
                    public String apply(ListReportTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportTypesRequest.Builder>,
                        ListReportTypesRequest>() {
                    @Override
                    public ListReportTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportTypesRequest.Builder>
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
                new java.util.function.Function<ListReportTypesRequest, ListReportTypesResponse>() {
                    @Override
                    public ListReportTypesResponse apply(ListReportTypesRequest request) {
                        return client.listReportTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.ReportTypeSummary} objects contained in responses from the
     * listReportTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.ReportTypeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.ReportTypeSummary>
            listReportTypesRecordIterator(final ListReportTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportTypesRequest.Builder,
                ListReportTypesRequest,
                ListReportTypesResponse,
                com.oracle.bmc.marketplace.model.ReportTypeSummary>(
                new java.util.function.Supplier<ListReportTypesRequest.Builder>() {
                    @Override
                    public ListReportTypesRequest.Builder get() {
                        return ListReportTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportTypesResponse, String>() {
                    @Override
                    public String apply(ListReportTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportTypesRequest.Builder>,
                        ListReportTypesRequest>() {
                    @Override
                    public ListReportTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportTypesRequest.Builder>
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
                new java.util.function.Function<ListReportTypesRequest, ListReportTypesResponse>() {
                    @Override
                    public ListReportTypesResponse apply(ListReportTypesRequest request) {
                        return client.listReportTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListReportTypesResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.ReportTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.ReportTypeSummary> apply(
                            ListReportTypesResponse response) {
                        return response.getReportTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReports
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListReportsResponse> listReportsResponseIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReportsRequest.Builder, ListReportsRequest, ListReportsResponse>(
                new java.util.function.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new java.util.function.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.ReportSummary} objects contained in responses from the
     * listReports operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.ReportSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.ReportSummary> listReportsRecordIterator(
            final ListReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReportsRequest.Builder,
                ListReportsRequest,
                ListReportsResponse,
                com.oracle.bmc.marketplace.model.ReportSummary>(
                new java.util.function.Supplier<ListReportsRequest.Builder>() {
                    @Override
                    public ListReportsRequest.Builder get() {
                        return ListReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListReportsResponse, String>() {
                    @Override
                    public String apply(ListReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReportsRequest.Builder>,
                        ListReportsRequest>() {
                    @Override
                    public ListReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReportsRequest.Builder>
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
                new java.util.function.Function<ListReportsRequest, ListReportsResponse>() {
                    @Override
                    public ListReportsResponse apply(ListReportsRequest request) {
                        return client.listReports(request);
                    }
                },
                new java.util.function.Function<
                        ListReportsResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.ReportSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.ReportSummary> apply(
                            ListReportsResponse response) {
                        return response.getReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the searchListings
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<SearchListingsResponse> searchListingsResponseIterator(
            final SearchListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                SearchListingsRequest.Builder, SearchListingsRequest, SearchListingsResponse>(
                new java.util.function.Supplier<SearchListingsRequest.Builder>() {
                    @Override
                    public SearchListingsRequest.Builder get() {
                        return SearchListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<SearchListingsResponse, String>() {
                    @Override
                    public String apply(SearchListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                SearchListingsRequest.Builder>,
                        SearchListingsRequest>() {
                    @Override
                    public SearchListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            SearchListingsRequest.Builder>
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
                new java.util.function.Function<SearchListingsRequest, SearchListingsResponse>() {
                    @Override
                    public SearchListingsResponse apply(SearchListingsRequest request) {
                        return client.searchListings(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.marketplace.model.ListingSummary} objects contained in responses from the
     * searchListings operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.marketplace.model.ListingSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.marketplace.model.ListingSummary> searchListingsRecordIterator(
            final SearchListingsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                SearchListingsRequest.Builder,
                SearchListingsRequest,
                SearchListingsResponse,
                com.oracle.bmc.marketplace.model.ListingSummary>(
                new java.util.function.Supplier<SearchListingsRequest.Builder>() {
                    @Override
                    public SearchListingsRequest.Builder get() {
                        return SearchListingsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<SearchListingsResponse, String>() {
                    @Override
                    public String apply(SearchListingsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                SearchListingsRequest.Builder>,
                        SearchListingsRequest>() {
                    @Override
                    public SearchListingsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            SearchListingsRequest.Builder>
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
                new java.util.function.Function<SearchListingsRequest, SearchListingsResponse>() {
                    @Override
                    public SearchListingsResponse apply(SearchListingsRequest request) {
                        return client.searchListings(request);
                    }
                },
                new java.util.function.Function<
                        SearchListingsResponse,
                        java.util.List<com.oracle.bmc.marketplace.model.ListingSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.marketplace.model.ListingSummary> apply(
                            SearchListingsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

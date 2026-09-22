/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of MarketplaceAdministrator where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class MarketplaceAdministratorPaginators {
    private final MarketplaceAdministrator client;

    public MarketplaceAdministratorPaginators(MarketplaceAdministrator client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminArtifacts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminArtifactsResponse> listAdminArtifactsResponseIterator(
            final ListAdminArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminArtifactsRequest.Builder, ListAdminArtifactsRequest,
                ListAdminArtifactsResponse>(
                new java.util.function.Supplier<ListAdminArtifactsRequest.Builder>() {
                    @Override
                    public ListAdminArtifactsRequest.Builder get() {
                        return ListAdminArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminArtifactsResponse, String>() {
                    @Override
                    public String apply(ListAdminArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminArtifactsRequest.Builder>,
                        ListAdminArtifactsRequest>() {
                    @Override
                    public ListAdminArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminArtifactsRequest.Builder>
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
                        ListAdminArtifactsRequest, ListAdminArtifactsResponse>() {
                    @Override
                    public ListAdminArtifactsResponse apply(ListAdminArtifactsRequest request) {
                        return client.listAdminArtifacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary} objects
     * contained in responses from the listAdminArtifacts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary>
            listAdminArtifactsRecordIterator(final ListAdminArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminArtifactsRequest.Builder, ListAdminArtifactsRequest,
                ListAdminArtifactsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary>(
                new java.util.function.Supplier<ListAdminArtifactsRequest.Builder>() {
                    @Override
                    public ListAdminArtifactsRequest.Builder get() {
                        return ListAdminArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminArtifactsResponse, String>() {
                    @Override
                    public String apply(ListAdminArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminArtifactsRequest.Builder>,
                        ListAdminArtifactsRequest>() {
                    @Override
                    public ListAdminArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminArtifactsRequest.Builder>
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
                        ListAdminArtifactsRequest, ListAdminArtifactsResponse>() {
                    @Override
                    public ListAdminArtifactsResponse apply(ListAdminArtifactsRequest request) {
                        return client.listAdminArtifacts(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminArtifactsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.AdminArtifactSummary>
                            apply(ListAdminArtifactsResponse response) {
                        return response.getAdminArtifactCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminListingRevisionAttachments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminListingRevisionAttachmentsResponse>
            listAdminListingRevisionAttachmentsResponseIterator(
                    final ListAdminListingRevisionAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminListingRevisionAttachmentsRequest.Builder,
                ListAdminListingRevisionAttachmentsRequest,
                ListAdminListingRevisionAttachmentsResponse>(
                new java.util.function.Supplier<
                        ListAdminListingRevisionAttachmentsRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsRequest.Builder get() {
                        return ListAdminListingRevisionAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionAttachmentsRequest.Builder>,
                        ListAdminListingRevisionAttachmentsRequest>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionAttachmentsRequest.Builder>
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
                        ListAdminListingRevisionAttachmentsRequest,
                        ListAdminListingRevisionAttachmentsResponse>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsResponse apply(
                            ListAdminListingRevisionAttachmentsRequest request) {
                        return client.listAdminListingRevisionAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionAttachmentSummary} objects
     * contained in responses from the listAdminListingRevisionAttachments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionAttachmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionAttachmentSummary>
            listAdminListingRevisionAttachmentsRecordIterator(
                    final ListAdminListingRevisionAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminListingRevisionAttachmentsRequest.Builder,
                ListAdminListingRevisionAttachmentsRequest,
                ListAdminListingRevisionAttachmentsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionAttachmentSummary>(
                new java.util.function.Supplier<
                        ListAdminListingRevisionAttachmentsRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsRequest.Builder get() {
                        return ListAdminListingRevisionAttachmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionAttachmentsResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionAttachmentsRequest.Builder>,
                        ListAdminListingRevisionAttachmentsRequest>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionAttachmentsRequest.Builder>
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
                        ListAdminListingRevisionAttachmentsRequest,
                        ListAdminListingRevisionAttachmentsResponse>() {
                    @Override
                    public ListAdminListingRevisionAttachmentsResponse apply(
                            ListAdminListingRevisionAttachmentsRequest request) {
                        return client.listAdminListingRevisionAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AdminListingRevisionAttachmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AdminListingRevisionAttachmentSummary>
                            apply(ListAdminListingRevisionAttachmentsResponse response) {
                        return response.getAdminListingRevisionAttachmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminListingRevisionPackages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminListingRevisionPackagesResponse>
            listAdminListingRevisionPackagesResponseIterator(
                    final ListAdminListingRevisionPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminListingRevisionPackagesRequest.Builder,
                ListAdminListingRevisionPackagesRequest, ListAdminListingRevisionPackagesResponse>(
                new java.util.function.Supplier<ListAdminListingRevisionPackagesRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionPackagesRequest.Builder get() {
                        return ListAdminListingRevisionPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionPackagesResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionPackagesRequest.Builder>,
                        ListAdminListingRevisionPackagesRequest>() {
                    @Override
                    public ListAdminListingRevisionPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionPackagesRequest.Builder>
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
                        ListAdminListingRevisionPackagesRequest,
                        ListAdminListingRevisionPackagesResponse>() {
                    @Override
                    public ListAdminListingRevisionPackagesResponse apply(
                            ListAdminListingRevisionPackagesRequest request) {
                        return client.listAdminListingRevisionPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionPackageSummary} objects
     * contained in responses from the listAdminListingRevisionPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionPackageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionPackageSummary>
            listAdminListingRevisionPackagesRecordIterator(
                    final ListAdminListingRevisionPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminListingRevisionPackagesRequest.Builder,
                ListAdminListingRevisionPackagesRequest, ListAdminListingRevisionPackagesResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionPackageSummary>(
                new java.util.function.Supplier<ListAdminListingRevisionPackagesRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionPackagesRequest.Builder get() {
                        return ListAdminListingRevisionPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionPackagesResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionPackagesRequest.Builder>,
                        ListAdminListingRevisionPackagesRequest>() {
                    @Override
                    public ListAdminListingRevisionPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionPackagesRequest.Builder>
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
                        ListAdminListingRevisionPackagesRequest,
                        ListAdminListingRevisionPackagesResponse>() {
                    @Override
                    public ListAdminListingRevisionPackagesResponse apply(
                            ListAdminListingRevisionPackagesRequest request) {
                        return client.listAdminListingRevisionPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AdminListingRevisionPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AdminListingRevisionPackageSummary>
                            apply(ListAdminListingRevisionPackagesResponse response) {
                        return response.getAdminListingRevisionPackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminListingRevisions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminListingRevisionsResponse> listAdminListingRevisionsResponseIterator(
            final ListAdminListingRevisionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminListingRevisionsRequest.Builder, ListAdminListingRevisionsRequest,
                ListAdminListingRevisionsResponse>(
                new java.util.function.Supplier<ListAdminListingRevisionsRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionsRequest.Builder get() {
                        return ListAdminListingRevisionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminListingRevisionsResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionsRequest.Builder>,
                        ListAdminListingRevisionsRequest>() {
                    @Override
                    public ListAdminListingRevisionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionsRequest.Builder>
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
                        ListAdminListingRevisionsRequest, ListAdminListingRevisionsResponse>() {
                    @Override
                    public ListAdminListingRevisionsResponse apply(
                            ListAdminListingRevisionsRequest request) {
                        return client.listAdminListingRevisions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionSummary} objects
     * contained in responses from the listAdminListingRevisions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionSummary>
            listAdminListingRevisionsRecordIterator(
                    final ListAdminListingRevisionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminListingRevisionsRequest.Builder, ListAdminListingRevisionsRequest,
                ListAdminListingRevisionsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionSummary>(
                new java.util.function.Supplier<ListAdminListingRevisionsRequest.Builder>() {
                    @Override
                    public ListAdminListingRevisionsRequest.Builder get() {
                        return ListAdminListingRevisionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminListingRevisionsResponse, String>() {
                    @Override
                    public String apply(ListAdminListingRevisionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminListingRevisionsRequest.Builder>,
                        ListAdminListingRevisionsRequest>() {
                    @Override
                    public ListAdminListingRevisionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminListingRevisionsRequest.Builder>
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
                        ListAdminListingRevisionsRequest, ListAdminListingRevisionsResponse>() {
                    @Override
                    public ListAdminListingRevisionsResponse apply(
                            ListAdminListingRevisionsRequest request) {
                        return client.listAdminListingRevisions(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminListingRevisionsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AdminListingRevisionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AdminListingRevisionSummary>
                            apply(ListAdminListingRevisionsResponse response) {
                        return response.getAdminListingRevisionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminPublisherSkus operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminPublisherSkusResponse> listAdminPublisherSkusResponseIterator(
            final ListAdminPublisherSkusRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminPublisherSkusRequest.Builder, ListAdminPublisherSkusRequest,
                ListAdminPublisherSkusResponse>(
                new java.util.function.Supplier<ListAdminPublisherSkusRequest.Builder>() {
                    @Override
                    public ListAdminPublisherSkusRequest.Builder get() {
                        return ListAdminPublisherSkusRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminPublisherSkusResponse, String>() {
                    @Override
                    public String apply(ListAdminPublisherSkusResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminPublisherSkusRequest.Builder>,
                        ListAdminPublisherSkusRequest>() {
                    @Override
                    public ListAdminPublisherSkusRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminPublisherSkusRequest.Builder>
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
                        ListAdminPublisherSkusRequest, ListAdminPublisherSkusResponse>() {
                    @Override
                    public ListAdminPublisherSkusResponse apply(
                            ListAdminPublisherSkusRequest request) {
                        return client.listAdminPublisherSkus(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku} objects
     * contained in responses from the listAdminPublisherSkus operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku>
            listAdminPublisherSkusRecordIterator(final ListAdminPublisherSkusRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminPublisherSkusRequest.Builder, ListAdminPublisherSkusRequest,
                ListAdminPublisherSkusResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku>(
                new java.util.function.Supplier<ListAdminPublisherSkusRequest.Builder>() {
                    @Override
                    public ListAdminPublisherSkusRequest.Builder get() {
                        return ListAdminPublisherSkusRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminPublisherSkusResponse, String>() {
                    @Override
                    public String apply(ListAdminPublisherSkusResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminPublisherSkusRequest.Builder>,
                        ListAdminPublisherSkusRequest>() {
                    @Override
                    public ListAdminPublisherSkusRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminPublisherSkusRequest.Builder>
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
                        ListAdminPublisherSkusRequest, ListAdminPublisherSkusResponse>() {
                    @Override
                    public ListAdminPublisherSkusResponse apply(
                            ListAdminPublisherSkusRequest request) {
                        return client.listAdminPublisherSkus(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminPublisherSkusResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.AdminPublisherSku>
                            apply(ListAdminPublisherSkusResponse response) {
                        return response.getAdminPublisherSkuCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminTermVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminTermVersionsResponse> listAdminTermVersionsResponseIterator(
            final ListAdminTermVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminTermVersionsRequest.Builder, ListAdminTermVersionsRequest,
                ListAdminTermVersionsResponse>(
                new java.util.function.Supplier<ListAdminTermVersionsRequest.Builder>() {
                    @Override
                    public ListAdminTermVersionsRequest.Builder get() {
                        return ListAdminTermVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminTermVersionsResponse, String>() {
                    @Override
                    public String apply(ListAdminTermVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminTermVersionsRequest.Builder>,
                        ListAdminTermVersionsRequest>() {
                    @Override
                    public ListAdminTermVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminTermVersionsRequest.Builder>
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
                        ListAdminTermVersionsRequest, ListAdminTermVersionsResponse>() {
                    @Override
                    public ListAdminTermVersionsResponse apply(
                            ListAdminTermVersionsRequest request) {
                        return client.listAdminTermVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminTermVersionSummary} objects
     * contained in responses from the listAdminTermVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminTermVersionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminTermVersionSummary>
            listAdminTermVersionsRecordIterator(final ListAdminTermVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminTermVersionsRequest.Builder, ListAdminTermVersionsRequest,
                ListAdminTermVersionsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminTermVersionSummary>(
                new java.util.function.Supplier<ListAdminTermVersionsRequest.Builder>() {
                    @Override
                    public ListAdminTermVersionsRequest.Builder get() {
                        return ListAdminTermVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminTermVersionsResponse, String>() {
                    @Override
                    public String apply(ListAdminTermVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminTermVersionsRequest.Builder>,
                        ListAdminTermVersionsRequest>() {
                    @Override
                    public ListAdminTermVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminTermVersionsRequest.Builder>
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
                        ListAdminTermVersionsRequest, ListAdminTermVersionsResponse>() {
                    @Override
                    public ListAdminTermVersionsResponse apply(
                            ListAdminTermVersionsRequest request) {
                        return client.listAdminTermVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminTermVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AdminTermVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AdminTermVersionSummary>
                            apply(ListAdminTermVersionsResponse response) {
                        return response.getAdminTermVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminTerms operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminTermsResponse> listAdminTermsResponseIterator(
            final ListAdminTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminTermsRequest.Builder, ListAdminTermsRequest, ListAdminTermsResponse>(
                new java.util.function.Supplier<ListAdminTermsRequest.Builder>() {
                    @Override
                    public ListAdminTermsRequest.Builder get() {
                        return ListAdminTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminTermsResponse, String>() {
                    @Override
                    public String apply(ListAdminTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminTermsRequest.Builder>,
                        ListAdminTermsRequest>() {
                    @Override
                    public ListAdminTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminTermsRequest.Builder>
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
                new java.util.function.Function<ListAdminTermsRequest, ListAdminTermsResponse>() {
                    @Override
                    public ListAdminTermsResponse apply(ListAdminTermsRequest request) {
                        return client.listAdminTerms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminTermSummary} objects
     * contained in responses from the listAdminTerms operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminTermSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminTermSummary>
            listAdminTermsRecordIterator(final ListAdminTermsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminTermsRequest.Builder, ListAdminTermsRequest, ListAdminTermsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminTermSummary>(
                new java.util.function.Supplier<ListAdminTermsRequest.Builder>() {
                    @Override
                    public ListAdminTermsRequest.Builder get() {
                        return ListAdminTermsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminTermsResponse, String>() {
                    @Override
                    public String apply(ListAdminTermsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminTermsRequest.Builder>,
                        ListAdminTermsRequest>() {
                    @Override
                    public ListAdminTermsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminTermsRequest.Builder>
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
                new java.util.function.Function<ListAdminTermsRequest, ListAdminTermsResponse>() {
                    @Override
                    public ListAdminTermsResponse apply(ListAdminTermsRequest request) {
                        return client.listAdminTerms(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminTermsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model.AdminTermSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model.AdminTermSummary>
                            apply(ListAdminTermsResponse response) {
                        return response.getAdminTermCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAdminWorkRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAdminWorkRequestsResponse> listAdminWorkRequestsResponseIterator(
            final ListAdminWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminWorkRequestsRequest.Builder, ListAdminWorkRequestsRequest,
                ListAdminWorkRequestsResponse>(
                new java.util.function.Supplier<ListAdminWorkRequestsRequest.Builder>() {
                    @Override
                    public ListAdminWorkRequestsRequest.Builder get() {
                        return ListAdminWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListAdminWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminWorkRequestsRequest.Builder>,
                        ListAdminWorkRequestsRequest>() {
                    @Override
                    public ListAdminWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminWorkRequestsRequest.Builder>
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
                        ListAdminWorkRequestsRequest, ListAdminWorkRequestsResponse>() {
                    @Override
                    public ListAdminWorkRequestsResponse apply(
                            ListAdminWorkRequestsRequest request) {
                        return client.listAdminWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminWorkRequestSummary} objects
     * contained in responses from the listAdminWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.marketplacepublisher.model.AdminWorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.marketplacepublisher.model.AdminWorkRequestSummary>
            listAdminWorkRequestsRecordIterator(final ListAdminWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminWorkRequestsRequest.Builder, ListAdminWorkRequestsRequest,
                ListAdminWorkRequestsResponse,
                com.oracle.bmc.marketplacepublisher.model.AdminWorkRequestSummary>(
                new java.util.function.Supplier<ListAdminWorkRequestsRequest.Builder>() {
                    @Override
                    public ListAdminWorkRequestsRequest.Builder get() {
                        return ListAdminWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListAdminWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminWorkRequestsRequest.Builder>,
                        ListAdminWorkRequestsRequest>() {
                    @Override
                    public ListAdminWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminWorkRequestsRequest.Builder>
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
                        ListAdminWorkRequestsRequest, ListAdminWorkRequestsResponse>() {
                    @Override
                    public ListAdminWorkRequestsResponse apply(
                            ListAdminWorkRequestsRequest request) {
                        return client.listAdminWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.marketplacepublisher.model
                                        .AdminWorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.marketplacepublisher.model
                                            .AdminWorkRequestSummary>
                            apply(ListAdminWorkRequestsResponse response) {
                        return response.getAdminWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

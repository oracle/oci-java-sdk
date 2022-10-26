/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of CertificatesManagement where multiple pages of data may be fetched. Two
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class CertificatesManagementPaginators {
    private final CertificatesManagement client;

    public CertificatesManagementPaginators(CertificatesManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAssociations operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAssociationsResponse> listAssociationsResponseIterator(
            final ListAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAssociationsRequest.Builder, ListAssociationsRequest, ListAssociationsResponse>(
                new java.util.function.Supplier<ListAssociationsRequest.Builder>() {
                    @Override
                    public ListAssociationsRequest.Builder get() {
                        return ListAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociationsResponse, String>() {
                    @Override
                    public String apply(ListAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociationsRequest.Builder>,
                        ListAssociationsRequest>() {
                    @Override
                    public ListAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociationsRequest.Builder>
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
                        ListAssociationsRequest, ListAssociationsResponse>() {
                    @Override
                    public ListAssociationsResponse apply(ListAssociationsRequest request) {
                        return client.listAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.AssociationSummary} objects contained in
     * responses from the listAssociations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.AssociationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.AssociationSummary>
            listAssociationsRecordIterator(final ListAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAssociationsRequest.Builder,
                ListAssociationsRequest,
                ListAssociationsResponse,
                com.oracle.bmc.certificatesmanagement.model.AssociationSummary>(
                new java.util.function.Supplier<ListAssociationsRequest.Builder>() {
                    @Override
                    public ListAssociationsRequest.Builder get() {
                        return ListAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAssociationsResponse, String>() {
                    @Override
                    public String apply(ListAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAssociationsRequest.Builder>,
                        ListAssociationsRequest>() {
                    @Override
                    public ListAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAssociationsRequest.Builder>
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
                        ListAssociationsRequest, ListAssociationsResponse>() {
                    @Override
                    public ListAssociationsResponse apply(ListAssociationsRequest request) {
                        return client.listAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model.AssociationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model.AssociationSummary>
                            apply(ListAssociationsResponse response) {
                        return response.getAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCaBundles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCaBundlesResponse> listCaBundlesResponseIterator(
            final ListCaBundlesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCaBundlesRequest.Builder, ListCaBundlesRequest, ListCaBundlesResponse>(
                new java.util.function.Supplier<ListCaBundlesRequest.Builder>() {
                    @Override
                    public ListCaBundlesRequest.Builder get() {
                        return ListCaBundlesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCaBundlesResponse, String>() {
                    @Override
                    public String apply(ListCaBundlesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaBundlesRequest.Builder>,
                        ListCaBundlesRequest>() {
                    @Override
                    public ListCaBundlesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaBundlesRequest.Builder>
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
                new java.util.function.Function<ListCaBundlesRequest, ListCaBundlesResponse>() {
                    @Override
                    public ListCaBundlesResponse apply(ListCaBundlesRequest request) {
                        return client.listCaBundles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.CaBundleSummary} objects contained in responses
     * from the listCaBundles operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.CaBundleSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.CaBundleSummary>
            listCaBundlesRecordIterator(final ListCaBundlesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCaBundlesRequest.Builder,
                ListCaBundlesRequest,
                ListCaBundlesResponse,
                com.oracle.bmc.certificatesmanagement.model.CaBundleSummary>(
                new java.util.function.Supplier<ListCaBundlesRequest.Builder>() {
                    @Override
                    public ListCaBundlesRequest.Builder get() {
                        return ListCaBundlesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCaBundlesResponse, String>() {
                    @Override
                    public String apply(ListCaBundlesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaBundlesRequest.Builder>,
                        ListCaBundlesRequest>() {
                    @Override
                    public ListCaBundlesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaBundlesRequest.Builder>
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
                new java.util.function.Function<ListCaBundlesRequest, ListCaBundlesResponse>() {
                    @Override
                    public ListCaBundlesResponse apply(ListCaBundlesRequest request) {
                        return client.listCaBundles(request);
                    }
                },
                new java.util.function.Function<
                        ListCaBundlesResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model.CaBundleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model.CaBundleSummary>
                            apply(ListCaBundlesResponse response) {
                        return response.getCaBundleCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificateAuthorities operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificateAuthoritiesResponse> listCertificateAuthoritiesResponseIterator(
            final ListCertificateAuthoritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificateAuthoritiesRequest.Builder,
                ListCertificateAuthoritiesRequest,
                ListCertificateAuthoritiesResponse>(
                new java.util.function.Supplier<ListCertificateAuthoritiesRequest.Builder>() {
                    @Override
                    public ListCertificateAuthoritiesRequest.Builder get() {
                        return ListCertificateAuthoritiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificateAuthoritiesResponse, String>() {
                    @Override
                    public String apply(ListCertificateAuthoritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateAuthoritiesRequest.Builder>,
                        ListCertificateAuthoritiesRequest>() {
                    @Override
                    public ListCertificateAuthoritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateAuthoritiesRequest.Builder>
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
                        ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResponse>() {
                    @Override
                    public ListCertificateAuthoritiesResponse apply(
                            ListCertificateAuthoritiesRequest request) {
                        return client.listCertificateAuthorities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.CertificateAuthoritySummary} objects contained in
     * responses from the listCertificateAuthorities operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.CertificateAuthoritySummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.CertificateAuthoritySummary>
            listCertificateAuthoritiesRecordIterator(
                    final ListCertificateAuthoritiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificateAuthoritiesRequest.Builder,
                ListCertificateAuthoritiesRequest,
                ListCertificateAuthoritiesResponse,
                com.oracle.bmc.certificatesmanagement.model.CertificateAuthoritySummary>(
                new java.util.function.Supplier<ListCertificateAuthoritiesRequest.Builder>() {
                    @Override
                    public ListCertificateAuthoritiesRequest.Builder get() {
                        return ListCertificateAuthoritiesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificateAuthoritiesResponse, String>() {
                    @Override
                    public String apply(ListCertificateAuthoritiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateAuthoritiesRequest.Builder>,
                        ListCertificateAuthoritiesRequest>() {
                    @Override
                    public ListCertificateAuthoritiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateAuthoritiesRequest.Builder>
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
                        ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResponse>() {
                    @Override
                    public ListCertificateAuthoritiesResponse apply(
                            ListCertificateAuthoritiesRequest request) {
                        return client.listCertificateAuthorities(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificateAuthoritiesResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model
                                        .CertificateAuthoritySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model
                                            .CertificateAuthoritySummary>
                            apply(ListCertificateAuthoritiesResponse response) {
                        return response.getCertificateAuthorityCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificateAuthorityVersions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificateAuthorityVersionsResponse>
            listCertificateAuthorityVersionsResponseIterator(
                    final ListCertificateAuthorityVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificateAuthorityVersionsRequest.Builder,
                ListCertificateAuthorityVersionsRequest,
                ListCertificateAuthorityVersionsResponse>(
                new java.util.function.Supplier<ListCertificateAuthorityVersionsRequest.Builder>() {
                    @Override
                    public ListCertificateAuthorityVersionsRequest.Builder get() {
                        return ListCertificateAuthorityVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificateAuthorityVersionsResponse, String>() {
                    @Override
                    public String apply(ListCertificateAuthorityVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateAuthorityVersionsRequest.Builder>,
                        ListCertificateAuthorityVersionsRequest>() {
                    @Override
                    public ListCertificateAuthorityVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateAuthorityVersionsRequest.Builder>
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
                        ListCertificateAuthorityVersionsRequest,
                        ListCertificateAuthorityVersionsResponse>() {
                    @Override
                    public ListCertificateAuthorityVersionsResponse apply(
                            ListCertificateAuthorityVersionsRequest request) {
                        return client.listCertificateAuthorityVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionSummary} objects
     * contained in responses from the listCertificateAuthorityVersions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionSummary>
            listCertificateAuthorityVersionsRecordIterator(
                    final ListCertificateAuthorityVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificateAuthorityVersionsRequest.Builder,
                ListCertificateAuthorityVersionsRequest,
                ListCertificateAuthorityVersionsResponse,
                com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionSummary>(
                new java.util.function.Supplier<ListCertificateAuthorityVersionsRequest.Builder>() {
                    @Override
                    public ListCertificateAuthorityVersionsRequest.Builder get() {
                        return ListCertificateAuthorityVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificateAuthorityVersionsResponse, String>() {
                    @Override
                    public String apply(ListCertificateAuthorityVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateAuthorityVersionsRequest.Builder>,
                        ListCertificateAuthorityVersionsRequest>() {
                    @Override
                    public ListCertificateAuthorityVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateAuthorityVersionsRequest.Builder>
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
                        ListCertificateAuthorityVersionsRequest,
                        ListCertificateAuthorityVersionsResponse>() {
                    @Override
                    public ListCertificateAuthorityVersionsResponse apply(
                            ListCertificateAuthorityVersionsRequest request) {
                        return client.listCertificateAuthorityVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificateAuthorityVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model
                                        .CertificateAuthorityVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model
                                            .CertificateAuthorityVersionSummary>
                            apply(ListCertificateAuthorityVersionsResponse response) {
                        return response.getCertificateAuthorityVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificateVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificateVersionsResponse> listCertificateVersionsResponseIterator(
            final ListCertificateVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificateVersionsRequest.Builder,
                ListCertificateVersionsRequest,
                ListCertificateVersionsResponse>(
                new java.util.function.Supplier<ListCertificateVersionsRequest.Builder>() {
                    @Override
                    public ListCertificateVersionsRequest.Builder get() {
                        return ListCertificateVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificateVersionsResponse, String>() {
                    @Override
                    public String apply(ListCertificateVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateVersionsRequest.Builder>,
                        ListCertificateVersionsRequest>() {
                    @Override
                    public ListCertificateVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateVersionsRequest.Builder>
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
                        ListCertificateVersionsRequest, ListCertificateVersionsResponse>() {
                    @Override
                    public ListCertificateVersionsResponse apply(
                            ListCertificateVersionsRequest request) {
                        return client.listCertificateVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.CertificateVersionSummary} objects contained in
     * responses from the listCertificateVersions operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.CertificateVersionSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.CertificateVersionSummary>
            listCertificateVersionsRecordIterator(final ListCertificateVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificateVersionsRequest.Builder,
                ListCertificateVersionsRequest,
                ListCertificateVersionsResponse,
                com.oracle.bmc.certificatesmanagement.model.CertificateVersionSummary>(
                new java.util.function.Supplier<ListCertificateVersionsRequest.Builder>() {
                    @Override
                    public ListCertificateVersionsRequest.Builder get() {
                        return ListCertificateVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificateVersionsResponse, String>() {
                    @Override
                    public String apply(ListCertificateVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificateVersionsRequest.Builder>,
                        ListCertificateVersionsRequest>() {
                    @Override
                    public ListCertificateVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificateVersionsRequest.Builder>
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
                        ListCertificateVersionsRequest, ListCertificateVersionsResponse>() {
                    @Override
                    public ListCertificateVersionsResponse apply(
                            ListCertificateVersionsRequest request) {
                        return client.listCertificateVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificateVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model
                                        .CertificateVersionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model
                                            .CertificateVersionSummary>
                            apply(ListCertificateVersionsResponse response) {
                        return response.getCertificateVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificatesResponse> listCertificatesResponseIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse>(
                new java.util.function.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.certificatesmanagement.model.CertificateSummary} objects contained in
     * responses from the listCertificates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.certificatesmanagement.model.CertificateSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.certificatesmanagement.model.CertificateSummary>
            listCertificatesRecordIterator(final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificatesRequest.Builder,
                ListCertificatesRequest,
                ListCertificatesResponse,
                com.oracle.bmc.certificatesmanagement.model.CertificateSummary>(
                new java.util.function.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificatesResponse,
                        java.util.List<
                                com.oracle.bmc.certificatesmanagement.model.CertificateSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.certificatesmanagement.model.CertificateSummary>
                            apply(ListCertificatesResponse response) {
                        return response.getCertificateCollection().getItems();
                    }
                });
    }
}

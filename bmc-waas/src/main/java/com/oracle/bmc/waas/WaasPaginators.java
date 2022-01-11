/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Waas where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.RequiredArgsConstructor
public class WaasPaginators {
    private final Waas client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAccessRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAccessRulesResponse> listAccessRulesResponseIterator(
            final ListAccessRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAccessRulesRequest.Builder, ListAccessRulesRequest, ListAccessRulesResponse>(
                new com.google.common.base.Supplier<ListAccessRulesRequest.Builder>() {
                    @Override
                    public ListAccessRulesRequest.Builder get() {
                        return ListAccessRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRulesResponse, String>() {
                    @Override
                    public String apply(ListAccessRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRulesRequest.Builder>,
                        ListAccessRulesRequest>() {
                    @Override
                    public ListAccessRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRulesRequest.Builder>
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
                        ListAccessRulesRequest, ListAccessRulesResponse>() {
                    @Override
                    public ListAccessRulesResponse apply(ListAccessRulesRequest request) {
                        return client.listAccessRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.AccessRule} objects
     * contained in responses from the listAccessRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.AccessRule} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.AccessRule> listAccessRulesRecordIterator(
            final ListAccessRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAccessRulesRequest.Builder, ListAccessRulesRequest, ListAccessRulesResponse,
                com.oracle.bmc.waas.model.AccessRule>(
                new com.google.common.base.Supplier<ListAccessRulesRequest.Builder>() {
                    @Override
                    public ListAccessRulesRequest.Builder get() {
                        return ListAccessRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessRulesResponse, String>() {
                    @Override
                    public String apply(ListAccessRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessRulesRequest.Builder>,
                        ListAccessRulesRequest>() {
                    @Override
                    public ListAccessRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessRulesRequest.Builder>
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
                        ListAccessRulesRequest, ListAccessRulesResponse>() {
                    @Override
                    public ListAccessRulesResponse apply(ListAccessRulesRequest request) {
                        return client.listAccessRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAccessRulesResponse,
                        java.util.List<com.oracle.bmc.waas.model.AccessRule>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.AccessRule> apply(
                            ListAccessRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAddressLists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAddressListsResponse> listAddressListsResponseIterator(
            final ListAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAddressListsRequest.Builder, ListAddressListsRequest, ListAddressListsResponse>(
                new com.google.common.base.Supplier<ListAddressListsRequest.Builder>() {
                    @Override
                    public ListAddressListsRequest.Builder get() {
                        return ListAddressListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAddressListsResponse, String>() {
                    @Override
                    public String apply(ListAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddressListsRequest.Builder>,
                        ListAddressListsRequest>() {
                    @Override
                    public ListAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddressListsRequest.Builder>
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
                        ListAddressListsRequest, ListAddressListsResponse>() {
                    @Override
                    public ListAddressListsResponse apply(ListAddressListsRequest request) {
                        return client.listAddressLists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.AddressListSummary} objects
     * contained in responses from the listAddressLists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.AddressListSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.AddressListSummary> listAddressListsRecordIterator(
            final ListAddressListsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAddressListsRequest.Builder, ListAddressListsRequest, ListAddressListsResponse,
                com.oracle.bmc.waas.model.AddressListSummary>(
                new com.google.common.base.Supplier<ListAddressListsRequest.Builder>() {
                    @Override
                    public ListAddressListsRequest.Builder get() {
                        return ListAddressListsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAddressListsResponse, String>() {
                    @Override
                    public String apply(ListAddressListsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAddressListsRequest.Builder>,
                        ListAddressListsRequest>() {
                    @Override
                    public ListAddressListsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAddressListsRequest.Builder>
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
                        ListAddressListsRequest, ListAddressListsResponse>() {
                    @Override
                    public ListAddressListsResponse apply(ListAddressListsRequest request) {
                        return client.listAddressLists(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAddressListsResponse,
                        java.util.List<com.oracle.bmc.waas.model.AddressListSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.AddressListSummary> apply(
                            ListAddressListsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCachingRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCachingRulesResponse> listCachingRulesResponseIterator(
            final ListCachingRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCachingRulesRequest.Builder, ListCachingRulesRequest, ListCachingRulesResponse>(
                new com.google.common.base.Supplier<ListCachingRulesRequest.Builder>() {
                    @Override
                    public ListCachingRulesRequest.Builder get() {
                        return ListCachingRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCachingRulesResponse, String>() {
                    @Override
                    public String apply(ListCachingRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCachingRulesRequest.Builder>,
                        ListCachingRulesRequest>() {
                    @Override
                    public ListCachingRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCachingRulesRequest.Builder>
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
                        ListCachingRulesRequest, ListCachingRulesResponse>() {
                    @Override
                    public ListCachingRulesResponse apply(ListCachingRulesRequest request) {
                        return client.listCachingRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.CachingRuleSummary} objects
     * contained in responses from the listCachingRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.CachingRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.CachingRuleSummary> listCachingRulesRecordIterator(
            final ListCachingRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCachingRulesRequest.Builder, ListCachingRulesRequest, ListCachingRulesResponse,
                com.oracle.bmc.waas.model.CachingRuleSummary>(
                new com.google.common.base.Supplier<ListCachingRulesRequest.Builder>() {
                    @Override
                    public ListCachingRulesRequest.Builder get() {
                        return ListCachingRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCachingRulesResponse, String>() {
                    @Override
                    public String apply(ListCachingRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCachingRulesRequest.Builder>,
                        ListCachingRulesRequest>() {
                    @Override
                    public ListCachingRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCachingRulesRequest.Builder>
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
                        ListCachingRulesRequest, ListCachingRulesResponse>() {
                    @Override
                    public ListCachingRulesResponse apply(ListCachingRulesRequest request) {
                        return client.listCachingRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCachingRulesResponse,
                        java.util.List<com.oracle.bmc.waas.model.CachingRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.CachingRuleSummary> apply(
                            ListCachingRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCaptchas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCaptchasResponse> listCaptchasResponseIterator(
            final ListCaptchasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCaptchasRequest.Builder, ListCaptchasRequest, ListCaptchasResponse>(
                new com.google.common.base.Supplier<ListCaptchasRequest.Builder>() {
                    @Override
                    public ListCaptchasRequest.Builder get() {
                        return ListCaptchasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCaptchasResponse, String>() {
                    @Override
                    public String apply(ListCaptchasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaptchasRequest.Builder>,
                        ListCaptchasRequest>() {
                    @Override
                    public ListCaptchasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaptchasRequest.Builder>
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
                new com.google.common.base.Function<ListCaptchasRequest, ListCaptchasResponse>() {
                    @Override
                    public ListCaptchasResponse apply(ListCaptchasRequest request) {
                        return client.listCaptchas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.Captcha} objects
     * contained in responses from the listCaptchas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.Captcha} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.Captcha> listCaptchasRecordIterator(
            final ListCaptchasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCaptchasRequest.Builder, ListCaptchasRequest, ListCaptchasResponse,
                com.oracle.bmc.waas.model.Captcha>(
                new com.google.common.base.Supplier<ListCaptchasRequest.Builder>() {
                    @Override
                    public ListCaptchasRequest.Builder get() {
                        return ListCaptchasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCaptchasResponse, String>() {
                    @Override
                    public String apply(ListCaptchasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCaptchasRequest.Builder>,
                        ListCaptchasRequest>() {
                    @Override
                    public ListCaptchasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCaptchasRequest.Builder>
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
                new com.google.common.base.Function<ListCaptchasRequest, ListCaptchasResponse>() {
                    @Override
                    public ListCaptchasResponse apply(ListCaptchasRequest request) {
                        return client.listCaptchas(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCaptchasResponse, java.util.List<com.oracle.bmc.waas.model.Captcha>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.Captcha> apply(
                            ListCaptchasResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCertificates operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCertificatesResponse> listCertificatesResponseIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse>(
                new com.google.common.base.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.CertificateSummary} objects
     * contained in responses from the listCertificates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.CertificateSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.CertificateSummary> listCertificatesRecordIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse,
                com.oracle.bmc.waas.model.CertificateSummary>(
                new com.google.common.base.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCertificatesResponse,
                        java.util.List<com.oracle.bmc.waas.model.CertificateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.CertificateSummary> apply(
                            ListCertificatesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCustomProtectionRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCustomProtectionRulesResponse> listCustomProtectionRulesResponseIterator(
            final ListCustomProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCustomProtectionRulesRequest.Builder, ListCustomProtectionRulesRequest,
                ListCustomProtectionRulesResponse>(
                new com.google.common.base.Supplier<ListCustomProtectionRulesRequest.Builder>() {
                    @Override
                    public ListCustomProtectionRulesRequest.Builder get() {
                        return ListCustomProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCustomProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListCustomProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomProtectionRulesRequest.Builder>,
                        ListCustomProtectionRulesRequest>() {
                    @Override
                    public ListCustomProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomProtectionRulesRequest.Builder>
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
                        ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>() {
                    @Override
                    public ListCustomProtectionRulesResponse apply(
                            ListCustomProtectionRulesRequest request) {
                        return client.listCustomProtectionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.CustomProtectionRuleSummary} objects
     * contained in responses from the listCustomProtectionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.CustomProtectionRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.CustomProtectionRuleSummary>
            listCustomProtectionRulesRecordIterator(
                    final ListCustomProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCustomProtectionRulesRequest.Builder, ListCustomProtectionRulesRequest,
                ListCustomProtectionRulesResponse,
                com.oracle.bmc.waas.model.CustomProtectionRuleSummary>(
                new com.google.common.base.Supplier<ListCustomProtectionRulesRequest.Builder>() {
                    @Override
                    public ListCustomProtectionRulesRequest.Builder get() {
                        return ListCustomProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListCustomProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListCustomProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomProtectionRulesRequest.Builder>,
                        ListCustomProtectionRulesRequest>() {
                    @Override
                    public ListCustomProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomProtectionRulesRequest.Builder>
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
                        ListCustomProtectionRulesRequest, ListCustomProtectionRulesResponse>() {
                    @Override
                    public ListCustomProtectionRulesResponse apply(
                            ListCustomProtectionRulesRequest request) {
                        return client.listCustomProtectionRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListCustomProtectionRulesResponse,
                        java.util.List<com.oracle.bmc.waas.model.CustomProtectionRuleSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.CustomProtectionRuleSummary>
                            apply(ListCustomProtectionRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listEdgeSubnets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListEdgeSubnetsResponse> listEdgeSubnetsResponseIterator(
            final ListEdgeSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEdgeSubnetsRequest.Builder, ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>(
                new com.google.common.base.Supplier<ListEdgeSubnetsRequest.Builder>() {
                    @Override
                    public ListEdgeSubnetsRequest.Builder get() {
                        return ListEdgeSubnetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEdgeSubnetsResponse, String>() {
                    @Override
                    public String apply(ListEdgeSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEdgeSubnetsRequest.Builder>,
                        ListEdgeSubnetsRequest>() {
                    @Override
                    public ListEdgeSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEdgeSubnetsRequest.Builder>
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
                        ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>() {
                    @Override
                    public ListEdgeSubnetsResponse apply(ListEdgeSubnetsRequest request) {
                        return client.listEdgeSubnets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.EdgeSubnet} objects
     * contained in responses from the listEdgeSubnets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.EdgeSubnet} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.EdgeSubnet> listEdgeSubnetsRecordIterator(
            final ListEdgeSubnetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEdgeSubnetsRequest.Builder, ListEdgeSubnetsRequest, ListEdgeSubnetsResponse,
                com.oracle.bmc.waas.model.EdgeSubnet>(
                new com.google.common.base.Supplier<ListEdgeSubnetsRequest.Builder>() {
                    @Override
                    public ListEdgeSubnetsRequest.Builder get() {
                        return ListEdgeSubnetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListEdgeSubnetsResponse, String>() {
                    @Override
                    public String apply(ListEdgeSubnetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEdgeSubnetsRequest.Builder>,
                        ListEdgeSubnetsRequest>() {
                    @Override
                    public ListEdgeSubnetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEdgeSubnetsRequest.Builder>
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
                        ListEdgeSubnetsRequest, ListEdgeSubnetsResponse>() {
                    @Override
                    public ListEdgeSubnetsResponse apply(ListEdgeSubnetsRequest request) {
                        return client.listEdgeSubnets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListEdgeSubnetsResponse,
                        java.util.List<com.oracle.bmc.waas.model.EdgeSubnet>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.EdgeSubnet> apply(
                            ListEdgeSubnetsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGoodBots operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGoodBotsResponse> listGoodBotsResponseIterator(
            final ListGoodBotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGoodBotsRequest.Builder, ListGoodBotsRequest, ListGoodBotsResponse>(
                new com.google.common.base.Supplier<ListGoodBotsRequest.Builder>() {
                    @Override
                    public ListGoodBotsRequest.Builder get() {
                        return ListGoodBotsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGoodBotsResponse, String>() {
                    @Override
                    public String apply(ListGoodBotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGoodBotsRequest.Builder>,
                        ListGoodBotsRequest>() {
                    @Override
                    public ListGoodBotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGoodBotsRequest.Builder>
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
                new com.google.common.base.Function<ListGoodBotsRequest, ListGoodBotsResponse>() {
                    @Override
                    public ListGoodBotsResponse apply(ListGoodBotsRequest request) {
                        return client.listGoodBots(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.GoodBot} objects
     * contained in responses from the listGoodBots operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.GoodBot} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.GoodBot> listGoodBotsRecordIterator(
            final ListGoodBotsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGoodBotsRequest.Builder, ListGoodBotsRequest, ListGoodBotsResponse,
                com.oracle.bmc.waas.model.GoodBot>(
                new com.google.common.base.Supplier<ListGoodBotsRequest.Builder>() {
                    @Override
                    public ListGoodBotsRequest.Builder get() {
                        return ListGoodBotsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListGoodBotsResponse, String>() {
                    @Override
                    public String apply(ListGoodBotsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGoodBotsRequest.Builder>,
                        ListGoodBotsRequest>() {
                    @Override
                    public ListGoodBotsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGoodBotsRequest.Builder>
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
                new com.google.common.base.Function<ListGoodBotsRequest, ListGoodBotsResponse>() {
                    @Override
                    public ListGoodBotsResponse apply(ListGoodBotsRequest request) {
                        return client.listGoodBots(request);
                    }
                },
                new com.google.common.base.Function<
                        ListGoodBotsResponse, java.util.List<com.oracle.bmc.waas.model.GoodBot>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.GoodBot> apply(
                            ListGoodBotsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProtectionRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProtectionRulesResponse> listProtectionRulesResponseIterator(
            final ListProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProtectionRulesRequest.Builder, ListProtectionRulesRequest,
                ListProtectionRulesResponse>(
                new com.google.common.base.Supplier<ListProtectionRulesRequest.Builder>() {
                    @Override
                    public ListProtectionRulesRequest.Builder get() {
                        return ListProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionRulesRequest.Builder>,
                        ListProtectionRulesRequest>() {
                    @Override
                    public ListProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionRulesRequest.Builder>
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
                        ListProtectionRulesRequest, ListProtectionRulesResponse>() {
                    @Override
                    public ListProtectionRulesResponse apply(ListProtectionRulesRequest request) {
                        return client.listProtectionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.ProtectionRule} objects
     * contained in responses from the listProtectionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.ProtectionRule} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.ProtectionRule> listProtectionRulesRecordIterator(
            final ListProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProtectionRulesRequest.Builder, ListProtectionRulesRequest,
                ListProtectionRulesResponse, com.oracle.bmc.waas.model.ProtectionRule>(
                new com.google.common.base.Supplier<ListProtectionRulesRequest.Builder>() {
                    @Override
                    public ListProtectionRulesRequest.Builder get() {
                        return ListProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProtectionRulesRequest.Builder>,
                        ListProtectionRulesRequest>() {
                    @Override
                    public ListProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProtectionRulesRequest.Builder>
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
                        ListProtectionRulesRequest, ListProtectionRulesResponse>() {
                    @Override
                    public ListProtectionRulesResponse apply(ListProtectionRulesRequest request) {
                        return client.listProtectionRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProtectionRulesResponse,
                        java.util.List<com.oracle.bmc.waas.model.ProtectionRule>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.ProtectionRule> apply(
                            ListProtectionRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecommendations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecommendationsResponse> listRecommendationsResponseIterator(
            final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse>(
                new com.google.common.base.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.Recommendation} objects
     * contained in responses from the listRecommendations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.Recommendation} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.Recommendation> listRecommendationsRecordIterator(
            final ListRecommendationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecommendationsRequest.Builder, ListRecommendationsRequest,
                ListRecommendationsResponse, com.oracle.bmc.waas.model.Recommendation>(
                new com.google.common.base.Supplier<ListRecommendationsRequest.Builder>() {
                    @Override
                    public ListRecommendationsRequest.Builder get() {
                        return ListRecommendationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListRecommendationsResponse, String>() {
                    @Override
                    public String apply(ListRecommendationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecommendationsRequest.Builder>,
                        ListRecommendationsRequest>() {
                    @Override
                    public ListRecommendationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecommendationsRequest.Builder>
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
                        ListRecommendationsRequest, ListRecommendationsResponse>() {
                    @Override
                    public ListRecommendationsResponse apply(ListRecommendationsRequest request) {
                        return client.listRecommendations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListRecommendationsResponse,
                        java.util.List<com.oracle.bmc.waas.model.Recommendation>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.Recommendation> apply(
                            ListRecommendationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listThreatFeeds operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListThreatFeedsResponse> listThreatFeedsResponseIterator(
            final ListThreatFeedsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListThreatFeedsRequest.Builder, ListThreatFeedsRequest, ListThreatFeedsResponse>(
                new com.google.common.base.Supplier<ListThreatFeedsRequest.Builder>() {
                    @Override
                    public ListThreatFeedsRequest.Builder get() {
                        return ListThreatFeedsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListThreatFeedsResponse, String>() {
                    @Override
                    public String apply(ListThreatFeedsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListThreatFeedsRequest.Builder>,
                        ListThreatFeedsRequest>() {
                    @Override
                    public ListThreatFeedsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListThreatFeedsRequest.Builder>
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
                        ListThreatFeedsRequest, ListThreatFeedsResponse>() {
                    @Override
                    public ListThreatFeedsResponse apply(ListThreatFeedsRequest request) {
                        return client.listThreatFeeds(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.ThreatFeed} objects
     * contained in responses from the listThreatFeeds operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.ThreatFeed} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.ThreatFeed> listThreatFeedsRecordIterator(
            final ListThreatFeedsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListThreatFeedsRequest.Builder, ListThreatFeedsRequest, ListThreatFeedsResponse,
                com.oracle.bmc.waas.model.ThreatFeed>(
                new com.google.common.base.Supplier<ListThreatFeedsRequest.Builder>() {
                    @Override
                    public ListThreatFeedsRequest.Builder get() {
                        return ListThreatFeedsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListThreatFeedsResponse, String>() {
                    @Override
                    public String apply(ListThreatFeedsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListThreatFeedsRequest.Builder>,
                        ListThreatFeedsRequest>() {
                    @Override
                    public ListThreatFeedsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListThreatFeedsRequest.Builder>
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
                        ListThreatFeedsRequest, ListThreatFeedsResponse>() {
                    @Override
                    public ListThreatFeedsResponse apply(ListThreatFeedsRequest request) {
                        return client.listThreatFeeds(request);
                    }
                },
                new com.google.common.base.Function<
                        ListThreatFeedsResponse,
                        java.util.List<com.oracle.bmc.waas.model.ThreatFeed>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.ThreatFeed> apply(
                            ListThreatFeedsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWaasPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWaasPoliciesResponse> listWaasPoliciesResponseIterator(
            final ListWaasPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWaasPoliciesRequest.Builder, ListWaasPoliciesRequest, ListWaasPoliciesResponse>(
                new com.google.common.base.Supplier<ListWaasPoliciesRequest.Builder>() {
                    @Override
                    public ListWaasPoliciesRequest.Builder get() {
                        return ListWaasPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWaasPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWaasPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWaasPoliciesRequest.Builder>,
                        ListWaasPoliciesRequest>() {
                    @Override
                    public ListWaasPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWaasPoliciesRequest.Builder>
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
                        ListWaasPoliciesRequest, ListWaasPoliciesResponse>() {
                    @Override
                    public ListWaasPoliciesResponse apply(ListWaasPoliciesRequest request) {
                        return client.listWaasPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WaasPolicySummary} objects
     * contained in responses from the listWaasPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WaasPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WaasPolicySummary> listWaasPoliciesRecordIterator(
            final ListWaasPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWaasPoliciesRequest.Builder, ListWaasPoliciesRequest, ListWaasPoliciesResponse,
                com.oracle.bmc.waas.model.WaasPolicySummary>(
                new com.google.common.base.Supplier<ListWaasPoliciesRequest.Builder>() {
                    @Override
                    public ListWaasPoliciesRequest.Builder get() {
                        return ListWaasPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWaasPoliciesResponse, String>() {
                    @Override
                    public String apply(ListWaasPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWaasPoliciesRequest.Builder>,
                        ListWaasPoliciesRequest>() {
                    @Override
                    public ListWaasPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWaasPoliciesRequest.Builder>
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
                        ListWaasPoliciesRequest, ListWaasPoliciesResponse>() {
                    @Override
                    public ListWaasPoliciesResponse apply(ListWaasPoliciesRequest request) {
                        return client.listWaasPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWaasPoliciesResponse,
                        java.util.List<com.oracle.bmc.waas.model.WaasPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WaasPolicySummary> apply(
                            ListWaasPoliciesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWaasPolicyCustomProtectionRules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWaasPolicyCustomProtectionRulesResponse>
            listWaasPolicyCustomProtectionRulesResponseIterator(
                    final ListWaasPolicyCustomProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWaasPolicyCustomProtectionRulesRequest.Builder,
                ListWaasPolicyCustomProtectionRulesRequest,
                ListWaasPolicyCustomProtectionRulesResponse>(
                new com.google.common.base.Supplier<
                        ListWaasPolicyCustomProtectionRulesRequest.Builder>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesRequest.Builder get() {
                        return ListWaasPolicyCustomProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWaasPolicyCustomProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListWaasPolicyCustomProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWaasPolicyCustomProtectionRulesRequest.Builder>,
                        ListWaasPolicyCustomProtectionRulesRequest>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWaasPolicyCustomProtectionRulesRequest.Builder>
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
                        ListWaasPolicyCustomProtectionRulesRequest,
                        ListWaasPolicyCustomProtectionRulesResponse>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesResponse apply(
                            ListWaasPolicyCustomProtectionRulesRequest request) {
                        return client.listWaasPolicyCustomProtectionRules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary} objects
     * contained in responses from the listWaasPolicyCustomProtectionRules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary>
            listWaasPolicyCustomProtectionRulesRecordIterator(
                    final ListWaasPolicyCustomProtectionRulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWaasPolicyCustomProtectionRulesRequest.Builder,
                ListWaasPolicyCustomProtectionRulesRequest,
                ListWaasPolicyCustomProtectionRulesResponse,
                com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary>(
                new com.google.common.base.Supplier<
                        ListWaasPolicyCustomProtectionRulesRequest.Builder>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesRequest.Builder get() {
                        return ListWaasPolicyCustomProtectionRulesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWaasPolicyCustomProtectionRulesResponse, String>() {
                    @Override
                    public String apply(ListWaasPolicyCustomProtectionRulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWaasPolicyCustomProtectionRulesRequest.Builder>,
                        ListWaasPolicyCustomProtectionRulesRequest>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWaasPolicyCustomProtectionRulesRequest.Builder>
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
                        ListWaasPolicyCustomProtectionRulesRequest,
                        ListWaasPolicyCustomProtectionRulesResponse>() {
                    @Override
                    public ListWaasPolicyCustomProtectionRulesResponse apply(
                            ListWaasPolicyCustomProtectionRulesRequest request) {
                        return client.listWaasPolicyCustomProtectionRules(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWaasPolicyCustomProtectionRulesResponse,
                        java.util.List<
                                com.oracle.bmc.waas.model
                                        .WaasPolicyCustomProtectionRuleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.waas.model.WaasPolicyCustomProtectionRuleSummary>
                            apply(ListWaasPolicyCustomProtectionRulesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWafBlockedRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWafBlockedRequestsResponse> listWafBlockedRequestsResponseIterator(
            final ListWafBlockedRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWafBlockedRequestsRequest.Builder, ListWafBlockedRequestsRequest,
                ListWafBlockedRequestsResponse>(
                new com.google.common.base.Supplier<ListWafBlockedRequestsRequest.Builder>() {
                    @Override
                    public ListWafBlockedRequestsRequest.Builder get() {
                        return ListWafBlockedRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafBlockedRequestsResponse, String>() {
                    @Override
                    public String apply(ListWafBlockedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafBlockedRequestsRequest.Builder>,
                        ListWafBlockedRequestsRequest>() {
                    @Override
                    public ListWafBlockedRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafBlockedRequestsRequest.Builder>
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
                        ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>() {
                    @Override
                    public ListWafBlockedRequestsResponse apply(
                            ListWafBlockedRequestsRequest request) {
                        return client.listWafBlockedRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WafBlockedRequest} objects
     * contained in responses from the listWafBlockedRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WafBlockedRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WafBlockedRequest>
            listWafBlockedRequestsRecordIterator(final ListWafBlockedRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWafBlockedRequestsRequest.Builder, ListWafBlockedRequestsRequest,
                ListWafBlockedRequestsResponse, com.oracle.bmc.waas.model.WafBlockedRequest>(
                new com.google.common.base.Supplier<ListWafBlockedRequestsRequest.Builder>() {
                    @Override
                    public ListWafBlockedRequestsRequest.Builder get() {
                        return ListWafBlockedRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafBlockedRequestsResponse, String>() {
                    @Override
                    public String apply(ListWafBlockedRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafBlockedRequestsRequest.Builder>,
                        ListWafBlockedRequestsRequest>() {
                    @Override
                    public ListWafBlockedRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafBlockedRequestsRequest.Builder>
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
                        ListWafBlockedRequestsRequest, ListWafBlockedRequestsResponse>() {
                    @Override
                    public ListWafBlockedRequestsResponse apply(
                            ListWafBlockedRequestsRequest request) {
                        return client.listWafBlockedRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWafBlockedRequestsResponse,
                        java.util.List<com.oracle.bmc.waas.model.WafBlockedRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WafBlockedRequest> apply(
                            ListWafBlockedRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWafLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWafLogsResponse> listWafLogsResponseIterator(
            final ListWafLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWafLogsRequest.Builder, ListWafLogsRequest, ListWafLogsResponse>(
                new com.google.common.base.Supplier<ListWafLogsRequest.Builder>() {
                    @Override
                    public ListWafLogsRequest.Builder get() {
                        return ListWafLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafLogsResponse, String>() {
                    @Override
                    public String apply(ListWafLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafLogsRequest.Builder>,
                        ListWafLogsRequest>() {
                    @Override
                    public ListWafLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafLogsRequest.Builder>
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
                new com.google.common.base.Function<ListWafLogsRequest, ListWafLogsResponse>() {
                    @Override
                    public ListWafLogsResponse apply(ListWafLogsRequest request) {
                        return client.listWafLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WafLog} objects
     * contained in responses from the listWafLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WafLog} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WafLog> listWafLogsRecordIterator(
            final ListWafLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWafLogsRequest.Builder, ListWafLogsRequest, ListWafLogsResponse,
                com.oracle.bmc.waas.model.WafLog>(
                new com.google.common.base.Supplier<ListWafLogsRequest.Builder>() {
                    @Override
                    public ListWafLogsRequest.Builder get() {
                        return ListWafLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafLogsResponse, String>() {
                    @Override
                    public String apply(ListWafLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafLogsRequest.Builder>,
                        ListWafLogsRequest>() {
                    @Override
                    public ListWafLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafLogsRequest.Builder>
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
                new com.google.common.base.Function<ListWafLogsRequest, ListWafLogsResponse>() {
                    @Override
                    public ListWafLogsResponse apply(ListWafLogsRequest request) {
                        return client.listWafLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWafLogsResponse, java.util.List<com.oracle.bmc.waas.model.WafLog>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WafLog> apply(
                            ListWafLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWafRequests operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWafRequestsResponse> listWafRequestsResponseIterator(
            final ListWafRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWafRequestsRequest.Builder, ListWafRequestsRequest, ListWafRequestsResponse>(
                new com.google.common.base.Supplier<ListWafRequestsRequest.Builder>() {
                    @Override
                    public ListWafRequestsRequest.Builder get() {
                        return ListWafRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafRequestsResponse, String>() {
                    @Override
                    public String apply(ListWafRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafRequestsRequest.Builder>,
                        ListWafRequestsRequest>() {
                    @Override
                    public ListWafRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafRequestsRequest.Builder>
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
                        ListWafRequestsRequest, ListWafRequestsResponse>() {
                    @Override
                    public ListWafRequestsResponse apply(ListWafRequestsRequest request) {
                        return client.listWafRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WafRequest} objects
     * contained in responses from the listWafRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WafRequest} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WafRequest> listWafRequestsRecordIterator(
            final ListWafRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWafRequestsRequest.Builder, ListWafRequestsRequest, ListWafRequestsResponse,
                com.oracle.bmc.waas.model.WafRequest>(
                new com.google.common.base.Supplier<ListWafRequestsRequest.Builder>() {
                    @Override
                    public ListWafRequestsRequest.Builder get() {
                        return ListWafRequestsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafRequestsResponse, String>() {
                    @Override
                    public String apply(ListWafRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafRequestsRequest.Builder>,
                        ListWafRequestsRequest>() {
                    @Override
                    public ListWafRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafRequestsRequest.Builder>
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
                        ListWafRequestsRequest, ListWafRequestsResponse>() {
                    @Override
                    public ListWafRequestsResponse apply(ListWafRequestsRequest request) {
                        return client.listWafRequests(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWafRequestsResponse,
                        java.util.List<com.oracle.bmc.waas.model.WafRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WafRequest> apply(
                            ListWafRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWafTraffic operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWafTrafficResponse> listWafTrafficResponseIterator(
            final ListWafTrafficRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWafTrafficRequest.Builder, ListWafTrafficRequest, ListWafTrafficResponse>(
                new com.google.common.base.Supplier<ListWafTrafficRequest.Builder>() {
                    @Override
                    public ListWafTrafficRequest.Builder get() {
                        return ListWafTrafficRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafTrafficResponse, String>() {
                    @Override
                    public String apply(ListWafTrafficResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafTrafficRequest.Builder>,
                        ListWafTrafficRequest>() {
                    @Override
                    public ListWafTrafficRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafTrafficRequest.Builder>
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
                        ListWafTrafficRequest, ListWafTrafficResponse>() {
                    @Override
                    public ListWafTrafficResponse apply(ListWafTrafficRequest request) {
                        return client.listWafTraffic(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WafTrafficDatum} objects
     * contained in responses from the listWafTraffic operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WafTrafficDatum} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WafTrafficDatum> listWafTrafficRecordIterator(
            final ListWafTrafficRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWafTrafficRequest.Builder, ListWafTrafficRequest, ListWafTrafficResponse,
                com.oracle.bmc.waas.model.WafTrafficDatum>(
                new com.google.common.base.Supplier<ListWafTrafficRequest.Builder>() {
                    @Override
                    public ListWafTrafficRequest.Builder get() {
                        return ListWafTrafficRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWafTrafficResponse, String>() {
                    @Override
                    public String apply(ListWafTrafficResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWafTrafficRequest.Builder>,
                        ListWafTrafficRequest>() {
                    @Override
                    public ListWafTrafficRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWafTrafficRequest.Builder>
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
                        ListWafTrafficRequest, ListWafTrafficResponse>() {
                    @Override
                    public ListWafTrafficResponse apply(ListWafTrafficRequest request) {
                        return client.listWafTraffic(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWafTrafficResponse,
                        java.util.List<com.oracle.bmc.waas.model.WafTrafficDatum>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WafTrafficDatum> apply(
                            ListWafTrafficResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWhitelists operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWhitelistsResponse> listWhitelistsResponseIterator(
            final ListWhitelistsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWhitelistsRequest.Builder, ListWhitelistsRequest, ListWhitelistsResponse>(
                new com.google.common.base.Supplier<ListWhitelistsRequest.Builder>() {
                    @Override
                    public ListWhitelistsRequest.Builder get() {
                        return ListWhitelistsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWhitelistsResponse, String>() {
                    @Override
                    public String apply(ListWhitelistsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWhitelistsRequest.Builder>,
                        ListWhitelistsRequest>() {
                    @Override
                    public ListWhitelistsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWhitelistsRequest.Builder>
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
                        ListWhitelistsRequest, ListWhitelistsResponse>() {
                    @Override
                    public ListWhitelistsResponse apply(ListWhitelistsRequest request) {
                        return client.listWhitelists(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.Whitelist} objects
     * contained in responses from the listWhitelists operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.Whitelist} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.Whitelist> listWhitelistsRecordIterator(
            final ListWhitelistsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWhitelistsRequest.Builder, ListWhitelistsRequest, ListWhitelistsResponse,
                com.oracle.bmc.waas.model.Whitelist>(
                new com.google.common.base.Supplier<ListWhitelistsRequest.Builder>() {
                    @Override
                    public ListWhitelistsRequest.Builder get() {
                        return ListWhitelistsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWhitelistsResponse, String>() {
                    @Override
                    public String apply(ListWhitelistsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWhitelistsRequest.Builder>,
                        ListWhitelistsRequest>() {
                    @Override
                    public ListWhitelistsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWhitelistsRequest.Builder>
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
                        ListWhitelistsRequest, ListWhitelistsResponse>() {
                    @Override
                    public ListWhitelistsResponse apply(ListWhitelistsRequest request) {
                        return client.listWhitelists(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWhitelistsResponse,
                        java.util.List<com.oracle.bmc.waas.model.Whitelist>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.Whitelist> apply(
                            ListWhitelistsResponse response) {
                        return response.getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.waas.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.waas.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.waas.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.waas.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.waas.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.waas.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

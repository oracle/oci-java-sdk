/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApiGateway where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ApiGatewayPaginators {
    private final ApiGateway client;

    public ApiGatewayPaginators(ApiGateway client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApis operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApisResponse> listApisResponseIterator(final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApisRequest.Builder, ListApisRequest, ListApisResponse>(
                new java.util.function.Supplier<ListApisRequest.Builder>() {
                    @Override
                    public ListApisRequest.Builder get() {
                        return ListApisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApisResponse, String>() {
                    @Override
                    public String apply(ListApisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApisRequest.Builder>,
                        ListApisRequest>() {
                    @Override
                    public ListApisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApisRequest.Builder>
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
                new java.util.function.Function<ListApisRequest, ListApisResponse>() {
                    @Override
                    public ListApisResponse apply(ListApisRequest request) {
                        return client.listApis(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.ApiSummary} objects
     * contained in responses from the listApis operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.ApiSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.ApiSummary> listApisRecordIterator(
            final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApisRequest.Builder, ListApisRequest, ListApisResponse,
                com.oracle.bmc.apigateway.model.ApiSummary>(
                new java.util.function.Supplier<ListApisRequest.Builder>() {
                    @Override
                    public ListApisRequest.Builder get() {
                        return ListApisRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApisResponse, String>() {
                    @Override
                    public String apply(ListApisResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApisRequest.Builder>,
                        ListApisRequest>() {
                    @Override
                    public ListApisRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApisRequest.Builder>
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
                new java.util.function.Function<ListApisRequest, ListApisResponse>() {
                    @Override
                    public ListApisResponse apply(ListApisRequest request) {
                        return client.listApis(request);
                    }
                },
                new java.util.function.Function<
                        ListApisResponse,
                        java.util.List<com.oracle.bmc.apigateway.model.ApiSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.ApiSummary> apply(
                            ListApisResponse response) {
                        return response.getApiCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.CertificateSummary} objects
     * contained in responses from the listCertificates operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.CertificateSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.CertificateSummary>
            listCertificatesRecordIterator(final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse,
                com.oracle.bmc.apigateway.model.CertificateSummary>(
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
                        java.util.List<com.oracle.bmc.apigateway.model.CertificateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.CertificateSummary> apply(
                            ListCertificatesResponse response) {
                        return response.getCertificateCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSdkLanguageTypes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSdkLanguageTypesResponse> listSdkLanguageTypesResponseIterator(
            final ListSdkLanguageTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSdkLanguageTypesRequest.Builder, ListSdkLanguageTypesRequest,
                ListSdkLanguageTypesResponse>(
                new java.util.function.Supplier<ListSdkLanguageTypesRequest.Builder>() {
                    @Override
                    public ListSdkLanguageTypesRequest.Builder get() {
                        return ListSdkLanguageTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdkLanguageTypesResponse, String>() {
                    @Override
                    public String apply(ListSdkLanguageTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdkLanguageTypesRequest.Builder>,
                        ListSdkLanguageTypesRequest>() {
                    @Override
                    public ListSdkLanguageTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdkLanguageTypesRequest.Builder>
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
                        ListSdkLanguageTypesRequest, ListSdkLanguageTypesResponse>() {
                    @Override
                    public ListSdkLanguageTypesResponse apply(ListSdkLanguageTypesRequest request) {
                        return client.listSdkLanguageTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary} objects
     * contained in responses from the listSdkLanguageTypes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary>
            listSdkLanguageTypesRecordIterator(final ListSdkLanguageTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSdkLanguageTypesRequest.Builder, ListSdkLanguageTypesRequest,
                ListSdkLanguageTypesResponse,
                com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary>(
                new java.util.function.Supplier<ListSdkLanguageTypesRequest.Builder>() {
                    @Override
                    public ListSdkLanguageTypesRequest.Builder get() {
                        return ListSdkLanguageTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdkLanguageTypesResponse, String>() {
                    @Override
                    public String apply(ListSdkLanguageTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdkLanguageTypesRequest.Builder>,
                        ListSdkLanguageTypesRequest>() {
                    @Override
                    public ListSdkLanguageTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdkLanguageTypesRequest.Builder>
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
                        ListSdkLanguageTypesRequest, ListSdkLanguageTypesResponse>() {
                    @Override
                    public ListSdkLanguageTypesResponse apply(ListSdkLanguageTypesRequest request) {
                        return client.listSdkLanguageTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListSdkLanguageTypesResponse,
                        java.util.List<com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary>
                            apply(ListSdkLanguageTypesResponse response) {
                        return response.getSdkLanguageTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSdks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSdksResponse> listSdksResponseIterator(final ListSdksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSdksRequest.Builder, ListSdksRequest, ListSdksResponse>(
                new java.util.function.Supplier<ListSdksRequest.Builder>() {
                    @Override
                    public ListSdksRequest.Builder get() {
                        return ListSdksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdksResponse, String>() {
                    @Override
                    public String apply(ListSdksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdksRequest.Builder>,
                        ListSdksRequest>() {
                    @Override
                    public ListSdksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdksRequest.Builder>
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
                new java.util.function.Function<ListSdksRequest, ListSdksResponse>() {
                    @Override
                    public ListSdksResponse apply(ListSdksRequest request) {
                        return client.listSdks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.apigateway.model.SdkSummary} objects
     * contained in responses from the listSdks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.apigateway.model.SdkSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.SdkSummary> listSdksRecordIterator(
            final ListSdksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSdksRequest.Builder, ListSdksRequest, ListSdksResponse,
                com.oracle.bmc.apigateway.model.SdkSummary>(
                new java.util.function.Supplier<ListSdksRequest.Builder>() {
                    @Override
                    public ListSdksRequest.Builder get() {
                        return ListSdksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSdksResponse, String>() {
                    @Override
                    public String apply(ListSdksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSdksRequest.Builder>,
                        ListSdksRequest>() {
                    @Override
                    public ListSdksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSdksRequest.Builder>
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
                new java.util.function.Function<ListSdksRequest, ListSdksResponse>() {
                    @Override
                    public ListSdksResponse apply(ListSdksRequest request) {
                        return client.listSdks(request);
                    }
                },
                new java.util.function.Function<
                        ListSdksResponse,
                        java.util.List<com.oracle.bmc.apigateway.model.SdkSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.apigateway.model.SdkSummary> apply(
                            ListSdksResponse response) {
                        return response.getSdkCollection().getItems();
                    }
                });
    }
}

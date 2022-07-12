/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Odapackage where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class OdapackagePaginators {
    private final Odapackage client;

    public OdapackagePaginators(Odapackage client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listImportedPackages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListImportedPackagesResponse> listImportedPackagesResponseIterator(
            final ListImportedPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListImportedPackagesRequest.Builder, ListImportedPackagesRequest,
                ListImportedPackagesResponse>(
                new java.util.function.Supplier<ListImportedPackagesRequest.Builder>() {
                    @Override
                    public ListImportedPackagesRequest.Builder get() {
                        return ListImportedPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportedPackagesResponse, String>() {
                    @Override
                    public String apply(ListImportedPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportedPackagesRequest.Builder>,
                        ListImportedPackagesRequest>() {
                    @Override
                    public ListImportedPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportedPackagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListImportedPackagesRequest, ListImportedPackagesResponse>() {
                    @Override
                    public ListImportedPackagesResponse apply(ListImportedPackagesRequest request) {
                        return client.listImportedPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.ImportedPackageSummary} objects
     * contained in responses from the listImportedPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.ImportedPackageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.ImportedPackageSummary>
            listImportedPackagesRecordIterator(final ListImportedPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListImportedPackagesRequest.Builder, ListImportedPackagesRequest,
                ListImportedPackagesResponse, com.oracle.bmc.oda.model.ImportedPackageSummary>(
                new java.util.function.Supplier<ListImportedPackagesRequest.Builder>() {
                    @Override
                    public ListImportedPackagesRequest.Builder get() {
                        return ListImportedPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListImportedPackagesResponse, String>() {
                    @Override
                    public String apply(ListImportedPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListImportedPackagesRequest.Builder>,
                        ListImportedPackagesRequest>() {
                    @Override
                    public ListImportedPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListImportedPackagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListImportedPackagesRequest, ListImportedPackagesResponse>() {
                    @Override
                    public ListImportedPackagesResponse apply(ListImportedPackagesRequest request) {
                        return client.listImportedPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListImportedPackagesResponse,
                        java.util.List<com.oracle.bmc.oda.model.ImportedPackageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.ImportedPackageSummary> apply(
                            ListImportedPackagesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPackages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.oda.model.PackageSummary} objects
     * contained in responses from the listPackages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.oda.model.PackageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.oda.model.PackageSummary> listPackagesRecordIterator(
            final ListPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPackagesRequest.Builder, ListPackagesRequest, ListPackagesResponse,
                com.oracle.bmc.oda.model.PackageSummary>(
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
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
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
                        java.util.List<com.oracle.bmc.oda.model.PackageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.oda.model.PackageSummary> apply(
                            ListPackagesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

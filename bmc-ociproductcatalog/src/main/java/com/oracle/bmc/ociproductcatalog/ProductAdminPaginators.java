/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog;

import com.oracle.bmc.ociproductcatalog.requests.*;
import com.oracle.bmc.ociproductcatalog.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ProductAdmin where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
public class ProductAdminPaginators {
    private final ProductAdmin client;

    public ProductAdminPaginators(ProductAdmin client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAdminProducts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAdminProductsResponse> listAdminProductsResponseIterator(
            final ListAdminProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAdminProductsRequest.Builder,
                ListAdminProductsRequest,
                ListAdminProductsResponse>(
                new java.util.function.Supplier<ListAdminProductsRequest.Builder>() {
                    @Override
                    public ListAdminProductsRequest.Builder get() {
                        return ListAdminProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminProductsResponse, String>() {
                    @Override
                    public String apply(ListAdminProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminProductsRequest.Builder>,
                        ListAdminProductsRequest>() {
                    @Override
                    public ListAdminProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminProductsRequest.Builder>
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
                        ListAdminProductsRequest, ListAdminProductsResponse>() {
                    @Override
                    public ListAdminProductsResponse apply(ListAdminProductsRequest request) {
                        return client.listAdminProducts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.ociproductcatalog.model.ProductSummary} objects contained in responses from
     * the listAdminProducts operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.ociproductcatalog.model.ProductSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.ociproductcatalog.model.ProductSummary>
            listAdminProductsRecordIterator(final ListAdminProductsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAdminProductsRequest.Builder,
                ListAdminProductsRequest,
                ListAdminProductsResponse,
                com.oracle.bmc.ociproductcatalog.model.ProductSummary>(
                new java.util.function.Supplier<ListAdminProductsRequest.Builder>() {
                    @Override
                    public ListAdminProductsRequest.Builder get() {
                        return ListAdminProductsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAdminProductsResponse, String>() {
                    @Override
                    public String apply(ListAdminProductsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAdminProductsRequest.Builder>,
                        ListAdminProductsRequest>() {
                    @Override
                    public ListAdminProductsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAdminProductsRequest.Builder>
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
                        ListAdminProductsRequest, ListAdminProductsResponse>() {
                    @Override
                    public ListAdminProductsResponse apply(ListAdminProductsRequest request) {
                        return client.listAdminProducts(request);
                    }
                },
                new java.util.function.Function<
                        ListAdminProductsResponse,
                        java.util.List<com.oracle.bmc.ociproductcatalog.model.ProductSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ociproductcatalog.model.ProductSummary>
                            apply(ListAdminProductsResponse response) {
                        return response.getProductCollection().getItems();
                    }
                });
    }
}

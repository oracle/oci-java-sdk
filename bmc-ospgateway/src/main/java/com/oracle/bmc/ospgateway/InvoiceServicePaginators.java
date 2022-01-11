/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway;

import com.oracle.bmc.ospgateway.requests.*;
import com.oracle.bmc.ospgateway.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of InvoiceService where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.RequiredArgsConstructor
public class InvoiceServicePaginators {
    private final InvoiceService client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listInvoiceLines operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInvoiceLinesResponse> listInvoiceLinesResponseIterator(
            final ListInvoiceLinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInvoiceLinesRequest.Builder, ListInvoiceLinesRequest, ListInvoiceLinesResponse>(
                new com.google.common.base.Supplier<ListInvoiceLinesRequest.Builder>() {
                    @Override
                    public ListInvoiceLinesRequest.Builder get() {
                        return ListInvoiceLinesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInvoiceLinesResponse, String>() {
                    @Override
                    public String apply(ListInvoiceLinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInvoiceLinesRequest.Builder>,
                        ListInvoiceLinesRequest>() {
                    @Override
                    public ListInvoiceLinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInvoiceLinesRequest.Builder>
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
                        ListInvoiceLinesRequest, ListInvoiceLinesResponse>() {
                    @Override
                    public ListInvoiceLinesResponse apply(ListInvoiceLinesRequest request) {
                        return client.listInvoiceLines(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.ospgateway.model.InvoiceLineSummary} objects
     * contained in responses from the listInvoiceLines operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.ospgateway.model.InvoiceLineSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.ospgateway.model.InvoiceLineSummary>
            listInvoiceLinesRecordIterator(final ListInvoiceLinesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInvoiceLinesRequest.Builder, ListInvoiceLinesRequest, ListInvoiceLinesResponse,
                com.oracle.bmc.ospgateway.model.InvoiceLineSummary>(
                new com.google.common.base.Supplier<ListInvoiceLinesRequest.Builder>() {
                    @Override
                    public ListInvoiceLinesRequest.Builder get() {
                        return ListInvoiceLinesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInvoiceLinesResponse, String>() {
                    @Override
                    public String apply(ListInvoiceLinesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInvoiceLinesRequest.Builder>,
                        ListInvoiceLinesRequest>() {
                    @Override
                    public ListInvoiceLinesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInvoiceLinesRequest.Builder>
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
                        ListInvoiceLinesRequest, ListInvoiceLinesResponse>() {
                    @Override
                    public ListInvoiceLinesResponse apply(ListInvoiceLinesRequest request) {
                        return client.listInvoiceLines(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInvoiceLinesResponse,
                        java.util.List<com.oracle.bmc.ospgateway.model.InvoiceLineSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ospgateway.model.InvoiceLineSummary> apply(
                            ListInvoiceLinesResponse response) {
                        return response.getInvoiceLineCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInvoices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInvoicesResponse> listInvoicesResponseIterator(
            final ListInvoicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInvoicesRequest.Builder, ListInvoicesRequest, ListInvoicesResponse>(
                new com.google.common.base.Supplier<ListInvoicesRequest.Builder>() {
                    @Override
                    public ListInvoicesRequest.Builder get() {
                        return ListInvoicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInvoicesResponse, String>() {
                    @Override
                    public String apply(ListInvoicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInvoicesRequest.Builder>,
                        ListInvoicesRequest>() {
                    @Override
                    public ListInvoicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInvoicesRequest.Builder>
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
                new com.google.common.base.Function<ListInvoicesRequest, ListInvoicesResponse>() {
                    @Override
                    public ListInvoicesResponse apply(ListInvoicesRequest request) {
                        return client.listInvoices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.ospgateway.model.InvoiceSummary} objects
     * contained in responses from the listInvoices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.ospgateway.model.InvoiceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.ospgateway.model.InvoiceSummary> listInvoicesRecordIterator(
            final ListInvoicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInvoicesRequest.Builder, ListInvoicesRequest, ListInvoicesResponse,
                com.oracle.bmc.ospgateway.model.InvoiceSummary>(
                new com.google.common.base.Supplier<ListInvoicesRequest.Builder>() {
                    @Override
                    public ListInvoicesRequest.Builder get() {
                        return ListInvoicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInvoicesResponse, String>() {
                    @Override
                    public String apply(ListInvoicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInvoicesRequest.Builder>,
                        ListInvoicesRequest>() {
                    @Override
                    public ListInvoicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInvoicesRequest.Builder>
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
                new com.google.common.base.Function<ListInvoicesRequest, ListInvoicesResponse>() {
                    @Override
                    public ListInvoicesResponse apply(ListInvoicesRequest request) {
                        return client.listInvoices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInvoicesResponse,
                        java.util.List<com.oracle.bmc.ospgateway.model.InvoiceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ospgateway.model.InvoiceSummary> apply(
                            ListInvoicesResponse response) {
                        return response.getInvoiceCollection().getItems();
                    }
                });
    }
}

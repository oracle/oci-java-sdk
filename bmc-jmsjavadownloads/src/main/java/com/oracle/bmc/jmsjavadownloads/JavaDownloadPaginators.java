/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads;

import com.oracle.bmc.jmsjavadownloads.requests.*;
import com.oracle.bmc.jmsjavadownloads.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of JavaDownload where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class JavaDownloadPaginators {
    private final JavaDownload client;

    public JavaDownloadPaginators(JavaDownload client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaDownloadRecords operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaDownloadRecordsResponse> listJavaDownloadRecordsResponseIterator(
            final ListJavaDownloadRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaDownloadRecordsRequest.Builder,
                ListJavaDownloadRecordsRequest,
                ListJavaDownloadRecordsResponse>(
                new java.util.function.Supplier<ListJavaDownloadRecordsRequest.Builder>() {
                    @Override
                    public ListJavaDownloadRecordsRequest.Builder get() {
                        return ListJavaDownloadRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadRecordsResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadRecordsRequest.Builder>,
                        ListJavaDownloadRecordsRequest>() {
                    @Override
                    public ListJavaDownloadRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadRecordsRequest.Builder>
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
                        ListJavaDownloadRecordsRequest, ListJavaDownloadRecordsResponse>() {
                    @Override
                    public ListJavaDownloadRecordsResponse apply(
                            ListJavaDownloadRecordsRequest request) {
                        return client.listJavaDownloadRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSummary} objects contained in
     * responses from the listJavaDownloadRecords operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSummary>
            listJavaDownloadRecordsRecordIterator(final ListJavaDownloadRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaDownloadRecordsRequest.Builder,
                ListJavaDownloadRecordsRequest,
                ListJavaDownloadRecordsResponse,
                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSummary>(
                new java.util.function.Supplier<ListJavaDownloadRecordsRequest.Builder>() {
                    @Override
                    public ListJavaDownloadRecordsRequest.Builder get() {
                        return ListJavaDownloadRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadRecordsResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadRecordsRequest.Builder>,
                        ListJavaDownloadRecordsRequest>() {
                    @Override
                    public ListJavaDownloadRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadRecordsRequest.Builder>
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
                        ListJavaDownloadRecordsRequest, ListJavaDownloadRecordsResponse>() {
                    @Override
                    public ListJavaDownloadRecordsResponse apply(
                            ListJavaDownloadRecordsRequest request) {
                        return client.listJavaDownloadRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaDownloadRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.jmsjavadownloads.model
                                        .JavaDownloadRecordSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordSummary>
                            apply(ListJavaDownloadRecordsResponse response) {
                        return response.getJavaDownloadRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaDownloadReports operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaDownloadReportsResponse> listJavaDownloadReportsResponseIterator(
            final ListJavaDownloadReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaDownloadReportsRequest.Builder,
                ListJavaDownloadReportsRequest,
                ListJavaDownloadReportsResponse>(
                new java.util.function.Supplier<ListJavaDownloadReportsRequest.Builder>() {
                    @Override
                    public ListJavaDownloadReportsRequest.Builder get() {
                        return ListJavaDownloadReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadReportsResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadReportsRequest.Builder>,
                        ListJavaDownloadReportsRequest>() {
                    @Override
                    public ListJavaDownloadReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadReportsRequest.Builder>
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
                        ListJavaDownloadReportsRequest, ListJavaDownloadReportsResponse>() {
                    @Override
                    public ListJavaDownloadReportsResponse apply(
                            ListJavaDownloadReportsRequest request) {
                        return client.listJavaDownloadReports(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportSummary} objects contained in
     * responses from the listJavaDownloadReports operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportSummary>
            listJavaDownloadReportsRecordIterator(final ListJavaDownloadReportsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaDownloadReportsRequest.Builder,
                ListJavaDownloadReportsRequest,
                ListJavaDownloadReportsResponse,
                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportSummary>(
                new java.util.function.Supplier<ListJavaDownloadReportsRequest.Builder>() {
                    @Override
                    public ListJavaDownloadReportsRequest.Builder get() {
                        return ListJavaDownloadReportsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadReportsResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadReportsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadReportsRequest.Builder>,
                        ListJavaDownloadReportsRequest>() {
                    @Override
                    public ListJavaDownloadReportsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadReportsRequest.Builder>
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
                        ListJavaDownloadReportsRequest, ListJavaDownloadReportsResponse>() {
                    @Override
                    public ListJavaDownloadReportsResponse apply(
                            ListJavaDownloadReportsRequest request) {
                        return client.listJavaDownloadReports(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaDownloadReportsResponse,
                        java.util.List<
                                com.oracle.bmc.jmsjavadownloads.model
                                        .JavaDownloadReportSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportSummary>
                            apply(ListJavaDownloadReportsResponse response) {
                        return response.getJavaDownloadReportCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaDownloadTokens operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaDownloadTokensResponse> listJavaDownloadTokensResponseIterator(
            final ListJavaDownloadTokensRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaDownloadTokensRequest.Builder,
                ListJavaDownloadTokensRequest,
                ListJavaDownloadTokensResponse>(
                new java.util.function.Supplier<ListJavaDownloadTokensRequest.Builder>() {
                    @Override
                    public ListJavaDownloadTokensRequest.Builder get() {
                        return ListJavaDownloadTokensRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadTokensResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadTokensResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadTokensRequest.Builder>,
                        ListJavaDownloadTokensRequest>() {
                    @Override
                    public ListJavaDownloadTokensRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadTokensRequest.Builder>
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
                        ListJavaDownloadTokensRequest, ListJavaDownloadTokensResponse>() {
                    @Override
                    public ListJavaDownloadTokensResponse apply(
                            ListJavaDownloadTokensRequest request) {
                        return client.listJavaDownloadTokens(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary} objects contained in
     * responses from the listJavaDownloadTokens operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary>
            listJavaDownloadTokensRecordIterator(final ListJavaDownloadTokensRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaDownloadTokensRequest.Builder,
                ListJavaDownloadTokensRequest,
                ListJavaDownloadTokensResponse,
                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary>(
                new java.util.function.Supplier<ListJavaDownloadTokensRequest.Builder>() {
                    @Override
                    public ListJavaDownloadTokensRequest.Builder get() {
                        return ListJavaDownloadTokensRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaDownloadTokensResponse, String>() {
                    @Override
                    public String apply(ListJavaDownloadTokensResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaDownloadTokensRequest.Builder>,
                        ListJavaDownloadTokensRequest>() {
                    @Override
                    public ListJavaDownloadTokensRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaDownloadTokensRequest.Builder>
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
                        ListJavaDownloadTokensRequest, ListJavaDownloadTokensResponse>() {
                    @Override
                    public ListJavaDownloadTokensResponse apply(
                            ListJavaDownloadTokensRequest request) {
                        return client.listJavaDownloadTokens(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaDownloadTokensResponse,
                        java.util.List<
                                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenSummary>
                            apply(ListJavaDownloadTokensResponse response) {
                        return response.getJavaDownloadTokenCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaLicenseAcceptanceRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaLicenseAcceptanceRecordsResponse>
            listJavaLicenseAcceptanceRecordsResponseIterator(
                    final ListJavaLicenseAcceptanceRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaLicenseAcceptanceRecordsRequest.Builder,
                ListJavaLicenseAcceptanceRecordsRequest,
                ListJavaLicenseAcceptanceRecordsResponse>(
                new java.util.function.Supplier<ListJavaLicenseAcceptanceRecordsRequest.Builder>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsRequest.Builder get() {
                        return ListJavaLicenseAcceptanceRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaLicenseAcceptanceRecordsResponse, String>() {
                    @Override
                    public String apply(ListJavaLicenseAcceptanceRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaLicenseAcceptanceRecordsRequest.Builder>,
                        ListJavaLicenseAcceptanceRecordsRequest>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaLicenseAcceptanceRecordsRequest.Builder>
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
                        ListJavaLicenseAcceptanceRecordsRequest,
                        ListJavaLicenseAcceptanceRecordsResponse>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsResponse apply(
                            ListJavaLicenseAcceptanceRecordsRequest request) {
                        return client.listJavaLicenseAcceptanceRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordSummary} objects contained
     * in responses from the listJavaLicenseAcceptanceRecords operation. This iterable will fetch
     * more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordSummary>
            listJavaLicenseAcceptanceRecordsRecordIterator(
                    final ListJavaLicenseAcceptanceRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaLicenseAcceptanceRecordsRequest.Builder,
                ListJavaLicenseAcceptanceRecordsRequest,
                ListJavaLicenseAcceptanceRecordsResponse,
                com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordSummary>(
                new java.util.function.Supplier<ListJavaLicenseAcceptanceRecordsRequest.Builder>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsRequest.Builder get() {
                        return ListJavaLicenseAcceptanceRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaLicenseAcceptanceRecordsResponse, String>() {
                    @Override
                    public String apply(ListJavaLicenseAcceptanceRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaLicenseAcceptanceRecordsRequest.Builder>,
                        ListJavaLicenseAcceptanceRecordsRequest>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaLicenseAcceptanceRecordsRequest.Builder>
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
                        ListJavaLicenseAcceptanceRecordsRequest,
                        ListJavaLicenseAcceptanceRecordsResponse>() {
                    @Override
                    public ListJavaLicenseAcceptanceRecordsResponse apply(
                            ListJavaLicenseAcceptanceRecordsRequest request) {
                        return client.listJavaLicenseAcceptanceRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaLicenseAcceptanceRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.jmsjavadownloads.model
                                        .JavaLicenseAcceptanceRecordSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.jmsjavadownloads.model
                                            .JavaLicenseAcceptanceRecordSummary>
                            apply(ListJavaLicenseAcceptanceRecordsResponse response) {
                        return response.getJavaLicenseAcceptanceRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listJavaLicenses operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListJavaLicensesResponse> listJavaLicensesResponseIterator(
            final ListJavaLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListJavaLicensesRequest.Builder, ListJavaLicensesRequest, ListJavaLicensesResponse>(
                new java.util.function.Supplier<ListJavaLicensesRequest.Builder>() {
                    @Override
                    public ListJavaLicensesRequest.Builder get() {
                        return ListJavaLicensesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaLicensesResponse, String>() {
                    @Override
                    public String apply(ListJavaLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaLicensesRequest.Builder>,
                        ListJavaLicensesRequest>() {
                    @Override
                    public ListJavaLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaLicensesRequest.Builder>
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
                        ListJavaLicensesRequest, ListJavaLicensesResponse>() {
                    @Override
                    public ListJavaLicensesResponse apply(ListJavaLicensesRequest request) {
                        return client.listJavaLicenses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary} objects contained in responses from
     * the listJavaLicenses operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary>
            listJavaLicensesRecordIterator(final ListJavaLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListJavaLicensesRequest.Builder,
                ListJavaLicensesRequest,
                ListJavaLicensesResponse,
                com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary>(
                new java.util.function.Supplier<ListJavaLicensesRequest.Builder>() {
                    @Override
                    public ListJavaLicensesRequest.Builder get() {
                        return ListJavaLicensesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListJavaLicensesResponse, String>() {
                    @Override
                    public String apply(ListJavaLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListJavaLicensesRequest.Builder>,
                        ListJavaLicensesRequest>() {
                    @Override
                    public ListJavaLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListJavaLicensesRequest.Builder>
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
                        ListJavaLicensesRequest, ListJavaLicensesResponse>() {
                    @Override
                    public ListJavaLicensesResponse apply(ListJavaLicensesRequest request) {
                        return client.listJavaLicenses(request);
                    }
                },
                new java.util.function.Function<
                        ListJavaLicensesResponse,
                        java.util.List<
                                com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsjavadownloads.model.JavaLicenseSummary>
                            apply(ListJavaLicensesResponse response) {
                        return response.getJavaLicenseCollection().getItems();
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
     * com.oracle.bmc.jmsjavadownloads.model.WorkRequestError} objects contained in responses from
     * the listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.jmsjavadownloads.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.jmsjavadownloads.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsjavadownloads.model.WorkRequestError>
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
     * com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry>(
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
                                com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntry>
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
     * com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary} objects contained in responses from
     * the listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary>(
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
                                com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

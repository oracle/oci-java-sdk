/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms;

import com.oracle.bmc.wlms.requests.*;
import com.oracle.bmc.wlms.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of WeblogicManagementService where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
public class WeblogicManagementServicePaginators {
    private final WeblogicManagementService client;

    public WeblogicManagementServicePaginators(WeblogicManagementService client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAgreementRecords operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgreementRecordsResponse> listAgreementRecordsResponseIterator(
            final ListAgreementRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgreementRecordsRequest.Builder,
                ListAgreementRecordsRequest,
                ListAgreementRecordsResponse>(
                new java.util.function.Supplier<ListAgreementRecordsRequest.Builder>() {
                    @Override
                    public ListAgreementRecordsRequest.Builder get() {
                        return ListAgreementRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgreementRecordsResponse, String>() {
                    @Override
                    public String apply(ListAgreementRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgreementRecordsRequest.Builder>,
                        ListAgreementRecordsRequest>() {
                    @Override
                    public ListAgreementRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgreementRecordsRequest.Builder>
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
                        ListAgreementRecordsRequest, ListAgreementRecordsResponse>() {
                    @Override
                    public ListAgreementRecordsResponse apply(ListAgreementRecordsRequest request) {
                        return client.listAgreementRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.AgreementRecordSummary} objects contained in responses from the
     * listAgreementRecords operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.AgreementRecordSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.AgreementRecordSummary>
            listAgreementRecordsRecordIterator(final ListAgreementRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgreementRecordsRequest.Builder,
                ListAgreementRecordsRequest,
                ListAgreementRecordsResponse,
                com.oracle.bmc.wlms.model.AgreementRecordSummary>(
                new java.util.function.Supplier<ListAgreementRecordsRequest.Builder>() {
                    @Override
                    public ListAgreementRecordsRequest.Builder get() {
                        return ListAgreementRecordsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgreementRecordsResponse, String>() {
                    @Override
                    public String apply(ListAgreementRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgreementRecordsRequest.Builder>,
                        ListAgreementRecordsRequest>() {
                    @Override
                    public ListAgreementRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgreementRecordsRequest.Builder>
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
                        ListAgreementRecordsRequest, ListAgreementRecordsResponse>() {
                    @Override
                    public ListAgreementRecordsResponse apply(ListAgreementRecordsRequest request) {
                        return client.listAgreementRecords(request);
                    }
                },
                new java.util.function.Function<
                        ListAgreementRecordsResponse,
                        java.util.List<com.oracle.bmc.wlms.model.AgreementRecordSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.AgreementRecordSummary> apply(
                            ListAgreementRecordsResponse response) {
                        return response.getAgreementRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplicablePatches operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicablePatchesResponse> listApplicablePatchesResponseIterator(
            final ListApplicablePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicablePatchesRequest.Builder,
                ListApplicablePatchesRequest,
                ListApplicablePatchesResponse>(
                new java.util.function.Supplier<ListApplicablePatchesRequest.Builder>() {
                    @Override
                    public ListApplicablePatchesRequest.Builder get() {
                        return ListApplicablePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicablePatchesResponse, String>() {
                    @Override
                    public String apply(ListApplicablePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicablePatchesRequest.Builder>,
                        ListApplicablePatchesRequest>() {
                    @Override
                    public ListApplicablePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicablePatchesRequest.Builder>
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
                        ListApplicablePatchesRequest, ListApplicablePatchesResponse>() {
                    @Override
                    public ListApplicablePatchesResponse apply(
                            ListApplicablePatchesRequest request) {
                        return client.listApplicablePatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ApplicablePatchSummary} objects contained in responses from the
     * listApplicablePatches operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ApplicablePatchSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ApplicablePatchSummary>
            listApplicablePatchesRecordIterator(final ListApplicablePatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicablePatchesRequest.Builder,
                ListApplicablePatchesRequest,
                ListApplicablePatchesResponse,
                com.oracle.bmc.wlms.model.ApplicablePatchSummary>(
                new java.util.function.Supplier<ListApplicablePatchesRequest.Builder>() {
                    @Override
                    public ListApplicablePatchesRequest.Builder get() {
                        return ListApplicablePatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicablePatchesResponse, String>() {
                    @Override
                    public String apply(ListApplicablePatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicablePatchesRequest.Builder>,
                        ListApplicablePatchesRequest>() {
                    @Override
                    public ListApplicablePatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicablePatchesRequest.Builder>
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
                        ListApplicablePatchesRequest, ListApplicablePatchesResponse>() {
                    @Override
                    public ListApplicablePatchesResponse apply(
                            ListApplicablePatchesRequest request) {
                        return client.listApplicablePatches(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicablePatchesResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ApplicablePatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ApplicablePatchSummary> apply(
                            ListApplicablePatchesResponse response) {
                        return response.getApplicablePatchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceScanResults operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceScanResultsResponse>
            listManagedInstanceScanResultsResponseIterator(
                    final ListManagedInstanceScanResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceScanResultsRequest.Builder,
                ListManagedInstanceScanResultsRequest,
                ListManagedInstanceScanResultsResponse>(
                new java.util.function.Supplier<ListManagedInstanceScanResultsRequest.Builder>() {
                    @Override
                    public ListManagedInstanceScanResultsRequest.Builder get() {
                        return ListManagedInstanceScanResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceScanResultsResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceScanResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceScanResultsRequest.Builder>,
                        ListManagedInstanceScanResultsRequest>() {
                    @Override
                    public ListManagedInstanceScanResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceScanResultsRequest.Builder>
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
                        ListManagedInstanceScanResultsRequest,
                        ListManagedInstanceScanResultsResponse>() {
                    @Override
                    public ListManagedInstanceScanResultsResponse apply(
                            ListManagedInstanceScanResultsRequest request) {
                        return client.listManagedInstanceScanResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ScanResultSummary} objects contained in responses from the
     * listManagedInstanceScanResults operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ScanResultSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ScanResultSummary>
            listManagedInstanceScanResultsRecordIterator(
                    final ListManagedInstanceScanResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceScanResultsRequest.Builder,
                ListManagedInstanceScanResultsRequest,
                ListManagedInstanceScanResultsResponse,
                com.oracle.bmc.wlms.model.ScanResultSummary>(
                new java.util.function.Supplier<ListManagedInstanceScanResultsRequest.Builder>() {
                    @Override
                    public ListManagedInstanceScanResultsRequest.Builder get() {
                        return ListManagedInstanceScanResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceScanResultsResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceScanResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceScanResultsRequest.Builder>,
                        ListManagedInstanceScanResultsRequest>() {
                    @Override
                    public ListManagedInstanceScanResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceScanResultsRequest.Builder>
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
                        ListManagedInstanceScanResultsRequest,
                        ListManagedInstanceScanResultsResponse>() {
                    @Override
                    public ListManagedInstanceScanResultsResponse apply(
                            ListManagedInstanceScanResultsRequest request) {
                        return client.listManagedInstanceScanResults(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceScanResultsResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ScanResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ScanResultSummary> apply(
                            ListManagedInstanceScanResultsResponse response) {
                        return response.getScanResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceServerInstalledPatches operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceServerInstalledPatchesResponse>
            listManagedInstanceServerInstalledPatchesResponseIterator(
                    final ListManagedInstanceServerInstalledPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceServerInstalledPatchesRequest.Builder,
                ListManagedInstanceServerInstalledPatchesRequest,
                ListManagedInstanceServerInstalledPatchesResponse>(
                new java.util.function.Supplier<
                        ListManagedInstanceServerInstalledPatchesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesRequest.Builder get() {
                        return ListManagedInstanceServerInstalledPatchesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceServerInstalledPatchesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceServerInstalledPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceServerInstalledPatchesRequest.Builder>,
                        ListManagedInstanceServerInstalledPatchesRequest>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceServerInstalledPatchesRequest
                                                    .Builder>
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
                        ListManagedInstanceServerInstalledPatchesRequest,
                        ListManagedInstanceServerInstalledPatchesResponse>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesResponse apply(
                            ListManagedInstanceServerInstalledPatchesRequest request) {
                        return client.listManagedInstanceServerInstalledPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.InstalledPatchSummary} objects contained in responses from the
     * listManagedInstanceServerInstalledPatches operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.InstalledPatchSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.InstalledPatchSummary>
            listManagedInstanceServerInstalledPatchesRecordIterator(
                    final ListManagedInstanceServerInstalledPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceServerInstalledPatchesRequest.Builder,
                ListManagedInstanceServerInstalledPatchesRequest,
                ListManagedInstanceServerInstalledPatchesResponse,
                com.oracle.bmc.wlms.model.InstalledPatchSummary>(
                new java.util.function.Supplier<
                        ListManagedInstanceServerInstalledPatchesRequest.Builder>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesRequest.Builder get() {
                        return ListManagedInstanceServerInstalledPatchesRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceServerInstalledPatchesResponse, String>() {
                    @Override
                    public String apply(
                            ListManagedInstanceServerInstalledPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceServerInstalledPatchesRequest.Builder>,
                        ListManagedInstanceServerInstalledPatchesRequest>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceServerInstalledPatchesRequest
                                                    .Builder>
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
                        ListManagedInstanceServerInstalledPatchesRequest,
                        ListManagedInstanceServerInstalledPatchesResponse>() {
                    @Override
                    public ListManagedInstanceServerInstalledPatchesResponse apply(
                            ListManagedInstanceServerInstalledPatchesRequest request) {
                        return client.listManagedInstanceServerInstalledPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceServerInstalledPatchesResponse,
                        java.util.List<com.oracle.bmc.wlms.model.InstalledPatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.InstalledPatchSummary> apply(
                            ListManagedInstanceServerInstalledPatchesResponse response) {
                        return response.getInstalledPatchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstanceServers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstanceServersResponse> listManagedInstanceServersResponseIterator(
            final ListManagedInstanceServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstanceServersRequest.Builder,
                ListManagedInstanceServersRequest,
                ListManagedInstanceServersResponse>(
                new java.util.function.Supplier<ListManagedInstanceServersRequest.Builder>() {
                    @Override
                    public ListManagedInstanceServersRequest.Builder get() {
                        return ListManagedInstanceServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceServersResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceServersRequest.Builder>,
                        ListManagedInstanceServersRequest>() {
                    @Override
                    public ListManagedInstanceServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceServersRequest.Builder>
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
                        ListManagedInstanceServersRequest, ListManagedInstanceServersResponse>() {
                    @Override
                    public ListManagedInstanceServersResponse apply(
                            ListManagedInstanceServersRequest request) {
                        return client.listManagedInstanceServers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ServerSummary} objects contained in responses from the
     * listManagedInstanceServers operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ServerSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ServerSummary>
            listManagedInstanceServersRecordIterator(
                    final ListManagedInstanceServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstanceServersRequest.Builder,
                ListManagedInstanceServersRequest,
                ListManagedInstanceServersResponse,
                com.oracle.bmc.wlms.model.ServerSummary>(
                new java.util.function.Supplier<ListManagedInstanceServersRequest.Builder>() {
                    @Override
                    public ListManagedInstanceServersRequest.Builder get() {
                        return ListManagedInstanceServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstanceServersResponse, String>() {
                    @Override
                    public String apply(ListManagedInstanceServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstanceServersRequest.Builder>,
                        ListManagedInstanceServersRequest>() {
                    @Override
                    public ListManagedInstanceServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstanceServersRequest.Builder>
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
                        ListManagedInstanceServersRequest, ListManagedInstanceServersResponse>() {
                    @Override
                    public ListManagedInstanceServersResponse apply(
                            ListManagedInstanceServersRequest request) {
                        return client.listManagedInstanceServers(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstanceServersResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ServerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ServerSummary> apply(
                            ListManagedInstanceServersResponse response) {
                        return response.getServerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listManagedInstances operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListManagedInstancesResponse> listManagedInstancesResponseIterator(
            final ListManagedInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListManagedInstancesRequest.Builder,
                ListManagedInstancesRequest,
                ListManagedInstancesResponse>(
                new java.util.function.Supplier<ListManagedInstancesRequest.Builder>() {
                    @Override
                    public ListManagedInstancesRequest.Builder get() {
                        return ListManagedInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstancesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesRequest.Builder>,
                        ListManagedInstancesRequest>() {
                    @Override
                    public ListManagedInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesRequest.Builder>
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
                        ListManagedInstancesRequest, ListManagedInstancesResponse>() {
                    @Override
                    public ListManagedInstancesResponse apply(ListManagedInstancesRequest request) {
                        return client.listManagedInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ManagedInstanceSummary} objects contained in responses from the
     * listManagedInstances operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ManagedInstanceSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ManagedInstanceSummary>
            listManagedInstancesRecordIterator(final ListManagedInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListManagedInstancesRequest.Builder,
                ListManagedInstancesRequest,
                ListManagedInstancesResponse,
                com.oracle.bmc.wlms.model.ManagedInstanceSummary>(
                new java.util.function.Supplier<ListManagedInstancesRequest.Builder>() {
                    @Override
                    public ListManagedInstancesRequest.Builder get() {
                        return ListManagedInstancesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListManagedInstancesResponse, String>() {
                    @Override
                    public String apply(ListManagedInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListManagedInstancesRequest.Builder>,
                        ListManagedInstancesRequest>() {
                    @Override
                    public ListManagedInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListManagedInstancesRequest.Builder>
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
                        ListManagedInstancesRequest, ListManagedInstancesResponse>() {
                    @Override
                    public ListManagedInstancesResponse apply(ListManagedInstancesRequest request) {
                        return client.listManagedInstances(request);
                    }
                },
                new java.util.function.Function<
                        ListManagedInstancesResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ManagedInstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ManagedInstanceSummary> apply(
                            ListManagedInstancesResponse response) {
                        return response.getManagedInstanceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWlsDomainScanResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainScanResultsResponse> listWlsDomainScanResultsResponseIterator(
            final ListWlsDomainScanResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainScanResultsRequest.Builder,
                ListWlsDomainScanResultsRequest,
                ListWlsDomainScanResultsResponse>(
                new java.util.function.Supplier<ListWlsDomainScanResultsRequest.Builder>() {
                    @Override
                    public ListWlsDomainScanResultsRequest.Builder get() {
                        return ListWlsDomainScanResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainScanResultsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainScanResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainScanResultsRequest.Builder>,
                        ListWlsDomainScanResultsRequest>() {
                    @Override
                    public ListWlsDomainScanResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainScanResultsRequest.Builder>
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
                        ListWlsDomainScanResultsRequest, ListWlsDomainScanResultsResponse>() {
                    @Override
                    public ListWlsDomainScanResultsResponse apply(
                            ListWlsDomainScanResultsRequest request) {
                        return client.listWlsDomainScanResults(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ScanResultSummary} objects contained in responses from the
     * listWlsDomainScanResults operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ScanResultSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ScanResultSummary>
            listWlsDomainScanResultsRecordIterator(final ListWlsDomainScanResultsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainScanResultsRequest.Builder,
                ListWlsDomainScanResultsRequest,
                ListWlsDomainScanResultsResponse,
                com.oracle.bmc.wlms.model.ScanResultSummary>(
                new java.util.function.Supplier<ListWlsDomainScanResultsRequest.Builder>() {
                    @Override
                    public ListWlsDomainScanResultsRequest.Builder get() {
                        return ListWlsDomainScanResultsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainScanResultsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainScanResultsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainScanResultsRequest.Builder>,
                        ListWlsDomainScanResultsRequest>() {
                    @Override
                    public ListWlsDomainScanResultsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainScanResultsRequest.Builder>
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
                        ListWlsDomainScanResultsRequest, ListWlsDomainScanResultsResponse>() {
                    @Override
                    public ListWlsDomainScanResultsResponse apply(
                            ListWlsDomainScanResultsRequest request) {
                        return client.listWlsDomainScanResults(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainScanResultsResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ScanResultSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ScanResultSummary> apply(
                            ListWlsDomainScanResultsResponse response) {
                        return response.getScanResultCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWlsDomainServerBackups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainServerBackupsResponse> listWlsDomainServerBackupsResponseIterator(
            final ListWlsDomainServerBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainServerBackupsRequest.Builder,
                ListWlsDomainServerBackupsRequest,
                ListWlsDomainServerBackupsResponse>(
                new java.util.function.Supplier<ListWlsDomainServerBackupsRequest.Builder>() {
                    @Override
                    public ListWlsDomainServerBackupsRequest.Builder get() {
                        return ListWlsDomainServerBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainServerBackupsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServerBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServerBackupsRequest.Builder>,
                        ListWlsDomainServerBackupsRequest>() {
                    @Override
                    public ListWlsDomainServerBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServerBackupsRequest.Builder>
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
                        ListWlsDomainServerBackupsRequest, ListWlsDomainServerBackupsResponse>() {
                    @Override
                    public ListWlsDomainServerBackupsResponse apply(
                            ListWlsDomainServerBackupsRequest request) {
                        return client.listWlsDomainServerBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.BackupSummary} objects contained in responses from the
     * listWlsDomainServerBackups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.BackupSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.wlms.model.BackupSummary>
            listWlsDomainServerBackupsRecordIterator(
                    final ListWlsDomainServerBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainServerBackupsRequest.Builder,
                ListWlsDomainServerBackupsRequest,
                ListWlsDomainServerBackupsResponse,
                com.oracle.bmc.wlms.model.BackupSummary>(
                new java.util.function.Supplier<ListWlsDomainServerBackupsRequest.Builder>() {
                    @Override
                    public ListWlsDomainServerBackupsRequest.Builder get() {
                        return ListWlsDomainServerBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainServerBackupsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServerBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServerBackupsRequest.Builder>,
                        ListWlsDomainServerBackupsRequest>() {
                    @Override
                    public ListWlsDomainServerBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServerBackupsRequest.Builder>
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
                        ListWlsDomainServerBackupsRequest, ListWlsDomainServerBackupsResponse>() {
                    @Override
                    public ListWlsDomainServerBackupsResponse apply(
                            ListWlsDomainServerBackupsRequest request) {
                        return client.listWlsDomainServerBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainServerBackupsResponse,
                        java.util.List<com.oracle.bmc.wlms.model.BackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.BackupSummary> apply(
                            ListWlsDomainServerBackupsResponse response) {
                        return response.getBackupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWlsDomainServerInstalledPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainServerInstalledPatchesResponse>
            listWlsDomainServerInstalledPatchesResponseIterator(
                    final ListWlsDomainServerInstalledPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainServerInstalledPatchesRequest.Builder,
                ListWlsDomainServerInstalledPatchesRequest,
                ListWlsDomainServerInstalledPatchesResponse>(
                new java.util.function.Supplier<
                        ListWlsDomainServerInstalledPatchesRequest.Builder>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesRequest.Builder get() {
                        return ListWlsDomainServerInstalledPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainServerInstalledPatchesResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServerInstalledPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServerInstalledPatchesRequest.Builder>,
                        ListWlsDomainServerInstalledPatchesRequest>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServerInstalledPatchesRequest.Builder>
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
                        ListWlsDomainServerInstalledPatchesRequest,
                        ListWlsDomainServerInstalledPatchesResponse>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesResponse apply(
                            ListWlsDomainServerInstalledPatchesRequest request) {
                        return client.listWlsDomainServerInstalledPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.InstalledPatchSummary} objects contained in responses from the
     * listWlsDomainServerInstalledPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.InstalledPatchSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.InstalledPatchSummary>
            listWlsDomainServerInstalledPatchesRecordIterator(
                    final ListWlsDomainServerInstalledPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainServerInstalledPatchesRequest.Builder,
                ListWlsDomainServerInstalledPatchesRequest,
                ListWlsDomainServerInstalledPatchesResponse,
                com.oracle.bmc.wlms.model.InstalledPatchSummary>(
                new java.util.function.Supplier<
                        ListWlsDomainServerInstalledPatchesRequest.Builder>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesRequest.Builder get() {
                        return ListWlsDomainServerInstalledPatchesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainServerInstalledPatchesResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServerInstalledPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServerInstalledPatchesRequest.Builder>,
                        ListWlsDomainServerInstalledPatchesRequest>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServerInstalledPatchesRequest.Builder>
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
                        ListWlsDomainServerInstalledPatchesRequest,
                        ListWlsDomainServerInstalledPatchesResponse>() {
                    @Override
                    public ListWlsDomainServerInstalledPatchesResponse apply(
                            ListWlsDomainServerInstalledPatchesRequest request) {
                        return client.listWlsDomainServerInstalledPatches(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainServerInstalledPatchesResponse,
                        java.util.List<com.oracle.bmc.wlms.model.InstalledPatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.InstalledPatchSummary> apply(
                            ListWlsDomainServerInstalledPatchesResponse response) {
                        return response.getInstalledPatchCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWlsDomainServers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainServersResponse> listWlsDomainServersResponseIterator(
            final ListWlsDomainServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainServersRequest.Builder,
                ListWlsDomainServersRequest,
                ListWlsDomainServersResponse>(
                new java.util.function.Supplier<ListWlsDomainServersRequest.Builder>() {
                    @Override
                    public ListWlsDomainServersRequest.Builder get() {
                        return ListWlsDomainServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainServersResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServersRequest.Builder>,
                        ListWlsDomainServersRequest>() {
                    @Override
                    public ListWlsDomainServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServersRequest.Builder>
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
                        ListWlsDomainServersRequest, ListWlsDomainServersResponse>() {
                    @Override
                    public ListWlsDomainServersResponse apply(ListWlsDomainServersRequest request) {
                        return client.listWlsDomainServers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.ServerSummary} objects contained in responses from the
     * listWlsDomainServers operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.ServerSummary} objects contained in responses received from the
     *     service.
     */
    public Iterable<com.oracle.bmc.wlms.model.ServerSummary> listWlsDomainServersRecordIterator(
            final ListWlsDomainServersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainServersRequest.Builder,
                ListWlsDomainServersRequest,
                ListWlsDomainServersResponse,
                com.oracle.bmc.wlms.model.ServerSummary>(
                new java.util.function.Supplier<ListWlsDomainServersRequest.Builder>() {
                    @Override
                    public ListWlsDomainServersRequest.Builder get() {
                        return ListWlsDomainServersRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainServersResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainServersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainServersRequest.Builder>,
                        ListWlsDomainServersRequest>() {
                    @Override
                    public ListWlsDomainServersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainServersRequest.Builder>
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
                        ListWlsDomainServersRequest, ListWlsDomainServersResponse>() {
                    @Override
                    public ListWlsDomainServersResponse apply(ListWlsDomainServersRequest request) {
                        return client.listWlsDomainServers(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainServersResponse,
                        java.util.List<com.oracle.bmc.wlms.model.ServerSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.ServerSummary> apply(
                            ListWlsDomainServersResponse response) {
                        return response.getServerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWlsDomains
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainsResponse> listWlsDomainsResponseIterator(
            final ListWlsDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainsRequest.Builder, ListWlsDomainsRequest, ListWlsDomainsResponse>(
                new java.util.function.Supplier<ListWlsDomainsRequest.Builder>() {
                    @Override
                    public ListWlsDomainsRequest.Builder get() {
                        return ListWlsDomainsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainsRequest.Builder>,
                        ListWlsDomainsRequest>() {
                    @Override
                    public ListWlsDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainsRequest.Builder>
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
                new java.util.function.Function<ListWlsDomainsRequest, ListWlsDomainsResponse>() {
                    @Override
                    public ListWlsDomainsResponse apply(ListWlsDomainsRequest request) {
                        return client.listWlsDomains(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.WlsDomainSummary} objects contained in responses from the
     * listWlsDomains operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.WlsDomainSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.WlsDomainSummary> listWlsDomainsRecordIterator(
            final ListWlsDomainsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainsRequest.Builder,
                ListWlsDomainsRequest,
                ListWlsDomainsResponse,
                com.oracle.bmc.wlms.model.WlsDomainSummary>(
                new java.util.function.Supplier<ListWlsDomainsRequest.Builder>() {
                    @Override
                    public ListWlsDomainsRequest.Builder get() {
                        return ListWlsDomainsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWlsDomainsResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainsRequest.Builder>,
                        ListWlsDomainsRequest>() {
                    @Override
                    public ListWlsDomainsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainsRequest.Builder>
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
                new java.util.function.Function<ListWlsDomainsRequest, ListWlsDomainsResponse>() {
                    @Override
                    public ListWlsDomainsResponse apply(ListWlsDomainsRequest request) {
                        return client.listWlsDomains(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainsResponse,
                        java.util.List<com.oracle.bmc.wlms.model.WlsDomainSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.WlsDomainSummary> apply(
                            ListWlsDomainsResponse response) {
                        return response.getWlsDomainCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWlsDomainsSharingMiddlewares operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWlsDomainsSharingMiddlewaresResponse>
            listWlsDomainsSharingMiddlewaresResponseIterator(
                    final ListWlsDomainsSharingMiddlewaresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWlsDomainsSharingMiddlewaresRequest.Builder,
                ListWlsDomainsSharingMiddlewaresRequest,
                ListWlsDomainsSharingMiddlewaresResponse>(
                new java.util.function.Supplier<ListWlsDomainsSharingMiddlewaresRequest.Builder>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresRequest.Builder get() {
                        return ListWlsDomainsSharingMiddlewaresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainsSharingMiddlewaresResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainsSharingMiddlewaresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainsSharingMiddlewaresRequest.Builder>,
                        ListWlsDomainsSharingMiddlewaresRequest>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainsSharingMiddlewaresRequest.Builder>
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
                        ListWlsDomainsSharingMiddlewaresRequest,
                        ListWlsDomainsSharingMiddlewaresResponse>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresResponse apply(
                            ListWlsDomainsSharingMiddlewaresRequest request) {
                        return client.listWlsDomainsSharingMiddlewares(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.wlms.model.WlsDomainSummary} objects contained in responses from the
     * listWlsDomainsSharingMiddlewares operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.WlsDomainSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.WlsDomainSummary>
            listWlsDomainsSharingMiddlewaresRecordIterator(
                    final ListWlsDomainsSharingMiddlewaresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWlsDomainsSharingMiddlewaresRequest.Builder,
                ListWlsDomainsSharingMiddlewaresRequest,
                ListWlsDomainsSharingMiddlewaresResponse,
                com.oracle.bmc.wlms.model.WlsDomainSummary>(
                new java.util.function.Supplier<ListWlsDomainsSharingMiddlewaresRequest.Builder>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresRequest.Builder get() {
                        return ListWlsDomainsSharingMiddlewaresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainsSharingMiddlewaresResponse, String>() {
                    @Override
                    public String apply(ListWlsDomainsSharingMiddlewaresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWlsDomainsSharingMiddlewaresRequest.Builder>,
                        ListWlsDomainsSharingMiddlewaresRequest>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWlsDomainsSharingMiddlewaresRequest.Builder>
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
                        ListWlsDomainsSharingMiddlewaresRequest,
                        ListWlsDomainsSharingMiddlewaresResponse>() {
                    @Override
                    public ListWlsDomainsSharingMiddlewaresResponse apply(
                            ListWlsDomainsSharingMiddlewaresRequest request) {
                        return client.listWlsDomainsSharingMiddlewares(request);
                    }
                },
                new java.util.function.Function<
                        ListWlsDomainsSharingMiddlewaresResponse,
                        java.util.List<com.oracle.bmc.wlms.model.WlsDomainSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.WlsDomainSummary> apply(
                            ListWlsDomainsSharingMiddlewaresResponse response) {
                        return response.getWlsDomainCollection().getItems();
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
     * com.oracle.bmc.wlms.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.wlms.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.wlms.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.WorkRequestError> apply(
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
     * com.oracle.bmc.wlms.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.wlms.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.wlms.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.WorkRequestLogEntry> apply(
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
     * com.oracle.bmc.wlms.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.wlms.model.WorkRequestSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.wlms.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.wlms.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.wlms.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.wlms.model.WorkRequestSummary> apply(
                            ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

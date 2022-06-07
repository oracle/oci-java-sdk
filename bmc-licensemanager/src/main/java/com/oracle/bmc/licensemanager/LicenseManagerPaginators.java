/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager;

import com.oracle.bmc.licensemanager.requests.*;
import com.oracle.bmc.licensemanager.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of LicenseManager where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class LicenseManagerPaginators {
    private final LicenseManager client;

    public LicenseManagerPaginators(LicenseManager client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listLicenseRecords operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListLicenseRecordsResponse> listLicenseRecordsResponseIterator(
            final ListLicenseRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListLicenseRecordsRequest.Builder, ListLicenseRecordsRequest,
                ListLicenseRecordsResponse>(
                new com.google.common.base.Supplier<ListLicenseRecordsRequest.Builder>() {
                    @Override
                    public ListLicenseRecordsRequest.Builder get() {
                        return ListLicenseRecordsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLicenseRecordsResponse, String>() {
                    @Override
                    public String apply(ListLicenseRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLicenseRecordsRequest.Builder>,
                        ListLicenseRecordsRequest>() {
                    @Override
                    public ListLicenseRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLicenseRecordsRequest.Builder>
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
                        ListLicenseRecordsRequest, ListLicenseRecordsResponse>() {
                    @Override
                    public ListLicenseRecordsResponse apply(ListLicenseRecordsRequest request) {
                        return client.listLicenseRecords(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.licensemanager.model.LicenseRecordSummary} objects
     * contained in responses from the listLicenseRecords operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.licensemanager.model.LicenseRecordSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.licensemanager.model.LicenseRecordSummary>
            listLicenseRecordsRecordIterator(final ListLicenseRecordsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListLicenseRecordsRequest.Builder, ListLicenseRecordsRequest,
                ListLicenseRecordsResponse,
                com.oracle.bmc.licensemanager.model.LicenseRecordSummary>(
                new com.google.common.base.Supplier<ListLicenseRecordsRequest.Builder>() {
                    @Override
                    public ListLicenseRecordsRequest.Builder get() {
                        return ListLicenseRecordsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListLicenseRecordsResponse, String>() {
                    @Override
                    public String apply(ListLicenseRecordsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListLicenseRecordsRequest.Builder>,
                        ListLicenseRecordsRequest>() {
                    @Override
                    public ListLicenseRecordsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListLicenseRecordsRequest.Builder>
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
                        ListLicenseRecordsRequest, ListLicenseRecordsResponse>() {
                    @Override
                    public ListLicenseRecordsResponse apply(ListLicenseRecordsRequest request) {
                        return client.listLicenseRecords(request);
                    }
                },
                new com.google.common.base.Function<
                        ListLicenseRecordsResponse,
                        java.util.List<
                                com.oracle.bmc.licensemanager.model.LicenseRecordSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.licensemanager.model.LicenseRecordSummary>
                            apply(ListLicenseRecordsResponse response) {
                        return response.getLicenseRecordCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProductLicenseConsumers operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProductLicenseConsumersResponse>
            listProductLicenseConsumersResponseIterator(
                    final ListProductLicenseConsumersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProductLicenseConsumersRequest.Builder, ListProductLicenseConsumersRequest,
                ListProductLicenseConsumersResponse>(
                new com.google.common.base.Supplier<ListProductLicenseConsumersRequest.Builder>() {
                    @Override
                    public ListProductLicenseConsumersRequest.Builder get() {
                        return ListProductLicenseConsumersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProductLicenseConsumersResponse, String>() {
                    @Override
                    public String apply(ListProductLicenseConsumersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductLicenseConsumersRequest.Builder>,
                        ListProductLicenseConsumersRequest>() {
                    @Override
                    public ListProductLicenseConsumersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductLicenseConsumersRequest.Builder>
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
                        ListProductLicenseConsumersRequest, ListProductLicenseConsumersResponse>() {
                    @Override
                    public ListProductLicenseConsumersResponse apply(
                            ListProductLicenseConsumersRequest request) {
                        return client.listProductLicenseConsumers(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.licensemanager.model.ProductLicenseConsumerSummary} objects
     * contained in responses from the listProductLicenseConsumers operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.licensemanager.model.ProductLicenseConsumerSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.licensemanager.model.ProductLicenseConsumerSummary>
            listProductLicenseConsumersRecordIterator(
                    final ListProductLicenseConsumersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProductLicenseConsumersRequest.Builder, ListProductLicenseConsumersRequest,
                ListProductLicenseConsumersResponse,
                com.oracle.bmc.licensemanager.model.ProductLicenseConsumerSummary>(
                new com.google.common.base.Supplier<ListProductLicenseConsumersRequest.Builder>() {
                    @Override
                    public ListProductLicenseConsumersRequest.Builder get() {
                        return ListProductLicenseConsumersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProductLicenseConsumersResponse, String>() {
                    @Override
                    public String apply(ListProductLicenseConsumersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductLicenseConsumersRequest.Builder>,
                        ListProductLicenseConsumersRequest>() {
                    @Override
                    public ListProductLicenseConsumersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductLicenseConsumersRequest.Builder>
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
                        ListProductLicenseConsumersRequest, ListProductLicenseConsumersResponse>() {
                    @Override
                    public ListProductLicenseConsumersResponse apply(
                            ListProductLicenseConsumersRequest request) {
                        return client.listProductLicenseConsumers(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProductLicenseConsumersResponse,
                        java.util.List<
                                com.oracle.bmc.licensemanager.model
                                        .ProductLicenseConsumerSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.licensemanager.model
                                            .ProductLicenseConsumerSummary>
                            apply(ListProductLicenseConsumersResponse response) {
                        return response.getProductLicenseConsumerCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProductLicenses operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProductLicensesResponse> listProductLicensesResponseIterator(
            final ListProductLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProductLicensesRequest.Builder, ListProductLicensesRequest,
                ListProductLicensesResponse>(
                new com.google.common.base.Supplier<ListProductLicensesRequest.Builder>() {
                    @Override
                    public ListProductLicensesRequest.Builder get() {
                        return ListProductLicensesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProductLicensesResponse, String>() {
                    @Override
                    public String apply(ListProductLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductLicensesRequest.Builder>,
                        ListProductLicensesRequest>() {
                    @Override
                    public ListProductLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductLicensesRequest.Builder>
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
                        ListProductLicensesRequest, ListProductLicensesResponse>() {
                    @Override
                    public ListProductLicensesResponse apply(ListProductLicensesRequest request) {
                        return client.listProductLicenses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.licensemanager.model.ProductLicenseSummary} objects
     * contained in responses from the listProductLicenses operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.licensemanager.model.ProductLicenseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.licensemanager.model.ProductLicenseSummary>
            listProductLicensesRecordIterator(final ListProductLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProductLicensesRequest.Builder, ListProductLicensesRequest,
                ListProductLicensesResponse,
                com.oracle.bmc.licensemanager.model.ProductLicenseSummary>(
                new com.google.common.base.Supplier<ListProductLicensesRequest.Builder>() {
                    @Override
                    public ListProductLicensesRequest.Builder get() {
                        return ListProductLicensesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProductLicensesResponse, String>() {
                    @Override
                    public String apply(ListProductLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProductLicensesRequest.Builder>,
                        ListProductLicensesRequest>() {
                    @Override
                    public ListProductLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProductLicensesRequest.Builder>
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
                        ListProductLicensesRequest, ListProductLicensesResponse>() {
                    @Override
                    public ListProductLicensesResponse apply(ListProductLicensesRequest request) {
                        return client.listProductLicenses(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProductLicensesResponse,
                        java.util.List<
                                com.oracle.bmc.licensemanager.model.ProductLicenseSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.licensemanager.model.ProductLicenseSummary>
                            apply(ListProductLicensesResponse response) {
                        return response.getProductLicenseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTopUtilizedProductLicenses operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTopUtilizedProductLicensesResponse>
            listTopUtilizedProductLicensesResponseIterator(
                    final ListTopUtilizedProductLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTopUtilizedProductLicensesRequest.Builder,
                ListTopUtilizedProductLicensesRequest, ListTopUtilizedProductLicensesResponse>(
                new com.google.common.base.Supplier<
                        ListTopUtilizedProductLicensesRequest.Builder>() {
                    @Override
                    public ListTopUtilizedProductLicensesRequest.Builder get() {
                        return ListTopUtilizedProductLicensesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTopUtilizedProductLicensesResponse, String>() {
                    @Override
                    public String apply(ListTopUtilizedProductLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTopUtilizedProductLicensesRequest.Builder>,
                        ListTopUtilizedProductLicensesRequest>() {
                    @Override
                    public ListTopUtilizedProductLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTopUtilizedProductLicensesRequest.Builder>
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
                        ListTopUtilizedProductLicensesRequest,
                        ListTopUtilizedProductLicensesResponse>() {
                    @Override
                    public ListTopUtilizedProductLicensesResponse apply(
                            ListTopUtilizedProductLicensesRequest request) {
                        return client.listTopUtilizedProductLicenses(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.licensemanager.model.TopUtilizedProductLicenseSummary} objects
     * contained in responses from the listTopUtilizedProductLicenses operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.licensemanager.model.TopUtilizedProductLicenseSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.licensemanager.model.TopUtilizedProductLicenseSummary>
            listTopUtilizedProductLicensesRecordIterator(
                    final ListTopUtilizedProductLicensesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTopUtilizedProductLicensesRequest.Builder,
                ListTopUtilizedProductLicensesRequest, ListTopUtilizedProductLicensesResponse,
                com.oracle.bmc.licensemanager.model.TopUtilizedProductLicenseSummary>(
                new com.google.common.base.Supplier<
                        ListTopUtilizedProductLicensesRequest.Builder>() {
                    @Override
                    public ListTopUtilizedProductLicensesRequest.Builder get() {
                        return ListTopUtilizedProductLicensesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTopUtilizedProductLicensesResponse, String>() {
                    @Override
                    public String apply(ListTopUtilizedProductLicensesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTopUtilizedProductLicensesRequest.Builder>,
                        ListTopUtilizedProductLicensesRequest>() {
                    @Override
                    public ListTopUtilizedProductLicensesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTopUtilizedProductLicensesRequest.Builder>
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
                        ListTopUtilizedProductLicensesRequest,
                        ListTopUtilizedProductLicensesResponse>() {
                    @Override
                    public ListTopUtilizedProductLicensesResponse apply(
                            ListTopUtilizedProductLicensesRequest request) {
                        return client.listTopUtilizedProductLicenses(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTopUtilizedProductLicensesResponse,
                        java.util.List<
                                com.oracle.bmc.licensemanager.model
                                        .TopUtilizedProductLicenseSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.licensemanager.model
                                            .TopUtilizedProductLicenseSummary>
                            apply(ListTopUtilizedProductLicensesResponse response) {
                        return response.getTopUtilizedProductLicenseCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTopUtilizedResources operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTopUtilizedResourcesResponse> listTopUtilizedResourcesResponseIterator(
            final ListTopUtilizedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTopUtilizedResourcesRequest.Builder, ListTopUtilizedResourcesRequest,
                ListTopUtilizedResourcesResponse>(
                new com.google.common.base.Supplier<ListTopUtilizedResourcesRequest.Builder>() {
                    @Override
                    public ListTopUtilizedResourcesRequest.Builder get() {
                        return ListTopUtilizedResourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTopUtilizedResourcesResponse, String>() {
                    @Override
                    public String apply(ListTopUtilizedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTopUtilizedResourcesRequest.Builder>,
                        ListTopUtilizedResourcesRequest>() {
                    @Override
                    public ListTopUtilizedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTopUtilizedResourcesRequest.Builder>
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
                        ListTopUtilizedResourcesRequest, ListTopUtilizedResourcesResponse>() {
                    @Override
                    public ListTopUtilizedResourcesResponse apply(
                            ListTopUtilizedResourcesRequest request) {
                        return client.listTopUtilizedResources(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary} objects
     * contained in responses from the listTopUtilizedResources operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary>
            listTopUtilizedResourcesRecordIterator(final ListTopUtilizedResourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTopUtilizedResourcesRequest.Builder, ListTopUtilizedResourcesRequest,
                ListTopUtilizedResourcesResponse,
                com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary>(
                new com.google.common.base.Supplier<ListTopUtilizedResourcesRequest.Builder>() {
                    @Override
                    public ListTopUtilizedResourcesRequest.Builder get() {
                        return ListTopUtilizedResourcesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTopUtilizedResourcesResponse, String>() {
                    @Override
                    public String apply(ListTopUtilizedResourcesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTopUtilizedResourcesRequest.Builder>,
                        ListTopUtilizedResourcesRequest>() {
                    @Override
                    public ListTopUtilizedResourcesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTopUtilizedResourcesRequest.Builder>
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
                        ListTopUtilizedResourcesRequest, ListTopUtilizedResourcesResponse>() {
                    @Override
                    public ListTopUtilizedResourcesResponse apply(
                            ListTopUtilizedResourcesRequest request) {
                        return client.listTopUtilizedResources(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTopUtilizedResourcesResponse,
                        java.util.List<
                                com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.licensemanager.model.TopUtilizedResourceSummary>
                            apply(ListTopUtilizedResourcesResponse response) {
                        return response.getTopUtilizedResourceCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer;

import com.oracle.bmc.computecloudatcustomer.requests.*;
import com.oracle.bmc.computecloudatcustomer.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ComputeCloudAtCustomer where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class ComputeCloudAtCustomerPaginators {
    private final ComputeCloudAtCustomer client;

    public ComputeCloudAtCustomerPaginators(ComputeCloudAtCustomer client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCccInfrastructures operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCccInfrastructuresResponse> listCccInfrastructuresResponseIterator(
            final ListCccInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCccInfrastructuresRequest.Builder, ListCccInfrastructuresRequest,
                ListCccInfrastructuresResponse>(
                new java.util.function.Supplier<ListCccInfrastructuresRequest.Builder>() {
                    @Override
                    public ListCccInfrastructuresRequest.Builder get() {
                        return ListCccInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCccInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListCccInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCccInfrastructuresRequest.Builder>,
                        ListCccInfrastructuresRequest>() {
                    @Override
                    public ListCccInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCccInfrastructuresRequest.Builder>
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
                        ListCccInfrastructuresRequest, ListCccInfrastructuresResponse>() {
                    @Override
                    public ListCccInfrastructuresResponse apply(
                            ListCccInfrastructuresRequest request) {
                        return client.listCccInfrastructures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.computecloudatcustomer.model.CccInfrastructureSummary} objects
     * contained in responses from the listCccInfrastructures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.computecloudatcustomer.model.CccInfrastructureSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.computecloudatcustomer.model.CccInfrastructureSummary>
            listCccInfrastructuresRecordIterator(final ListCccInfrastructuresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCccInfrastructuresRequest.Builder, ListCccInfrastructuresRequest,
                ListCccInfrastructuresResponse,
                com.oracle.bmc.computecloudatcustomer.model.CccInfrastructureSummary>(
                new java.util.function.Supplier<ListCccInfrastructuresRequest.Builder>() {
                    @Override
                    public ListCccInfrastructuresRequest.Builder get() {
                        return ListCccInfrastructuresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCccInfrastructuresResponse, String>() {
                    @Override
                    public String apply(ListCccInfrastructuresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCccInfrastructuresRequest.Builder>,
                        ListCccInfrastructuresRequest>() {
                    @Override
                    public ListCccInfrastructuresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCccInfrastructuresRequest.Builder>
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
                        ListCccInfrastructuresRequest, ListCccInfrastructuresResponse>() {
                    @Override
                    public ListCccInfrastructuresResponse apply(
                            ListCccInfrastructuresRequest request) {
                        return client.listCccInfrastructures(request);
                    }
                },
                new java.util.function.Function<
                        ListCccInfrastructuresResponse,
                        java.util.List<
                                com.oracle.bmc.computecloudatcustomer.model
                                        .CccInfrastructureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.computecloudatcustomer.model
                                            .CccInfrastructureSummary>
                            apply(ListCccInfrastructuresResponse response) {
                        return response.getCccInfrastructureCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCccUpgradeSchedules operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCccUpgradeSchedulesResponse> listCccUpgradeSchedulesResponseIterator(
            final ListCccUpgradeSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCccUpgradeSchedulesRequest.Builder, ListCccUpgradeSchedulesRequest,
                ListCccUpgradeSchedulesResponse>(
                new java.util.function.Supplier<ListCccUpgradeSchedulesRequest.Builder>() {
                    @Override
                    public ListCccUpgradeSchedulesRequest.Builder get() {
                        return ListCccUpgradeSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCccUpgradeSchedulesResponse, String>() {
                    @Override
                    public String apply(ListCccUpgradeSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCccUpgradeSchedulesRequest.Builder>,
                        ListCccUpgradeSchedulesRequest>() {
                    @Override
                    public ListCccUpgradeSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCccUpgradeSchedulesRequest.Builder>
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
                        ListCccUpgradeSchedulesRequest, ListCccUpgradeSchedulesResponse>() {
                    @Override
                    public ListCccUpgradeSchedulesResponse apply(
                            ListCccUpgradeSchedulesRequest request) {
                        return client.listCccUpgradeSchedules(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.computecloudatcustomer.model.CccUpgradeScheduleSummary} objects
     * contained in responses from the listCccUpgradeSchedules operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.computecloudatcustomer.model.CccUpgradeScheduleSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.computecloudatcustomer.model.CccUpgradeScheduleSummary>
            listCccUpgradeSchedulesRecordIterator(final ListCccUpgradeSchedulesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCccUpgradeSchedulesRequest.Builder, ListCccUpgradeSchedulesRequest,
                ListCccUpgradeSchedulesResponse,
                com.oracle.bmc.computecloudatcustomer.model.CccUpgradeScheduleSummary>(
                new java.util.function.Supplier<ListCccUpgradeSchedulesRequest.Builder>() {
                    @Override
                    public ListCccUpgradeSchedulesRequest.Builder get() {
                        return ListCccUpgradeSchedulesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCccUpgradeSchedulesResponse, String>() {
                    @Override
                    public String apply(ListCccUpgradeSchedulesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCccUpgradeSchedulesRequest.Builder>,
                        ListCccUpgradeSchedulesRequest>() {
                    @Override
                    public ListCccUpgradeSchedulesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCccUpgradeSchedulesRequest.Builder>
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
                        ListCccUpgradeSchedulesRequest, ListCccUpgradeSchedulesResponse>() {
                    @Override
                    public ListCccUpgradeSchedulesResponse apply(
                            ListCccUpgradeSchedulesRequest request) {
                        return client.listCccUpgradeSchedules(request);
                    }
                },
                new java.util.function.Function<
                        ListCccUpgradeSchedulesResponse,
                        java.util.List<
                                com.oracle.bmc.computecloudatcustomer.model
                                        .CccUpgradeScheduleSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.computecloudatcustomer.model
                                            .CccUpgradeScheduleSummary>
                            apply(ListCccUpgradeSchedulesResponse response) {
                        return response.getCccUpgradeScheduleCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DataIntegration where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.RequiredArgsConstructor
public class DataIntegrationPaginators {
    private final DataIntegration client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listApplications operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new com.google.common.base.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ApplicationSummary} objects
     * contained in responses from the listApplications operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ApplicationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse,
                com.oracle.bmc.dataintegration.model.ApplicationSummary>(
                new com.google.common.base.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new com.google.common.base.Function<
                        ListApplicationsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.ApplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.ApplicationSummary>
                            apply(ListApplicationsResponse response) {
                        return response.getApplicationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnectionValidations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConnectionValidationsResponse> listConnectionValidationsResponseIterator(
            final ListConnectionValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionValidationsRequest.Builder, ListConnectionValidationsRequest,
                ListConnectionValidationsResponse>(
                new com.google.common.base.Supplier<ListConnectionValidationsRequest.Builder>() {
                    @Override
                    public ListConnectionValidationsRequest.Builder get() {
                        return ListConnectionValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionValidationsResponse, String>() {
                    @Override
                    public String apply(ListConnectionValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionValidationsRequest.Builder>,
                        ListConnectionValidationsRequest>() {
                    @Override
                    public ListConnectionValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionValidationsRequest.Builder>
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
                        ListConnectionValidationsRequest, ListConnectionValidationsResponse>() {
                    @Override
                    public ListConnectionValidationsResponse apply(
                            ListConnectionValidationsRequest request) {
                        return client.listConnectionValidations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ConnectionValidationSummary} objects
     * contained in responses from the listConnectionValidations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ConnectionValidationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ConnectionValidationSummary>
            listConnectionValidationsRecordIterator(
                    final ListConnectionValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionValidationsRequest.Builder, ListConnectionValidationsRequest,
                ListConnectionValidationsResponse,
                com.oracle.bmc.dataintegration.model.ConnectionValidationSummary>(
                new com.google.common.base.Supplier<ListConnectionValidationsRequest.Builder>() {
                    @Override
                    public ListConnectionValidationsRequest.Builder get() {
                        return ListConnectionValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionValidationsResponse, String>() {
                    @Override
                    public String apply(ListConnectionValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionValidationsRequest.Builder>,
                        ListConnectionValidationsRequest>() {
                    @Override
                    public ListConnectionValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionValidationsRequest.Builder>
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
                        ListConnectionValidationsRequest, ListConnectionValidationsResponse>() {
                    @Override
                    public ListConnectionValidationsResponse apply(
                            ListConnectionValidationsRequest request) {
                        return client.listConnectionValidations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListConnectionValidationsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model
                                        .ConnectionValidationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model
                                            .ConnectionValidationSummary>
                            apply(ListConnectionValidationsResponse response) {
                        return response.getConnectionValidationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listConnections operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListConnectionsResponse> listConnectionsResponseIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse>(
                new com.google.common.base.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                        ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ConnectionSummary} objects
     * contained in responses from the listConnections operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ConnectionSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse,
                com.oracle.bmc.dataintegration.model.ConnectionSummary>(
                new com.google.common.base.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                        ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                },
                new com.google.common.base.Function<
                        ListConnectionsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.ConnectionSummary>
                            apply(ListConnectionsResponse response) {
                        return response.getConnectionSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataAssets operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataAssetsResponse> listDataAssetsResponseIterator(
            final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse>(
                new com.google.common.base.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                        ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.DataAssetSummary} objects
     * contained in responses from the listDataAssets operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.DataAssetSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.DataAssetSummary>
            listDataAssetsRecordIterator(final ListDataAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataAssetsRequest.Builder, ListDataAssetsRequest, ListDataAssetsResponse,
                com.oracle.bmc.dataintegration.model.DataAssetSummary>(
                new com.google.common.base.Supplier<ListDataAssetsRequest.Builder>() {
                    @Override
                    public ListDataAssetsRequest.Builder get() {
                        return ListDataAssetsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataAssetsResponse, String>() {
                    @Override
                    public String apply(ListDataAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataAssetsRequest.Builder>,
                        ListDataAssetsRequest>() {
                    @Override
                    public ListDataAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataAssetsRequest.Builder>
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
                        ListDataAssetsRequest, ListDataAssetsResponse>() {
                    @Override
                    public ListDataAssetsResponse apply(ListDataAssetsRequest request) {
                        return client.listDataAssets(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataAssetsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.DataAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.DataAssetSummary>
                            apply(ListDataAssetsResponse response) {
                        return response.getDataAssetSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataEntities operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataEntitiesResponse> listDataEntitiesResponseIterator(
            final ListDataEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataEntitiesRequest.Builder, ListDataEntitiesRequest, ListDataEntitiesResponse>(
                new com.google.common.base.Supplier<ListDataEntitiesRequest.Builder>() {
                    @Override
                    public ListDataEntitiesRequest.Builder get() {
                        return ListDataEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataEntitiesResponse, String>() {
                    @Override
                    public String apply(ListDataEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataEntitiesRequest.Builder>,
                        ListDataEntitiesRequest>() {
                    @Override
                    public ListDataEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataEntitiesRequest.Builder>
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
                        ListDataEntitiesRequest, ListDataEntitiesResponse>() {
                    @Override
                    public ListDataEntitiesResponse apply(ListDataEntitiesRequest request) {
                        return client.listDataEntities(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.DataEntitySummary} objects
     * contained in responses from the listDataEntities operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.DataEntitySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.DataEntitySummary>
            listDataEntitiesRecordIterator(final ListDataEntitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataEntitiesRequest.Builder, ListDataEntitiesRequest, ListDataEntitiesResponse,
                com.oracle.bmc.dataintegration.model.DataEntitySummary>(
                new com.google.common.base.Supplier<ListDataEntitiesRequest.Builder>() {
                    @Override
                    public ListDataEntitiesRequest.Builder get() {
                        return ListDataEntitiesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataEntitiesResponse, String>() {
                    @Override
                    public String apply(ListDataEntitiesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataEntitiesRequest.Builder>,
                        ListDataEntitiesRequest>() {
                    @Override
                    public ListDataEntitiesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataEntitiesRequest.Builder>
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
                        ListDataEntitiesRequest, ListDataEntitiesResponse>() {
                    @Override
                    public ListDataEntitiesResponse apply(ListDataEntitiesRequest request) {
                        return client.listDataEntities(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataEntitiesResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.DataEntitySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.DataEntitySummary>
                            apply(ListDataEntitiesResponse response) {
                        return response.getDataEntitySummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataFlowValidations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataFlowValidationsResponse> listDataFlowValidationsResponseIterator(
            final ListDataFlowValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataFlowValidationsRequest.Builder, ListDataFlowValidationsRequest,
                ListDataFlowValidationsResponse>(
                new com.google.common.base.Supplier<ListDataFlowValidationsRequest.Builder>() {
                    @Override
                    public ListDataFlowValidationsRequest.Builder get() {
                        return ListDataFlowValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataFlowValidationsResponse, String>() {
                    @Override
                    public String apply(ListDataFlowValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataFlowValidationsRequest.Builder>,
                        ListDataFlowValidationsRequest>() {
                    @Override
                    public ListDataFlowValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataFlowValidationsRequest.Builder>
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
                        ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>() {
                    @Override
                    public ListDataFlowValidationsResponse apply(
                            ListDataFlowValidationsRequest request) {
                        return client.listDataFlowValidations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.DataFlowValidationSummary} objects
     * contained in responses from the listDataFlowValidations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.DataFlowValidationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.DataFlowValidationSummary>
            listDataFlowValidationsRecordIterator(final ListDataFlowValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataFlowValidationsRequest.Builder, ListDataFlowValidationsRequest,
                ListDataFlowValidationsResponse,
                com.oracle.bmc.dataintegration.model.DataFlowValidationSummary>(
                new com.google.common.base.Supplier<ListDataFlowValidationsRequest.Builder>() {
                    @Override
                    public ListDataFlowValidationsRequest.Builder get() {
                        return ListDataFlowValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataFlowValidationsResponse, String>() {
                    @Override
                    public String apply(ListDataFlowValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataFlowValidationsRequest.Builder>,
                        ListDataFlowValidationsRequest>() {
                    @Override
                    public ListDataFlowValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataFlowValidationsRequest.Builder>
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
                        ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>() {
                    @Override
                    public ListDataFlowValidationsResponse apply(
                            ListDataFlowValidationsRequest request) {
                        return client.listDataFlowValidations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataFlowValidationsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model.DataFlowValidationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model.DataFlowValidationSummary>
                            apply(ListDataFlowValidationsResponse response) {
                        return response.getDataFlowValidationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDataFlows operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDataFlowsResponse> listDataFlowsResponseIterator(
            final ListDataFlowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDataFlowsRequest.Builder, ListDataFlowsRequest, ListDataFlowsResponse>(
                new com.google.common.base.Supplier<ListDataFlowsRequest.Builder>() {
                    @Override
                    public ListDataFlowsRequest.Builder get() {
                        return ListDataFlowsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataFlowsResponse, String>() {
                    @Override
                    public String apply(ListDataFlowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataFlowsRequest.Builder>,
                        ListDataFlowsRequest>() {
                    @Override
                    public ListDataFlowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataFlowsRequest.Builder>
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
                new com.google.common.base.Function<ListDataFlowsRequest, ListDataFlowsResponse>() {
                    @Override
                    public ListDataFlowsResponse apply(ListDataFlowsRequest request) {
                        return client.listDataFlows(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.DataFlowSummary} objects
     * contained in responses from the listDataFlows operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.DataFlowSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.DataFlowSummary>
            listDataFlowsRecordIterator(final ListDataFlowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDataFlowsRequest.Builder, ListDataFlowsRequest, ListDataFlowsResponse,
                com.oracle.bmc.dataintegration.model.DataFlowSummary>(
                new com.google.common.base.Supplier<ListDataFlowsRequest.Builder>() {
                    @Override
                    public ListDataFlowsRequest.Builder get() {
                        return ListDataFlowsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDataFlowsResponse, String>() {
                    @Override
                    public String apply(ListDataFlowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDataFlowsRequest.Builder>,
                        ListDataFlowsRequest>() {
                    @Override
                    public ListDataFlowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDataFlowsRequest.Builder>
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
                new com.google.common.base.Function<ListDataFlowsRequest, ListDataFlowsResponse>() {
                    @Override
                    public ListDataFlowsResponse apply(ListDataFlowsRequest request) {
                        return client.listDataFlows(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDataFlowsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.DataFlowSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.DataFlowSummary>
                            apply(ListDataFlowsResponse response) {
                        return response.getDataFlowSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDependentObjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDependentObjectsResponse> listDependentObjectsResponseIterator(
            final ListDependentObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDependentObjectsRequest.Builder, ListDependentObjectsRequest,
                ListDependentObjectsResponse>(
                new com.google.common.base.Supplier<ListDependentObjectsRequest.Builder>() {
                    @Override
                    public ListDependentObjectsRequest.Builder get() {
                        return ListDependentObjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDependentObjectsResponse, String>() {
                    @Override
                    public String apply(ListDependentObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDependentObjectsRequest.Builder>,
                        ListDependentObjectsRequest>() {
                    @Override
                    public ListDependentObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDependentObjectsRequest.Builder>
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
                        ListDependentObjectsRequest, ListDependentObjectsResponse>() {
                    @Override
                    public ListDependentObjectsResponse apply(ListDependentObjectsRequest request) {
                        return client.listDependentObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.DependentObjectSummary} objects
     * contained in responses from the listDependentObjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.DependentObjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.DependentObjectSummary>
            listDependentObjectsRecordIterator(final ListDependentObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDependentObjectsRequest.Builder, ListDependentObjectsRequest,
                ListDependentObjectsResponse,
                com.oracle.bmc.dataintegration.model.DependentObjectSummary>(
                new com.google.common.base.Supplier<ListDependentObjectsRequest.Builder>() {
                    @Override
                    public ListDependentObjectsRequest.Builder get() {
                        return ListDependentObjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListDependentObjectsResponse, String>() {
                    @Override
                    public String apply(ListDependentObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDependentObjectsRequest.Builder>,
                        ListDependentObjectsRequest>() {
                    @Override
                    public ListDependentObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDependentObjectsRequest.Builder>
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
                        ListDependentObjectsRequest, ListDependentObjectsResponse>() {
                    @Override
                    public ListDependentObjectsResponse apply(ListDependentObjectsRequest request) {
                        return client.listDependentObjects(request);
                    }
                },
                new com.google.common.base.Function<
                        ListDependentObjectsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model.DependentObjectSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model.DependentObjectSummary>
                            apply(ListDependentObjectsResponse response) {
                        return response.getDependentObjectSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExternalPublicationValidations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExternalPublicationValidationsResponse>
            listExternalPublicationValidationsResponseIterator(
                    final ListExternalPublicationValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalPublicationValidationsRequest.Builder,
                ListExternalPublicationValidationsRequest,
                ListExternalPublicationValidationsResponse>(
                new com.google.common.base.Supplier<
                        ListExternalPublicationValidationsRequest.Builder>() {
                    @Override
                    public ListExternalPublicationValidationsRequest.Builder get() {
                        return ListExternalPublicationValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListExternalPublicationValidationsResponse, String>() {
                    @Override
                    public String apply(ListExternalPublicationValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPublicationValidationsRequest.Builder>,
                        ListExternalPublicationValidationsRequest>() {
                    @Override
                    public ListExternalPublicationValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPublicationValidationsRequest.Builder>
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
                        ListExternalPublicationValidationsRequest,
                        ListExternalPublicationValidationsResponse>() {
                    @Override
                    public ListExternalPublicationValidationsResponse apply(
                            ListExternalPublicationValidationsRequest request) {
                        return client.listExternalPublicationValidations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ExternalPublicationValidationSummary} objects
     * contained in responses from the listExternalPublicationValidations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ExternalPublicationValidationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ExternalPublicationValidationSummary>
            listExternalPublicationValidationsRecordIterator(
                    final ListExternalPublicationValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalPublicationValidationsRequest.Builder,
                ListExternalPublicationValidationsRequest,
                ListExternalPublicationValidationsResponse,
                com.oracle.bmc.dataintegration.model.ExternalPublicationValidationSummary>(
                new com.google.common.base.Supplier<
                        ListExternalPublicationValidationsRequest.Builder>() {
                    @Override
                    public ListExternalPublicationValidationsRequest.Builder get() {
                        return ListExternalPublicationValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListExternalPublicationValidationsResponse, String>() {
                    @Override
                    public String apply(ListExternalPublicationValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPublicationValidationsRequest.Builder>,
                        ListExternalPublicationValidationsRequest>() {
                    @Override
                    public ListExternalPublicationValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPublicationValidationsRequest.Builder>
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
                        ListExternalPublicationValidationsRequest,
                        ListExternalPublicationValidationsResponse>() {
                    @Override
                    public ListExternalPublicationValidationsResponse apply(
                            ListExternalPublicationValidationsRequest request) {
                        return client.listExternalPublicationValidations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListExternalPublicationValidationsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model
                                        .ExternalPublicationValidationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model
                                            .ExternalPublicationValidationSummary>
                            apply(ListExternalPublicationValidationsResponse response) {
                        return response.getExternalPublicationValidationSummaryCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listExternalPublications operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListExternalPublicationsResponse> listExternalPublicationsResponseIterator(
            final ListExternalPublicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListExternalPublicationsRequest.Builder, ListExternalPublicationsRequest,
                ListExternalPublicationsResponse>(
                new com.google.common.base.Supplier<ListExternalPublicationsRequest.Builder>() {
                    @Override
                    public ListExternalPublicationsRequest.Builder get() {
                        return ListExternalPublicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExternalPublicationsResponse, String>() {
                    @Override
                    public String apply(ListExternalPublicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPublicationsRequest.Builder>,
                        ListExternalPublicationsRequest>() {
                    @Override
                    public ListExternalPublicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPublicationsRequest.Builder>
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
                        ListExternalPublicationsRequest, ListExternalPublicationsResponse>() {
                    @Override
                    public ListExternalPublicationsResponse apply(
                            ListExternalPublicationsRequest request) {
                        return client.listExternalPublications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ExternalPublicationSummary} objects
     * contained in responses from the listExternalPublications operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ExternalPublicationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ExternalPublicationSummary>
            listExternalPublicationsRecordIterator(final ListExternalPublicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListExternalPublicationsRequest.Builder, ListExternalPublicationsRequest,
                ListExternalPublicationsResponse,
                com.oracle.bmc.dataintegration.model.ExternalPublicationSummary>(
                new com.google.common.base.Supplier<ListExternalPublicationsRequest.Builder>() {
                    @Override
                    public ListExternalPublicationsRequest.Builder get() {
                        return ListExternalPublicationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListExternalPublicationsResponse, String>() {
                    @Override
                    public String apply(ListExternalPublicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListExternalPublicationsRequest.Builder>,
                        ListExternalPublicationsRequest>() {
                    @Override
                    public ListExternalPublicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListExternalPublicationsRequest.Builder>
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
                        ListExternalPublicationsRequest, ListExternalPublicationsResponse>() {
                    @Override
                    public ListExternalPublicationsResponse apply(
                            ListExternalPublicationsRequest request) {
                        return client.listExternalPublications(request);
                    }
                },
                new com.google.common.base.Function<
                        ListExternalPublicationsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model
                                        .ExternalPublicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model.ExternalPublicationSummary>
                            apply(ListExternalPublicationsResponse response) {
                        return response.getExternalPublicationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listFolders operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListFoldersResponse> listFoldersResponseIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse>(
                new com.google.common.base.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
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
                new com.google.common.base.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.FolderSummary} objects
     * contained in responses from the listFolders operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.FolderSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.FolderSummary> listFoldersRecordIterator(
            final ListFoldersRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListFoldersRequest.Builder, ListFoldersRequest, ListFoldersResponse,
                com.oracle.bmc.dataintegration.model.FolderSummary>(
                new com.google.common.base.Supplier<ListFoldersRequest.Builder>() {
                    @Override
                    public ListFoldersRequest.Builder get() {
                        return ListFoldersRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListFoldersResponse, String>() {
                    @Override
                    public String apply(ListFoldersResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListFoldersRequest.Builder>,
                        ListFoldersRequest>() {
                    @Override
                    public ListFoldersRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListFoldersRequest.Builder>
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
                new com.google.common.base.Function<ListFoldersRequest, ListFoldersResponse>() {
                    @Override
                    public ListFoldersResponse apply(ListFoldersRequest request) {
                        return client.listFolders(request);
                    }
                },
                new com.google.common.base.Function<
                        ListFoldersResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.FolderSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.FolderSummary> apply(
                            ListFoldersResponse response) {
                        return response.getFolderSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatchChanges operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPatchChangesResponse> listPatchChangesResponseIterator(
            final ListPatchChangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatchChangesRequest.Builder, ListPatchChangesRequest, ListPatchChangesResponse>(
                new com.google.common.base.Supplier<ListPatchChangesRequest.Builder>() {
                    @Override
                    public ListPatchChangesRequest.Builder get() {
                        return ListPatchChangesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPatchChangesResponse, String>() {
                    @Override
                    public String apply(ListPatchChangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchChangesRequest.Builder>,
                        ListPatchChangesRequest>() {
                    @Override
                    public ListPatchChangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchChangesRequest.Builder>
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
                        ListPatchChangesRequest, ListPatchChangesResponse>() {
                    @Override
                    public ListPatchChangesResponse apply(ListPatchChangesRequest request) {
                        return client.listPatchChanges(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.PatchChangeSummary} objects
     * contained in responses from the listPatchChanges operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.PatchChangeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.PatchChangeSummary>
            listPatchChangesRecordIterator(final ListPatchChangesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatchChangesRequest.Builder, ListPatchChangesRequest, ListPatchChangesResponse,
                com.oracle.bmc.dataintegration.model.PatchChangeSummary>(
                new com.google.common.base.Supplier<ListPatchChangesRequest.Builder>() {
                    @Override
                    public ListPatchChangesRequest.Builder get() {
                        return ListPatchChangesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPatchChangesResponse, String>() {
                    @Override
                    public String apply(ListPatchChangesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchChangesRequest.Builder>,
                        ListPatchChangesRequest>() {
                    @Override
                    public ListPatchChangesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchChangesRequest.Builder>
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
                        ListPatchChangesRequest, ListPatchChangesResponse>() {
                    @Override
                    public ListPatchChangesResponse apply(ListPatchChangesRequest request) {
                        return client.listPatchChanges(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPatchChangesResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.PatchChangeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.PatchChangeSummary>
                            apply(ListPatchChangesResponse response) {
                        return response.getPatchChangeSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPatches operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPatchesResponse> listPatchesResponseIterator(
            final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPatchesRequest.Builder, ListPatchesRequest, ListPatchesResponse>(
                new com.google.common.base.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new com.google.common.base.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.PatchSummary} objects
     * contained in responses from the listPatches operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.PatchSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.PatchSummary> listPatchesRecordIterator(
            final ListPatchesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPatchesRequest.Builder, ListPatchesRequest, ListPatchesResponse,
                com.oracle.bmc.dataintegration.model.PatchSummary>(
                new com.google.common.base.Supplier<ListPatchesRequest.Builder>() {
                    @Override
                    public ListPatchesRequest.Builder get() {
                        return ListPatchesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPatchesResponse, String>() {
                    @Override
                    public String apply(ListPatchesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPatchesRequest.Builder>,
                        ListPatchesRequest>() {
                    @Override
                    public ListPatchesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPatchesRequest.Builder>
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
                new com.google.common.base.Function<ListPatchesRequest, ListPatchesResponse>() {
                    @Override
                    public ListPatchesResponse apply(ListPatchesRequest request) {
                        return client.listPatches(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPatchesResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.PatchSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.PatchSummary> apply(
                            ListPatchesResponse response) {
                        return response.getPatchSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listProjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListProjectsResponse> listProjectsResponseIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListProjectsRequest.Builder, ListProjectsRequest, ListProjectsResponse>(
                new com.google.common.base.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
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
                new com.google.common.base.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ProjectSummary} objects
     * contained in responses from the listProjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ProjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ProjectSummary> listProjectsRecordIterator(
            final ListProjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListProjectsRequest.Builder, ListProjectsRequest, ListProjectsResponse,
                com.oracle.bmc.dataintegration.model.ProjectSummary>(
                new com.google.common.base.Supplier<ListProjectsRequest.Builder>() {
                    @Override
                    public ListProjectsRequest.Builder get() {
                        return ListProjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListProjectsResponse, String>() {
                    @Override
                    public String apply(ListProjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListProjectsRequest.Builder>,
                        ListProjectsRequest>() {
                    @Override
                    public ListProjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListProjectsRequest.Builder>
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
                new com.google.common.base.Function<ListProjectsRequest, ListProjectsResponse>() {
                    @Override
                    public ListProjectsResponse apply(ListProjectsRequest request) {
                        return client.listProjects(request);
                    }
                },
                new com.google.common.base.Function<
                        ListProjectsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.ProjectSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.ProjectSummary>
                            apply(ListProjectsResponse response) {
                        return response.getProjectSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listPublishedObjects operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListPublishedObjectsResponse> listPublishedObjectsResponseIterator(
            final ListPublishedObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPublishedObjectsRequest.Builder, ListPublishedObjectsRequest,
                ListPublishedObjectsResponse>(
                new com.google.common.base.Supplier<ListPublishedObjectsRequest.Builder>() {
                    @Override
                    public ListPublishedObjectsRequest.Builder get() {
                        return ListPublishedObjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublishedObjectsResponse, String>() {
                    @Override
                    public String apply(ListPublishedObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishedObjectsRequest.Builder>,
                        ListPublishedObjectsRequest>() {
                    @Override
                    public ListPublishedObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishedObjectsRequest.Builder>
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
                        ListPublishedObjectsRequest, ListPublishedObjectsResponse>() {
                    @Override
                    public ListPublishedObjectsResponse apply(ListPublishedObjectsRequest request) {
                        return client.listPublishedObjects(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.PublishedObjectSummary} objects
     * contained in responses from the listPublishedObjects operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.PublishedObjectSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.PublishedObjectSummary>
            listPublishedObjectsRecordIterator(final ListPublishedObjectsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPublishedObjectsRequest.Builder, ListPublishedObjectsRequest,
                ListPublishedObjectsResponse,
                com.oracle.bmc.dataintegration.model.PublishedObjectSummary>(
                new com.google.common.base.Supplier<ListPublishedObjectsRequest.Builder>() {
                    @Override
                    public ListPublishedObjectsRequest.Builder get() {
                        return ListPublishedObjectsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListPublishedObjectsResponse, String>() {
                    @Override
                    public String apply(ListPublishedObjectsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPublishedObjectsRequest.Builder>,
                        ListPublishedObjectsRequest>() {
                    @Override
                    public ListPublishedObjectsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPublishedObjectsRequest.Builder>
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
                        ListPublishedObjectsRequest, ListPublishedObjectsResponse>() {
                    @Override
                    public ListPublishedObjectsResponse apply(ListPublishedObjectsRequest request) {
                        return client.listPublishedObjects(request);
                    }
                },
                new com.google.common.base.Function<
                        ListPublishedObjectsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model.PublishedObjectSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model.PublishedObjectSummary>
                            apply(ListPublishedObjectsResponse response) {
                        return response.getPublishedObjectSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listReferences operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListReferencesResponse> listReferencesResponseIterator(
            final ListReferencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListReferencesRequest.Builder, ListReferencesRequest, ListReferencesResponse>(
                new com.google.common.base.Supplier<ListReferencesRequest.Builder>() {
                    @Override
                    public ListReferencesRequest.Builder get() {
                        return ListReferencesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReferencesResponse, String>() {
                    @Override
                    public String apply(ListReferencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReferencesRequest.Builder>,
                        ListReferencesRequest>() {
                    @Override
                    public ListReferencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReferencesRequest.Builder>
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
                        ListReferencesRequest, ListReferencesResponse>() {
                    @Override
                    public ListReferencesResponse apply(ListReferencesRequest request) {
                        return client.listReferences(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.ReferenceSummary} objects
     * contained in responses from the listReferences operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.ReferenceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.ReferenceSummary>
            listReferencesRecordIterator(final ListReferencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListReferencesRequest.Builder, ListReferencesRequest, ListReferencesResponse,
                com.oracle.bmc.dataintegration.model.ReferenceSummary>(
                new com.google.common.base.Supplier<ListReferencesRequest.Builder>() {
                    @Override
                    public ListReferencesRequest.Builder get() {
                        return ListReferencesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListReferencesResponse, String>() {
                    @Override
                    public String apply(ListReferencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListReferencesRequest.Builder>,
                        ListReferencesRequest>() {
                    @Override
                    public ListReferencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListReferencesRequest.Builder>
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
                        ListReferencesRequest, ListReferencesResponse>() {
                    @Override
                    public ListReferencesResponse apply(ListReferencesRequest request) {
                        return client.listReferences(request);
                    }
                },
                new com.google.common.base.Function<
                        ListReferencesResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.ReferenceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.ReferenceSummary>
                            apply(ListReferencesResponse response) {
                        return response.getReferenceSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSchemas operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListSchemasResponse> listSchemasResponseIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse>(
                new com.google.common.base.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new com.google.common.base.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.SchemaSummary} objects
     * contained in responses from the listSchemas operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.SchemaSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.SchemaSummary> listSchemasRecordIterator(
            final ListSchemasRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSchemasRequest.Builder, ListSchemasRequest, ListSchemasResponse,
                com.oracle.bmc.dataintegration.model.SchemaSummary>(
                new com.google.common.base.Supplier<ListSchemasRequest.Builder>() {
                    @Override
                    public ListSchemasRequest.Builder get() {
                        return ListSchemasRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListSchemasResponse, String>() {
                    @Override
                    public String apply(ListSchemasResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSchemasRequest.Builder>,
                        ListSchemasRequest>() {
                    @Override
                    public ListSchemasRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSchemasRequest.Builder>
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
                new com.google.common.base.Function<ListSchemasRequest, ListSchemasResponse>() {
                    @Override
                    public ListSchemasResponse apply(ListSchemasRequest request) {
                        return client.listSchemas(request);
                    }
                },
                new com.google.common.base.Function<
                        ListSchemasResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.SchemaSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.SchemaSummary> apply(
                            ListSchemasResponse response) {
                        return response.getSchemaSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaskRunLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaskRunLogsResponse> listTaskRunLogsResponseIterator(
            final ListTaskRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaskRunLogsRequest.Builder, ListTaskRunLogsRequest, ListTaskRunLogsResponse>(
                new com.google.common.base.Supplier<ListTaskRunLogsRequest.Builder>() {
                    @Override
                    public ListTaskRunLogsRequest.Builder get() {
                        return ListTaskRunLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskRunLogsResponse, String>() {
                    @Override
                    public String apply(ListTaskRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRunLogsRequest.Builder>,
                        ListTaskRunLogsRequest>() {
                    @Override
                    public ListTaskRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRunLogsRequest.Builder>
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
                        ListTaskRunLogsRequest, ListTaskRunLogsResponse>() {
                    @Override
                    public ListTaskRunLogsResponse apply(ListTaskRunLogsRequest request) {
                        return client.listTaskRunLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.TaskRunLogSummary} objects
     * contained in responses from the listTaskRunLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.TaskRunLogSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.TaskRunLogSummary>
            listTaskRunLogsRecordIterator(final ListTaskRunLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaskRunLogsRequest.Builder, ListTaskRunLogsRequest, ListTaskRunLogsResponse,
                com.oracle.bmc.dataintegration.model.TaskRunLogSummary>(
                new com.google.common.base.Supplier<ListTaskRunLogsRequest.Builder>() {
                    @Override
                    public ListTaskRunLogsRequest.Builder get() {
                        return ListTaskRunLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskRunLogsResponse, String>() {
                    @Override
                    public String apply(ListTaskRunLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRunLogsRequest.Builder>,
                        ListTaskRunLogsRequest>() {
                    @Override
                    public ListTaskRunLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRunLogsRequest.Builder>
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
                        ListTaskRunLogsRequest, ListTaskRunLogsResponse>() {
                    @Override
                    public ListTaskRunLogsResponse apply(ListTaskRunLogsRequest request) {
                        return client.listTaskRunLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaskRunLogsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.TaskRunLogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.TaskRunLogSummary>
                            apply(ListTaskRunLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaskRuns operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaskRunsResponse> listTaskRunsResponseIterator(
            final ListTaskRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaskRunsRequest.Builder, ListTaskRunsRequest, ListTaskRunsResponse>(
                new com.google.common.base.Supplier<ListTaskRunsRequest.Builder>() {
                    @Override
                    public ListTaskRunsRequest.Builder get() {
                        return ListTaskRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskRunsResponse, String>() {
                    @Override
                    public String apply(ListTaskRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRunsRequest.Builder>,
                        ListTaskRunsRequest>() {
                    @Override
                    public ListTaskRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRunsRequest.Builder>
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
                new com.google.common.base.Function<ListTaskRunsRequest, ListTaskRunsResponse>() {
                    @Override
                    public ListTaskRunsResponse apply(ListTaskRunsRequest request) {
                        return client.listTaskRuns(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.TaskRunSummary} objects
     * contained in responses from the listTaskRuns operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.TaskRunSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.TaskRunSummary> listTaskRunsRecordIterator(
            final ListTaskRunsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaskRunsRequest.Builder, ListTaskRunsRequest, ListTaskRunsResponse,
                com.oracle.bmc.dataintegration.model.TaskRunSummary>(
                new com.google.common.base.Supplier<ListTaskRunsRequest.Builder>() {
                    @Override
                    public ListTaskRunsRequest.Builder get() {
                        return ListTaskRunsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskRunsResponse, String>() {
                    @Override
                    public String apply(ListTaskRunsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskRunsRequest.Builder>,
                        ListTaskRunsRequest>() {
                    @Override
                    public ListTaskRunsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskRunsRequest.Builder>
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
                new com.google.common.base.Function<ListTaskRunsRequest, ListTaskRunsResponse>() {
                    @Override
                    public ListTaskRunsResponse apply(ListTaskRunsRequest request) {
                        return client.listTaskRuns(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaskRunsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.TaskRunSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.TaskRunSummary>
                            apply(ListTaskRunsResponse response) {
                        return response.getTaskRunSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTaskValidations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTaskValidationsResponse> listTaskValidationsResponseIterator(
            final ListTaskValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTaskValidationsRequest.Builder, ListTaskValidationsRequest,
                ListTaskValidationsResponse>(
                new com.google.common.base.Supplier<ListTaskValidationsRequest.Builder>() {
                    @Override
                    public ListTaskValidationsRequest.Builder get() {
                        return ListTaskValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskValidationsResponse, String>() {
                    @Override
                    public String apply(ListTaskValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskValidationsRequest.Builder>,
                        ListTaskValidationsRequest>() {
                    @Override
                    public ListTaskValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskValidationsRequest.Builder>
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
                        ListTaskValidationsRequest, ListTaskValidationsResponse>() {
                    @Override
                    public ListTaskValidationsResponse apply(ListTaskValidationsRequest request) {
                        return client.listTaskValidations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.TaskValidationSummary} objects
     * contained in responses from the listTaskValidations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.TaskValidationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.TaskValidationSummary>
            listTaskValidationsRecordIterator(final ListTaskValidationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTaskValidationsRequest.Builder, ListTaskValidationsRequest,
                ListTaskValidationsResponse,
                com.oracle.bmc.dataintegration.model.TaskValidationSummary>(
                new com.google.common.base.Supplier<ListTaskValidationsRequest.Builder>() {
                    @Override
                    public ListTaskValidationsRequest.Builder get() {
                        return ListTaskValidationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTaskValidationsResponse, String>() {
                    @Override
                    public String apply(ListTaskValidationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTaskValidationsRequest.Builder>,
                        ListTaskValidationsRequest>() {
                    @Override
                    public ListTaskValidationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTaskValidationsRequest.Builder>
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
                        ListTaskValidationsRequest, ListTaskValidationsResponse>() {
                    @Override
                    public ListTaskValidationsResponse apply(ListTaskValidationsRequest request) {
                        return client.listTaskValidations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTaskValidationsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model.TaskValidationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.dataintegration.model.TaskValidationSummary>
                            apply(ListTaskValidationsResponse response) {
                        return response.getTaskValidationSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTasks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTasksResponse> listTasksResponseIterator(final ListTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTasksRequest.Builder, ListTasksRequest, ListTasksResponse>(
                new com.google.common.base.Supplier<ListTasksRequest.Builder>() {
                    @Override
                    public ListTasksRequest.Builder get() {
                        return ListTasksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTasksResponse, String>() {
                    @Override
                    public String apply(ListTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTasksRequest.Builder>,
                        ListTasksRequest>() {
                    @Override
                    public ListTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTasksRequest.Builder>
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
                new com.google.common.base.Function<ListTasksRequest, ListTasksResponse>() {
                    @Override
                    public ListTasksResponse apply(ListTasksRequest request) {
                        return client.listTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.TaskSummary} objects
     * contained in responses from the listTasks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.TaskSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.TaskSummary> listTasksRecordIterator(
            final ListTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTasksRequest.Builder, ListTasksRequest, ListTasksResponse,
                com.oracle.bmc.dataintegration.model.TaskSummary>(
                new com.google.common.base.Supplier<ListTasksRequest.Builder>() {
                    @Override
                    public ListTasksRequest.Builder get() {
                        return ListTasksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListTasksResponse, String>() {
                    @Override
                    public String apply(ListTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTasksRequest.Builder>,
                        ListTasksRequest>() {
                    @Override
                    public ListTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTasksRequest.Builder>
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
                new com.google.common.base.Function<ListTasksRequest, ListTasksResponse>() {
                    @Override
                    public ListTasksResponse apply(ListTasksRequest request) {
                        return client.listTasks(request);
                    }
                },
                new com.google.common.base.Function<
                        ListTasksResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.TaskSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.TaskSummary> apply(
                            ListTasksResponse response) {
                        return response.getTaskSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestErrors operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.dataintegration.model.WorkRequestError>(
                new com.google.common.base.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkRequestLogs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.dataintegration.model.WorkRequestLogEntry>(
                new com.google.common.base.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.dataintegration.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.dataintegration.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.dataintegration.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listWorkspaces operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListWorkspacesResponse> listWorkspacesResponseIterator(
            final ListWorkspacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkspacesRequest.Builder, ListWorkspacesRequest, ListWorkspacesResponse>(
                new com.google.common.base.Supplier<ListWorkspacesRequest.Builder>() {
                    @Override
                    public ListWorkspacesRequest.Builder get() {
                        return ListWorkspacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkspacesResponse, String>() {
                    @Override
                    public String apply(ListWorkspacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkspacesRequest.Builder>,
                        ListWorkspacesRequest>() {
                    @Override
                    public ListWorkspacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkspacesRequest.Builder>
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
                        ListWorkspacesRequest, ListWorkspacesResponse>() {
                    @Override
                    public ListWorkspacesResponse apply(ListWorkspacesRequest request) {
                        return client.listWorkspaces(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.dataintegration.model.WorkspaceSummary} objects
     * contained in responses from the listWorkspaces operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.dataintegration.model.WorkspaceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.dataintegration.model.WorkspaceSummary>
            listWorkspacesRecordIterator(final ListWorkspacesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkspacesRequest.Builder, ListWorkspacesRequest, ListWorkspacesResponse,
                com.oracle.bmc.dataintegration.model.WorkspaceSummary>(
                new com.google.common.base.Supplier<ListWorkspacesRequest.Builder>() {
                    @Override
                    public ListWorkspacesRequest.Builder get() {
                        return ListWorkspacesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListWorkspacesResponse, String>() {
                    @Override
                    public String apply(ListWorkspacesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkspacesRequest.Builder>,
                        ListWorkspacesRequest>() {
                    @Override
                    public ListWorkspacesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkspacesRequest.Builder>
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
                        ListWorkspacesRequest, ListWorkspacesResponse>() {
                    @Override
                    public ListWorkspacesResponse apply(ListWorkspacesRequest request) {
                        return client.listWorkspaces(request);
                    }
                },
                new com.google.common.base.Function<
                        ListWorkspacesResponse,
                        java.util.List<com.oracle.bmc.dataintegration.model.WorkspaceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.dataintegration.model.WorkspaceSummary>
                            apply(ListWorkspacesResponse response) {
                        return response.getItems();
                    }
                });
    }
}

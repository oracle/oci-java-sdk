/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh;

import com.oracle.bmc.servicemesh.requests.*;
import com.oracle.bmc.servicemesh.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ServiceMesh where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.RequiredArgsConstructor
public class ServiceMeshPaginators {
    private final ServiceMesh client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listAccessPolicies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListAccessPoliciesResponse> listAccessPoliciesResponseIterator(
            final ListAccessPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAccessPoliciesRequest.Builder, ListAccessPoliciesRequest,
                ListAccessPoliciesResponse>(
                new com.google.common.base.Supplier<ListAccessPoliciesRequest.Builder>() {
                    @Override
                    public ListAccessPoliciesRequest.Builder get() {
                        return ListAccessPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAccessPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessPoliciesRequest.Builder>,
                        ListAccessPoliciesRequest>() {
                    @Override
                    public ListAccessPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessPoliciesRequest.Builder>
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
                        ListAccessPoliciesRequest, ListAccessPoliciesResponse>() {
                    @Override
                    public ListAccessPoliciesResponse apply(ListAccessPoliciesRequest request) {
                        return client.listAccessPolicies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.AccessPolicySummary} objects
     * contained in responses from the listAccessPolicies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.AccessPolicySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.AccessPolicySummary>
            listAccessPoliciesRecordIterator(final ListAccessPoliciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAccessPoliciesRequest.Builder, ListAccessPoliciesRequest,
                ListAccessPoliciesResponse, com.oracle.bmc.servicemesh.model.AccessPolicySummary>(
                new com.google.common.base.Supplier<ListAccessPoliciesRequest.Builder>() {
                    @Override
                    public ListAccessPoliciesRequest.Builder get() {
                        return ListAccessPoliciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListAccessPoliciesResponse, String>() {
                    @Override
                    public String apply(ListAccessPoliciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAccessPoliciesRequest.Builder>,
                        ListAccessPoliciesRequest>() {
                    @Override
                    public ListAccessPoliciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAccessPoliciesRequest.Builder>
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
                        ListAccessPoliciesRequest, ListAccessPoliciesResponse>() {
                    @Override
                    public ListAccessPoliciesResponse apply(ListAccessPoliciesRequest request) {
                        return client.listAccessPolicies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListAccessPoliciesResponse,
                        java.util.List<com.oracle.bmc.servicemesh.model.AccessPolicySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.AccessPolicySummary>
                            apply(ListAccessPoliciesResponse response) {
                        return response.getAccessPolicyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIngressGatewayRouteTables operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIngressGatewayRouteTablesResponse>
            listIngressGatewayRouteTablesResponseIterator(
                    final ListIngressGatewayRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIngressGatewayRouteTablesRequest.Builder, ListIngressGatewayRouteTablesRequest,
                ListIngressGatewayRouteTablesResponse>(
                new com.google.common.base.Supplier<
                        ListIngressGatewayRouteTablesRequest.Builder>() {
                    @Override
                    public ListIngressGatewayRouteTablesRequest.Builder get() {
                        return ListIngressGatewayRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIngressGatewayRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListIngressGatewayRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngressGatewayRouteTablesRequest.Builder>,
                        ListIngressGatewayRouteTablesRequest>() {
                    @Override
                    public ListIngressGatewayRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngressGatewayRouteTablesRequest.Builder>
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
                        ListIngressGatewayRouteTablesRequest,
                        ListIngressGatewayRouteTablesResponse>() {
                    @Override
                    public ListIngressGatewayRouteTablesResponse apply(
                            ListIngressGatewayRouteTablesRequest request) {
                        return client.listIngressGatewayRouteTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.IngressGatewayRouteTableSummary} objects
     * contained in responses from the listIngressGatewayRouteTables operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.IngressGatewayRouteTableSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.IngressGatewayRouteTableSummary>
            listIngressGatewayRouteTablesRecordIterator(
                    final ListIngressGatewayRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIngressGatewayRouteTablesRequest.Builder, ListIngressGatewayRouteTablesRequest,
                ListIngressGatewayRouteTablesResponse,
                com.oracle.bmc.servicemesh.model.IngressGatewayRouteTableSummary>(
                new com.google.common.base.Supplier<
                        ListIngressGatewayRouteTablesRequest.Builder>() {
                    @Override
                    public ListIngressGatewayRouteTablesRequest.Builder get() {
                        return ListIngressGatewayRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIngressGatewayRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListIngressGatewayRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngressGatewayRouteTablesRequest.Builder>,
                        ListIngressGatewayRouteTablesRequest>() {
                    @Override
                    public ListIngressGatewayRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngressGatewayRouteTablesRequest.Builder>
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
                        ListIngressGatewayRouteTablesRequest,
                        ListIngressGatewayRouteTablesResponse>() {
                    @Override
                    public ListIngressGatewayRouteTablesResponse apply(
                            ListIngressGatewayRouteTablesRequest request) {
                        return client.listIngressGatewayRouteTables(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIngressGatewayRouteTablesResponse,
                        java.util.List<
                                com.oracle.bmc.servicemesh.model
                                        .IngressGatewayRouteTableSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.servicemesh.model
                                            .IngressGatewayRouteTableSummary>
                            apply(ListIngressGatewayRouteTablesResponse response) {
                        return response.getIngressGatewayRouteTableCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIngressGateways operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListIngressGatewaysResponse> listIngressGatewaysResponseIterator(
            final ListIngressGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIngressGatewaysRequest.Builder, ListIngressGatewaysRequest,
                ListIngressGatewaysResponse>(
                new com.google.common.base.Supplier<ListIngressGatewaysRequest.Builder>() {
                    @Override
                    public ListIngressGatewaysRequest.Builder get() {
                        return ListIngressGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIngressGatewaysResponse, String>() {
                    @Override
                    public String apply(ListIngressGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngressGatewaysRequest.Builder>,
                        ListIngressGatewaysRequest>() {
                    @Override
                    public ListIngressGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngressGatewaysRequest.Builder>
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
                        ListIngressGatewaysRequest, ListIngressGatewaysResponse>() {
                    @Override
                    public ListIngressGatewaysResponse apply(ListIngressGatewaysRequest request) {
                        return client.listIngressGateways(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.IngressGatewaySummary} objects
     * contained in responses from the listIngressGateways operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.IngressGatewaySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.IngressGatewaySummary>
            listIngressGatewaysRecordIterator(final ListIngressGatewaysRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIngressGatewaysRequest.Builder, ListIngressGatewaysRequest,
                ListIngressGatewaysResponse,
                com.oracle.bmc.servicemesh.model.IngressGatewaySummary>(
                new com.google.common.base.Supplier<ListIngressGatewaysRequest.Builder>() {
                    @Override
                    public ListIngressGatewaysRequest.Builder get() {
                        return ListIngressGatewaysRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListIngressGatewaysResponse, String>() {
                    @Override
                    public String apply(ListIngressGatewaysResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIngressGatewaysRequest.Builder>,
                        ListIngressGatewaysRequest>() {
                    @Override
                    public ListIngressGatewaysRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIngressGatewaysRequest.Builder>
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
                        ListIngressGatewaysRequest, ListIngressGatewaysResponse>() {
                    @Override
                    public ListIngressGatewaysResponse apply(ListIngressGatewaysRequest request) {
                        return client.listIngressGateways(request);
                    }
                },
                new com.google.common.base.Function<
                        ListIngressGatewaysResponse,
                        java.util.List<com.oracle.bmc.servicemesh.model.IngressGatewaySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.IngressGatewaySummary>
                            apply(ListIngressGatewaysResponse response) {
                        return response.getIngressGatewayCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMeshes operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListMeshesResponse> listMeshesResponseIterator(
            final ListMeshesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMeshesRequest.Builder, ListMeshesRequest, ListMeshesResponse>(
                new com.google.common.base.Supplier<ListMeshesRequest.Builder>() {
                    @Override
                    public ListMeshesRequest.Builder get() {
                        return ListMeshesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMeshesResponse, String>() {
                    @Override
                    public String apply(ListMeshesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMeshesRequest.Builder>,
                        ListMeshesRequest>() {
                    @Override
                    public ListMeshesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMeshesRequest.Builder>
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
                new com.google.common.base.Function<ListMeshesRequest, ListMeshesResponse>() {
                    @Override
                    public ListMeshesResponse apply(ListMeshesRequest request) {
                        return client.listMeshes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.MeshSummary} objects
     * contained in responses from the listMeshes operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.MeshSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.MeshSummary> listMeshesRecordIterator(
            final ListMeshesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMeshesRequest.Builder, ListMeshesRequest, ListMeshesResponse,
                com.oracle.bmc.servicemesh.model.MeshSummary>(
                new com.google.common.base.Supplier<ListMeshesRequest.Builder>() {
                    @Override
                    public ListMeshesRequest.Builder get() {
                        return ListMeshesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListMeshesResponse, String>() {
                    @Override
                    public String apply(ListMeshesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMeshesRequest.Builder>,
                        ListMeshesRequest>() {
                    @Override
                    public ListMeshesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMeshesRequest.Builder>
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
                new com.google.common.base.Function<ListMeshesRequest, ListMeshesResponse>() {
                    @Override
                    public ListMeshesResponse apply(ListMeshesRequest request) {
                        return client.listMeshes(request);
                    }
                },
                new com.google.common.base.Function<
                        ListMeshesResponse,
                        java.util.List<com.oracle.bmc.servicemesh.model.MeshSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.MeshSummary> apply(
                            ListMeshesResponse response) {
                        return response.getMeshCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVirtualDeployments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVirtualDeploymentsResponse> listVirtualDeploymentsResponseIterator(
            final ListVirtualDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualDeploymentsRequest.Builder, ListVirtualDeploymentsRequest,
                ListVirtualDeploymentsResponse>(
                new com.google.common.base.Supplier<ListVirtualDeploymentsRequest.Builder>() {
                    @Override
                    public ListVirtualDeploymentsRequest.Builder get() {
                        return ListVirtualDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListVirtualDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualDeploymentsRequest.Builder>,
                        ListVirtualDeploymentsRequest>() {
                    @Override
                    public ListVirtualDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualDeploymentsRequest.Builder>
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
                        ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>() {
                    @Override
                    public ListVirtualDeploymentsResponse apply(
                            ListVirtualDeploymentsRequest request) {
                        return client.listVirtualDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary} objects
     * contained in responses from the listVirtualDeployments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary>
            listVirtualDeploymentsRecordIterator(final ListVirtualDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualDeploymentsRequest.Builder, ListVirtualDeploymentsRequest,
                ListVirtualDeploymentsResponse,
                com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary>(
                new com.google.common.base.Supplier<ListVirtualDeploymentsRequest.Builder>() {
                    @Override
                    public ListVirtualDeploymentsRequest.Builder get() {
                        return ListVirtualDeploymentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListVirtualDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualDeploymentsRequest.Builder>,
                        ListVirtualDeploymentsRequest>() {
                    @Override
                    public ListVirtualDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualDeploymentsRequest.Builder>
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
                        ListVirtualDeploymentsRequest, ListVirtualDeploymentsResponse>() {
                    @Override
                    public ListVirtualDeploymentsResponse apply(
                            ListVirtualDeploymentsRequest request) {
                        return client.listVirtualDeployments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualDeploymentsResponse,
                        java.util.List<
                                com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.VirtualDeploymentSummary>
                            apply(ListVirtualDeploymentsResponse response) {
                        return response.getVirtualDeploymentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVirtualServiceRouteTables operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVirtualServiceRouteTablesResponse>
            listVirtualServiceRouteTablesResponseIterator(
                    final ListVirtualServiceRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualServiceRouteTablesRequest.Builder, ListVirtualServiceRouteTablesRequest,
                ListVirtualServiceRouteTablesResponse>(
                new com.google.common.base.Supplier<
                        ListVirtualServiceRouteTablesRequest.Builder>() {
                    @Override
                    public ListVirtualServiceRouteTablesRequest.Builder get() {
                        return ListVirtualServiceRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualServiceRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListVirtualServiceRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualServiceRouteTablesRequest.Builder>,
                        ListVirtualServiceRouteTablesRequest>() {
                    @Override
                    public ListVirtualServiceRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualServiceRouteTablesRequest.Builder>
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
                        ListVirtualServiceRouteTablesRequest,
                        ListVirtualServiceRouteTablesResponse>() {
                    @Override
                    public ListVirtualServiceRouteTablesResponse apply(
                            ListVirtualServiceRouteTablesRequest request) {
                        return client.listVirtualServiceRouteTables(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualServiceRouteTableSummary} objects
     * contained in responses from the listVirtualServiceRouteTables operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualServiceRouteTableSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.VirtualServiceRouteTableSummary>
            listVirtualServiceRouteTablesRecordIterator(
                    final ListVirtualServiceRouteTablesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualServiceRouteTablesRequest.Builder, ListVirtualServiceRouteTablesRequest,
                ListVirtualServiceRouteTablesResponse,
                com.oracle.bmc.servicemesh.model.VirtualServiceRouteTableSummary>(
                new com.google.common.base.Supplier<
                        ListVirtualServiceRouteTablesRequest.Builder>() {
                    @Override
                    public ListVirtualServiceRouteTablesRequest.Builder get() {
                        return ListVirtualServiceRouteTablesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualServiceRouteTablesResponse, String>() {
                    @Override
                    public String apply(ListVirtualServiceRouteTablesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualServiceRouteTablesRequest.Builder>,
                        ListVirtualServiceRouteTablesRequest>() {
                    @Override
                    public ListVirtualServiceRouteTablesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualServiceRouteTablesRequest.Builder>
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
                        ListVirtualServiceRouteTablesRequest,
                        ListVirtualServiceRouteTablesResponse>() {
                    @Override
                    public ListVirtualServiceRouteTablesResponse apply(
                            ListVirtualServiceRouteTablesRequest request) {
                        return client.listVirtualServiceRouteTables(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualServiceRouteTablesResponse,
                        java.util.List<
                                com.oracle.bmc.servicemesh.model
                                        .VirtualServiceRouteTableSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.servicemesh.model
                                            .VirtualServiceRouteTableSummary>
                            apply(ListVirtualServiceRouteTablesResponse response) {
                        return response.getVirtualServiceRouteTableCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listVirtualServices operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListVirtualServicesResponse> listVirtualServicesResponseIterator(
            final ListVirtualServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListVirtualServicesRequest.Builder, ListVirtualServicesRequest,
                ListVirtualServicesResponse>(
                new com.google.common.base.Supplier<ListVirtualServicesRequest.Builder>() {
                    @Override
                    public ListVirtualServicesRequest.Builder get() {
                        return ListVirtualServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualServicesResponse, String>() {
                    @Override
                    public String apply(ListVirtualServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualServicesRequest.Builder>,
                        ListVirtualServicesRequest>() {
                    @Override
                    public ListVirtualServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualServicesRequest.Builder>
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
                        ListVirtualServicesRequest, ListVirtualServicesResponse>() {
                    @Override
                    public ListVirtualServicesResponse apply(ListVirtualServicesRequest request) {
                        return client.listVirtualServices(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualServiceSummary} objects
     * contained in responses from the listVirtualServices operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.VirtualServiceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.VirtualServiceSummary>
            listVirtualServicesRecordIterator(final ListVirtualServicesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListVirtualServicesRequest.Builder, ListVirtualServicesRequest,
                ListVirtualServicesResponse,
                com.oracle.bmc.servicemesh.model.VirtualServiceSummary>(
                new com.google.common.base.Supplier<ListVirtualServicesRequest.Builder>() {
                    @Override
                    public ListVirtualServicesRequest.Builder get() {
                        return ListVirtualServicesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListVirtualServicesResponse, String>() {
                    @Override
                    public String apply(ListVirtualServicesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListVirtualServicesRequest.Builder>,
                        ListVirtualServicesRequest>() {
                    @Override
                    public ListVirtualServicesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListVirtualServicesRequest.Builder>
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
                        ListVirtualServicesRequest, ListVirtualServicesResponse>() {
                    @Override
                    public ListVirtualServicesResponse apply(ListVirtualServicesRequest request) {
                        return client.listVirtualServices(request);
                    }
                },
                new com.google.common.base.Function<
                        ListVirtualServicesResponse,
                        java.util.List<com.oracle.bmc.servicemesh.model.VirtualServiceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.VirtualServiceSummary>
                            apply(ListVirtualServicesResponse response) {
                        return response.getVirtualServiceCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse, com.oracle.bmc.servicemesh.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse, com.oracle.bmc.servicemesh.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.servicemesh.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicemesh.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.servicemesh.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicemesh.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

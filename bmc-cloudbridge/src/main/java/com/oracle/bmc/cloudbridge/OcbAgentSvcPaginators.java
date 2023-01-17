/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OcbAgentSvc where multiple pages of data may be fetched. Two styles of
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class OcbAgentSvcPaginators {
    private final OcbAgentSvc client;

    public OcbAgentSvcPaginators(OcbAgentSvc client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listAgentDependencies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgentDependenciesResponse> listAgentDependenciesResponseIterator(
            final ListAgentDependenciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgentDependenciesRequest.Builder,
                ListAgentDependenciesRequest,
                ListAgentDependenciesResponse>(
                new java.util.function.Supplier<ListAgentDependenciesRequest.Builder>() {
                    @Override
                    public ListAgentDependenciesRequest.Builder get() {
                        return ListAgentDependenciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentDependenciesResponse, String>() {
                    @Override
                    public String apply(ListAgentDependenciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentDependenciesRequest.Builder>,
                        ListAgentDependenciesRequest>() {
                    @Override
                    public ListAgentDependenciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentDependenciesRequest.Builder>
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
                        ListAgentDependenciesRequest, ListAgentDependenciesResponse>() {
                    @Override
                    public ListAgentDependenciesResponse apply(
                            ListAgentDependenciesRequest request) {
                        return client.listAgentDependencies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.AgentDependencySummary} objects contained in responses from
     * the listAgentDependencies operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.AgentDependencySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.AgentDependencySummary>
            listAgentDependenciesRecordIterator(final ListAgentDependenciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgentDependenciesRequest.Builder,
                ListAgentDependenciesRequest,
                ListAgentDependenciesResponse,
                com.oracle.bmc.cloudbridge.model.AgentDependencySummary>(
                new java.util.function.Supplier<ListAgentDependenciesRequest.Builder>() {
                    @Override
                    public ListAgentDependenciesRequest.Builder get() {
                        return ListAgentDependenciesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentDependenciesResponse, String>() {
                    @Override
                    public String apply(ListAgentDependenciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentDependenciesRequest.Builder>,
                        ListAgentDependenciesRequest>() {
                    @Override
                    public ListAgentDependenciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentDependenciesRequest.Builder>
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
                        ListAgentDependenciesRequest, ListAgentDependenciesResponse>() {
                    @Override
                    public ListAgentDependenciesResponse apply(
                            ListAgentDependenciesRequest request) {
                        return client.listAgentDependencies(request);
                    }
                },
                new java.util.function.Function<
                        ListAgentDependenciesResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.AgentDependencySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.AgentDependencySummary>
                            apply(ListAgentDependenciesResponse response) {
                        return response.getAgentDependencyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listAgents
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListAgentsResponse> listAgentsResponseIterator(
            final ListAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListAgentsRequest.Builder, ListAgentsRequest, ListAgentsResponse>(
                new java.util.function.Supplier<ListAgentsRequest.Builder>() {
                    @Override
                    public ListAgentsRequest.Builder get() {
                        return ListAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentsResponse, String>() {
                    @Override
                    public String apply(ListAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentsRequest.Builder>,
                        ListAgentsRequest>() {
                    @Override
                    public ListAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentsRequest.Builder>
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
                new java.util.function.Function<ListAgentsRequest, ListAgentsResponse>() {
                    @Override
                    public ListAgentsResponse apply(ListAgentsRequest request) {
                        return client.listAgents(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.AgentSummary} objects contained in responses from the
     * listAgents operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.AgentSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.AgentSummary> listAgentsRecordIterator(
            final ListAgentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListAgentsRequest.Builder,
                ListAgentsRequest,
                ListAgentsResponse,
                com.oracle.bmc.cloudbridge.model.AgentSummary>(
                new java.util.function.Supplier<ListAgentsRequest.Builder>() {
                    @Override
                    public ListAgentsRequest.Builder get() {
                        return ListAgentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListAgentsResponse, String>() {
                    @Override
                    public String apply(ListAgentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListAgentsRequest.Builder>,
                        ListAgentsRequest>() {
                    @Override
                    public ListAgentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListAgentsRequest.Builder>
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
                new java.util.function.Function<ListAgentsRequest, ListAgentsResponse>() {
                    @Override
                    public ListAgentsResponse apply(ListAgentsRequest request) {
                        return client.listAgents(request);
                    }
                },
                new java.util.function.Function<
                        ListAgentsResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.AgentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.AgentSummary> apply(
                            ListAgentsResponse response) {
                        return response.getAgentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplianceImages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplianceImagesResponse> listApplianceImagesResponseIterator(
            final ListApplianceImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplianceImagesRequest.Builder,
                ListApplianceImagesRequest,
                ListApplianceImagesResponse>(
                new java.util.function.Supplier<ListApplianceImagesRequest.Builder>() {
                    @Override
                    public ListApplianceImagesRequest.Builder get() {
                        return ListApplianceImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplianceImagesResponse, String>() {
                    @Override
                    public String apply(ListApplianceImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplianceImagesRequest.Builder>,
                        ListApplianceImagesRequest>() {
                    @Override
                    public ListApplianceImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplianceImagesRequest.Builder>
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
                        ListApplianceImagesRequest, ListApplianceImagesResponse>() {
                    @Override
                    public ListApplianceImagesResponse apply(ListApplianceImagesRequest request) {
                        return client.listApplianceImages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.ApplianceImageSummary} objects contained in responses from
     * the listApplianceImages operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.ApplianceImageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.ApplianceImageSummary>
            listApplianceImagesRecordIterator(final ListApplianceImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplianceImagesRequest.Builder,
                ListApplianceImagesRequest,
                ListApplianceImagesResponse,
                com.oracle.bmc.cloudbridge.model.ApplianceImageSummary>(
                new java.util.function.Supplier<ListApplianceImagesRequest.Builder>() {
                    @Override
                    public ListApplianceImagesRequest.Builder get() {
                        return ListApplianceImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplianceImagesResponse, String>() {
                    @Override
                    public String apply(ListApplianceImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplianceImagesRequest.Builder>,
                        ListApplianceImagesRequest>() {
                    @Override
                    public ListApplianceImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplianceImagesRequest.Builder>
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
                        ListApplianceImagesRequest, ListApplianceImagesResponse>() {
                    @Override
                    public ListApplianceImagesResponse apply(ListApplianceImagesRequest request) {
                        return client.listApplianceImages(request);
                    }
                },
                new java.util.function.Function<
                        ListApplianceImagesResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.ApplianceImageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.ApplianceImageSummary>
                            apply(ListApplianceImagesResponse response) {
                        return response.getApplianceImageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listEnvironments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListEnvironmentsResponse> listEnvironmentsResponseIterator(
            final ListEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListEnvironmentsRequest.Builder, ListEnvironmentsRequest, ListEnvironmentsResponse>(
                new java.util.function.Supplier<ListEnvironmentsRequest.Builder>() {
                    @Override
                    public ListEnvironmentsRequest.Builder get() {
                        return ListEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnvironmentsRequest.Builder>,
                        ListEnvironmentsRequest>() {
                    @Override
                    public ListEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnvironmentsRequest.Builder>
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
                        ListEnvironmentsRequest, ListEnvironmentsResponse>() {
                    @Override
                    public ListEnvironmentsResponse apply(ListEnvironmentsRequest request) {
                        return client.listEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.cloudbridge.model.EnvironmentSummary} objects contained in responses from the
     * listEnvironments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.cloudbridge.model.EnvironmentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.cloudbridge.model.EnvironmentSummary>
            listEnvironmentsRecordIterator(final ListEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListEnvironmentsRequest.Builder,
                ListEnvironmentsRequest,
                ListEnvironmentsResponse,
                com.oracle.bmc.cloudbridge.model.EnvironmentSummary>(
                new java.util.function.Supplier<ListEnvironmentsRequest.Builder>() {
                    @Override
                    public ListEnvironmentsRequest.Builder get() {
                        return ListEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListEnvironmentsRequest.Builder>,
                        ListEnvironmentsRequest>() {
                    @Override
                    public ListEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListEnvironmentsRequest.Builder>
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
                        ListEnvironmentsRequest, ListEnvironmentsResponse>() {
                    @Override
                    public ListEnvironmentsResponse apply(ListEnvironmentsRequest request) {
                        return client.listEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListEnvironmentsResponse,
                        java.util.List<com.oracle.bmc.cloudbridge.model.EnvironmentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.cloudbridge.model.EnvironmentSummary>
                            apply(ListEnvironmentsResponse response) {
                        return response.getEnvironmentCollection().getItems();
                    }
                });
    }
}

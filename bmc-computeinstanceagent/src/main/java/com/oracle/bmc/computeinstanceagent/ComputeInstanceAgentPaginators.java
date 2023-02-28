/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent;

import com.oracle.bmc.computeinstanceagent.requests.*;
import com.oracle.bmc.computeinstanceagent.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ComputeInstanceAgent where multiple pages of data may be fetched. Two
 * styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
public class ComputeInstanceAgentPaginators {
    private final ComputeInstanceAgent client;

    public ComputeInstanceAgentPaginators(ComputeInstanceAgent client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInstanceAgentCommandExecutions operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInstanceAgentCommandExecutionsResponse>
            listInstanceAgentCommandExecutionsResponseIterator(
                    final ListInstanceAgentCommandExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceAgentCommandExecutionsRequest.Builder,
                ListInstanceAgentCommandExecutionsRequest,
                ListInstanceAgentCommandExecutionsResponse>(
                new java.util.function.Supplier<
                        ListInstanceAgentCommandExecutionsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsRequest.Builder get() {
                        return ListInstanceAgentCommandExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceAgentCommandExecutionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentCommandExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentCommandExecutionsRequest.Builder>,
                        ListInstanceAgentCommandExecutionsRequest>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentCommandExecutionsRequest.Builder>
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
                        ListInstanceAgentCommandExecutionsRequest,
                        ListInstanceAgentCommandExecutionsResponse>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsResponse apply(
                            ListInstanceAgentCommandExecutionsRequest request) {
                        return client.listInstanceAgentCommandExecutions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandExecutionSummary} objects
     * contained in responses from the listInstanceAgentCommandExecutions operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandExecutionSummary} objects
     *     contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandExecutionSummary>
            listInstanceAgentCommandExecutionsRecordIterator(
                    final ListInstanceAgentCommandExecutionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceAgentCommandExecutionsRequest.Builder,
                ListInstanceAgentCommandExecutionsRequest,
                ListInstanceAgentCommandExecutionsResponse,
                com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandExecutionSummary>(
                new java.util.function.Supplier<
                        ListInstanceAgentCommandExecutionsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsRequest.Builder get() {
                        return ListInstanceAgentCommandExecutionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceAgentCommandExecutionsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentCommandExecutionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentCommandExecutionsRequest.Builder>,
                        ListInstanceAgentCommandExecutionsRequest>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentCommandExecutionsRequest.Builder>
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
                        ListInstanceAgentCommandExecutionsRequest,
                        ListInstanceAgentCommandExecutionsResponse>() {
                    @Override
                    public ListInstanceAgentCommandExecutionsResponse apply(
                            ListInstanceAgentCommandExecutionsRequest request) {
                        return client.listInstanceAgentCommandExecutions(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceAgentCommandExecutionsResponse,
                        java.util.List<
                                com.oracle.bmc.computeinstanceagent.model
                                        .InstanceAgentCommandExecutionSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.computeinstanceagent.model
                                            .InstanceAgentCommandExecutionSummary>
                            apply(ListInstanceAgentCommandExecutionsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listInstanceAgentCommands operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListInstanceAgentCommandsResponse> listInstanceAgentCommandsResponseIterator(
            final ListInstanceAgentCommandsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceAgentCommandsRequest.Builder,
                ListInstanceAgentCommandsRequest,
                ListInstanceAgentCommandsResponse>(
                new java.util.function.Supplier<ListInstanceAgentCommandsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentCommandsRequest.Builder get() {
                        return ListInstanceAgentCommandsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceAgentCommandsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentCommandsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentCommandsRequest.Builder>,
                        ListInstanceAgentCommandsRequest>() {
                    @Override
                    public ListInstanceAgentCommandsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentCommandsRequest.Builder>
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
                        ListInstanceAgentCommandsRequest, ListInstanceAgentCommandsResponse>() {
                    @Override
                    public ListInstanceAgentCommandsResponse apply(
                            ListInstanceAgentCommandsRequest request) {
                        return client.listInstanceAgentCommands(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandSummary} objects contained in
     * responses from the listInstanceAgentCommands operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandSummary>
            listInstanceAgentCommandsRecordIterator(
                    final ListInstanceAgentCommandsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceAgentCommandsRequest.Builder,
                ListInstanceAgentCommandsRequest,
                ListInstanceAgentCommandsResponse,
                com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandSummary>(
                new java.util.function.Supplier<ListInstanceAgentCommandsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentCommandsRequest.Builder get() {
                        return ListInstanceAgentCommandsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListInstanceAgentCommandsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentCommandsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentCommandsRequest.Builder>,
                        ListInstanceAgentCommandsRequest>() {
                    @Override
                    public ListInstanceAgentCommandsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentCommandsRequest.Builder>
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
                        ListInstanceAgentCommandsRequest, ListInstanceAgentCommandsResponse>() {
                    @Override
                    public ListInstanceAgentCommandsResponse apply(
                            ListInstanceAgentCommandsRequest request) {
                        return client.listInstanceAgentCommands(request);
                    }
                },
                new java.util.function.Function<
                        ListInstanceAgentCommandsResponse,
                        java.util.List<
                                com.oracle.bmc.computeinstanceagent.model
                                        .InstanceAgentCommandSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.computeinstanceagent.model
                                            .InstanceAgentCommandSummary>
                            apply(ListInstanceAgentCommandsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

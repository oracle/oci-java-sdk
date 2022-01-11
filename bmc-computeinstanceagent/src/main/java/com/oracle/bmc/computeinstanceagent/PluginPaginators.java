/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent;

import com.oracle.bmc.computeinstanceagent.requests.*;
import com.oracle.bmc.computeinstanceagent.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Plugin where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.RequiredArgsConstructor
public class PluginPaginators {
    private final Plugin client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstanceAgentPlugins operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstanceAgentPluginsResponse> listInstanceAgentPluginsResponseIterator(
            final ListInstanceAgentPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceAgentPluginsRequest.Builder, ListInstanceAgentPluginsRequest,
                ListInstanceAgentPluginsResponse>(
                new com.google.common.base.Supplier<ListInstanceAgentPluginsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentPluginsRequest.Builder get() {
                        return ListInstanceAgentPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstanceAgentPluginsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentPluginsRequest.Builder>,
                        ListInstanceAgentPluginsRequest>() {
                    @Override
                    public ListInstanceAgentPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentPluginsRequest.Builder>
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
                        ListInstanceAgentPluginsRequest, ListInstanceAgentPluginsResponse>() {
                    @Override
                    public ListInstanceAgentPluginsResponse apply(
                            ListInstanceAgentPluginsRequest request) {
                        return client.listInstanceAgentPlugins(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary} objects
     * contained in responses from the listInstanceAgentPlugins operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary>
            listInstanceAgentPluginsRecordIterator(final ListInstanceAgentPluginsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceAgentPluginsRequest.Builder, ListInstanceAgentPluginsRequest,
                ListInstanceAgentPluginsResponse,
                com.oracle.bmc.computeinstanceagent.model.InstanceAgentPluginSummary>(
                new com.google.common.base.Supplier<ListInstanceAgentPluginsRequest.Builder>() {
                    @Override
                    public ListInstanceAgentPluginsRequest.Builder get() {
                        return ListInstanceAgentPluginsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstanceAgentPluginsResponse, String>() {
                    @Override
                    public String apply(ListInstanceAgentPluginsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceAgentPluginsRequest.Builder>,
                        ListInstanceAgentPluginsRequest>() {
                    @Override
                    public ListInstanceAgentPluginsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceAgentPluginsRequest.Builder>
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
                        ListInstanceAgentPluginsRequest, ListInstanceAgentPluginsResponse>() {
                    @Override
                    public ListInstanceAgentPluginsResponse apply(
                            ListInstanceAgentPluginsRequest request) {
                        return client.listInstanceAgentPlugins(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceAgentPluginsResponse,
                        java.util.List<
                                com.oracle.bmc.computeinstanceagent.model
                                        .InstanceAgentPluginSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.computeinstanceagent.model
                                            .InstanceAgentPluginSummary>
                            apply(ListInstanceAgentPluginsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

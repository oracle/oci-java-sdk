/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Datastore where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class DatastorePaginators {
    private final Datastore client;

    public DatastorePaginators(Datastore client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatastores
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatastoresResponse> listDatastoresResponseIterator(
            final ListDatastoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatastoresRequest.Builder, ListDatastoresRequest, ListDatastoresResponse>(
                new java.util.function.Supplier<ListDatastoresRequest.Builder>() {
                    @Override
                    public ListDatastoresRequest.Builder get() {
                        return ListDatastoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatastoresResponse, String>() {
                    @Override
                    public String apply(ListDatastoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatastoresRequest.Builder>,
                        ListDatastoresRequest>() {
                    @Override
                    public ListDatastoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatastoresRequest.Builder>
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
                new java.util.function.Function<ListDatastoresRequest, ListDatastoresResponse>() {
                    @Override
                    public ListDatastoresResponse apply(ListDatastoresRequest request) {
                        return client.listDatastores(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.ocvp.model.DatastoreSummary} objects contained in responses from the
     * listDatastores operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.ocvp.model.DatastoreSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.ocvp.model.DatastoreSummary> listDatastoresRecordIterator(
            final ListDatastoresRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatastoresRequest.Builder,
                ListDatastoresRequest,
                ListDatastoresResponse,
                com.oracle.bmc.ocvp.model.DatastoreSummary>(
                new java.util.function.Supplier<ListDatastoresRequest.Builder>() {
                    @Override
                    public ListDatastoresRequest.Builder get() {
                        return ListDatastoresRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatastoresResponse, String>() {
                    @Override
                    public String apply(ListDatastoresResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatastoresRequest.Builder>,
                        ListDatastoresRequest>() {
                    @Override
                    public ListDatastoresRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatastoresRequest.Builder>
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
                new java.util.function.Function<ListDatastoresRequest, ListDatastoresResponse>() {
                    @Override
                    public ListDatastoresResponse apply(ListDatastoresRequest request) {
                        return client.listDatastores(request);
                    }
                },
                new java.util.function.Function<
                        ListDatastoresResponse,
                        java.util.List<com.oracle.bmc.ocvp.model.DatastoreSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.ocvp.model.DatastoreSummary> apply(
                            ListDatastoresResponse response) {
                        return response.getDatastoreCollection().getItems();
                    }
                });
    }
}

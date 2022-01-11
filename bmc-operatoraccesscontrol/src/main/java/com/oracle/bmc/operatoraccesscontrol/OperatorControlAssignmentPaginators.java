/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OperatorControlAssignment where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.RequiredArgsConstructor
public class OperatorControlAssignmentPaginators {
    private final OperatorControlAssignment client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperatorControlAssignments operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperatorControlAssignmentsResponse>
            listOperatorControlAssignmentsResponseIterator(
                    final ListOperatorControlAssignmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperatorControlAssignmentsRequest.Builder,
                ListOperatorControlAssignmentsRequest, ListOperatorControlAssignmentsResponse>(
                new com.google.common.base.Supplier<
                        ListOperatorControlAssignmentsRequest.Builder>() {
                    @Override
                    public ListOperatorControlAssignmentsRequest.Builder get() {
                        return ListOperatorControlAssignmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOperatorControlAssignmentsResponse, String>() {
                    @Override
                    public String apply(ListOperatorControlAssignmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperatorControlAssignmentsRequest.Builder>,
                        ListOperatorControlAssignmentsRequest>() {
                    @Override
                    public ListOperatorControlAssignmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperatorControlAssignmentsRequest.Builder>
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
                        ListOperatorControlAssignmentsRequest,
                        ListOperatorControlAssignmentsResponse>() {
                    @Override
                    public ListOperatorControlAssignmentsResponse apply(
                            ListOperatorControlAssignmentsRequest request) {
                        return client.listOperatorControlAssignments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignmentSummary} objects
     * contained in responses from the listOperatorControlAssignments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignmentSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignmentSummary>
            listOperatorControlAssignmentsRecordIterator(
                    final ListOperatorControlAssignmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperatorControlAssignmentsRequest.Builder,
                ListOperatorControlAssignmentsRequest, ListOperatorControlAssignmentsResponse,
                com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignmentSummary>(
                new com.google.common.base.Supplier<
                        ListOperatorControlAssignmentsRequest.Builder>() {
                    @Override
                    public ListOperatorControlAssignmentsRequest.Builder get() {
                        return ListOperatorControlAssignmentsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOperatorControlAssignmentsResponse, String>() {
                    @Override
                    public String apply(ListOperatorControlAssignmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperatorControlAssignmentsRequest.Builder>,
                        ListOperatorControlAssignmentsRequest>() {
                    @Override
                    public ListOperatorControlAssignmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperatorControlAssignmentsRequest.Builder>
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
                        ListOperatorControlAssignmentsRequest,
                        ListOperatorControlAssignmentsResponse>() {
                    @Override
                    public ListOperatorControlAssignmentsResponse apply(
                            ListOperatorControlAssignmentsRequest request) {
                        return client.listOperatorControlAssignments(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOperatorControlAssignmentsResponse,
                        java.util.List<
                                com.oracle.bmc.operatoraccesscontrol.model
                                        .OperatorControlAssignmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.operatoraccesscontrol.model
                                            .OperatorControlAssignmentSummary>
                            apply(ListOperatorControlAssignmentsResponse response) {
                        return response.getOperatorControlAssignmentCollection().getItems();
                    }
                });
    }
}

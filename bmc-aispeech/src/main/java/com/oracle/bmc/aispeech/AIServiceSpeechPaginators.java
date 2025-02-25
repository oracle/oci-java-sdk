/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech;

import com.oracle.bmc.aispeech.requests.*;
import com.oracle.bmc.aispeech.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of AIServiceSpeech where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
public class AIServiceSpeechPaginators {
    private final AIServiceSpeech client;

    public AIServiceSpeechPaginators(AIServiceSpeech client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCustomizations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCustomizationsResponse> listCustomizationsResponseIterator(
            final ListCustomizationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCustomizationsRequest.Builder, ListCustomizationsRequest,
                ListCustomizationsResponse>(
                new java.util.function.Supplier<ListCustomizationsRequest.Builder>() {
                    @Override
                    public ListCustomizationsRequest.Builder get() {
                        return ListCustomizationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomizationsResponse, String>() {
                    @Override
                    public String apply(ListCustomizationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomizationsRequest.Builder>,
                        ListCustomizationsRequest>() {
                    @Override
                    public ListCustomizationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomizationsRequest.Builder>
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
                        ListCustomizationsRequest, ListCustomizationsResponse>() {
                    @Override
                    public ListCustomizationsResponse apply(ListCustomizationsRequest request) {
                        return client.listCustomizations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.aispeech.model.CustomizationSummary} objects
     * contained in responses from the listCustomizations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.aispeech.model.CustomizationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.aispeech.model.CustomizationSummary>
            listCustomizationsRecordIterator(final ListCustomizationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCustomizationsRequest.Builder, ListCustomizationsRequest,
                ListCustomizationsResponse, com.oracle.bmc.aispeech.model.CustomizationSummary>(
                new java.util.function.Supplier<ListCustomizationsRequest.Builder>() {
                    @Override
                    public ListCustomizationsRequest.Builder get() {
                        return ListCustomizationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCustomizationsResponse, String>() {
                    @Override
                    public String apply(ListCustomizationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCustomizationsRequest.Builder>,
                        ListCustomizationsRequest>() {
                    @Override
                    public ListCustomizationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCustomizationsRequest.Builder>
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
                        ListCustomizationsRequest, ListCustomizationsResponse>() {
                    @Override
                    public ListCustomizationsResponse apply(ListCustomizationsRequest request) {
                        return client.listCustomizations(request);
                    }
                },
                new java.util.function.Function<
                        ListCustomizationsResponse,
                        java.util.List<com.oracle.bmc.aispeech.model.CustomizationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aispeech.model.CustomizationSummary> apply(
                            ListCustomizationsResponse response) {
                        return response.getCustomizationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTranscriptionJobs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTranscriptionJobsResponse> listTranscriptionJobsResponseIterator(
            final ListTranscriptionJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTranscriptionJobsRequest.Builder, ListTranscriptionJobsRequest,
                ListTranscriptionJobsResponse>(
                new java.util.function.Supplier<ListTranscriptionJobsRequest.Builder>() {
                    @Override
                    public ListTranscriptionJobsRequest.Builder get() {
                        return ListTranscriptionJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranscriptionJobsResponse, String>() {
                    @Override
                    public String apply(ListTranscriptionJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranscriptionJobsRequest.Builder>,
                        ListTranscriptionJobsRequest>() {
                    @Override
                    public ListTranscriptionJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranscriptionJobsRequest.Builder>
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
                        ListTranscriptionJobsRequest, ListTranscriptionJobsResponse>() {
                    @Override
                    public ListTranscriptionJobsResponse apply(
                            ListTranscriptionJobsRequest request) {
                        return client.listTranscriptionJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.aispeech.model.TranscriptionJobSummary} objects
     * contained in responses from the listTranscriptionJobs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.aispeech.model.TranscriptionJobSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.aispeech.model.TranscriptionJobSummary>
            listTranscriptionJobsRecordIterator(final ListTranscriptionJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTranscriptionJobsRequest.Builder, ListTranscriptionJobsRequest,
                ListTranscriptionJobsResponse,
                com.oracle.bmc.aispeech.model.TranscriptionJobSummary>(
                new java.util.function.Supplier<ListTranscriptionJobsRequest.Builder>() {
                    @Override
                    public ListTranscriptionJobsRequest.Builder get() {
                        return ListTranscriptionJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranscriptionJobsResponse, String>() {
                    @Override
                    public String apply(ListTranscriptionJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranscriptionJobsRequest.Builder>,
                        ListTranscriptionJobsRequest>() {
                    @Override
                    public ListTranscriptionJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranscriptionJobsRequest.Builder>
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
                        ListTranscriptionJobsRequest, ListTranscriptionJobsResponse>() {
                    @Override
                    public ListTranscriptionJobsResponse apply(
                            ListTranscriptionJobsRequest request) {
                        return client.listTranscriptionJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListTranscriptionJobsResponse,
                        java.util.List<com.oracle.bmc.aispeech.model.TranscriptionJobSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aispeech.model.TranscriptionJobSummary>
                            apply(ListTranscriptionJobsResponse response) {
                        return response.getTranscriptionJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTranscriptionTasks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListTranscriptionTasksResponse> listTranscriptionTasksResponseIterator(
            final ListTranscriptionTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTranscriptionTasksRequest.Builder, ListTranscriptionTasksRequest,
                ListTranscriptionTasksResponse>(
                new java.util.function.Supplier<ListTranscriptionTasksRequest.Builder>() {
                    @Override
                    public ListTranscriptionTasksRequest.Builder get() {
                        return ListTranscriptionTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranscriptionTasksResponse, String>() {
                    @Override
                    public String apply(ListTranscriptionTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranscriptionTasksRequest.Builder>,
                        ListTranscriptionTasksRequest>() {
                    @Override
                    public ListTranscriptionTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranscriptionTasksRequest.Builder>
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
                        ListTranscriptionTasksRequest, ListTranscriptionTasksResponse>() {
                    @Override
                    public ListTranscriptionTasksResponse apply(
                            ListTranscriptionTasksRequest request) {
                        return client.listTranscriptionTasks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.aispeech.model.TranscriptionTaskSummary} objects
     * contained in responses from the listTranscriptionTasks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.aispeech.model.TranscriptionTaskSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.aispeech.model.TranscriptionTaskSummary>
            listTranscriptionTasksRecordIterator(final ListTranscriptionTasksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTranscriptionTasksRequest.Builder, ListTranscriptionTasksRequest,
                ListTranscriptionTasksResponse,
                com.oracle.bmc.aispeech.model.TranscriptionTaskSummary>(
                new java.util.function.Supplier<ListTranscriptionTasksRequest.Builder>() {
                    @Override
                    public ListTranscriptionTasksRequest.Builder get() {
                        return ListTranscriptionTasksRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTranscriptionTasksResponse, String>() {
                    @Override
                    public String apply(ListTranscriptionTasksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTranscriptionTasksRequest.Builder>,
                        ListTranscriptionTasksRequest>() {
                    @Override
                    public ListTranscriptionTasksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTranscriptionTasksRequest.Builder>
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
                        ListTranscriptionTasksRequest, ListTranscriptionTasksResponse>() {
                    @Override
                    public ListTranscriptionTasksResponse apply(
                            ListTranscriptionTasksRequest request) {
                        return client.listTranscriptionTasks(request);
                    }
                },
                new java.util.function.Function<
                        ListTranscriptionTasksResponse,
                        java.util.List<com.oracle.bmc.aispeech.model.TranscriptionTaskSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.aispeech.model.TranscriptionTaskSummary>
                            apply(ListTranscriptionTasksResponse response) {
                        return response.getTranscriptionTaskCollection().getItems();
                    }
                });
    }
}

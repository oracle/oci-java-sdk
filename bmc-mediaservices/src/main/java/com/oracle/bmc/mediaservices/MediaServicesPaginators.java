/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of MediaServices where multiple pages of data may be fetched. Two styles
 * of iteration are supported:
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesPaginators {
    private final MediaServices client;

    public MediaServicesPaginators(MediaServices client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaAssetDistributionChannelAttachments operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaAssetDistributionChannelAttachmentsResponse>
            listMediaAssetDistributionChannelAttachmentsResponseIterator(
                    final ListMediaAssetDistributionChannelAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaAssetDistributionChannelAttachmentsRequest.Builder,
                ListMediaAssetDistributionChannelAttachmentsRequest,
                ListMediaAssetDistributionChannelAttachmentsResponse>(
                new java.util.function.Supplier<
                        ListMediaAssetDistributionChannelAttachmentsRequest.Builder>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsRequest.Builder get() {
                        return ListMediaAssetDistributionChannelAttachmentsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaAssetDistributionChannelAttachmentsResponse, String>() {
                    @Override
                    public String apply(
                            ListMediaAssetDistributionChannelAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaAssetDistributionChannelAttachmentsRequest.Builder>,
                        ListMediaAssetDistributionChannelAttachmentsRequest>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaAssetDistributionChannelAttachmentsRequest
                                                    .Builder>
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
                        ListMediaAssetDistributionChannelAttachmentsRequest,
                        ListMediaAssetDistributionChannelAttachmentsResponse>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsResponse apply(
                            ListMediaAssetDistributionChannelAttachmentsRequest request) {
                        return client.listMediaAssetDistributionChannelAttachments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSummary} objects
     * contained in responses from the listMediaAssetDistributionChannelAttachments operation. This
     * iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSummary}
     *     objects contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.mediaservices.model
                            .MediaAssetDistributionChannelAttachmentSummary>
            listMediaAssetDistributionChannelAttachmentsRecordIterator(
                    final ListMediaAssetDistributionChannelAttachmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaAssetDistributionChannelAttachmentsRequest.Builder,
                ListMediaAssetDistributionChannelAttachmentsRequest,
                ListMediaAssetDistributionChannelAttachmentsResponse,
                com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSummary>(
                new java.util.function.Supplier<
                        ListMediaAssetDistributionChannelAttachmentsRequest.Builder>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsRequest.Builder get() {
                        return ListMediaAssetDistributionChannelAttachmentsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaAssetDistributionChannelAttachmentsResponse, String>() {
                    @Override
                    public String apply(
                            ListMediaAssetDistributionChannelAttachmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaAssetDistributionChannelAttachmentsRequest.Builder>,
                        ListMediaAssetDistributionChannelAttachmentsRequest>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaAssetDistributionChannelAttachmentsRequest
                                                    .Builder>
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
                        ListMediaAssetDistributionChannelAttachmentsRequest,
                        ListMediaAssetDistributionChannelAttachmentsResponse>() {
                    @Override
                    public ListMediaAssetDistributionChannelAttachmentsResponse apply(
                            ListMediaAssetDistributionChannelAttachmentsRequest request) {
                        return client.listMediaAssetDistributionChannelAttachments(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaAssetDistributionChannelAttachmentsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model
                                        .MediaAssetDistributionChannelAttachmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model
                                            .MediaAssetDistributionChannelAttachmentSummary>
                            apply(ListMediaAssetDistributionChannelAttachmentsResponse response) {
                        return response.getMediaAssetDistributionChannelAttachmentCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaAssets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaAssetsResponse> listMediaAssetsResponseIterator(
            final ListMediaAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaAssetsRequest.Builder, ListMediaAssetsRequest, ListMediaAssetsResponse>(
                new java.util.function.Supplier<ListMediaAssetsRequest.Builder>() {
                    @Override
                    public ListMediaAssetsRequest.Builder get() {
                        return ListMediaAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaAssetsResponse, String>() {
                    @Override
                    public String apply(ListMediaAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaAssetsRequest.Builder>,
                        ListMediaAssetsRequest>() {
                    @Override
                    public ListMediaAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaAssetsRequest.Builder>
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
                new java.util.function.Function<ListMediaAssetsRequest, ListMediaAssetsResponse>() {
                    @Override
                    public ListMediaAssetsResponse apply(ListMediaAssetsRequest request) {
                        return client.listMediaAssets(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaAssetSummary} objects contained in responses from the
     * listMediaAssets operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaAssetSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaAssetSummary>
            listMediaAssetsRecordIterator(final ListMediaAssetsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaAssetsRequest.Builder,
                ListMediaAssetsRequest,
                ListMediaAssetsResponse,
                com.oracle.bmc.mediaservices.model.MediaAssetSummary>(
                new java.util.function.Supplier<ListMediaAssetsRequest.Builder>() {
                    @Override
                    public ListMediaAssetsRequest.Builder get() {
                        return ListMediaAssetsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaAssetsResponse, String>() {
                    @Override
                    public String apply(ListMediaAssetsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaAssetsRequest.Builder>,
                        ListMediaAssetsRequest>() {
                    @Override
                    public ListMediaAssetsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaAssetsRequest.Builder>
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
                new java.util.function.Function<ListMediaAssetsRequest, ListMediaAssetsResponse>() {
                    @Override
                    public ListMediaAssetsResponse apply(ListMediaAssetsRequest request) {
                        return client.listMediaAssets(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaAssetsResponse,
                        java.util.List<com.oracle.bmc.mediaservices.model.MediaAssetSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.mediaservices.model.MediaAssetSummary>
                            apply(ListMediaAssetsResponse response) {
                        return response.getMediaAssetCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaWorkflowConfigurations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaWorkflowConfigurationsResponse>
            listMediaWorkflowConfigurationsResponseIterator(
                    final ListMediaWorkflowConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaWorkflowConfigurationsRequest.Builder,
                ListMediaWorkflowConfigurationsRequest,
                ListMediaWorkflowConfigurationsResponse>(
                new java.util.function.Supplier<ListMediaWorkflowConfigurationsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowConfigurationsRequest.Builder get() {
                        return ListMediaWorkflowConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowConfigurationsRequest.Builder>,
                        ListMediaWorkflowConfigurationsRequest>() {
                    @Override
                    public ListMediaWorkflowConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowConfigurationsRequest.Builder>
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
                        ListMediaWorkflowConfigurationsRequest,
                        ListMediaWorkflowConfigurationsResponse>() {
                    @Override
                    public ListMediaWorkflowConfigurationsResponse apply(
                            ListMediaWorkflowConfigurationsRequest request) {
                        return client.listMediaWorkflowConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaWorkflowConfigurationSummary} objects contained in
     * responses from the listMediaWorkflowConfigurations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaWorkflowConfigurationSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaWorkflowConfigurationSummary>
            listMediaWorkflowConfigurationsRecordIterator(
                    final ListMediaWorkflowConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaWorkflowConfigurationsRequest.Builder,
                ListMediaWorkflowConfigurationsRequest,
                ListMediaWorkflowConfigurationsResponse,
                com.oracle.bmc.mediaservices.model.MediaWorkflowConfigurationSummary>(
                new java.util.function.Supplier<ListMediaWorkflowConfigurationsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowConfigurationsRequest.Builder get() {
                        return ListMediaWorkflowConfigurationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowConfigurationsRequest.Builder>,
                        ListMediaWorkflowConfigurationsRequest>() {
                    @Override
                    public ListMediaWorkflowConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowConfigurationsRequest.Builder>
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
                        ListMediaWorkflowConfigurationsRequest,
                        ListMediaWorkflowConfigurationsResponse>() {
                    @Override
                    public ListMediaWorkflowConfigurationsResponse apply(
                            ListMediaWorkflowConfigurationsRequest request) {
                        return client.listMediaWorkflowConfigurations(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowConfigurationsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model
                                        .MediaWorkflowConfigurationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model
                                            .MediaWorkflowConfigurationSummary>
                            apply(ListMediaWorkflowConfigurationsResponse response) {
                        return response.getMediaWorkflowConfigurationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaWorkflowJobFacts operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaWorkflowJobFactsResponse> listMediaWorkflowJobFactsResponseIterator(
            final ListMediaWorkflowJobFactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaWorkflowJobFactsRequest.Builder,
                ListMediaWorkflowJobFactsRequest,
                ListMediaWorkflowJobFactsResponse>(
                new java.util.function.Supplier<ListMediaWorkflowJobFactsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowJobFactsRequest.Builder get() {
                        return ListMediaWorkflowJobFactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowJobFactsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowJobFactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowJobFactsRequest.Builder>,
                        ListMediaWorkflowJobFactsRequest>() {
                    @Override
                    public ListMediaWorkflowJobFactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowJobFactsRequest.Builder>
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
                        ListMediaWorkflowJobFactsRequest, ListMediaWorkflowJobFactsResponse>() {
                    @Override
                    public ListMediaWorkflowJobFactsResponse apply(
                            ListMediaWorkflowJobFactsRequest request) {
                        return client.listMediaWorkflowJobFacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary} objects contained in
     * responses from the listMediaWorkflowJobFacts operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary>
            listMediaWorkflowJobFactsRecordIterator(
                    final ListMediaWorkflowJobFactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaWorkflowJobFactsRequest.Builder,
                ListMediaWorkflowJobFactsRequest,
                ListMediaWorkflowJobFactsResponse,
                com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary>(
                new java.util.function.Supplier<ListMediaWorkflowJobFactsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowJobFactsRequest.Builder get() {
                        return ListMediaWorkflowJobFactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowJobFactsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowJobFactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowJobFactsRequest.Builder>,
                        ListMediaWorkflowJobFactsRequest>() {
                    @Override
                    public ListMediaWorkflowJobFactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowJobFactsRequest.Builder>
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
                        ListMediaWorkflowJobFactsRequest, ListMediaWorkflowJobFactsResponse>() {
                    @Override
                    public ListMediaWorkflowJobFactsResponse apply(
                            ListMediaWorkflowJobFactsRequest request) {
                        return client.listMediaWorkflowJobFacts(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowJobFactsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model.MediaWorkflowJobFactSummary>
                            apply(ListMediaWorkflowJobFactsResponse response) {
                        return response.getMediaWorkflowJobFactCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaWorkflowJobs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaWorkflowJobsResponse> listMediaWorkflowJobsResponseIterator(
            final ListMediaWorkflowJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaWorkflowJobsRequest.Builder,
                ListMediaWorkflowJobsRequest,
                ListMediaWorkflowJobsResponse>(
                new java.util.function.Supplier<ListMediaWorkflowJobsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowJobsRequest.Builder get() {
                        return ListMediaWorkflowJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowJobsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowJobsRequest.Builder>,
                        ListMediaWorkflowJobsRequest>() {
                    @Override
                    public ListMediaWorkflowJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowJobsRequest.Builder>
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
                        ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>() {
                    @Override
                    public ListMediaWorkflowJobsResponse apply(
                            ListMediaWorkflowJobsRequest request) {
                        return client.listMediaWorkflowJobs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary} objects contained in responses
     * from the listMediaWorkflowJobs operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary>
            listMediaWorkflowJobsRecordIterator(final ListMediaWorkflowJobsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaWorkflowJobsRequest.Builder,
                ListMediaWorkflowJobsRequest,
                ListMediaWorkflowJobsResponse,
                com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary>(
                new java.util.function.Supplier<ListMediaWorkflowJobsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowJobsRequest.Builder get() {
                        return ListMediaWorkflowJobsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowJobsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowJobsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowJobsRequest.Builder>,
                        ListMediaWorkflowJobsRequest>() {
                    @Override
                    public ListMediaWorkflowJobsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowJobsRequest.Builder>
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
                        ListMediaWorkflowJobsRequest, ListMediaWorkflowJobsResponse>() {
                    @Override
                    public ListMediaWorkflowJobsResponse apply(
                            ListMediaWorkflowJobsRequest request) {
                        return client.listMediaWorkflowJobs(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowJobsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model.MediaWorkflowJobSummary>
                            apply(ListMediaWorkflowJobsResponse response) {
                        return response.getMediaWorkflowJobCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaWorkflowTaskDeclarations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaWorkflowTaskDeclarationsResponse>
            listMediaWorkflowTaskDeclarationsResponseIterator(
                    final ListMediaWorkflowTaskDeclarationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaWorkflowTaskDeclarationsRequest.Builder,
                ListMediaWorkflowTaskDeclarationsRequest,
                ListMediaWorkflowTaskDeclarationsResponse>(
                new java.util.function.Supplier<
                        ListMediaWorkflowTaskDeclarationsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsRequest.Builder get() {
                        return ListMediaWorkflowTaskDeclarationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowTaskDeclarationsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowTaskDeclarationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowTaskDeclarationsRequest.Builder>,
                        ListMediaWorkflowTaskDeclarationsRequest>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowTaskDeclarationsRequest.Builder>
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
                        ListMediaWorkflowTaskDeclarationsRequest,
                        ListMediaWorkflowTaskDeclarationsResponse>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsResponse apply(
                            ListMediaWorkflowTaskDeclarationsRequest request) {
                        return client.listMediaWorkflowTaskDeclarations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclaration} objects contained in
     * responses from the listMediaWorkflowTaskDeclarations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclaration} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclaration>
            listMediaWorkflowTaskDeclarationsRecordIterator(
                    final ListMediaWorkflowTaskDeclarationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaWorkflowTaskDeclarationsRequest.Builder,
                ListMediaWorkflowTaskDeclarationsRequest,
                ListMediaWorkflowTaskDeclarationsResponse,
                com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclaration>(
                new java.util.function.Supplier<
                        ListMediaWorkflowTaskDeclarationsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsRequest.Builder get() {
                        return ListMediaWorkflowTaskDeclarationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowTaskDeclarationsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowTaskDeclarationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowTaskDeclarationsRequest.Builder>,
                        ListMediaWorkflowTaskDeclarationsRequest>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowTaskDeclarationsRequest.Builder>
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
                        ListMediaWorkflowTaskDeclarationsRequest,
                        ListMediaWorkflowTaskDeclarationsResponse>() {
                    @Override
                    public ListMediaWorkflowTaskDeclarationsResponse apply(
                            ListMediaWorkflowTaskDeclarationsRequest request) {
                        return client.listMediaWorkflowTaskDeclarations(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowTaskDeclarationsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model
                                        .MediaWorkflowTaskDeclaration>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model.MediaWorkflowTaskDeclaration>
                            apply(ListMediaWorkflowTaskDeclarationsResponse response) {
                        return response.getMediaWorkflowTaskDeclarationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listMediaWorkflows operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMediaWorkflowsResponse> listMediaWorkflowsResponseIterator(
            final ListMediaWorkflowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListMediaWorkflowsRequest.Builder,
                ListMediaWorkflowsRequest,
                ListMediaWorkflowsResponse>(
                new java.util.function.Supplier<ListMediaWorkflowsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowsRequest.Builder get() {
                        return ListMediaWorkflowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowsRequest.Builder>,
                        ListMediaWorkflowsRequest>() {
                    @Override
                    public ListMediaWorkflowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowsRequest.Builder>
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
                        ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>() {
                    @Override
                    public ListMediaWorkflowsResponse apply(ListMediaWorkflowsRequest request) {
                        return client.listMediaWorkflows(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.MediaWorkflowSummary} objects contained in responses from
     * the listMediaWorkflows operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.MediaWorkflowSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.MediaWorkflowSummary>
            listMediaWorkflowsRecordIterator(final ListMediaWorkflowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListMediaWorkflowsRequest.Builder,
                ListMediaWorkflowsRequest,
                ListMediaWorkflowsResponse,
                com.oracle.bmc.mediaservices.model.MediaWorkflowSummary>(
                new java.util.function.Supplier<ListMediaWorkflowsRequest.Builder>() {
                    @Override
                    public ListMediaWorkflowsRequest.Builder get() {
                        return ListMediaWorkflowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListMediaWorkflowsResponse, String>() {
                    @Override
                    public String apply(ListMediaWorkflowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListMediaWorkflowsRequest.Builder>,
                        ListMediaWorkflowsRequest>() {
                    @Override
                    public ListMediaWorkflowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListMediaWorkflowsRequest.Builder>
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
                        ListMediaWorkflowsRequest, ListMediaWorkflowsResponse>() {
                    @Override
                    public ListMediaWorkflowsResponse apply(ListMediaWorkflowsRequest request) {
                        return client.listMediaWorkflows(request);
                    }
                },
                new java.util.function.Function<
                        ListMediaWorkflowsResponse,
                        java.util.List<com.oracle.bmc.mediaservices.model.MediaWorkflowSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.mediaservices.model.MediaWorkflowSummary>
                            apply(ListMediaWorkflowsResponse response) {
                        return response.getMediaWorkflowCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listStreamCdnConfigs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStreamCdnConfigsResponse> listStreamCdnConfigsResponseIterator(
            final ListStreamCdnConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStreamCdnConfigsRequest.Builder,
                ListStreamCdnConfigsRequest,
                ListStreamCdnConfigsResponse>(
                new java.util.function.Supplier<ListStreamCdnConfigsRequest.Builder>() {
                    @Override
                    public ListStreamCdnConfigsRequest.Builder get() {
                        return ListStreamCdnConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamCdnConfigsResponse, String>() {
                    @Override
                    public String apply(ListStreamCdnConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamCdnConfigsRequest.Builder>,
                        ListStreamCdnConfigsRequest>() {
                    @Override
                    public ListStreamCdnConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamCdnConfigsRequest.Builder>
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
                        ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>() {
                    @Override
                    public ListStreamCdnConfigsResponse apply(ListStreamCdnConfigsRequest request) {
                        return client.listStreamCdnConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary} objects contained in responses
     * from the listStreamCdnConfigs operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary>
            listStreamCdnConfigsRecordIterator(final ListStreamCdnConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStreamCdnConfigsRequest.Builder,
                ListStreamCdnConfigsRequest,
                ListStreamCdnConfigsResponse,
                com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary>(
                new java.util.function.Supplier<ListStreamCdnConfigsRequest.Builder>() {
                    @Override
                    public ListStreamCdnConfigsRequest.Builder get() {
                        return ListStreamCdnConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamCdnConfigsResponse, String>() {
                    @Override
                    public String apply(ListStreamCdnConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamCdnConfigsRequest.Builder>,
                        ListStreamCdnConfigsRequest>() {
                    @Override
                    public ListStreamCdnConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamCdnConfigsRequest.Builder>
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
                        ListStreamCdnConfigsRequest, ListStreamCdnConfigsResponse>() {
                    @Override
                    public ListStreamCdnConfigsResponse apply(ListStreamCdnConfigsRequest request) {
                        return client.listStreamCdnConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListStreamCdnConfigsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.mediaservices.model.StreamCdnConfigSummary>
                            apply(ListStreamCdnConfigsResponse response) {
                        return response.getStreamCdnConfigCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listStreamDistributionChannels operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStreamDistributionChannelsResponse>
            listStreamDistributionChannelsResponseIterator(
                    final ListStreamDistributionChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStreamDistributionChannelsRequest.Builder,
                ListStreamDistributionChannelsRequest,
                ListStreamDistributionChannelsResponse>(
                new java.util.function.Supplier<ListStreamDistributionChannelsRequest.Builder>() {
                    @Override
                    public ListStreamDistributionChannelsRequest.Builder get() {
                        return ListStreamDistributionChannelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamDistributionChannelsResponse, String>() {
                    @Override
                    public String apply(ListStreamDistributionChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamDistributionChannelsRequest.Builder>,
                        ListStreamDistributionChannelsRequest>() {
                    @Override
                    public ListStreamDistributionChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamDistributionChannelsRequest.Builder>
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
                        ListStreamDistributionChannelsRequest,
                        ListStreamDistributionChannelsResponse>() {
                    @Override
                    public ListStreamDistributionChannelsResponse apply(
                            ListStreamDistributionChannelsRequest request) {
                        return client.listStreamDistributionChannels(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.StreamDistributionChannelSummary} objects contained in
     * responses from the listStreamDistributionChannels operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.StreamDistributionChannelSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.StreamDistributionChannelSummary>
            listStreamDistributionChannelsRecordIterator(
                    final ListStreamDistributionChannelsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStreamDistributionChannelsRequest.Builder,
                ListStreamDistributionChannelsRequest,
                ListStreamDistributionChannelsResponse,
                com.oracle.bmc.mediaservices.model.StreamDistributionChannelSummary>(
                new java.util.function.Supplier<ListStreamDistributionChannelsRequest.Builder>() {
                    @Override
                    public ListStreamDistributionChannelsRequest.Builder get() {
                        return ListStreamDistributionChannelsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamDistributionChannelsResponse, String>() {
                    @Override
                    public String apply(ListStreamDistributionChannelsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamDistributionChannelsRequest.Builder>,
                        ListStreamDistributionChannelsRequest>() {
                    @Override
                    public ListStreamDistributionChannelsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamDistributionChannelsRequest.Builder>
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
                        ListStreamDistributionChannelsRequest,
                        ListStreamDistributionChannelsResponse>() {
                    @Override
                    public ListStreamDistributionChannelsResponse apply(
                            ListStreamDistributionChannelsRequest request) {
                        return client.listStreamDistributionChannels(request);
                    }
                },
                new java.util.function.Function<
                        ListStreamDistributionChannelsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model
                                        .StreamDistributionChannelSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model
                                            .StreamDistributionChannelSummary>
                            apply(ListStreamDistributionChannelsResponse response) {
                        return response.getStreamDistributionChannelCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listStreamPackagingConfigs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListStreamPackagingConfigsResponse> listStreamPackagingConfigsResponseIterator(
            final ListStreamPackagingConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListStreamPackagingConfigsRequest.Builder,
                ListStreamPackagingConfigsRequest,
                ListStreamPackagingConfigsResponse>(
                new java.util.function.Supplier<ListStreamPackagingConfigsRequest.Builder>() {
                    @Override
                    public ListStreamPackagingConfigsRequest.Builder get() {
                        return ListStreamPackagingConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamPackagingConfigsResponse, String>() {
                    @Override
                    public String apply(ListStreamPackagingConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamPackagingConfigsRequest.Builder>,
                        ListStreamPackagingConfigsRequest>() {
                    @Override
                    public ListStreamPackagingConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamPackagingConfigsRequest.Builder>
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
                        ListStreamPackagingConfigsRequest, ListStreamPackagingConfigsResponse>() {
                    @Override
                    public ListStreamPackagingConfigsResponse apply(
                            ListStreamPackagingConfigsRequest request) {
                        return client.listStreamPackagingConfigs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.StreamPackagingConfigSummary} objects contained in
     * responses from the listStreamPackagingConfigs operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.StreamPackagingConfigSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.StreamPackagingConfigSummary>
            listStreamPackagingConfigsRecordIterator(
                    final ListStreamPackagingConfigsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListStreamPackagingConfigsRequest.Builder,
                ListStreamPackagingConfigsRequest,
                ListStreamPackagingConfigsResponse,
                com.oracle.bmc.mediaservices.model.StreamPackagingConfigSummary>(
                new java.util.function.Supplier<ListStreamPackagingConfigsRequest.Builder>() {
                    @Override
                    public ListStreamPackagingConfigsRequest.Builder get() {
                        return ListStreamPackagingConfigsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListStreamPackagingConfigsResponse, String>() {
                    @Override
                    public String apply(ListStreamPackagingConfigsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListStreamPackagingConfigsRequest.Builder>,
                        ListStreamPackagingConfigsRequest>() {
                    @Override
                    public ListStreamPackagingConfigsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListStreamPackagingConfigsRequest.Builder>
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
                        ListStreamPackagingConfigsRequest, ListStreamPackagingConfigsResponse>() {
                    @Override
                    public ListStreamPackagingConfigsResponse apply(
                            ListStreamPackagingConfigsRequest request) {
                        return client.listStreamPackagingConfigs(request);
                    }
                },
                new java.util.function.Function<
                        ListStreamPackagingConfigsResponse,
                        java.util.List<
                                com.oracle.bmc.mediaservices.model
                                        .StreamPackagingConfigSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.mediaservices.model.StreamPackagingConfigSummary>
                            apply(ListStreamPackagingConfigsResponse response) {
                        return response.getStreamPackagingConfigCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSystemMediaWorkflows operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSystemMediaWorkflowsResponse> listSystemMediaWorkflowsResponseIterator(
            final ListSystemMediaWorkflowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListSystemMediaWorkflowsRequest.Builder,
                ListSystemMediaWorkflowsRequest,
                ListSystemMediaWorkflowsResponse>(
                new java.util.function.Supplier<ListSystemMediaWorkflowsRequest.Builder>() {
                    @Override
                    public ListSystemMediaWorkflowsRequest.Builder get() {
                        return ListSystemMediaWorkflowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSystemMediaWorkflowsResponse, String>() {
                    @Override
                    public String apply(ListSystemMediaWorkflowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSystemMediaWorkflowsRequest.Builder>,
                        ListSystemMediaWorkflowsRequest>() {
                    @Override
                    public ListSystemMediaWorkflowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSystemMediaWorkflowsRequest.Builder>
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
                        ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>() {
                    @Override
                    public ListSystemMediaWorkflowsResponse apply(
                            ListSystemMediaWorkflowsRequest request) {
                        return client.listSystemMediaWorkflows(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.mediaservices.model.SystemMediaWorkflow} objects contained in responses from
     * the listSystemMediaWorkflows operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.mediaservices.model.SystemMediaWorkflow} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.mediaservices.model.SystemMediaWorkflow>
            listSystemMediaWorkflowsRecordIterator(final ListSystemMediaWorkflowsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListSystemMediaWorkflowsRequest.Builder,
                ListSystemMediaWorkflowsRequest,
                ListSystemMediaWorkflowsResponse,
                com.oracle.bmc.mediaservices.model.SystemMediaWorkflow>(
                new java.util.function.Supplier<ListSystemMediaWorkflowsRequest.Builder>() {
                    @Override
                    public ListSystemMediaWorkflowsRequest.Builder get() {
                        return ListSystemMediaWorkflowsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListSystemMediaWorkflowsResponse, String>() {
                    @Override
                    public String apply(ListSystemMediaWorkflowsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListSystemMediaWorkflowsRequest.Builder>,
                        ListSystemMediaWorkflowsRequest>() {
                    @Override
                    public ListSystemMediaWorkflowsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListSystemMediaWorkflowsRequest.Builder>
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
                        ListSystemMediaWorkflowsRequest, ListSystemMediaWorkflowsResponse>() {
                    @Override
                    public ListSystemMediaWorkflowsResponse apply(
                            ListSystemMediaWorkflowsRequest request) {
                        return client.listSystemMediaWorkflows(request);
                    }
                },
                new java.util.function.Function<
                        ListSystemMediaWorkflowsResponse,
                        java.util.List<com.oracle.bmc.mediaservices.model.SystemMediaWorkflow>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.mediaservices.model.SystemMediaWorkflow>
                            apply(ListSystemMediaWorkflowsResponse response) {
                        return response.getSystemMediaWorkflowCollection().getItems();
                    }
                });
    }
}

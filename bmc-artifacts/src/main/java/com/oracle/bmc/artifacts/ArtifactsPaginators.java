/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Artifacts where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ArtifactsPaginators {
    private final Artifacts client;

    public ArtifactsPaginators(Artifacts client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainerImageSignatures operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainerImageSignaturesResponse>
            listContainerImageSignaturesResponseIterator(
                    final ListContainerImageSignaturesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerImageSignaturesRequest.Builder, ListContainerImageSignaturesRequest,
                ListContainerImageSignaturesResponse>(
                new java.util.function.Supplier<ListContainerImageSignaturesRequest.Builder>() {
                    @Override
                    public ListContainerImageSignaturesRequest.Builder get() {
                        return ListContainerImageSignaturesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerImageSignaturesResponse, String>() {
                    @Override
                    public String apply(ListContainerImageSignaturesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerImageSignaturesRequest.Builder>,
                        ListContainerImageSignaturesRequest>() {
                    @Override
                    public ListContainerImageSignaturesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerImageSignaturesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerImageSignaturesRequest,
                        ListContainerImageSignaturesResponse>() {
                    @Override
                    public ListContainerImageSignaturesResponse apply(
                            ListContainerImageSignaturesRequest request) {
                        return client.listContainerImageSignatures(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary} objects
     * contained in responses from the listContainerImageSignatures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary>
            listContainerImageSignaturesRecordIterator(
                    final ListContainerImageSignaturesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerImageSignaturesRequest.Builder, ListContainerImageSignaturesRequest,
                ListContainerImageSignaturesResponse,
                com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary>(
                new java.util.function.Supplier<ListContainerImageSignaturesRequest.Builder>() {
                    @Override
                    public ListContainerImageSignaturesRequest.Builder get() {
                        return ListContainerImageSignaturesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerImageSignaturesResponse, String>() {
                    @Override
                    public String apply(ListContainerImageSignaturesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerImageSignaturesRequest.Builder>,
                        ListContainerImageSignaturesRequest>() {
                    @Override
                    public ListContainerImageSignaturesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerImageSignaturesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerImageSignaturesRequest,
                        ListContainerImageSignaturesResponse>() {
                    @Override
                    public ListContainerImageSignaturesResponse apply(
                            ListContainerImageSignaturesRequest request) {
                        return client.listContainerImageSignatures(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerImageSignaturesResponse,
                        java.util.List<
                                com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary>
                            apply(ListContainerImageSignaturesResponse response) {
                        return response.getContainerImageSignatureCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainerImages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainerImagesResponse> listContainerImagesResponseIterator(
            final ListContainerImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerImagesRequest.Builder, ListContainerImagesRequest,
                ListContainerImagesResponse>(
                new java.util.function.Supplier<ListContainerImagesRequest.Builder>() {
                    @Override
                    public ListContainerImagesRequest.Builder get() {
                        return ListContainerImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerImagesResponse, String>() {
                    @Override
                    public String apply(ListContainerImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerImagesRequest.Builder>,
                        ListContainerImagesRequest>() {
                    @Override
                    public ListContainerImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerImagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerImagesRequest, ListContainerImagesResponse>() {
                    @Override
                    public ListContainerImagesResponse apply(ListContainerImagesRequest request) {
                        return client.listContainerImages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.artifacts.model.ContainerImageSummary} objects
     * contained in responses from the listContainerImages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.artifacts.model.ContainerImageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerImageSummary>
            listContainerImagesRecordIterator(final ListContainerImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerImagesRequest.Builder, ListContainerImagesRequest,
                ListContainerImagesResponse, com.oracle.bmc.artifacts.model.ContainerImageSummary>(
                new java.util.function.Supplier<ListContainerImagesRequest.Builder>() {
                    @Override
                    public ListContainerImagesRequest.Builder get() {
                        return ListContainerImagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerImagesResponse, String>() {
                    @Override
                    public String apply(ListContainerImagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerImagesRequest.Builder>,
                        ListContainerImagesRequest>() {
                    @Override
                    public ListContainerImagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerImagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerImagesRequest, ListContainerImagesResponse>() {
                    @Override
                    public ListContainerImagesResponse apply(ListContainerImagesRequest request) {
                        return client.listContainerImages(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerImagesResponse,
                        java.util.List<com.oracle.bmc.artifacts.model.ContainerImageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.artifacts.model.ContainerImageSummary>
                            apply(ListContainerImagesResponse response) {
                        return response.getContainerImageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listContainerRepositories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListContainerRepositoriesResponse> listContainerRepositoriesResponseIterator(
            final ListContainerRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListContainerRepositoriesRequest.Builder, ListContainerRepositoriesRequest,
                ListContainerRepositoriesResponse>(
                new java.util.function.Supplier<ListContainerRepositoriesRequest.Builder>() {
                    @Override
                    public ListContainerRepositoriesRequest.Builder get() {
                        return ListContainerRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListContainerRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerRepositoriesRequest.Builder>,
                        ListContainerRepositoriesRequest>() {
                    @Override
                    public ListContainerRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerRepositoriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerRepositoriesRequest, ListContainerRepositoriesResponse>() {
                    @Override
                    public ListContainerRepositoriesResponse apply(
                            ListContainerRepositoriesRequest request) {
                        return client.listContainerRepositories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.artifacts.model.ContainerRepositorySummary} objects
     * contained in responses from the listContainerRepositories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.artifacts.model.ContainerRepositorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerRepositorySummary>
            listContainerRepositoriesRecordIterator(
                    final ListContainerRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListContainerRepositoriesRequest.Builder, ListContainerRepositoriesRequest,
                ListContainerRepositoriesResponse,
                com.oracle.bmc.artifacts.model.ContainerRepositorySummary>(
                new java.util.function.Supplier<ListContainerRepositoriesRequest.Builder>() {
                    @Override
                    public ListContainerRepositoriesRequest.Builder get() {
                        return ListContainerRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListContainerRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListContainerRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListContainerRepositoriesRequest.Builder>,
                        ListContainerRepositoriesRequest>() {
                    @Override
                    public ListContainerRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListContainerRepositoriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListContainerRepositoriesRequest, ListContainerRepositoriesResponse>() {
                    @Override
                    public ListContainerRepositoriesResponse apply(
                            ListContainerRepositoriesRequest request) {
                        return client.listContainerRepositories(request);
                    }
                },
                new java.util.function.Function<
                        ListContainerRepositoriesResponse,
                        java.util.List<
                                com.oracle.bmc.artifacts.model.ContainerRepositorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.artifacts.model.ContainerRepositorySummary>
                            apply(ListContainerRepositoriesResponse response) {
                        return response.getContainerRepositoryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listGenericArtifacts operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListGenericArtifactsResponse> listGenericArtifactsResponseIterator(
            final ListGenericArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListGenericArtifactsRequest.Builder, ListGenericArtifactsRequest,
                ListGenericArtifactsResponse>(
                new java.util.function.Supplier<ListGenericArtifactsRequest.Builder>() {
                    @Override
                    public ListGenericArtifactsRequest.Builder get() {
                        return ListGenericArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGenericArtifactsResponse, String>() {
                    @Override
                    public String apply(ListGenericArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenericArtifactsRequest.Builder>,
                        ListGenericArtifactsRequest>() {
                    @Override
                    public ListGenericArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenericArtifactsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListGenericArtifactsRequest, ListGenericArtifactsResponse>() {
                    @Override
                    public ListGenericArtifactsResponse apply(ListGenericArtifactsRequest request) {
                        return client.listGenericArtifacts(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.artifacts.model.GenericArtifactSummary} objects
     * contained in responses from the listGenericArtifacts operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.artifacts.model.GenericArtifactSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.GenericArtifactSummary>
            listGenericArtifactsRecordIterator(final ListGenericArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListGenericArtifactsRequest.Builder, ListGenericArtifactsRequest,
                ListGenericArtifactsResponse,
                com.oracle.bmc.artifacts.model.GenericArtifactSummary>(
                new java.util.function.Supplier<ListGenericArtifactsRequest.Builder>() {
                    @Override
                    public ListGenericArtifactsRequest.Builder get() {
                        return ListGenericArtifactsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListGenericArtifactsResponse, String>() {
                    @Override
                    public String apply(ListGenericArtifactsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListGenericArtifactsRequest.Builder>,
                        ListGenericArtifactsRequest>() {
                    @Override
                    public ListGenericArtifactsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListGenericArtifactsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListGenericArtifactsRequest, ListGenericArtifactsResponse>() {
                    @Override
                    public ListGenericArtifactsResponse apply(ListGenericArtifactsRequest request) {
                        return client.listGenericArtifacts(request);
                    }
                },
                new java.util.function.Function<
                        ListGenericArtifactsResponse,
                        java.util.List<com.oracle.bmc.artifacts.model.GenericArtifactSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.artifacts.model.GenericArtifactSummary>
                            apply(ListGenericArtifactsResponse response) {
                        return response.getGenericArtifactCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRepositories operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRepositoriesResponse> listRepositoriesResponseIterator(
            final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRepositoriesRequest.Builder, ListRepositoriesRequest, ListRepositoriesResponse>(
                new java.util.function.Supplier<ListRepositoriesRequest.Builder>() {
                    @Override
                    public ListRepositoriesRequest.Builder get() {
                        return ListRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRepositoriesRequest.Builder>,
                        ListRepositoriesRequest>() {
                    @Override
                    public ListRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRepositoriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListRepositoriesRequest, ListRepositoriesResponse>() {
                    @Override
                    public ListRepositoriesResponse apply(ListRepositoriesRequest request) {
                        return client.listRepositories(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.artifacts.model.RepositorySummary} objects
     * contained in responses from the listRepositories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.artifacts.model.RepositorySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.RepositorySummary>
            listRepositoriesRecordIterator(final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRepositoriesRequest.Builder, ListRepositoriesRequest, ListRepositoriesResponse,
                com.oracle.bmc.artifacts.model.RepositorySummary>(
                new java.util.function.Supplier<ListRepositoriesRequest.Builder>() {
                    @Override
                    public ListRepositoriesRequest.Builder get() {
                        return ListRepositoriesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRepositoriesResponse, String>() {
                    @Override
                    public String apply(ListRepositoriesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRepositoriesRequest.Builder>,
                        ListRepositoriesRequest>() {
                    @Override
                    public ListRepositoriesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRepositoriesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListRepositoriesRequest, ListRepositoriesResponse>() {
                    @Override
                    public ListRepositoriesResponse apply(ListRepositoriesRequest request) {
                        return client.listRepositories(request);
                    }
                },
                new java.util.function.Function<
                        ListRepositoriesResponse,
                        java.util.List<com.oracle.bmc.artifacts.model.RepositorySummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.artifacts.model.RepositorySummary> apply(
                            ListRepositoriesResponse response) {
                        return response.getRepositoryCollection().getItems();
                    }
                });
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of DatabaseToolsRuntime where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class DatabaseToolsRuntimePaginators {
    private final DatabaseToolsRuntime client;

    public DatabaseToolsRuntimePaginators(DatabaseToolsRuntime client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCredentialExecuteGrantees operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCredentialExecuteGranteesResponse>
            listCredentialExecuteGranteesResponseIterator(
                    final ListCredentialExecuteGranteesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCredentialExecuteGranteesRequest.Builder, ListCredentialExecuteGranteesRequest,
                ListCredentialExecuteGranteesResponse>(
                new java.util.function.Supplier<ListCredentialExecuteGranteesRequest.Builder>() {
                    @Override
                    public ListCredentialExecuteGranteesRequest.Builder get() {
                        return ListCredentialExecuteGranteesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialExecuteGranteesResponse, String>() {
                    @Override
                    public String apply(ListCredentialExecuteGranteesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialExecuteGranteesRequest.Builder>,
                        ListCredentialExecuteGranteesRequest>() {
                    @Override
                    public ListCredentialExecuteGranteesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialExecuteGranteesRequest.Builder>
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
                        ListCredentialExecuteGranteesRequest,
                        ListCredentialExecuteGranteesResponse>() {
                    @Override
                    public ListCredentialExecuteGranteesResponse apply(
                            ListCredentialExecuteGranteesRequest request) {
                        return client.listCredentialExecuteGrantees(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGranteeSummary} objects
     * contained in responses from the listCredentialExecuteGrantees operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGranteeSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGranteeSummary>
            listCredentialExecuteGranteesRecordIterator(
                    final ListCredentialExecuteGranteesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCredentialExecuteGranteesRequest.Builder, ListCredentialExecuteGranteesRequest,
                ListCredentialExecuteGranteesResponse,
                com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGranteeSummary>(
                new java.util.function.Supplier<ListCredentialExecuteGranteesRequest.Builder>() {
                    @Override
                    public ListCredentialExecuteGranteesRequest.Builder get() {
                        return ListCredentialExecuteGranteesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialExecuteGranteesResponse, String>() {
                    @Override
                    public String apply(ListCredentialExecuteGranteesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialExecuteGranteesRequest.Builder>,
                        ListCredentialExecuteGranteesRequest>() {
                    @Override
                    public ListCredentialExecuteGranteesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialExecuteGranteesRequest.Builder>
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
                        ListCredentialExecuteGranteesRequest,
                        ListCredentialExecuteGranteesResponse>() {
                    @Override
                    public ListCredentialExecuteGranteesResponse apply(
                            ListCredentialExecuteGranteesRequest request) {
                        return client.listCredentialExecuteGrantees(request);
                    }
                },
                new java.util.function.Function<
                        ListCredentialExecuteGranteesResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .CredentialExecuteGranteeSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model
                                            .CredentialExecuteGranteeSummary>
                            apply(ListCredentialExecuteGranteesResponse response) {
                        return response.getCredentialExecuteGranteeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCredentialPublicSynonyms operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCredentialPublicSynonymsResponse>
            listCredentialPublicSynonymsResponseIterator(
                    final ListCredentialPublicSynonymsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCredentialPublicSynonymsRequest.Builder, ListCredentialPublicSynonymsRequest,
                ListCredentialPublicSynonymsResponse>(
                new java.util.function.Supplier<ListCredentialPublicSynonymsRequest.Builder>() {
                    @Override
                    public ListCredentialPublicSynonymsRequest.Builder get() {
                        return ListCredentialPublicSynonymsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialPublicSynonymsResponse, String>() {
                    @Override
                    public String apply(ListCredentialPublicSynonymsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialPublicSynonymsRequest.Builder>,
                        ListCredentialPublicSynonymsRequest>() {
                    @Override
                    public ListCredentialPublicSynonymsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialPublicSynonymsRequest.Builder>
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
                        ListCredentialPublicSynonymsRequest,
                        ListCredentialPublicSynonymsResponse>() {
                    @Override
                    public ListCredentialPublicSynonymsResponse apply(
                            ListCredentialPublicSynonymsRequest request) {
                        return client.listCredentialPublicSynonyms(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonymSummary} objects
     * contained in responses from the listCredentialPublicSynonyms operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonymSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonymSummary>
            listCredentialPublicSynonymsRecordIterator(
                    final ListCredentialPublicSynonymsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCredentialPublicSynonymsRequest.Builder, ListCredentialPublicSynonymsRequest,
                ListCredentialPublicSynonymsResponse,
                com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonymSummary>(
                new java.util.function.Supplier<ListCredentialPublicSynonymsRequest.Builder>() {
                    @Override
                    public ListCredentialPublicSynonymsRequest.Builder get() {
                        return ListCredentialPublicSynonymsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialPublicSynonymsResponse, String>() {
                    @Override
                    public String apply(ListCredentialPublicSynonymsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialPublicSynonymsRequest.Builder>,
                        ListCredentialPublicSynonymsRequest>() {
                    @Override
                    public ListCredentialPublicSynonymsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialPublicSynonymsRequest.Builder>
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
                        ListCredentialPublicSynonymsRequest,
                        ListCredentialPublicSynonymsResponse>() {
                    @Override
                    public ListCredentialPublicSynonymsResponse apply(
                            ListCredentialPublicSynonymsRequest request) {
                        return client.listCredentialPublicSynonyms(request);
                    }
                },
                new java.util.function.Function<
                        ListCredentialPublicSynonymsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .CredentialPublicSynonymSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model
                                            .CredentialPublicSynonymSummary>
                            apply(ListCredentialPublicSynonymsResponse response) {
                        return response.getCredentialPublicSynonymCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listCredentials operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListCredentialsResponse> listCredentialsResponseIterator(
            final ListCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCredentialsRequest.Builder, ListCredentialsRequest, ListCredentialsResponse>(
                new java.util.function.Supplier<ListCredentialsRequest.Builder>() {
                    @Override
                    public ListCredentialsRequest.Builder get() {
                        return ListCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialsResponse, String>() {
                    @Override
                    public String apply(ListCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialsRequest.Builder>,
                        ListCredentialsRequest>() {
                    @Override
                    public ListCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialsRequest.Builder>
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
                new java.util.function.Function<ListCredentialsRequest, ListCredentialsResponse>() {
                    @Override
                    public ListCredentialsResponse apply(ListCredentialsRequest request) {
                        return client.listCredentials(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialSummary} objects
     * contained in responses from the listCredentials operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.CredentialSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.CredentialSummary>
            listCredentialsRecordIterator(final ListCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCredentialsRequest.Builder, ListCredentialsRequest, ListCredentialsResponse,
                com.oracle.bmc.databasetoolsruntime.model.CredentialSummary>(
                new java.util.function.Supplier<ListCredentialsRequest.Builder>() {
                    @Override
                    public ListCredentialsRequest.Builder get() {
                        return ListCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCredentialsResponse, String>() {
                    @Override
                    public String apply(ListCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCredentialsRequest.Builder>,
                        ListCredentialsRequest>() {
                    @Override
                    public ListCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCredentialsRequest.Builder>
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
                new java.util.function.Function<ListCredentialsRequest, ListCredentialsResponse>() {
                    @Override
                    public ListCredentialsResponse apply(ListCredentialsRequest request) {
                        return client.listCredentials(request);
                    }
                },
                new java.util.function.Function<
                        ListCredentialsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model.CredentialSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model.CredentialSummary>
                            apply(ListCredentialsResponse response) {
                        return response.getCredentialCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponseIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder
                            get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
                                .builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse, String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
                                    response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
                                        .Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                                request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary} objects
     * contained in responses from the listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasetoolsruntime.model
                            .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary>
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRecordIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse,
                com.oracle.bmc.databasetoolsruntime.model
                        .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest.Builder
                            get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
                                .builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse, String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
                                    response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
                                        .Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                                request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model
                                            .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecSummary>
                            apply(
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
                                            response) {
                        return response.getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponseIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                            request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                .Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest.Builder
                            get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                .builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse,
                        String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
                                    response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                        .Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                    request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                                request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary} objects
     * contained in responses from the listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasetoolsruntime.model
                            .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary>
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRecordIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                            request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse,
                com.oracle.bmc.databasetoolsruntime.model
                        .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                .Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest.Builder
                            get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                .builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse,
                        String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
                                    response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                        .Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest
                                    request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                                request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model
                                            .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecSummary>
                            apply(
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
                                            response) {
                        return response.getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listDatabaseToolsDatabaseApiGatewayConfigPools operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolsResponseIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse, String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolSummary} objects
     * contained in responses from the listDatabaseToolsDatabaseApiGatewayConfigPools operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPoolSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<
                    com.oracle.bmc.databasetoolsruntime.model
                            .DatabaseToolsDatabaseApiGatewayConfigPoolSummary>
            listDatabaseToolsDatabaseApiGatewayConfigPoolsRecordIterator(
                    final ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse,
                com.oracle.bmc.databasetoolsruntime.model
                        .DatabaseToolsDatabaseApiGatewayConfigPoolSummary>(
                new java.util.function.Supplier<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder get() {
                        return ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.builder()
                                .copy(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse, String>() {
                    @Override
                    public String apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest.Builder>,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest
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
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>() {
                    @Override
                    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse apply(
                            ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {
                        return client.listDatabaseToolsDatabaseApiGatewayConfigPools(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .DatabaseToolsDatabaseApiGatewayConfigPoolSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model
                                            .DatabaseToolsDatabaseApiGatewayConfigPoolSummary>
                            apply(ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse response) {
                        return response.getDatabaseToolsDatabaseApiGatewayConfigPoolCollection()
                                .getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listUserCredentials operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListUserCredentialsResponse> listUserCredentialsResponseIterator(
            final ListUserCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListUserCredentialsRequest.Builder, ListUserCredentialsRequest,
                ListUserCredentialsResponse>(
                new java.util.function.Supplier<ListUserCredentialsRequest.Builder>() {
                    @Override
                    public ListUserCredentialsRequest.Builder get() {
                        return ListUserCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserCredentialsResponse, String>() {
                    @Override
                    public String apply(ListUserCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserCredentialsRequest.Builder>,
                        ListUserCredentialsRequest>() {
                    @Override
                    public ListUserCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserCredentialsRequest.Builder>
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
                        ListUserCredentialsRequest, ListUserCredentialsResponse>() {
                    @Override
                    public ListUserCredentialsResponse apply(ListUserCredentialsRequest request) {
                        return client.listUserCredentials(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.UserCredentialSummary} objects
     * contained in responses from the listUserCredentials operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.UserCredentialSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.UserCredentialSummary>
            listUserCredentialsRecordIterator(final ListUserCredentialsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListUserCredentialsRequest.Builder, ListUserCredentialsRequest,
                ListUserCredentialsResponse,
                com.oracle.bmc.databasetoolsruntime.model.UserCredentialSummary>(
                new java.util.function.Supplier<ListUserCredentialsRequest.Builder>() {
                    @Override
                    public ListUserCredentialsRequest.Builder get() {
                        return ListUserCredentialsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListUserCredentialsResponse, String>() {
                    @Override
                    public String apply(ListUserCredentialsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListUserCredentialsRequest.Builder>,
                        ListUserCredentialsRequest>() {
                    @Override
                    public ListUserCredentialsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListUserCredentialsRequest.Builder>
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
                        ListUserCredentialsRequest, ListUserCredentialsResponse>() {
                    @Override
                    public ListUserCredentialsResponse apply(ListUserCredentialsRequest request) {
                        return client.listUserCredentials(request);
                    }
                },
                new java.util.function.Function<
                        ListUserCredentialsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model
                                        .UserCredentialSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model.UserCredentialSummary>
                            apply(ListUserCredentialsResponse response) {
                        return response.getUserCredentialCollection().getItems();
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
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestError} objects
     * contained in responses from the listWorkRequestErrors operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestError} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder, ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.databasetoolsruntime.model.WorkRequestError>(
                new java.util.function.Supplier<ListWorkRequestErrorsRequest.Builder>() {
                    @Override
                    public ListWorkRequestErrorsRequest.Builder get() {
                        return ListWorkRequestErrorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestErrorsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestErrorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestErrorsRequest.Builder>,
                        ListWorkRequestErrorsRequest>() {
                    @Override
                    public ListWorkRequestErrorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestErrorsRequest.Builder>
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
                        ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>() {
                    @Override
                    public ListWorkRequestErrorsResponse apply(
                            ListWorkRequestErrorsRequest request) {
                        return client.listWorkRequestErrors(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestErrorsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
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
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry} objects
     * contained in responses from the listWorkRequestLogs operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder, ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry>(
                new java.util.function.Supplier<ListWorkRequestLogsRequest.Builder>() {
                    @Override
                    public ListWorkRequestLogsRequest.Builder get() {
                        return ListWorkRequestLogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestLogsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestLogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestLogsRequest.Builder>,
                        ListWorkRequestLogsRequest>() {
                    @Override
                    public ListWorkRequestLogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestLogsRequest.Builder>
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
                        ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>() {
                    @Override
                    public ListWorkRequestLogsResponse apply(ListWorkRequestLogsRequest request) {
                        return client.listWorkRequestLogs(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestLogsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntry>
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
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary} objects
     * contained in responses from the listWorkRequests operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder, ListWorkRequestsRequest, ListWorkRequestsResponse,
                com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary>(
                new java.util.function.Supplier<ListWorkRequestsRequest.Builder>() {
                    @Override
                    public ListWorkRequestsRequest.Builder get() {
                        return ListWorkRequestsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListWorkRequestsResponse, String>() {
                    @Override
                    public String apply(ListWorkRequestsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListWorkRequestsRequest.Builder>,
                        ListWorkRequestsRequest>() {
                    @Override
                    public ListWorkRequestsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListWorkRequestsRequest.Builder>
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
                        ListWorkRequestsRequest, ListWorkRequestsResponse>() {
                    @Override
                    public ListWorkRequestsResponse apply(ListWorkRequestsRequest request) {
                        return client.listWorkRequests(request);
                    }
                },
                new java.util.function.Function<
                        ListWorkRequestsResponse,
                        java.util.List<
                                com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.databasetoolsruntime.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestCollection().getItems();
                    }
                });
    }
}

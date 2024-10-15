/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate;

import com.oracle.bmc.goldengate.requests.*;
import com.oracle.bmc.goldengate.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of GoldenGate where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class GoldenGatePaginators {
    private final GoldenGate client;

    public GoldenGatePaginators(GoldenGate client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificatesResponse> listCertificatesResponseIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListCertificatesRequest.Builder, ListCertificatesRequest, ListCertificatesResponse>(
                new java.util.function.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.CertificateSummary} objects contained in responses from the
     * listCertificates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.CertificateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.CertificateSummary>
            listCertificatesRecordIterator(final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListCertificatesRequest.Builder,
                ListCertificatesRequest,
                ListCertificatesResponse,
                com.oracle.bmc.goldengate.model.CertificateSummary>(
                new java.util.function.Supplier<ListCertificatesRequest.Builder>() {
                    @Override
                    public ListCertificatesRequest.Builder get() {
                        return ListCertificatesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListCertificatesResponse, String>() {
                    @Override
                    public String apply(ListCertificatesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListCertificatesRequest.Builder>,
                        ListCertificatesRequest>() {
                    @Override
                    public ListCertificatesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListCertificatesRequest.Builder>
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
                        ListCertificatesRequest, ListCertificatesResponse>() {
                    @Override
                    public ListCertificatesResponse apply(ListCertificatesRequest request) {
                        return client.listCertificates(request);
                    }
                },
                new java.util.function.Function<
                        ListCertificatesResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.CertificateSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.CertificateSummary> apply(
                            ListCertificatesResponse response) {
                        return response.getCertificateCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConnectionAssignments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListConnectionAssignmentsResponse> listConnectionAssignmentsResponseIterator(
            final ListConnectionAssignmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionAssignmentsRequest.Builder,
                ListConnectionAssignmentsRequest,
                ListConnectionAssignmentsResponse>(
                new java.util.function.Supplier<ListConnectionAssignmentsRequest.Builder>() {
                    @Override
                    public ListConnectionAssignmentsRequest.Builder get() {
                        return ListConnectionAssignmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionAssignmentsResponse, String>() {
                    @Override
                    public String apply(ListConnectionAssignmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionAssignmentsRequest.Builder>,
                        ListConnectionAssignmentsRequest>() {
                    @Override
                    public ListConnectionAssignmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionAssignmentsRequest.Builder>
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
                        ListConnectionAssignmentsRequest, ListConnectionAssignmentsResponse>() {
                    @Override
                    public ListConnectionAssignmentsResponse apply(
                            ListConnectionAssignmentsRequest request) {
                        return client.listConnectionAssignments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary} objects contained in responses
     * from the listConnectionAssignments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary>
            listConnectionAssignmentsRecordIterator(
                    final ListConnectionAssignmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionAssignmentsRequest.Builder,
                ListConnectionAssignmentsRequest,
                ListConnectionAssignmentsResponse,
                com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary>(
                new java.util.function.Supplier<ListConnectionAssignmentsRequest.Builder>() {
                    @Override
                    public ListConnectionAssignmentsRequest.Builder get() {
                        return ListConnectionAssignmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionAssignmentsResponse, String>() {
                    @Override
                    public String apply(ListConnectionAssignmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionAssignmentsRequest.Builder>,
                        ListConnectionAssignmentsRequest>() {
                    @Override
                    public ListConnectionAssignmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionAssignmentsRequest.Builder>
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
                        ListConnectionAssignmentsRequest, ListConnectionAssignmentsResponse>() {
                    @Override
                    public ListConnectionAssignmentsResponse apply(
                            ListConnectionAssignmentsRequest request) {
                        return client.listConnectionAssignments(request);
                    }
                },
                new java.util.function.Function<
                        ListConnectionAssignmentsResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.goldengate.model.ConnectionAssignmentSummary>
                            apply(ListConnectionAssignmentsResponse response) {
                        return response.getConnectionAssignmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListConnectionsResponse> listConnectionsResponseIterator(
            final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListConnectionsRequest.Builder, ListConnectionsRequest, ListConnectionsResponse>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.ConnectionSummary} objects contained in responses from the
     * listConnections operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.ConnectionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.ConnectionSummary>
            listConnectionsRecordIterator(final ListConnectionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListConnectionsRequest.Builder,
                ListConnectionsRequest,
                ListConnectionsResponse,
                com.oracle.bmc.goldengate.model.ConnectionSummary>(
                new java.util.function.Supplier<ListConnectionsRequest.Builder>() {
                    @Override
                    public ListConnectionsRequest.Builder get() {
                        return ListConnectionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListConnectionsResponse, String>() {
                    @Override
                    public String apply(ListConnectionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListConnectionsRequest.Builder>,
                        ListConnectionsRequest>() {
                    @Override
                    public ListConnectionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListConnectionsRequest.Builder>
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
                new java.util.function.Function<ListConnectionsRequest, ListConnectionsResponse>() {
                    @Override
                    public ListConnectionsResponse apply(ListConnectionsRequest request) {
                        return client.listConnections(request);
                    }
                },
                new java.util.function.Function<
                        ListConnectionsResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.ConnectionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.ConnectionSummary> apply(
                            ListConnectionsResponse response) {
                        return response.getConnectionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDatabaseRegistrations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDatabaseRegistrationsResponse> listDatabaseRegistrationsResponseIterator(
            final ListDatabaseRegistrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDatabaseRegistrationsRequest.Builder,
                ListDatabaseRegistrationsRequest,
                ListDatabaseRegistrationsResponse>(
                new java.util.function.Supplier<ListDatabaseRegistrationsRequest.Builder>() {
                    @Override
                    public ListDatabaseRegistrationsRequest.Builder get() {
                        return ListDatabaseRegistrationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseRegistrationsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseRegistrationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseRegistrationsRequest.Builder>,
                        ListDatabaseRegistrationsRequest>() {
                    @Override
                    public ListDatabaseRegistrationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseRegistrationsRequest.Builder>
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
                        ListDatabaseRegistrationsRequest, ListDatabaseRegistrationsResponse>() {
                    @Override
                    public ListDatabaseRegistrationsResponse apply(
                            ListDatabaseRegistrationsRequest request) {
                        return client.listDatabaseRegistrations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary} objects contained in responses
     * from the listDatabaseRegistrations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary>
            listDatabaseRegistrationsRecordIterator(
                    final ListDatabaseRegistrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDatabaseRegistrationsRequest.Builder,
                ListDatabaseRegistrationsRequest,
                ListDatabaseRegistrationsResponse,
                com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary>(
                new java.util.function.Supplier<ListDatabaseRegistrationsRequest.Builder>() {
                    @Override
                    public ListDatabaseRegistrationsRequest.Builder get() {
                        return ListDatabaseRegistrationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDatabaseRegistrationsResponse, String>() {
                    @Override
                    public String apply(ListDatabaseRegistrationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDatabaseRegistrationsRequest.Builder>,
                        ListDatabaseRegistrationsRequest>() {
                    @Override
                    public ListDatabaseRegistrationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDatabaseRegistrationsRequest.Builder>
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
                        ListDatabaseRegistrationsRequest, ListDatabaseRegistrationsResponse>() {
                    @Override
                    public ListDatabaseRegistrationsResponse apply(
                            ListDatabaseRegistrationsRequest request) {
                        return client.listDatabaseRegistrations(request);
                    }
                },
                new java.util.function.Function<
                        ListDatabaseRegistrationsResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.goldengate.model.DatabaseRegistrationSummary>
                            apply(ListDatabaseRegistrationsResponse response) {
                        return response.getDatabaseRegistrationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentBackups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentBackupsResponse> listDeploymentBackupsResponseIterator(
            final ListDeploymentBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentBackupsRequest.Builder,
                ListDeploymentBackupsRequest,
                ListDeploymentBackupsResponse>(
                new java.util.function.Supplier<ListDeploymentBackupsRequest.Builder>() {
                    @Override
                    public ListDeploymentBackupsRequest.Builder get() {
                        return ListDeploymentBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentBackupsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentBackupsRequest.Builder>,
                        ListDeploymentBackupsRequest>() {
                    @Override
                    public ListDeploymentBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentBackupsRequest.Builder>
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
                        ListDeploymentBackupsRequest, ListDeploymentBackupsResponse>() {
                    @Override
                    public ListDeploymentBackupsResponse apply(
                            ListDeploymentBackupsRequest request) {
                        return client.listDeploymentBackups(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentBackupSummary} objects contained in responses from
     * the listDeploymentBackups operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentBackupSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentBackupSummary>
            listDeploymentBackupsRecordIterator(final ListDeploymentBackupsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentBackupsRequest.Builder,
                ListDeploymentBackupsRequest,
                ListDeploymentBackupsResponse,
                com.oracle.bmc.goldengate.model.DeploymentBackupSummary>(
                new java.util.function.Supplier<ListDeploymentBackupsRequest.Builder>() {
                    @Override
                    public ListDeploymentBackupsRequest.Builder get() {
                        return ListDeploymentBackupsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentBackupsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentBackupsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentBackupsRequest.Builder>,
                        ListDeploymentBackupsRequest>() {
                    @Override
                    public ListDeploymentBackupsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentBackupsRequest.Builder>
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
                        ListDeploymentBackupsRequest, ListDeploymentBackupsResponse>() {
                    @Override
                    public ListDeploymentBackupsResponse apply(
                            ListDeploymentBackupsRequest request) {
                        return client.listDeploymentBackups(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentBackupsResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.DeploymentBackupSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.DeploymentBackupSummary>
                            apply(ListDeploymentBackupsResponse response) {
                        return response.getDeploymentBackupCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentEnvironments operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentEnvironmentsResponse> listDeploymentEnvironmentsResponseIterator(
            final ListDeploymentEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentEnvironmentsRequest.Builder,
                ListDeploymentEnvironmentsRequest,
                ListDeploymentEnvironmentsResponse>(
                new java.util.function.Supplier<ListDeploymentEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeploymentEnvironmentsRequest.Builder get() {
                        return ListDeploymentEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentEnvironmentsRequest.Builder>,
                        ListDeploymentEnvironmentsRequest>() {
                    @Override
                    public ListDeploymentEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentEnvironmentsRequest.Builder>
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
                        ListDeploymentEnvironmentsRequest, ListDeploymentEnvironmentsResponse>() {
                    @Override
                    public ListDeploymentEnvironmentsResponse apply(
                            ListDeploymentEnvironmentsRequest request) {
                        return client.listDeploymentEnvironments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary} objects contained in responses
     * from the listDeploymentEnvironments operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary>
            listDeploymentEnvironmentsRecordIterator(
                    final ListDeploymentEnvironmentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentEnvironmentsRequest.Builder,
                ListDeploymentEnvironmentsRequest,
                ListDeploymentEnvironmentsResponse,
                com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary>(
                new java.util.function.Supplier<ListDeploymentEnvironmentsRequest.Builder>() {
                    @Override
                    public ListDeploymentEnvironmentsRequest.Builder get() {
                        return ListDeploymentEnvironmentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentEnvironmentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentEnvironmentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentEnvironmentsRequest.Builder>,
                        ListDeploymentEnvironmentsRequest>() {
                    @Override
                    public ListDeploymentEnvironmentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentEnvironmentsRequest.Builder>
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
                        ListDeploymentEnvironmentsRequest, ListDeploymentEnvironmentsResponse>() {
                    @Override
                    public ListDeploymentEnvironmentsResponse apply(
                            ListDeploymentEnvironmentsRequest request) {
                        return client.listDeploymentEnvironments(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentEnvironmentsResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.goldengate.model.DeploymentEnvironmentSummary>
                            apply(ListDeploymentEnvironmentsResponse response) {
                        return response.getDeploymentEnvironmentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentTypesResponse> listDeploymentTypesResponseIterator(
            final ListDeploymentTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentTypesRequest.Builder,
                ListDeploymentTypesRequest,
                ListDeploymentTypesResponse>(
                new java.util.function.Supplier<ListDeploymentTypesRequest.Builder>() {
                    @Override
                    public ListDeploymentTypesRequest.Builder get() {
                        return ListDeploymentTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentTypesResponse, String>() {
                    @Override
                    public String apply(ListDeploymentTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentTypesRequest.Builder>,
                        ListDeploymentTypesRequest>() {
                    @Override
                    public ListDeploymentTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentTypesRequest.Builder>
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
                        ListDeploymentTypesRequest, ListDeploymentTypesResponse>() {
                    @Override
                    public ListDeploymentTypesResponse apply(ListDeploymentTypesRequest request) {
                        return client.listDeploymentTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentTypeSummary} objects contained in responses from
     * the listDeploymentTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentTypeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentTypeSummary>
            listDeploymentTypesRecordIterator(final ListDeploymentTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentTypesRequest.Builder,
                ListDeploymentTypesRequest,
                ListDeploymentTypesResponse,
                com.oracle.bmc.goldengate.model.DeploymentTypeSummary>(
                new java.util.function.Supplier<ListDeploymentTypesRequest.Builder>() {
                    @Override
                    public ListDeploymentTypesRequest.Builder get() {
                        return ListDeploymentTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentTypesResponse, String>() {
                    @Override
                    public String apply(ListDeploymentTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentTypesRequest.Builder>,
                        ListDeploymentTypesRequest>() {
                    @Override
                    public ListDeploymentTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentTypesRequest.Builder>
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
                        ListDeploymentTypesRequest, ListDeploymentTypesResponse>() {
                    @Override
                    public ListDeploymentTypesResponse apply(ListDeploymentTypesRequest request) {
                        return client.listDeploymentTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentTypesResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.DeploymentTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.DeploymentTypeSummary>
                            apply(ListDeploymentTypesResponse response) {
                        return response.getDeploymentTypeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentUpgrades operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentUpgradesResponse> listDeploymentUpgradesResponseIterator(
            final ListDeploymentUpgradesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentUpgradesRequest.Builder,
                ListDeploymentUpgradesRequest,
                ListDeploymentUpgradesResponse>(
                new java.util.function.Supplier<ListDeploymentUpgradesRequest.Builder>() {
                    @Override
                    public ListDeploymentUpgradesRequest.Builder get() {
                        return ListDeploymentUpgradesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentUpgradesResponse, String>() {
                    @Override
                    public String apply(ListDeploymentUpgradesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentUpgradesRequest.Builder>,
                        ListDeploymentUpgradesRequest>() {
                    @Override
                    public ListDeploymentUpgradesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentUpgradesRequest.Builder>
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
                        ListDeploymentUpgradesRequest, ListDeploymentUpgradesResponse>() {
                    @Override
                    public ListDeploymentUpgradesResponse apply(
                            ListDeploymentUpgradesRequest request) {
                        return client.listDeploymentUpgrades(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary} objects contained in responses from
     * the listDeploymentUpgrades operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary>
            listDeploymentUpgradesRecordIterator(final ListDeploymentUpgradesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentUpgradesRequest.Builder,
                ListDeploymentUpgradesRequest,
                ListDeploymentUpgradesResponse,
                com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary>(
                new java.util.function.Supplier<ListDeploymentUpgradesRequest.Builder>() {
                    @Override
                    public ListDeploymentUpgradesRequest.Builder get() {
                        return ListDeploymentUpgradesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentUpgradesResponse, String>() {
                    @Override
                    public String apply(ListDeploymentUpgradesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentUpgradesRequest.Builder>,
                        ListDeploymentUpgradesRequest>() {
                    @Override
                    public ListDeploymentUpgradesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentUpgradesRequest.Builder>
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
                        ListDeploymentUpgradesRequest, ListDeploymentUpgradesResponse>() {
                    @Override
                    public ListDeploymentUpgradesResponse apply(
                            ListDeploymentUpgradesRequest request) {
                        return client.listDeploymentUpgrades(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentUpgradesResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.DeploymentUpgradeSummary>
                            apply(ListDeploymentUpgradesResponse response) {
                        return response.getDeploymentUpgradeCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentVersionsResponse> listDeploymentVersionsResponseIterator(
            final ListDeploymentVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentVersionsRequest.Builder,
                ListDeploymentVersionsRequest,
                ListDeploymentVersionsResponse>(
                new java.util.function.Supplier<ListDeploymentVersionsRequest.Builder>() {
                    @Override
                    public ListDeploymentVersionsRequest.Builder get() {
                        return ListDeploymentVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentVersionsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentVersionsRequest.Builder>,
                        ListDeploymentVersionsRequest>() {
                    @Override
                    public ListDeploymentVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentVersionsRequest.Builder>
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
                        ListDeploymentVersionsRequest, ListDeploymentVersionsResponse>() {
                    @Override
                    public ListDeploymentVersionsResponse apply(
                            ListDeploymentVersionsRequest request) {
                        return client.listDeploymentVersions(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentVersionSummary} objects contained in responses from
     * the listDeploymentVersions operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentVersionSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentVersionSummary>
            listDeploymentVersionsRecordIterator(final ListDeploymentVersionsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentVersionsRequest.Builder,
                ListDeploymentVersionsRequest,
                ListDeploymentVersionsResponse,
                com.oracle.bmc.goldengate.model.DeploymentVersionSummary>(
                new java.util.function.Supplier<ListDeploymentVersionsRequest.Builder>() {
                    @Override
                    public ListDeploymentVersionsRequest.Builder get() {
                        return ListDeploymentVersionsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentVersionsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentVersionsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentVersionsRequest.Builder>,
                        ListDeploymentVersionsRequest>() {
                    @Override
                    public ListDeploymentVersionsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentVersionsRequest.Builder>
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
                        ListDeploymentVersionsRequest, ListDeploymentVersionsResponse>() {
                    @Override
                    public ListDeploymentVersionsResponse apply(
                            ListDeploymentVersionsRequest request) {
                        return client.listDeploymentVersions(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentVersionsResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model.DeploymentVersionSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.DeploymentVersionSummary>
                            apply(ListDeploymentVersionsResponse response) {
                        return response.getDeploymentVersionCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeploymentWalletsOperations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentWalletsOperationsResponse>
            listDeploymentWalletsOperationsResponseIterator(
                    final ListDeploymentWalletsOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentWalletsOperationsRequest.Builder,
                ListDeploymentWalletsOperationsRequest,
                ListDeploymentWalletsOperationsResponse>(
                new java.util.function.Supplier<ListDeploymentWalletsOperationsRequest.Builder>() {
                    @Override
                    public ListDeploymentWalletsOperationsRequest.Builder get() {
                        return ListDeploymentWalletsOperationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentWalletsOperationsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentWalletsOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentWalletsOperationsRequest.Builder>,
                        ListDeploymentWalletsOperationsRequest>() {
                    @Override
                    public ListDeploymentWalletsOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentWalletsOperationsRequest.Builder>
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
                        ListDeploymentWalletsOperationsRequest,
                        ListDeploymentWalletsOperationsResponse>() {
                    @Override
                    public ListDeploymentWalletsOperationsResponse apply(
                            ListDeploymentWalletsOperationsRequest request) {
                        return client.listDeploymentWalletsOperations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentWalletsOperationSummary} objects contained in
     * responses from the listDeploymentWalletsOperations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentWalletsOperationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentWalletsOperationSummary>
            listDeploymentWalletsOperationsRecordIterator(
                    final ListDeploymentWalletsOperationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentWalletsOperationsRequest.Builder,
                ListDeploymentWalletsOperationsRequest,
                ListDeploymentWalletsOperationsResponse,
                com.oracle.bmc.goldengate.model.DeploymentWalletsOperationSummary>(
                new java.util.function.Supplier<ListDeploymentWalletsOperationsRequest.Builder>() {
                    @Override
                    public ListDeploymentWalletsOperationsRequest.Builder get() {
                        return ListDeploymentWalletsOperationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentWalletsOperationsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentWalletsOperationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentWalletsOperationsRequest.Builder>,
                        ListDeploymentWalletsOperationsRequest>() {
                    @Override
                    public ListDeploymentWalletsOperationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentWalletsOperationsRequest.Builder>
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
                        ListDeploymentWalletsOperationsRequest,
                        ListDeploymentWalletsOperationsResponse>() {
                    @Override
                    public ListDeploymentWalletsOperationsResponse apply(
                            ListDeploymentWalletsOperationsRequest request) {
                        return client.listDeploymentWalletsOperations(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentWalletsOperationsResponse,
                        java.util.List<
                                com.oracle.bmc.goldengate.model
                                        .DeploymentWalletsOperationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.goldengate.model
                                            .DeploymentWalletsOperationSummary>
                            apply(ListDeploymentWalletsOperationsResponse response) {
                        return response.getDeploymentWalletsOperationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDeployments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDeploymentsResponse> listDeploymentsResponseIterator(
            final ListDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListDeploymentsRequest.Builder, ListDeploymentsRequest, ListDeploymentsResponse>(
                new java.util.function.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                new java.util.function.Function<ListDeploymentsRequest, ListDeploymentsResponse>() {
                    @Override
                    public ListDeploymentsResponse apply(ListDeploymentsRequest request) {
                        return client.listDeployments(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.DeploymentSummary} objects contained in responses from the
     * listDeployments operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.DeploymentSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.DeploymentSummary>
            listDeploymentsRecordIterator(final ListDeploymentsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListDeploymentsRequest.Builder,
                ListDeploymentsRequest,
                ListDeploymentsResponse,
                com.oracle.bmc.goldengate.model.DeploymentSummary>(
                new java.util.function.Supplier<ListDeploymentsRequest.Builder>() {
                    @Override
                    public ListDeploymentsRequest.Builder get() {
                        return ListDeploymentsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListDeploymentsResponse, String>() {
                    @Override
                    public String apply(ListDeploymentsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListDeploymentsRequest.Builder>,
                        ListDeploymentsRequest>() {
                    @Override
                    public ListDeploymentsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListDeploymentsRequest.Builder>
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
                new java.util.function.Function<ListDeploymentsRequest, ListDeploymentsResponse>() {
                    @Override
                    public ListDeploymentsResponse apply(ListDeploymentsRequest request) {
                        return client.listDeployments(request);
                    }
                },
                new java.util.function.Function<
                        ListDeploymentsResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.DeploymentSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.DeploymentSummary> apply(
                            ListDeploymentsResponse response) {
                        return response.getDeploymentCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listTrailFiles
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTrailFilesResponse> listTrailFilesResponseIterator(
            final ListTrailFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTrailFilesRequest.Builder, ListTrailFilesRequest, ListTrailFilesResponse>(
                new java.util.function.Supplier<ListTrailFilesRequest.Builder>() {
                    @Override
                    public ListTrailFilesRequest.Builder get() {
                        return ListTrailFilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTrailFilesResponse, String>() {
                    @Override
                    public String apply(ListTrailFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTrailFilesRequest.Builder>,
                        ListTrailFilesRequest>() {
                    @Override
                    public ListTrailFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTrailFilesRequest.Builder>
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
                new java.util.function.Function<ListTrailFilesRequest, ListTrailFilesResponse>() {
                    @Override
                    public ListTrailFilesResponse apply(ListTrailFilesRequest request) {
                        return client.listTrailFiles(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.TrailFileSummary} objects contained in responses from the
     * listTrailFiles operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.TrailFileSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.TrailFileSummary> listTrailFilesRecordIterator(
            final ListTrailFilesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTrailFilesRequest.Builder,
                ListTrailFilesRequest,
                ListTrailFilesResponse,
                com.oracle.bmc.goldengate.model.TrailFileSummary>(
                new java.util.function.Supplier<ListTrailFilesRequest.Builder>() {
                    @Override
                    public ListTrailFilesRequest.Builder get() {
                        return ListTrailFilesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTrailFilesResponse, String>() {
                    @Override
                    public String apply(ListTrailFilesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTrailFilesRequest.Builder>,
                        ListTrailFilesRequest>() {
                    @Override
                    public ListTrailFilesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTrailFilesRequest.Builder>
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
                new java.util.function.Function<ListTrailFilesRequest, ListTrailFilesResponse>() {
                    @Override
                    public ListTrailFilesResponse apply(ListTrailFilesRequest request) {
                        return client.listTrailFiles(request);
                    }
                },
                new java.util.function.Function<
                        ListTrailFilesResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.TrailFileSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.TrailFileSummary> apply(
                            ListTrailFilesResponse response) {
                        return response.getTrailFileCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listTrailSequences operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListTrailSequencesResponse> listTrailSequencesResponseIterator(
            final ListTrailSequencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListTrailSequencesRequest.Builder,
                ListTrailSequencesRequest,
                ListTrailSequencesResponse>(
                new java.util.function.Supplier<ListTrailSequencesRequest.Builder>() {
                    @Override
                    public ListTrailSequencesRequest.Builder get() {
                        return ListTrailSequencesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTrailSequencesResponse, String>() {
                    @Override
                    public String apply(ListTrailSequencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTrailSequencesRequest.Builder>,
                        ListTrailSequencesRequest>() {
                    @Override
                    public ListTrailSequencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTrailSequencesRequest.Builder>
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
                        ListTrailSequencesRequest, ListTrailSequencesResponse>() {
                    @Override
                    public ListTrailSequencesResponse apply(ListTrailSequencesRequest request) {
                        return client.listTrailSequences(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.TrailSequenceSummary} objects contained in responses from the
     * listTrailSequences operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.TrailSequenceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.TrailSequenceSummary>
            listTrailSequencesRecordIterator(final ListTrailSequencesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListTrailSequencesRequest.Builder,
                ListTrailSequencesRequest,
                ListTrailSequencesResponse,
                com.oracle.bmc.goldengate.model.TrailSequenceSummary>(
                new java.util.function.Supplier<ListTrailSequencesRequest.Builder>() {
                    @Override
                    public ListTrailSequencesRequest.Builder get() {
                        return ListTrailSequencesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListTrailSequencesResponse, String>() {
                    @Override
                    public String apply(ListTrailSequencesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListTrailSequencesRequest.Builder>,
                        ListTrailSequencesRequest>() {
                    @Override
                    public ListTrailSequencesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListTrailSequencesRequest.Builder>
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
                        ListTrailSequencesRequest, ListTrailSequencesResponse>() {
                    @Override
                    public ListTrailSequencesResponse apply(ListTrailSequencesRequest request) {
                        return client.listTrailSequences(request);
                    }
                },
                new java.util.function.Function<
                        ListTrailSequencesResponse,
                        java.util.List<com.oracle.bmc.goldengate.model.TrailSequenceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.TrailSequenceSummary>
                            apply(ListTrailSequencesResponse response) {
                        return response.getTrailSequenceCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.WorkRequestError} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.goldengate.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.goldengate.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.WorkRequestError> apply(
                            ListWorkRequestErrorsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.goldengate.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.goldengate.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
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
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.goldengate.model.WorkRequest} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.goldengate.model.WorkRequest} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.goldengate.model.WorkRequest> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.goldengate.model.WorkRequest>(
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
                        java.util.List<com.oracle.bmc.goldengate.model.WorkRequest>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.goldengate.model.WorkRequest> apply(
                            ListWorkRequestsResponse response) {
                        return response.getItems();
                    }
                });
    }
}

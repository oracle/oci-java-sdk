/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog;

import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ServiceCatalog where multiple pages of data may be fetched. Two styles
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class ServiceCatalogPaginators {
    private final ServiceCatalog client;

    public ServiceCatalogPaginators(ServiceCatalog client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationsResponse> listApplicationsResponseIterator(
            final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListApplicationsRequest.Builder, ListApplicationsRequest, ListApplicationsResponse>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.servicecatalog.model.ApplicationSummary} objects contained in responses from
     * the listApplications operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.ApplicationSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.ApplicationSummary>
            listApplicationsRecordIterator(final ListApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListApplicationsRequest.Builder,
                ListApplicationsRequest,
                ListApplicationsResponse,
                com.oracle.bmc.servicecatalog.model.ApplicationSummary>(
                new java.util.function.Supplier<ListApplicationsRequest.Builder>() {
                    @Override
                    public ListApplicationsRequest.Builder get() {
                        return ListApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListApplicationsResponse, String>() {
                    @Override
                    public String apply(ListApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListApplicationsRequest.Builder>,
                        ListApplicationsRequest>() {
                    @Override
                    public ListApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListApplicationsRequest.Builder>
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
                        ListApplicationsRequest, ListApplicationsResponse>() {
                    @Override
                    public ListApplicationsResponse apply(ListApplicationsRequest request) {
                        return client.listApplications(request);
                    }
                },
                new java.util.function.Function<
                        ListApplicationsResponse,
                        java.util.List<com.oracle.bmc.servicecatalog.model.ApplicationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicecatalog.model.ApplicationSummary>
                            apply(ListApplicationsResponse response) {
                        return response.getApplicationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPrivateApplicationPackages operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPrivateApplicationPackagesResponse>
            listPrivateApplicationPackagesResponseIterator(
                    final ListPrivateApplicationPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateApplicationPackagesRequest.Builder,
                ListPrivateApplicationPackagesRequest,
                ListPrivateApplicationPackagesResponse>(
                new java.util.function.Supplier<ListPrivateApplicationPackagesRequest.Builder>() {
                    @Override
                    public ListPrivateApplicationPackagesRequest.Builder get() {
                        return ListPrivateApplicationPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateApplicationPackagesResponse, String>() {
                    @Override
                    public String apply(ListPrivateApplicationPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateApplicationPackagesRequest.Builder>,
                        ListPrivateApplicationPackagesRequest>() {
                    @Override
                    public ListPrivateApplicationPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateApplicationPackagesRequest.Builder>
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
                        ListPrivateApplicationPackagesRequest,
                        ListPrivateApplicationPackagesResponse>() {
                    @Override
                    public ListPrivateApplicationPackagesResponse apply(
                            ListPrivateApplicationPackagesRequest request) {
                        return client.listPrivateApplicationPackages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.servicecatalog.model.PrivateApplicationPackageSummary} objects contained in
     * responses from the listPrivateApplicationPackages operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.PrivateApplicationPackageSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.PrivateApplicationPackageSummary>
            listPrivateApplicationPackagesRecordIterator(
                    final ListPrivateApplicationPackagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateApplicationPackagesRequest.Builder,
                ListPrivateApplicationPackagesRequest,
                ListPrivateApplicationPackagesResponse,
                com.oracle.bmc.servicecatalog.model.PrivateApplicationPackageSummary>(
                new java.util.function.Supplier<ListPrivateApplicationPackagesRequest.Builder>() {
                    @Override
                    public ListPrivateApplicationPackagesRequest.Builder get() {
                        return ListPrivateApplicationPackagesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateApplicationPackagesResponse, String>() {
                    @Override
                    public String apply(ListPrivateApplicationPackagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateApplicationPackagesRequest.Builder>,
                        ListPrivateApplicationPackagesRequest>() {
                    @Override
                    public ListPrivateApplicationPackagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateApplicationPackagesRequest.Builder>
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
                        ListPrivateApplicationPackagesRequest,
                        ListPrivateApplicationPackagesResponse>() {
                    @Override
                    public ListPrivateApplicationPackagesResponse apply(
                            ListPrivateApplicationPackagesRequest request) {
                        return client.listPrivateApplicationPackages(request);
                    }
                },
                new java.util.function.Function<
                        ListPrivateApplicationPackagesResponse,
                        java.util.List<
                                com.oracle.bmc.servicecatalog.model
                                        .PrivateApplicationPackageSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.servicecatalog.model
                                            .PrivateApplicationPackageSummary>
                            apply(ListPrivateApplicationPackagesResponse response) {
                        return response.getPrivateApplicationPackageCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPrivateApplications operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPrivateApplicationsResponse> listPrivateApplicationsResponseIterator(
            final ListPrivateApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListPrivateApplicationsRequest.Builder,
                ListPrivateApplicationsRequest,
                ListPrivateApplicationsResponse>(
                new java.util.function.Supplier<ListPrivateApplicationsRequest.Builder>() {
                    @Override
                    public ListPrivateApplicationsRequest.Builder get() {
                        return ListPrivateApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateApplicationsResponse, String>() {
                    @Override
                    public String apply(ListPrivateApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateApplicationsRequest.Builder>,
                        ListPrivateApplicationsRequest>() {
                    @Override
                    public ListPrivateApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateApplicationsRequest.Builder>
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
                        ListPrivateApplicationsRequest, ListPrivateApplicationsResponse>() {
                    @Override
                    public ListPrivateApplicationsResponse apply(
                            ListPrivateApplicationsRequest request) {
                        return client.listPrivateApplications(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary} objects contained in responses
     * from the listPrivateApplications operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary>
            listPrivateApplicationsRecordIterator(final ListPrivateApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListPrivateApplicationsRequest.Builder,
                ListPrivateApplicationsRequest,
                ListPrivateApplicationsResponse,
                com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary>(
                new java.util.function.Supplier<ListPrivateApplicationsRequest.Builder>() {
                    @Override
                    public ListPrivateApplicationsRequest.Builder get() {
                        return ListPrivateApplicationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListPrivateApplicationsResponse, String>() {
                    @Override
                    public String apply(ListPrivateApplicationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListPrivateApplicationsRequest.Builder>,
                        ListPrivateApplicationsRequest>() {
                    @Override
                    public ListPrivateApplicationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListPrivateApplicationsRequest.Builder>
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
                        ListPrivateApplicationsRequest, ListPrivateApplicationsResponse>() {
                    @Override
                    public ListPrivateApplicationsResponse apply(
                            ListPrivateApplicationsRequest request) {
                        return client.listPrivateApplications(request);
                    }
                },
                new java.util.function.Function<
                        ListPrivateApplicationsResponse,
                        java.util.List<
                                com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.servicecatalog.model.PrivateApplicationSummary>
                            apply(ListPrivateApplicationsResponse response) {
                        return response.getPrivateApplicationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceCatalogAssociations operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceCatalogAssociationsResponse>
            listServiceCatalogAssociationsResponseIterator(
                    final ListServiceCatalogAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceCatalogAssociationsRequest.Builder,
                ListServiceCatalogAssociationsRequest,
                ListServiceCatalogAssociationsResponse>(
                new java.util.function.Supplier<ListServiceCatalogAssociationsRequest.Builder>() {
                    @Override
                    public ListServiceCatalogAssociationsRequest.Builder get() {
                        return ListServiceCatalogAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceCatalogAssociationsResponse, String>() {
                    @Override
                    public String apply(ListServiceCatalogAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceCatalogAssociationsRequest.Builder>,
                        ListServiceCatalogAssociationsRequest>() {
                    @Override
                    public ListServiceCatalogAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceCatalogAssociationsRequest.Builder>
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
                        ListServiceCatalogAssociationsRequest,
                        ListServiceCatalogAssociationsResponse>() {
                    @Override
                    public ListServiceCatalogAssociationsResponse apply(
                            ListServiceCatalogAssociationsRequest request) {
                        return client.listServiceCatalogAssociations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociationSummary} objects contained in
     * responses from the listServiceCatalogAssociations operation. This iterable will fetch more
     * data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociationSummary} objects contained
     *     in responses received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociationSummary>
            listServiceCatalogAssociationsRecordIterator(
                    final ListServiceCatalogAssociationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceCatalogAssociationsRequest.Builder,
                ListServiceCatalogAssociationsRequest,
                ListServiceCatalogAssociationsResponse,
                com.oracle.bmc.servicecatalog.model.ServiceCatalogAssociationSummary>(
                new java.util.function.Supplier<ListServiceCatalogAssociationsRequest.Builder>() {
                    @Override
                    public ListServiceCatalogAssociationsRequest.Builder get() {
                        return ListServiceCatalogAssociationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceCatalogAssociationsResponse, String>() {
                    @Override
                    public String apply(ListServiceCatalogAssociationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceCatalogAssociationsRequest.Builder>,
                        ListServiceCatalogAssociationsRequest>() {
                    @Override
                    public ListServiceCatalogAssociationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceCatalogAssociationsRequest.Builder>
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
                        ListServiceCatalogAssociationsRequest,
                        ListServiceCatalogAssociationsResponse>() {
                    @Override
                    public ListServiceCatalogAssociationsResponse apply(
                            ListServiceCatalogAssociationsRequest request) {
                        return client.listServiceCatalogAssociations(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceCatalogAssociationsResponse,
                        java.util.List<
                                com.oracle.bmc.servicecatalog.model
                                        .ServiceCatalogAssociationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.servicecatalog.model
                                            .ServiceCatalogAssociationSummary>
                            apply(ListServiceCatalogAssociationsResponse response) {
                        return response.getServiceCatalogAssociationCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listServiceCatalogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListServiceCatalogsResponse> listServiceCatalogsResponseIterator(
            final ListServiceCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListServiceCatalogsRequest.Builder,
                ListServiceCatalogsRequest,
                ListServiceCatalogsResponse>(
                new java.util.function.Supplier<ListServiceCatalogsRequest.Builder>() {
                    @Override
                    public ListServiceCatalogsRequest.Builder get() {
                        return ListServiceCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceCatalogsResponse, String>() {
                    @Override
                    public String apply(ListServiceCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceCatalogsRequest.Builder>,
                        ListServiceCatalogsRequest>() {
                    @Override
                    public ListServiceCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceCatalogsRequest.Builder>
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
                        ListServiceCatalogsRequest, ListServiceCatalogsResponse>() {
                    @Override
                    public ListServiceCatalogsResponse apply(ListServiceCatalogsRequest request) {
                        return client.listServiceCatalogs(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary} objects contained in responses
     * from the listServiceCatalogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary>
            listServiceCatalogsRecordIterator(final ListServiceCatalogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListServiceCatalogsRequest.Builder,
                ListServiceCatalogsRequest,
                ListServiceCatalogsResponse,
                com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary>(
                new java.util.function.Supplier<ListServiceCatalogsRequest.Builder>() {
                    @Override
                    public ListServiceCatalogsRequest.Builder get() {
                        return ListServiceCatalogsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListServiceCatalogsResponse, String>() {
                    @Override
                    public String apply(ListServiceCatalogsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListServiceCatalogsRequest.Builder>,
                        ListServiceCatalogsRequest>() {
                    @Override
                    public ListServiceCatalogsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListServiceCatalogsRequest.Builder>
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
                        ListServiceCatalogsRequest, ListServiceCatalogsResponse>() {
                    @Override
                    public ListServiceCatalogsResponse apply(ListServiceCatalogsRequest request) {
                        return client.listServiceCatalogs(request);
                    }
                },
                new java.util.function.Function<
                        ListServiceCatalogsResponse,
                        java.util.List<
                                com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicecatalog.model.ServiceCatalogSummary>
                            apply(ListServiceCatalogsResponse response) {
                        return response.getServiceCatalogCollection().getItems();
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
     * com.oracle.bmc.servicecatalog.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.WorkRequestError} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestErrorsRequest.Builder,
                ListWorkRequestErrorsRequest,
                ListWorkRequestErrorsResponse,
                com.oracle.bmc.servicecatalog.model.WorkRequestError>(
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
                        java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestError>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestError>
                            apply(ListWorkRequestErrorsResponse response) {
                        return response.getWorkRequestErrorCollection().getItems();
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
     * com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry} objects contained in responses from
     * the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestLogsRequest.Builder,
                ListWorkRequestLogsRequest,
                ListWorkRequestLogsResponse,
                com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry>(
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
                        java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestLogEntry>
                            apply(ListWorkRequestLogsResponse response) {
                        return response.getWorkRequestLogEntryCollection().getItems();
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
     * com.oracle.bmc.servicecatalog.model.WorkRequestSummary} objects contained in responses from
     * the listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.servicecatalog.model.WorkRequestSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.servicecatalog.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListWorkRequestsRequest.Builder,
                ListWorkRequestsRequest,
                ListWorkRequestsResponse,
                com.oracle.bmc.servicecatalog.model.WorkRequestSummary>(
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
                        java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.servicecatalog.model.WorkRequestSummary>
                            apply(ListWorkRequestsResponse response) {
                        return response.getWorkRequestSummaryCollection().getItems();
                    }
                });
    }
}

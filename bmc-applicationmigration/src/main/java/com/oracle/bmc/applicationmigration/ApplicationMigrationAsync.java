/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration;

import com.oracle.bmc.applicationmigration.requests.*;
import com.oracle.bmc.applicationmigration.responses.*;

/**
 * Application Migration simplifies the migration of applications from Oracle Cloud Infrastructure
 * Classic to Oracle Cloud Infrastructure. You can use Application Migration API to migrate
 * applications, such as Oracle Java Cloud Service, SOA Cloud Service, and Integration Classic
 * instances, to Oracle Cloud Infrastructure. For more information, see [Overview of Application
 * Migration](https://docs.cloud.oracle.com/iaas/application-migration/appmigrationoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public interface ApplicationMigrationAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Cancels the specified work request. When you cancel a work request, it causes the in-progress
     * task to be canceled. For example, if the create migration work request is in the accepted or
     * in progress state for a long time, you can cancel the work request.
     *
     * <p>When you cancel a work request, the state of the work request changes to cancelling, and
     * then to the cancelled state.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves the specified migration into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMigrationCompartmentResponse> changeMigrationCompartment(
            ChangeMigrationCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMigrationCompartmentRequest, ChangeMigrationCompartmentResponse>
                    handler);

    /**
     * Moves the specified source into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSourceCompartmentResponse> changeSourceCompartment(
            ChangeSourceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSourceCompartmentRequest, ChangeSourceCompartmentResponse>
                    handler);

    /**
     * Creates a migration. A migration represents the end-to-end workflow of moving an application
     * from a source environment to Oracle Cloud Infrastructure. Each migration moves a single
     * application to Oracle Cloud Infrastructure. For more information, see [Manage
     * Migrations](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm).
     *
     * <p>When you create a migration, provide the required information to let Application Migration
     * access the source environment. Application Migration uses this information to access the
     * application in the source environment and discover application artifacts.
     *
     * <p>All Oracle Cloud Infrastructure resources, including migrations, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find
     * its OCID in the response. You can also retrieve a resource's OCID by using a List API
     * operation on that resource type, or by viewing the resource in the Console. For more
     * information, see Resource Identifiers.
     *
     * <p>After you send your request, a migration is created in the compartment that contains the
     * source. The new migration's lifecycle state will temporarily be <code>CREATING</code> and the
     * state of the migration will be <code>DISCOVERING_APPLICATION</code>. During this phase,
     * Application Migration sets the template for the <code>serviceConfig</code> and <code>
     * applicationConfig</code> fields of the migration. When this operation is complete, the state
     * of the migration changes to <code>MISSING_CONFIG_VALUES</code>. Next, you'll need to update
     * the migration to provide configuration values. Before updating the migration, ensure that its
     * state has changed to <code>MISSING_CONFIG_VALUES</code>.
     *
     * <p>To track the progress of this operation, you can monitor the status of the Create
     * Migration and Discover Application work requests by using the <code>
     * {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest}</code> REST
     * API operation on the work request or by viewing the status of the work request in the
     * console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMigrationResponse> createMigration(
            CreateMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMigrationRequest, CreateMigrationResponse>
                    handler);

    /**
     * Creates a source in the specified compartment. In Application Migration, a source refers to
     * the environment from which the application is being migrated. For more information, see
     * [Manage
     * Sources](https://docs.cloud.oracle.com/iaas/application-migration/manage_sources.htm).
     *
     * <p>All Oracle Cloud Infrastructure resources, including sources, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find
     * its OCID in the response. You can also retrieve a resource's OCID by using a List API
     * operation on that resource type, or by viewing the resource in the Console.
     *
     * <p>After you send your request, a source is created in the specified compartment. The new
     * source's lifecycle state will temporarily be <code>CREATING</code>. Application Migration
     * connects to the source environment with the authentication credentials that you have
     * provided. If the connection is established, the status of the source changes to <code>ACTIVE
     * </code> and Application Migration fetches the list of applications that are available for
     * migration in the source environment.
     *
     * <p>To track the progress of the operation, you can monitor the status of the Create Source
     * work request by using the <code>
     * {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest}</code> REST
     * API operation on the work request or by viewing the status of the work request in the
     * console.
     *
     * <p>Ensure that the state of the source has changed to <code>ACTIVE</code>, before you
     * retrieve the list of applications from the source environment using the <code>
     * {@link #listSourceApplications(ListSourceApplicationsRequest, Consumer, Consumer) listSourceApplications}
     * </code> REST API call.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSourceResponse> createSource(
            CreateSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSourceRequest, CreateSourceResponse>
                    handler);

    /**
     * Deletes the specified migration.
     *
     * <p>If you have migrated the application or for any other reason if you no longer require a
     * migration, then you can delete the relevant migration. You can delete a migration,
     * irrespective of its state. If any work request is being processed for the migration that you
     * want to delete, then the associated work requests are cancelled and then the migration is
     * deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMigrationResponse> deleteMigration(
            DeleteMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMigrationRequest, DeleteMigrationResponse>
                    handler);

    /**
     * Deletes the specified source.
     *
     * <p>Before deleting a source, you must delete all the migrations associated with the source.
     * If you have migrated all the required applications in a source or for any other reason you no
     * longer require a source, then you can delete the relevant source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSourceResponse> deleteSource(
            DeleteSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSourceRequest, DeleteSourceResponse>
                    handler);

    /**
     * Retrieves details of the specified migration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMigrationResponse> getMigration(
            GetMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMigrationRequest, GetMigrationResponse>
                    handler);

    /**
     * Retrieves details of the specified source. Specify the OCID of the source for which you want
     * to retrieve details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSourceResponse> getSource(
            GetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse> handler);

    /**
     * Gets the details of the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Retrieves details of all the migrations that are available in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMigrationsResponse> listMigrations(
            ListMigrationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMigrationsRequest, ListMigrationsResponse>
                    handler);

    /**
     * Retrieves details of all the applications associated with the specified source. This list is
     * generated dynamically by interrogating the source and the list changes as applications are
     * started or stopped in the source environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceApplicationsResponse> listSourceApplications(
            ListSourceApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourceApplicationsRequest, ListSourceApplicationsResponse>
                    handler);

    /**
     * Retrieves details of all the sources that are available in the specified compartment and
     * match the specified query criteria. If you don't specify any query criteria, then details of
     * all the sources are displayed. To filter the retrieved results, you can pass one or more of
     * the following query parameters, by appending them to the URI as shown in the following
     * example.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSourcesResponse> listSources(
            ListSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSourcesRequest, ListSourcesResponse> handler);

    /**
     * Retrieves details of the errors encountered while executing an operation that is tracked by
     * the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Retrieves logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Retrieves details of all the work requests and match the specified query criteria. To filter
     * the retrieved results, you can pass one or more of the following query parameters, by
     * appending them to the URI as shown in the following example.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Starts migrating the specified application to Oracle Cloud Infrastructure.
     *
     * <p>Before sending this request, ensure that you have provided configuration details to update
     * the migration and the state of the migration is <code>READY</code>.
     *
     * <p>After you send this request, the migration's state will temporarily be <code>MIGRATING
     * </code>.
     *
     * <p>To track the progress of the operation, you can monitor the status of the Migrate
     * Application work request by using the <code>
     * {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest}</code> REST
     * API operation on the work request or by viewing the status of the work request in the
     * console. When this work request is processed successfully, Application Migration creates the
     * required resources in the target environment and the state of the migration changes to <code>
     * MIGRATION_SUCCEEDED</code>.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MigrateApplicationResponse> migrateApplication(
            MigrateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            MigrateApplicationRequest, MigrateApplicationResponse>
                    handler);

    /**
     * Updates the configuration details for the specified migration.
     *
     * <p>When you create a migration, Application Migration sets the template for the <code>
     * serviceConfig</code> and <code>applicationConfig</code> attributes of the migration. When you
     * update the migration, you must provide values for these fields to specify configuration
     * information for the application in the target environment.
     *
     * <p>
     *
     * <p>Before updating the migration, complete the following tasks:
     *
     * <ol>
     *   <li>Identify the migration that you want to update and ensure that the migration is in the
     *       <code>MISSING_CONFIG_VALUES</code> state.
     *   <li>Get details of the migration using the <code>GetMigration</code> command. This returns
     *       the template for the <code>serviceConfig</code> and <code>applicationConfig</code>
     *       attributes of the migration.
     *   <li>You must fill out the required details for the <code>serviceConfig</code> and <code>
     *       applicationConfig</code> attributes. The <code>isRequired</code> attribute of a
     *       configuration property indicates whether it is mandatory to provide a value.
     *   <li>You can provide values for the optional configuration properties or you can delete the
     *       optional properties for which you do not provide values. Note that you cannot add any
     *       property that is not present in the template.
     * </ol>
     *
     * <p>To update the migration, pass the configuration values in the request body. The
     * information that you must provide depends on the type of application that you are migrating.
     * For reference information about configuration fields, see [Provide Configuration
     * Information](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm#provide_configuration_details).
     *
     * <p>To track the progress of the operation, you can monitor the status of the Update Migration
     * work request by using the <code>
     * {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest}</code> REST
     * API operation on the work request or by viewing the status of the work request in the
     * console.
     *
     * <p>When the migration has been updated, the state of the migration changes to <code>READY
     * </code>. After updating the migration, you can start the migration whenever you are ready.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMigrationResponse> updateMigration(
            UpdateMigrationRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMigrationRequest, UpdateMigrationResponse>
                    handler);

    /**
     * You can update the authorization details to access the source environment from which you want
     * to migrate applications to Oracle Cloud Infrastructure. You can also update the description
     * and tags of a source.
     *
     * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
     * supply string values using the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSourceResponse> updateSource(
            UpdateSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSourceRequest, UpdateSourceResponse>
                    handler);
}

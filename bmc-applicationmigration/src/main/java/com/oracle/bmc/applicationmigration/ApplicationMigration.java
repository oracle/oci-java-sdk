/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration;

import com.oracle.bmc.applicationmigration.requests.*;
import com.oracle.bmc.applicationmigration.responses.*;

/**
 * Application Migration simplifies the migration of applications from Oracle Cloud Infrastructure Classic to Oracle Cloud Infrastructure.
 * You can use Application Migration API to migrate applications, such as Oracle Java Cloud Service, SOA Cloud Service, and Integration Classic
 * instances, to Oracle Cloud Infrastructure. For more information, see
 * [Overview of Application Migration](https://docs.cloud.oracle.com/iaas/application-migration/appmigrationoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public interface ApplicationMigration extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Cancels the specified work request. When you cancel a work request, it causes the in-progress task to be canceled.
     * For example, if the create migration work request is in the accepted or in progress state for a long time, you can cancel the work request.
     * <p>
     * When you cancel a work request, the state of the work request changes to cancelling, and then to the cancelled state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/CancelWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Moves the specified migration into a different compartment within the same tenancy. For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ChangeMigrationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeMigrationCompartment API.
     */
    ChangeMigrationCompartmentResponse changeMigrationCompartment(
            ChangeMigrationCompartmentRequest request);

    /**
     * Moves the specified source into a different compartment within the same tenancy. For information about moving resources
     * between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ChangeSourceCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSourceCompartment API.
     */
    ChangeSourceCompartmentResponse changeSourceCompartment(ChangeSourceCompartmentRequest request);

    /**
     * Creates a migration. A migration represents the end-to-end workflow of moving an application from a source environment to Oracle Cloud
     * Infrastructure. Each migration moves a single application to Oracle Cloud Infrastructure. For more information,
     * see [Manage Migrations](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm).
     * <p>
     * When you create a migration, provide the required information to let Application Migration access the source environment.
     * Application Migration uses this information to access the application in the source environment and discover application artifacts.
     * <p>
     * All Oracle Cloud Infrastructure resources, including migrations, get an Oracle-assigned, unique ID called an Oracle Cloud Identifier (OCID).
     * When you create a resource, you can find its OCID in the response. You can also retrieve a resource's OCID by using a List API operation on
     * that resource type, or by viewing the resource in the Console. For more information, see Resource Identifiers.
     * <p>
     * After you send your request, a migration is created in the compartment that contains the source. The new migration's lifecycle state
     * will temporarily be <code>CREATING</code> and the state of the migration will be <code>DISCOVERING_APPLICATION</code>. During this phase,
     * Application Migration sets the template for the <code>serviceConfig</code> and <code>applicationConfig</code> fields of the migration.
     * When this operation is complete, the state of the migration changes to <code>MISSING_CONFIG_VALUES</code>.
     * Next, you'll need to update the migration to provide configuration values. Before updating the
     * migration, ensure that its state has changed to <code>MISSING_CONFIG_VALUES</code>.
     * <p>
     * To track the progress of this operation, you can monitor the status of the Create Migration and Discover Application work requests
     * by using the <code>{@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest}</code> REST API operation on the work request or by viewing the status of the work request in
     * the console.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/CreateMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMigration API.
     */
    CreateMigrationResponse createMigration(CreateMigrationRequest request);

    /**
     * Creates a source in the specified compartment. In Application Migration, a source refers to the environment from which the application
     * is being migrated. For more information, see [Manage Sources](https://docs.cloud.oracle.com/iaas/application-migration/manage_sources.htm).
     * <p>
     * All Oracle Cloud Infrastructure resources, including sources, get an Oracle-assigned, unique ID called an Oracle Cloud Identifier (OCID).
     * When you create a resource, you can find its OCID in the response. You can also retrieve a resource's OCID by using a List API operation
     * on that resource type, or by viewing the resource in the Console.
     * <p>
     * After you send your request, a source is created in the specified compartment. The new source's lifecycle state will temporarily be
     * <code>CREATING</code>. Application Migration connects to the source environment with the authentication credentials that you have provided.
     * If the connection is established, the status of the source changes to <code>ACTIVE</code> and Application Migration fetches the list of
     * applications that are available for migration in the source environment.
     * <p>
     * To track the progress of the operation, you can monitor the status of the Create Source work request by using the
     * <code>{@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest}</code> REST API operation on the work request or by viewing the status of the work request in the console.
     * <p>
     * Ensure that the state of the source has changed to <code>ACTIVE</code>, before you retrieve the list of applications from
     * the source environment using the <code>{@link #listSourceApplications(ListSourceApplicationsRequest) listSourceApplications}</code> REST API call.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/CreateSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSource API.
     */
    CreateSourceResponse createSource(CreateSourceRequest request);

    /**
     * Deletes the specified migration.
     * <p>
     * If you have migrated the application or for any other reason if you no longer require a migration, then you can delete the
     * relevant migration. You can delete a migration, irrespective of its state. If any work request is being processed for the migration
     * that you want to delete, then the associated work requests are cancelled and then the migration is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/DeleteMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMigration API.
     */
    DeleteMigrationResponse deleteMigration(DeleteMigrationRequest request);

    /**
     * Deletes the specified source.
     * <p>
     * Before deleting a source, you must delete all the migrations associated with the source.
     * If you have migrated all the required applications in a source or for any other reason you no longer require a source, then you can
     * delete the relevant source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/DeleteSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSource API.
     */
    DeleteSourceResponse deleteSource(DeleteSourceRequest request);

    /**
     * Retrieves details of the specified migration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/GetMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMigration API.
     */
    GetMigrationResponse getMigration(GetMigrationRequest request);

    /**
     * Retrieves details of the specified source. Specify the OCID of the source for which you want to retrieve details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/GetSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSource API.
     */
    GetSourceResponse getSource(GetSourceRequest request);

    /**
     * Gets the details of the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Retrieves details of all the migrations that are available in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListMigrationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMigrations API.
     */
    ListMigrationsResponse listMigrations(ListMigrationsRequest request);

    /**
     * Retrieves details of all the applications associated with the specified source.
     * This list is generated dynamically by interrogating the source and the list changes as applications are started or
     * stopped in the source environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListSourceApplicationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSourceApplications API.
     */
    ListSourceApplicationsResponse listSourceApplications(ListSourceApplicationsRequest request);

    /**
     * Retrieves details of all the sources that are available in the specified compartment and match the specified query criteria.
     * If you don't specify any query criteria, then details of all the sources are displayed.
     * To filter the retrieved results, you can pass one or more of the following query parameters, by appending them to the URI
     * as shown in the following example.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSources API.
     */
    ListSourcesResponse listSources(ListSourcesRequest request);

    /**
     * Retrieves details of the errors encountered while executing an operation that is tracked by the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Retrieves logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Retrieves details of all the work requests and match the specified query criteria. To filter the retrieved results, you can pass one or more of the following query parameters, by appending them to the URI as shown in the following example.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Starts migrating the specified application to Oracle Cloud Infrastructure.
     * <p>
     * Before sending this request, ensure that you have provided configuration details to update the migration and the state of the migration
     * is <code>READY</code>.
     * <p>
     * After you send this request, the migration's state will temporarily be <code>MIGRATING</code>.
     * <p>
     * To track the progress of the operation, you can monitor the status of the Migrate Application work request by using the
     * <code>{@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest}</code> REST API operation on the work request or by viewing the status of the work request in the console.
     * When this work request is processed successfully, Application Migration creates the required resources in the target environment
     * and the state of the migration changes to <code>MIGRATION_SUCCEEDED</code>.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/MigrateApplicationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use MigrateApplication API.
     */
    MigrateApplicationResponse migrateApplication(MigrateApplicationRequest request);

    /**
     * Updates the configuration details for the specified migration.
     * <p>
     * When you create a migration, Application Migration sets the template for the <code>serviceConfig</code> and <code>applicationConfig</code>
     * attributes of the migration.
     * When you update the migration, you must provide values for these fields to specify configuration information for the application in the
     * target environment.
     * <p>
     *
     * <p>
     * Before updating the migration, complete the following tasks:
     * <ol>
     * <li>Identify the migration that you want to update and ensure that the migration is in the <code>MISSING_CONFIG_VALUES</code> state.</li>
     * <li>Get details of the migration using the <code>GetMigration</code> command. This returns the  template for the <code>serviceConfig</code>
     * and <code>applicationConfig</code> attributes of the migration.</li>
     * <li>You must fill out the required details for the <code>serviceConfig</code> and <code>applicationConfig</code> attributes.
     * The <code>isRequired</code> attribute of a configuration property indicates whether it is mandatory to provide a value.</li>
     * <li>You can provide values for the optional configuration properties or you can delete the optional properties for which you do not
     * provide values. Note that you cannot add any property that is not present in the template.</li>
     * </ol>
     * <p>
     * To update the migration, pass the configuration values in the request body. The information that you must provide depends on the type
     * of application that you are migrating. For reference information about configuration fields, see
     * [Provide Configuration Information](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm#provide_configuration_details).
     * <p>
     * To track the progress of the operation, you can monitor the status of the Update Migration work request by using the
     * <code>{@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest}</code> REST API operation on the work request or by viewing the status of the work request in the console.
     * <p>
     * When the migration has been updated, the state of the migration changes to <code>READY</code>. After updating the migration,
     * you can start the migration whenever you are ready.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/UpdateMigrationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMigration API.
     */
    UpdateMigrationResponse updateMigration(UpdateMigrationRequest request);

    /**
     * You can update the authorization details to access the source environment from which you want to migrate applications to Oracle Cloud
     * Infrastructure. You can also update the description and tags of a source.
     * <p>
     **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/applicationmigration/UpdateSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSource API.
     */
    UpdateSourceResponse updateSource(UpdateSourceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ApplicationMigrationWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ApplicationMigrationPaginators getPaginators();
}

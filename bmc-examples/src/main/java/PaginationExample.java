/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.User;
import com.oracle.bmc.identity.requests.ListUsersRequest;
import com.oracle.bmc.identity.responses.ListUsersResponse;

import java.io.IOException;

/**
 * This class demonstrates the different pagination mechanisms available in the Java SDK. It covers three
 * ways of doing pagination:
 *
 * <ul>
 *   <li>Manually handling next page tokens</li>
 *   <li>Using the paginator exposed by each service client to iterate through responses to service calls</li>
 *   <li>Using the paginator exposed by each sertvice client to iterate through the models/resources returned by service calls</li>
 * </ul>
 *
 * This class also makes the following assumptions:
 *
 * <ul>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>
 *      The ListUsers operation in Identity service will be used to demonstrate pagination, so you should ensure that
 *      you have permissions to call this operation
 *   </li>
 *   <li>The region used is us-phoenix-1</li>
 * <ul>
 */
public class PaginationExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the tenancy (so we can list users)</li>
     * </ul>
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one arguments: Your tenancy OCID");
        }

        final String tenancyId = args[0];

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        final IdentityClient identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_PHOENIX_1);

        try {
            doManualPagination(identityClient, tenancyId);
            doPaginateWithResponsePaginator(identityClient, tenancyId);
            doPaginateWithRecordPaginator(identityClient, tenancyId);
        } finally {
            identityClient.close();
        }
    }

    /**
     * This method demonstrates how to do pagination yourself by manually managing the next page
     * tokens returned by service responses
     *
     * @param identityClient the client used to make service calls
     * @param compartmentId the OCID of the compartment we'll issue the ListUsers request against. This should be your tenancy OCID
     */
    private static void doManualPagination(
            final IdentityClient identityClient, final String compartmentId) {

        System.out.println("Manual Pagination");
        System.out.println("===================");

        String nextPageToken = null;
        do {
            ListUsersResponse response =
                    identityClient.listUsers(
                            ListUsersRequest.builder()
                                    .compartmentId(compartmentId)
                                    .page(nextPageToken)
                                    .build());
            for (User user : response.getItems()) {
                System.out.println(user);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);

        System.out.println();
        System.out.println();
    }

    /**
     * This method demonstrates how to do pagination by using the Paginator offered by the service client. Each service
     * client has a getPaginators() method which will return a Paginator. The Paginator will have methods which vend a
     * {@link java.lang.Iterable} that can be used to iterate over either Response objects returned by a service call or
     * resources/records being listed.
     *
     * This method demonstrates how to iterate over the Response objects using the Paginator. The methods used to
     * get an iterable over Response objects are always of the form <operation>ResponseIterator().
     */
    private static void doPaginateWithResponsePaginator(
            final IdentityClient identityClient, final String compartmentId) {

        System.out.println("Pagination Using Response Paginator");
        System.out.println("===================");

        // Build a request object as normal, including any sorting or filtering you wish to do
        final ListUsersRequest request =
                ListUsersRequest.builder().compartmentId(compartmentId).build();

        // Note that the iterable is over the Response objects
        final Iterable<ListUsersResponse> responseIterator =
                identityClient.getPaginators().listUsersResponseIterator(request);
        for (ListUsersResponse response : responseIterator) {
            for (User user : response.getItems()) {
                System.out.println(user);
            }
        }

        System.out.println();
        System.out.println();
    }

    /**
     * This method demonstrates how to do pagination by using the Paginator offered by the service client. Each service
     * client has a getPaginators() method which will return a Paginator. The Paginator will have methods which vend a
     * {@link java.lang.Iterable} that can be used to iterate over either Response objects returned by a service call or
     * resources/records being listed.
     *
     * This method demonstrates how to iterate over the resources/records using the Paginator. The methods used to
     * get an iterable over resources/records are always of the form <operation>RecordIterator().
     */
    private static void doPaginateWithRecordPaginator(
            final IdentityClient identityClient, final String compartmentId) {

        System.out.println("Pagination Using Record Paginator");
        System.out.println("===================");

        // Build a request object as normal, including any sorting or filtering you wish to do
        final ListUsersRequest request =
                ListUsersRequest.builder().compartmentId(compartmentId).build();

        // Note that the iterable is over the model object
        final Iterable<User> recordIterator =
                identityClient.getPaginators().listUsersRecordIterator(request);
        for (User user : recordIterator) {
            System.out.println(user);
        }

        System.out.println();
        System.out.println();
    }
}

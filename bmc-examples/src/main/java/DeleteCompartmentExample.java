/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.CreateCompartmentDetails;
import com.oracle.bmc.identity.model.WorkRequestSummary;
import com.oracle.bmc.identity.requests.CreateCompartmentRequest;
import com.oracle.bmc.identity.requests.DeleteCompartmentRequest;
import com.oracle.bmc.identity.requests.GetWorkRequestRequest;
import com.oracle.bmc.identity.requests.ListWorkRequestsRequest;
import com.oracle.bmc.identity.responses.DeleteCompartmentResponse;
import com.oracle.bmc.identity.responses.GetWorkRequestResponse;
import com.oracle.bmc.identity.responses.ListWorkRequestsResponse;
import com.oracle.bmc.model.BmcException;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;
import net.jodah.failsafe.function.Predicate;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class DeleteCompartmentExample {
    final static RetryPolicy RETRY_POLICY =
            new RetryPolicy()
                    .retryOn(new RetryPredicate())
                    .withDelay(1, TimeUnit.SECONDS)
                    .withMaxRetries(10);

    public static void main(String[] args) throws Exception {
        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        final Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_ASHBURN_1);

        // Create a compartment.
        final Compartment compartment =
                createChildCompartment(identityClient, tenantId, "Compartment-1");
        System.out.println("Created compartment with compartmentId:" + compartment.getId());
        System.out.println();

        // Delete the compartment.
        final DeleteCompartmentRequest deleteCompartmentRequest =
                DeleteCompartmentRequest.builder().compartmentId(compartment.getId()).build();

        // If we create/update and then try to use compartments straight away, sometimes we can get a 404.
        // To try and avoid this, this example uses retries with a short delay.
        DeleteCompartmentResponse deleteCompartmentResponse =
                Failsafe.with(RETRY_POLICY)
                        .get(
                                new Callable<DeleteCompartmentResponse>() {
                                    public DeleteCompartmentResponse call() {
                                        return identityClient.deleteCompartment(
                                                deleteCompartmentRequest);
                                    }
                                });
        System.out.println("Deleted compartment with compartmentId:" + compartment.getId());
        System.out.println();

        // Get delete compartment work request details.
        final GetWorkRequestRequest getWorkRequestRequest =
                GetWorkRequestRequest.builder()
                        .workRequestId(deleteCompartmentResponse.getOpcWorkRequestId())
                        .build();
        GetWorkRequestResponse getWorkRequestResponse =
                Failsafe.with(RETRY_POLICY)
                        .get(
                                new Callable<GetWorkRequestResponse>() {
                                    public GetWorkRequestResponse call() {
                                        return identityClient.getWorkRequest(getWorkRequestRequest);
                                    }
                                });

        System.out.println(
                "Queried work request with workRequestId:"
                        + getWorkRequestResponse.getWorkRequest().getId());
        System.out.println(
                "WorkRequest status:" + getWorkRequestResponse.getWorkRequest().getStatus());
        System.out.println();

        // List all work requests in a compartment.
        String nextPageToken = null;
        System.out.println("Querying for work requests in a compartment:" + compartment.getId());
        do {
            final String finalNextPageToken = nextPageToken;

            ListWorkRequestsResponse response =
                    Failsafe.with(RETRY_POLICY)
                            .get(
                                    new Callable<ListWorkRequestsResponse>() {
                                        public ListWorkRequestsResponse call() {
                                            return identityClient.listWorkRequests(
                                                    ListWorkRequestsRequest.builder()
                                                            .limit(100)
                                                            .compartmentId(compartment.getId())
                                                            .page(finalNextPageToken)
                                                            .build());
                                        }
                                    });

            for (WorkRequestSummary workRequestSummary : response.getItems()) {
                System.out.println("workRequestId:" + workRequestSummary.getId());
                System.out.println("WorkRequest status:" + workRequestSummary.getStatus());
                System.out.println();
            }

            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);
    }

    private static Compartment createChildCompartment(
            Identity client, String compartmentId, String name) {
        CreateCompartmentDetails createCompartmentDetails =
                CreateCompartmentDetails.builder()
                        .compartmentId(compartmentId)
                        .name(name)
                        .description(name)
                        .build();

        Compartment compartment =
                client.createCompartment(
                                CreateCompartmentRequest.builder()
                                        .createCompartmentDetails(createCompartmentDetails)
                                        .build())
                        .getCompartment();

        if (compartment == null) {
            throw new RuntimeException(
                    "Compartment creation fails with " + createCompartmentDetails.toString());
        }
        System.out.println("Compartment " + compartment.getName() + " created successfully");
        return compartment;
    }

    private static class RetryPredicate implements Predicate<Throwable> {
        /**
         * Checks if the exception can be retried or not.
         *
         * @param e Exception object.
         * @return Returns true if the exception can be retried otherwise false.
         */
        public boolean test(Throwable e) {
            return e instanceof BmcException && ((BmcException) e).getStatusCode() == 404;
        }
    }
}

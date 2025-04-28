/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityAsyncClient;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.responses.AsyncHandler;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.function.Function;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;

public class InstancePrincipalsAuthenticationDetailsProviderExample {

    public static void main(String[] args) throws Exception {

        final InstancePrincipalsAuthenticationDetailsProvider provider;
        try {
            provider = InstancePrincipalsAuthenticationDetailsProvider.builder().build();
        } catch (Exception e) {
            if (e.getCause() instanceof SocketTimeoutException
                    || e.getCause() instanceof ConnectException) {
                System.out.println(
                        "This sample only works when running on an OCI instance. Are you sure you’re running on an OCI instance? For more info see: https://docs.oracle.com/iaas/Content/Identity/Tasks/callingservicesfrominstances.htm");
                return;
            }
            throw e;
        }

        final IdentityClient identityClient = IdentityClient.builder().build(provider);
        final IdentityAsyncClient identityAsyncClient =
                IdentityAsyncClient.builder().build(provider);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if
        // known)
        final String compartmentId = args[0];
        System.out.println(compartmentId);

        final ListAvailabilityDomainsRequest request =
                ListAvailabilityDomainsRequest.builder().compartmentId(compartmentId).build();

        System.out.println(
                "*******************Synchronous List Availability Domains*********************************");
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(request);

        identityClient.close();

        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems()) {
            System.out.println(domain.toString());
        }
        System.out.println(
                "*****************************************************************************************");
        System.out.println();
        System.out.println();

        System.out.println(
                "*************Asynchronous List Availability Domains with Futures*************************");
        final Future<ListAvailabilityDomainsResponse> future =
                identityAsyncClient.listAvailabilityDomains(request, null);
        final ListAvailabilityDomainsResponse responseFromFuture = future.get();
        for (AvailabilityDomain domain : responseFromFuture.getItems()) {
            System.out.println(domain.toString());
        }
        System.out.println(
                "*****************************************************************************************");
        System.out.println();
        System.out.println();

        System.out.println(
                "***********Asynchronous List Availability Domains with Async Handler************");
        final AsyncHandler<ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                asyncHandler =
                        new ExampleAsyncHandler(
                                provider,
                                new Function<
                                        AsyncHandler<
                                                ListAvailabilityDomainsRequest,
                                                ListAvailabilityDomainsResponse>,
                                        Future<ListAvailabilityDomainsResponse>>() {
                                    @Override
                                    public Future<ListAvailabilityDomainsResponse> apply(
                                            AsyncHandler<
                                                            ListAvailabilityDomainsRequest,
                                                            ListAvailabilityDomainsResponse>
                                                    handler) {
                                        return identityAsyncClient.listAvailabilityDomains(
                                                request, handler);
                                    }
                                });
        identityAsyncClient.listAvailabilityDomains(request, asyncHandler);
        ((ExampleAsyncHandler) asyncHandler).waitForCompletion();
        System.out.println(
                "*****************************************************************************************");

        identityClient.close();
        identityAsyncClient.close();
    }

    public static class ExampleAsyncHandler
            implements AsyncHandler<
                    ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse> {
        private final CountDownLatch latch = new CountDownLatch(1);
        private final InstancePrincipalsAuthenticationDetailsProvider authDetailsProvider;
        private final Function<
                        AsyncHandler<
                                ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>,
                        Future<ListAvailabilityDomainsResponse>>
                retryCall;
        private int numTries = 0;

        public ExampleAsyncHandler(
                final InstancePrincipalsAuthenticationDetailsProvider authDetailsProvider,
                final Function<
                                AsyncHandler<
                                        ListAvailabilityDomainsRequest,
                                        ListAvailabilityDomainsResponse>,
                                Future<ListAvailabilityDomainsResponse>>
                        retryCall) {
            this.authDetailsProvider = authDetailsProvider;
            this.retryCall = retryCall;
        }

        @Override
        public void onSuccess(
                ListAvailabilityDomainsRequest request, ListAvailabilityDomainsResponse response) {
            for (AvailabilityDomain domain : response.getItems()) {
                System.out.println(domain.toString());
            }
            latch.countDown();
        }

        @Override
        public void onError(ListAvailabilityDomainsRequest request, Throwable t) {
            t.printStackTrace();
            latch.countDown();
        }

        public void waitForCompletion() throws Exception {
            latch.await();
        }
    }
}

/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.*;
import com.oracle.bmc.identity.requests.*;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.model.BmcException;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;
import net.jodah.failsafe.function.Predicate;
import java.util.concurrent.Callable;

import java.util.concurrent.TimeUnit;

public class UpdateUserCapabilitesExample {
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

        // Create a user.
        final User user =
                createUser(identityClient, tenantId, "SDK-Sample-User", "SDK sample user");
        System.out.println("Created user with userId:" + user.getId());
        System.out.println();

        // Get the created user.
        final GetUserRequest getUserRequest = GetUserRequest.builder().userId(user.getId()).build();

        // If we create/update and then try to use compartments straight away, sometimes we can get a 404.
        // To try and avoid this, this example uses retries with a short delay.
        GetUserResponse getUserResponse =
                Failsafe.with(RETRY_POLICY)
                        .get(
                                new Callable<GetUserResponse>() {
                                    public GetUserResponse call() {
                                        return identityClient.getUser(getUserRequest);
                                    }
                                });
        System.out.println("Getting the created user with userId:" + user.getId());
        System.out.println();

        updateUserCapabilities(identityClient, user.getId(), false);
    }

    public static User createUser(
            Identity client, String compartmentId, String name, String description) {
        CreateUserDetails createUserDetails =
                CreateUserDetails.builder()
                        .compartmentId(compartmentId)
                        .name(name)
                        .description(description)
                        .build();

        User user =
                client.createUser(
                                CreateUserRequest.builder()
                                        .createUserDetails(createUserDetails)
                                        .build())
                        .getUser();

        if (user == null) {
            throw new RuntimeException("User creation fails with " + createUserDetails.toString());
        }
        System.out.println("User " + user.getName() + " created successfully");
        return user;
    }

    public static User updateUserCapabilities(
            Identity client, String userId, boolean canUseAuthTokens) {

        UpdateUserCapabilitiesDetails updateUserCapabilitiesDetails =
                UpdateUserCapabilitiesDetails.builder().canUseAuthTokens(canUseAuthTokens).build();

        try {
            User user =
                    client.updateUserCapabilities(
                                    UpdateUserCapabilitiesRequest.builder()
                                            .userId(userId)
                                            .updateUserCapabilitiesDetails(
                                                    updateUserCapabilitiesDetails)
                                            .build())
                            .getUser();

            if (user == null) {
                throw new RuntimeException(
                        "Update user capabilities fails with "
                                + updateUserCapabilitiesDetails.toString());
            }

            System.out.println("User" + user + " updated successfully with the capabilities");
            return user;
        } catch (Exception ex) {
            throw new RuntimeException(
                    "User update capabilities fails with error:" + ex.getMessage());
        }
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

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.GetAuthenticationPolicyRequest;
import com.oracle.bmc.identity.responses.GetAuthenticationPolicyResponse;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * An example for using session token authentication which uses the Authentication Policy api to
 * repeatedly get the Authentication-Policy for your tenant.
 *
 * <p>A valid session token is required to run this example otherwise a `401 - Not Authenticated`
 * error will occur.
 *
 * <p>Use the OCI CLI to authenticate with a browser and create a token, see
 * https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/clitoken.htm
 */
public class SessionTokenExample {
    public static void main(String[] args) throws IOException {

        /**
         * This portion assumes that a valid session token in the file specified by the
         * "security_token_file" field for the profile being used in the config file. See
         * https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm#File_Entries
         */

        // The following creates a session token auth provider with default behavior,
        // which includes default config file parsing and a refresh schedule
        // that keeps a session valid for 24 hours.
        SessionTokenAuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider();
        queryAuthenticationPolicy(provider);
        // Close the provider to stop the token refresh schedule
        provider.close();

        // The session token auth provider builder can be used to create the
        // SessionTokenAuthenticationDetailsProvider with default refresh schedule
        // without parsing a config file or session token file.
        provider =
                SessionTokenAuthenticationDetailsProvider.builder()
                        .region("us-phoenix-1")
                        .tenantId("ocid1.tenancy.oc...")
                        .privateKeyFilePath("~/.oci/sessions/mySession/oci_api_key.pem")
                        .sessionToken("<token>")
                        .build();
        queryAuthenticationPolicy(provider);
        provider.close();

        // Provide custom refresh timing.
        provider =
                SessionTokenAuthenticationDetailsProvider.builder()
                        .refreshPeriod(4)
                        .timeUnit(TimeUnit.MINUTES)
                        .sessionLifetimeHours(2)
                        .build();
        queryAuthenticationPolicy(provider);
        provider.close();

        // Default parsing with disabled automatic token refreshing.
        provider =
                SessionTokenAuthenticationDetailsProvider.builder()
                        .disableScheduledRefresh()
                        .build();
        queryAuthenticationPolicy(provider);

        // Provide a custom scheduler
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

        provider = SessionTokenAuthenticationDetailsProvider.builder().scheduler(scheduler).build();
        queryAuthenticationPolicy(provider);
        provider.close();
    }

    private static void queryAuthenticationPolicy(AuthenticationDetailsProvider provider) {
        Identity identityClient = IdentityClient.builder().build(provider);
        final String tenantId = provider.getTenantId();
        System.out.printf("Getting the authentication policy of your tenant %s\n", tenantId);
        GetAuthenticationPolicyResponse getAuthenticationPolicyResponse =
                identityClient.getAuthenticationPolicy(
                        GetAuthenticationPolicyRequest.builder()
                                // currently only the tenant (ie the root compartment) can have an
                                // authentication policy
                                .compartmentId(tenantId)
                                .build());
        System.out.printf(
                "The Authentication Policy is: %s\n",
                getAuthenticationPolicyResponse.getAuthenticationPolicy().toString());
    }
}

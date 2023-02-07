/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.PasswordPolicy;
import com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails;
import com.oracle.bmc.identity.requests.GetAuthenticationPolicyRequest;
import com.oracle.bmc.identity.requests.UpdateAuthenticationPolicyRequest;
import com.oracle.bmc.identity.responses.GetAuthenticationPolicyResponse;
import com.oracle.bmc.identity.responses.UpdateAuthenticationPolicyResponse;

import java.io.IOException;

/**
 * An example for using the Authentication Policy api using a session token. Steps: 1. Get the
 * Authentication-Policy for your tenant 2. Update the Authentication-Policy for your tenant 3.
 * Create a session token using the OCI CLI 4. Set the session token file path in the OCI
 * configuration file using the 'security_token_file' parameter
 */
public class SessionTokenExample {
    public static void main(String[] args) throws IOException {

        // This example assumes that you have a session token in the file specified by the
        // "security_token_file" field
        // in the profile being used in the config file. If the token does not exist or has not been
        // refreshed,
        // this example will fail with a 401 - Not Authenticated error.
        // You can use the OCI CLI to authenticate and create a token, see
        // https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/clitoken.htm
        final AuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider();

        final String tenantId = provider.getTenantId();
        Identity identityClient = IdentityClient.builder().build(provider);

        queryAuthenticationPolicy(tenantId, identityClient);

        updateAuthenticationPolicy(tenantId, identityClient);
    }

    private static void queryAuthenticationPolicy(String tenantId, Identity identityClient) {
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

    private static void updateAuthenticationPolicy(String tenantId, Identity identityClient) {
        System.out.printf("Updating the authentication policy of your tenant %s\n", tenantId);
        UpdateAuthenticationPolicyRequest request =
                UpdateAuthenticationPolicyRequest.builder()
                        .compartmentId(tenantId)
                        .updateAuthenticationPolicyDetails(
                                UpdateAuthenticationPolicyDetails.builder()
                                        .passwordPolicy(
                                                PasswordPolicy.builder()
                                                        .minimumPasswordLength(
                                                                15) // note that this is changed
                                                        // from the default
                                                        .isLowercaseCharactersRequired(true)
                                                        .isUppercaseCharactersRequired(true)
                                                        .isNumericCharactersRequired(true)
                                                        .isSpecialCharactersRequired(true)
                                                        .isUsernameContainmentAllowed(false)
                                                        .build())
                                        .build())
                        .build();
        UpdateAuthenticationPolicyResponse response =
                identityClient.updateAuthenticationPolicy(request);

        System.out.printf(
                "The Authentication Policy is updated to: %s\n",
                response.getAuthenticationPolicy());
    }
}

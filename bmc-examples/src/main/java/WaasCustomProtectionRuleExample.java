/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.waas.WaasClient;
import com.oracle.bmc.waas.model.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaasCustomProtectionRuleExample {

    /** Configuration for the example, replace these with your own values. */
    private static final String CONFIG_LOCATION = "~/.oci/config";

    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final String CUSTOM_PROTECTION_RULE_TEMPLATE_LOCATION = "~/.oci/template";
    private static final String COMPARTMENT_ID = "ocid1.compartment.oc1...aaaaaa";
    private static final String TARGET_COMPARTMENT_ID = "ocid1.compartment.oc1...xxxxxx";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the WAAS policy will be created.
     *           <p><b>Note:</b> Your tenancy OCID will be read from your configuration file
     *       <li>The web application domain that will be pointed to the CNAME of the Web Application
     *           Firewall.
     *       <li>The origin domain that the Web Application Firewall will forward traffic to.
     *       <li><b>Optionally:</b> The path to the PEM encoded RSA private key used by the Web
     *           Application Firewall to accept HTTPS traffic for your domain
     *       <li><b>Optionally:</b> The path to the PEM encoded SSL certificate used by the Web
     *           Application Firewall to accept HTTPS traffic for your domain
     *     </ul>
     *     The request flow should look like the following: User -> `domain` -> OCI Web Application
     *     Firewall -> `origin`
     */
    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final WaasClient waasClient = WaasClient.builder().build(provider);
        final IdentityClient identityClient = IdentityClient.builder().build(provider);

        String customProtectionRuleTemplate =
                new String(
                        Files.readAllBytes(Paths.get(CUSTOM_PROTECTION_RULE_TEMPLATE_LOCATION)),
                        StandardCharsets.UTF_8);

        CustomProtectionRule customProtectionRule = null;
        try {
            customProtectionRule =
                    createCustomProtectionRule(
                            waasClient, COMPARTMENT_ID, "CustomRule", customProtectionRuleTemplate);

            listCustomProtectionRules(waasClient, COMPARTMENT_ID);

            changeCustomProtectionRuleCompartment(
                    waasClient, customProtectionRule.getId(), TARGET_COMPARTMENT_ID);

            getCustomProtectionRule(waasClient, customProtectionRule.getId());

            deleteCustomProtectionRule(waasClient, customProtectionRule.getId());

        } finally {

            waasClient.close();
            identityClient.close();
        }
    }

    /**
     * Creates a new Custom Protection Rule
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartment that owns the Address List
     * @param name text used as a displayName in the created resource
     * @param template protection rule template
     * @return the created Custom Protection Rule
     */
    private static CustomProtectionRule createCustomProtectionRule(
            WaasClient waasClient,
            final String compartmentId,
            final String name,
            final String template) {

        System.out.println("Creating new custom protection rule");
        System.out.println("===================================");

        CreateCustomProtectionRuleDetails customProtectionRuleDetails =
                CreateCustomProtectionRuleDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(name)
                        .template(template)
                        .build();

        final CreateCustomProtectionRuleResponse customProtectionRuleResponse =
                waasClient.createCustomProtectionRule(
                        CreateCustomProtectionRuleRequest.builder()
                                .createCustomProtectionRuleDetails(customProtectionRuleDetails)
                                .build());

        System.out.println("New custom protection rule has been created");
        return customProtectionRuleResponse.getCustomProtectionRule();
    }

    /**
     * Deletes a WAAS policy and waits for it to be deleted
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param customProtectionRuleId the custom protection rule OCID to delete
     */
    private static void deleteCustomProtectionRule(
            WaasClient waasClient, final String customProtectionRuleId) {
        waasClient.deleteCustomProtectionRule(
                DeleteCustomProtectionRuleRequest.builder()
                        .customProtectionRuleId(customProtectionRuleId)
                        .build());

        waasClient
                .getWaiters()
                .forCustomProtectionRule(
                        GetCustomProtectionRuleRequest.builder()
                                .customProtectionRuleId(customProtectionRuleId)
                                .build(),
                        LifecycleStates.Deleted);

        System.out.println("Custom protection rule deleted");
    }

    /**
     * Gets Custom Protection Rule.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param customProtectionRuleId the OCID of the Custom Protection Rule
     */
    private static CustomProtectionRule getCustomProtectionRule(
            WaasClient waasClient, final String customProtectionRuleId) {

        GetCustomProtectionRuleResponse customProtectionRuleResponse =
                waasClient.getCustomProtectionRule(
                        GetCustomProtectionRuleRequest.builder()
                                .customProtectionRuleId(customProtectionRuleId)
                                .build());

        return customProtectionRuleResponse.getCustomProtectionRule();
    }

    /**
     * Lists Custom Protection Rules of the compartment.
     *
     * @param waasClient the client used to communicate with the WAAS service
     * @param compartmentId the OCID of the compartments to list resources to
     */
    private static void listCustomProtectionRules(
            WaasClient waasClient, final String compartmentId) {

        System.out.println("Listing Custom Protection rules");
        System.out.println("===============================");

        ListCustomProtectionRulesRequest listCustomProtectionRulesRequest =
                ListCustomProtectionRulesRequest.builder().compartmentId(compartmentId).build();

        Iterable<CustomProtectionRuleSummary> customProtectionRuleIterator =
                waasClient
                        .getPaginators()
                        .listCustomProtectionRulesRecordIterator(listCustomProtectionRulesRequest);

        for (CustomProtectionRuleSummary summary : customProtectionRuleIterator) {
            System.out.println("Custom protection rule: " + summary.getDisplayName());
        }
    }

    /**
     * Changes the compartment for an existing Custom Protection Rule
     *
     * @param waasClient client used to communicate with the service
     * @param customProtectionRuleId ID of the Custom Protection Rule to be updated
     * @param targetCompartmentId target compartment to which the Custom Protection Rule will be
     *     moved
     */
    private static void changeCustomProtectionRuleCompartment(
            WaasClient waasClient,
            final String customProtectionRuleId,
            final String targetCompartmentId) {
        ChangeCustomProtectionRuleCompartmentResponse response =
                waasClient.changeCustomProtectionRuleCompartment(
                        ChangeCustomProtectionRuleCompartmentRequest.builder()
                                .customProtectionRuleId(customProtectionRuleId)
                                .changeCustomProtectionRuleCompartmentDetails(
                                        ChangeCustomProtectionRuleCompartmentDetails.builder()
                                                .compartmentId(targetCompartmentId)
                                                .build())
                                .build());

        System.out.println("Moved Custom Protection rule " + response.toString());
    }
}

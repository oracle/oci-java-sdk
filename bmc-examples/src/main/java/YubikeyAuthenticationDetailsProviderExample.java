/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.YubikeyAuthenticationDetailsProvider;
import com.oracle.bmc.auth.YubikeyConfig;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

public class YubikeyAuthenticationDetailsProviderExample {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: the first argument is a yubikey passphrase, the second is the compartment ID");
        }
        char[] yubikeyPassphrase = args[0].toCharArray();
        final String compartmentId = args[1];

        // Example 1: using the YubikeyAuthenticationDetailsProvider.builder to load the yubikey parameters
        // Config file is not needed at all the builder accepts all the necessary parameters
        // The yubikey passphrase is passed directly to the builder
        YubikeyAuthenticationDetailsProvider provider =
                YubikeyAuthenticationDetailsProvider.builder()
                        .region(Region.US_PHOENIX_1)
                        .tenantId("ocid1.tenancy.oc1..")
                        .userId("ocid1.user.oc1..")
                        .yubikeyPassphraseCharacters(yubikeyPassphrase)
                        .build();
        IdentityClient identityClient = IdentityClient.builder().build(provider);
        CallListAvailabilityDomains(identityClient, compartmentId);

        // Example 2: using the default config file to load the required parameters
        // The default config file (path and profile) is used to generate the required parameters for this provider if some or all of the parameters are missing from the builder.
        // the "pass_phrase" entry is used as the yubikey passphrase.
        provider = YubikeyAuthenticationDetailsProvider.builder().build();
        identityClient = IdentityClient.builder().build(provider);
        CallListAvailabilityDomains(identityClient, compartmentId);

        // Example 3: using a custom config file to load parameters from a custom profile
        // The config file found at ~/customFilePath/config is used along with the parameters in the CustomProfile profile.
        // the "pass_phrase" entry is used as the yubikey passphrase.
        ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse("~/customFilePath/config", "CustomProfile");
        provider = YubikeyAuthenticationDetailsProvider.builder().configFile(configFile).build();
        identityClient = IdentityClient.builder().build(provider);
        CallListAvailabilityDomains(identityClient, compartmentId);

        // Example 4: using a custom config file path and yubikeyConfig
        // The config file found at ~/customFilePath/config is used along with the parameters in the CustomProfile profile.
        // the yubikey passphrase is passed via the YubikeyConfig object which can also be used to change the yubikey library location.
        YubikeyConfig yubikeyConfig =
                YubikeyConfig.builder()
                        // .libraryLocation("~/custom/yubikeyLibrary/path")
                        .yubikeyPassphraseCharacters(yubikeyPassphrase)
                        .build();
        provider =
                YubikeyAuthenticationDetailsProvider.builder()
                        .configFile(configFile)
                        .yubikeyConfig(yubikeyConfig)
                        .build();
        identityClient = IdentityClient.builder().build(provider);
        CallListAvailabilityDomains(identityClient, compartmentId);
    }

    static void CallListAvailabilityDomains(IdentityClient identityClient, String compartmentId) {
        final ListAvailabilityDomainsRequest request =
                ListAvailabilityDomainsRequest.builder().compartmentId(compartmentId).build();

        System.out.println(
                "*******************Synchronous List Availability Domains*********************************");
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(request);

        identityClient.close();

        for (AvailabilityDomain domain : listAvailabilityDomainsResponse.getItems())
            System.out.println(domain);
        System.out.println(
                "*****************************************************************************************");
    }
}

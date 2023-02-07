/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.FaultDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.ListFaultDomainsRequest;
import com.oracle.bmc.identity.responses.ListFaultDomainsResponse;

import java.util.List;

public class ListFaultDomainsExample {
    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String compartmentId = null;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Identity identityClient = IdentityClient.builder().build(provider);

        List<AvailabilityDomain> availabilityDomains =
                identityClient
                        .listAvailabilityDomains(
                                ListAvailabilityDomainsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .build())
                        .getItems();

        for (AvailabilityDomain ad : availabilityDomains) {

            ListFaultDomainsResponse listFaultDomainsResponse =
                    identityClient.listFaultDomains(
                            ListFaultDomainsRequest.builder()
                                    .compartmentId(ad.getCompartmentId())
                                    .availabilityDomain(ad.getName())
                                    .build());
            for (FaultDomain fd : listFaultDomainsResponse.getItems()) {
                System.out.println(fd.getName());
            }
        }
    }
}

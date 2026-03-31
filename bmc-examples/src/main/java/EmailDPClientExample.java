/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.emaildataplane.EmailDPClient;
import com.oracle.bmc.emaildataplane.requests.SubmitRawEmailRequest;
import com.oracle.bmc.emaildataplane.responses.SubmitRawEmailResponse;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EmailDPClientExample {

    public static void main(String[] args) throws Exception {
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        EmailDPClient emailDPClient = new EmailDPClient(provider);

        SubmitRawEmailRequest submitRawEmailRequest =
                SubmitRawEmailRequest.builder()
                        .compartmentId(provider.getTenantId())
                        .contentType(SubmitRawEmailRequest.ContentType.MessageGlobal)
                        .sender("sender@example.com")
                        .recipients(
                                Arrays.asList("recipients@example.com", "recipients2@example.com"))
                        .rawMessage(generateStreamFromString("ExampleStreamValue"))
                        .build();

        SubmitRawEmailResponse response = emailDPClient.submitRawEmail(submitRawEmailRequest);

        System.out.println("Email submitted successfully. Response: " + response);
    }

    private static InputStream generateStreamFromString(String data) {
        return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }
}

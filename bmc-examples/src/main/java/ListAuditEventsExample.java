/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.Date;

import com.oracle.bmc.audit.Audit;
import com.oracle.bmc.audit.AuditClient;
import com.oracle.bmc.audit.model.AuditEvent;
import com.oracle.bmc.audit.requests.ListEventsRequest;
import com.oracle.bmc.audit.responses.ListEventsResponse;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;

public class ListAuditEventsExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String compartmentId = null;
        Date startTime = null;
        Date endTime = null;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        Audit auditService = new AuditClient(provider);

        String nextPageToken = null;
        do {
            ListEventsResponse response =
                    auditService.listEvents(
                            ListEventsRequest.builder()
                                    .compartmentId(compartmentId)
                                    .startTime(startTime)
                                    .endTime(endTime)
                                    .page(nextPageToken)
                                    .build());

            for (AuditEvent event : response.getItems()) {
                System.out.println(event);
            }

            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);

        auditService.close();
    }
}

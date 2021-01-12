/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.util.Date;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
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
        String compartmentId = "";
        Date endTime = null;
        Date startTime = null;
        Region region = Region.US_PHOENIX_1;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Audit auditService = new AuditClient(provider);
        auditService.setRegion(region);

        /*
         * Below we demonstrate getting audit events using three different strategies:
         *
         *      - Manually paging through results from ListEvents using the opcNextPage in each response
         *      - Using the paginator exposed by the Audit service client to iterate through ListEvents responses without having
         *        to manually deal with opcNextPage tokens
         *      - Using the paginator exposed by the Audit service client to iterate through AuditEvent objects (returned by calling
         *        ListEvents) without having to manually deal with opcNextPage tokens
         */

        System.out.println("Audit events - manual pagination");
        System.out.println("================================");
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

        System.out.println();
        System.out.println();

        ListEventsRequest listRequest =
                ListEventsRequest.builder()
                        .compartmentId(compartmentId)
                        .startTime(startTime)
                        .endTime(endTime)
                        .build();

        System.out.println("Audit events - response paginator");
        System.out.println("================================");
        Iterable<ListEventsResponse> responseIterator =
                auditService.getPaginators().listEventsResponseIterator(listRequest);
        for (ListEventsResponse response : responseIterator) {
            for (AuditEvent event : response.getItems()) {
                System.out.println(event);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Audit events - record paginator");
        System.out.println("================================");
        Iterable<AuditEvent> recordIterator =
                auditService.getPaginators().listEventsRecordIterator(listRequest);
        for (AuditEvent event : recordIterator) {
            System.out.println(event);
        }

        auditService.close();
    }
}

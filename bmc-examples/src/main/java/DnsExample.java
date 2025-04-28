/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dns.Dns;
import com.oracle.bmc.dns.DnsClient;
import com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails;
import com.oracle.bmc.dns.model.CreateZoneDetails;
import com.oracle.bmc.dns.model.PatchDomainRecordsDetails;
import com.oracle.bmc.dns.model.PatchRRSetDetails;
import com.oracle.bmc.dns.model.PatchZoneRecordsDetails;
import com.oracle.bmc.dns.model.Record;
import com.oracle.bmc.dns.model.RecordDetails;
import com.oracle.bmc.dns.model.RecordOperation;
import com.oracle.bmc.dns.model.SortOrder;
import com.oracle.bmc.dns.model.UpdateDomainRecordsDetails;
import com.oracle.bmc.dns.model.UpdateRRSetDetails;
import com.oracle.bmc.dns.model.UpdateZoneRecordsDetails;
import com.oracle.bmc.dns.model.Zone;
import com.oracle.bmc.dns.model.ZoneSummary;
import com.oracle.bmc.dns.requests.ChangeZoneCompartmentRequest;
import com.oracle.bmc.dns.requests.CreateZoneRequest;
import com.oracle.bmc.dns.requests.DeleteDomainRecordsRequest;
import com.oracle.bmc.dns.requests.DeleteRRSetRequest;
import com.oracle.bmc.dns.requests.GetDomainRecordsRequest;
import com.oracle.bmc.dns.requests.GetRRSetRequest;
import com.oracle.bmc.dns.requests.GetZoneRecordsRequest;
import com.oracle.bmc.dns.requests.GetZoneRequest;
import com.oracle.bmc.dns.requests.ListZonesRequest;
import com.oracle.bmc.dns.requests.PatchDomainRecordsRequest;
import com.oracle.bmc.dns.requests.PatchRRSetRequest;
import com.oracle.bmc.dns.requests.PatchZoneRecordsRequest;
import com.oracle.bmc.dns.requests.UpdateDomainRecordsRequest;
import com.oracle.bmc.dns.requests.UpdateRRSetRequest;
import com.oracle.bmc.dns.requests.UpdateZoneRecordsRequest;
import com.oracle.bmc.dns.responses.ChangeZoneCompartmentResponse;
import com.oracle.bmc.dns.responses.CreateZoneResponse;
import com.oracle.bmc.dns.responses.GetDomainRecordsResponse;
import com.oracle.bmc.dns.responses.GetRRSetResponse;
import com.oracle.bmc.dns.responses.GetZoneRecordsResponse;
import com.oracle.bmc.dns.responses.GetZoneResponse;
import com.oracle.bmc.dns.responses.ListZonesResponse;
import com.oracle.bmc.model.BmcException;

import java.util.ArrayList;
import java.util.List;

import static com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails.builder;

/**
 * This class provides a basic example of how to use the DNS service in the Java SDK. The main()
 * method in this class requires the following arguments:
 *
 * <p>- The first is the OCID of the compartment where we'll create the DNS Zone - The second is the
 * name of the DNS zone (e.g. my-example-zone.com) to create - The third is the OCID of the target
 * compartment where the DNS Zone will be moved
 */
public class DnsExample {
    public static void main(String[] args) throws Exception {
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file "~/.oci/config", and a profile in that config with the name "DEFAULT". Make
        // changes to the following line if needed and use
        // ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final Dns client = DnsClient.builder().build(provider);

        if (args.length != 3) {
            System.err.println(
                    "Missing required arguments: <compartment-id> <zone-name> <target-compartment-id>");
        }

        final String compartmentId = args[0];
        final String zoneName = args[1];
        final String targetCompartmentId = args[2];

        final CreateZoneResponse createZoneResponse =
                client.createZone(
                        CreateZoneRequest.builder()
                                .createZoneDetails(
                                        CreateZoneDetails.builder()
                                                .name(zoneName)
                                                .zoneType(CreateZoneDetails.ZoneType.Primary)
                                                .compartmentId(compartmentId)
                                                .build())
                                .build());

        // A zone has a lifecycle state, so we can wait until it is available
        GetZoneResponse getZoneResponse =
                client.getWaiters()
                        .forZone(
                                GetZoneRequest.builder()
                                        .compartmentId(compartmentId)
                                        .zoneNameOrId(zoneName)
                                        .build(),
                                Zone.LifecycleState.Active)
                        .execute();
        System.out.println("Created zone: " + getZoneResponse.getZone().toString());

        // We can also list all zones
        System.out.println();
        System.out.println("Listing all zones");
        System.out.println("==========================");
        getZones(client, ListZonesRequest.builder().compartmentId(compartmentId));

        // We can also specify filtering and sort criteria. Here we try and exact match on a zone
        // name and sort the results by time created descending
        System.out.println();
        System.out.println("Listing all zones with sort and filter");
        System.out.println("==========================");
        getZones(
                client,
                ListZonesRequest.builder()
                        .compartmentId(compartmentId)
                        .name(zoneName)
                        .sortBy(ListZonesRequest.SortBy.TimeCreated)
                        .sortOrder(SortOrder.Desc));

        updateZoneRecords(client, zoneName, compartmentId);
        patchZoneRecords(client, zoneName, compartmentId);

        updateAndPatchDomainRecords(client, zoneName, compartmentId);
        updateAndPatchRRSet(client, zoneName, compartmentId);

        final Zone zone = createZoneResponse.getZone();
        changeZoneCompartment(client, zone, targetCompartmentId);
    }

    /** We can change the compartment for a zone. */
    private static void changeZoneCompartment(
            final Dns client, final Zone zone, String targetCompartmentId) throws Exception {
        final ChangeZoneCompartmentDetails details =
                builder().compartmentId(targetCompartmentId).build();
        final ChangeZoneCompartmentRequest request =
                ChangeZoneCompartmentRequest.builder()
                        .zoneId(zone.getId())
                        .changeZoneCompartmentDetails(details)
                        .build();
        ChangeZoneCompartmentResponse changeResponse = client.changeZoneCompartment(request);

        System.out.println();
        System.out.println(
                "Changed zone compartment from "
                        + zone.getCompartmentId()
                        + " to "
                        + changeResponse.toString());
        System.out.println();
    }

    /**
     * We can update records in the zone. This will overwrite any existing records so if there are
     * items we wish to keep (e.g. the NS records in the zone) we need to read those out first and
     * make sure they are included in the update.
     *
     * <p>Note, also, that when updating zone records we can add records with different rtypes and
     * also for different domains in the zone
     */
    private static void updateZoneRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        // Here we get all NS records in the zone so that we can preserve them on update. Note that
        // getting zones records is a paginated operation and we're also applying filters to narrow
        // down our records
        final List<Record> originalNsRecords =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .domain(zoneName)
                                .rtype("NS"));

        // Now we prepare our update - this will contain the NS records we retrieved, as well as a
        // TXT record for the top level domain and an A record for a subdomain
        final List<RecordDetails> updateZoneRecordItems = new ArrayList<>();
        for (Record r : originalNsRecords) {
            updateZoneRecordItems.add(
                    RecordDetails.builder()
                            .domain(zoneName)
                            .ttl(r.getTtl())
                            .rtype("NS")
                            .rdata(r.getRdata())
                            .build());
        }
        updateZoneRecordItems.add(
                RecordDetails.builder()
                        .domain(zoneName)
                        .ttl(30)
                        .rtype("TXT")
                        .rdata("Some textual data")
                        .build());
        updateZoneRecordItems.add(
                RecordDetails.builder()
                        .domain("testsubdomain1." + zoneName)
                        .ttl(1800)
                        .rtype("A")
                        .rdata("127.0.0.1")
                        .build());

        client.updateZoneRecords(
                UpdateZoneRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .updateZoneRecordsDetails(
                                UpdateZoneRecordsDetails.builder()
                                        .items(updateZoneRecordItems)
                                        .build())
                        .build());

        // When retrieving records, we can optionally specify what version of the zone we want
        // records for. In this case, we explicitly want the latest version, which we can get by
        // retrieving the zone and then interrogating its version. Specifying different versions is
        // also possible
        final List<Record> allZoneRecordsAfterUpdate =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion()));
        System.out.println();
        System.out.println("Zone records after update");
        System.out.println("==========================");
        System.out.println(allZoneRecordsAfterUpdate);
    }

    /**
     * In addition to updates, we can use the patch operation to add and remove records from the
     * zone without having to send through the complete list of records each time. In this example,
     * we'll remove the existing TXT record that updateZoneRecords() added, and add a new one in
     */
    private static void patchZoneRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        final List<Record> allZoneRecords =
                getZoneRecords(client, GetZoneRecordsRequest.builder().zoneNameOrId(zoneName));

        Record txtRecord = null;
        for (Record r : allZoneRecords) {
            if (r.getRtype().equals("TXT")) {
                txtRecord = r;
                break;
            }
        }
        if (txtRecord == null) {
            throw new NullPointerException(
                    "Expected to find a TXT record in the list of zone records");
        }

        final List<RecordOperation> patchAddRemoveTxtRecord = new ArrayList<>();
        patchAddRemoveTxtRecord.add(
                RecordOperation.builder()
                        .domain(zoneName)
                        .recordHash(txtRecord.getRecordHash())
                        .rtype("TXT")
                        .rdata(txtRecord.getRdata())
                        .operation(RecordOperation.Operation.Remove)
                        .build());
        patchAddRemoveTxtRecord.add(
                RecordOperation.builder()
                        .domain(zoneName)
                        .rtype("TXT")
                        .rdata("Patch add new data")
                        .ttl(60)
                        .operation(RecordOperation.Operation.Add)
                        .build());

        client.patchZoneRecords(
                PatchZoneRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .patchZoneRecordsDetails(
                                PatchZoneRecordsDetails.builder()
                                        .items(patchAddRemoveTxtRecord)
                                        .build())
                        .build());

        final List<Record> recordsAfterPatch =
                getZoneRecords(client, GetZoneRecordsRequest.builder().zoneNameOrId(zoneName));
        System.out.println();
        System.out.println("Zone records after patch");
        System.out.println("==========================");
        System.out.println(recordsAfterPatch);

        // As part of patch operations, we can also specify preconditions (REQUIRE - data must be
        // present, and PROHIBIT - data must not be present) which must be met for the operation to
        // succeed.
        //
        // Note that currently (as of 6 February 2018) sending rdata as part of a precondition is
        // not supported

        final List<RecordOperation> failingPatchOperation = new ArrayList<>();
        failingPatchOperation.add( // This will fail as nothing matches this criteria
                RecordOperation.builder()
                        .domain("testsubdomain1." + zoneName)
                        .rtype("A")
                        .rrsetVersion("1234567")
                        .operation(RecordOperation.Operation.Require)
                        .build());
        failingPatchOperation.add(
                RecordOperation.builder()
                        .domain("testsubdomain1." + zoneName)
                        .rtype("A")
                        .rdata("127.0.0.2")
                        .ttl(1800)
                        .operation(RecordOperation.Operation.Add)
                        .build());

        try {
            client.patchZoneRecords(
                    PatchZoneRecordsRequest.builder()
                            .zoneNameOrId(zoneName)
                            .compartmentId(compartmentId)
                            .patchZoneRecordsDetails(
                                    PatchZoneRecordsDetails.builder()
                                            .items(failingPatchOperation)
                                            .build())
                            .build());
        } catch (BmcException e) {
            System.out.println(
                    String.format(
                            "Patch failed with BmcException of status: %d", e.getStatusCode()));
        }

        // This operation will succeed since we're asking that something matching the criteria
        // doesn't exist (PROHIBIT).
        //
        // Note also that the new TTL will be applied to all other A records in the rrset (i.e. our
        // existing A record will have its TTL changed to 2100), as all records in a rrset must
        // have the same TTL.
        final List<RecordOperation> successfulPatchOperation = new ArrayList<>();
        successfulPatchOperation.add(
                RecordOperation.builder()
                        .domain("testsubdomain1." + zoneName)
                        .rtype("A")
                        .rrsetVersion("1234567")
                        .operation(RecordOperation.Operation.Prohibit)
                        .build());
        successfulPatchOperation.add(
                RecordOperation.builder()
                        .domain("testsubdomain1." + zoneName)
                        .rtype("A")
                        .rdata("127.0.0.2")
                        .ttl(2000)
                        .operation(RecordOperation.Operation.Add)
                        .build());

        client.patchZoneRecords(
                PatchZoneRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .patchZoneRecordsDetails(
                                PatchZoneRecordsDetails.builder()
                                        .items(patchAddRemoveTxtRecord)
                                        .build())
                        .build());

        final List<Record> recordsAfterPatchWithPreconditions =
                getZoneRecords(client, GetZoneRecordsRequest.builder().zoneNameOrId(zoneName));
        System.out.println();
        System.out.println("Zone records after patch with preconditions");
        System.out.println("==========================");
        System.out.println(recordsAfterPatchWithPreconditions);
    }

    /**
     * We can also do update and patch operations at the domain level. This can handle records with
     * different rtypes, but they must all have the same domain (FQDN).
     */
    private static void updateAndPatchDomainRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        final String subdomain = "testsubdomain2." + zoneName;

        // When retrieving records, we can optionally specify what version of the zone we want
        // records for. In this case, we explicitly want the latest version, which we can get by
        // retrieving the zone and then interrogating its version. Specifying different versions is
        // also possible
        final List<Record> originalDomainRecords =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(subdomain));
        System.out.println();
        System.out.println("Current domain records");
        System.out.println("==========================");
        System.out.println(originalDomainRecords);

        final List<RecordDetails> updateDomainRecords = new ArrayList<>();
        updateDomainRecords.add(
                RecordDetails.builder()
                        .domain(subdomain)
                        .ttl(30)
                        .rtype("TXT")
                        .rdata("Subdomain text")
                        .build());
        updateDomainRecords.add(
                RecordDetails.builder()
                        .domain(subdomain)
                        .ttl(900)
                        .rtype("A")
                        .rdata("127.0.0.3")
                        .build());

        client.updateDomainRecords(
                UpdateDomainRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .updateDomainRecordsDetails(
                                UpdateDomainRecordsDetails.builder()
                                        .items(updateDomainRecords)
                                        .build())
                        .build());

        final List<Record> updatedDomainRecords =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder().zoneNameOrId(zoneName).domain(subdomain));
        System.out.println();
        System.out.println("Domain records after update");
        System.out.println("==========================");
        System.out.println(updatedDomainRecords);

        Record aRecord = null;
        Record txtRecord = null;
        for (Record r : updatedDomainRecords) {
            if (r.getRtype().equals("A")) {
                aRecord = r;
            } else if (r.getRtype().equals("TXT")) {
                txtRecord = r;
            }
        }
        if (aRecord == null || txtRecord == null) {
            throw new NullPointerException(
                    "Expected to find both an A record and a TXT record in the domain records after update");
        }

        /*
         * Patch operations at the domain level function similarly to patch operations at the zone
         * level, in that we can send through partial updates (additions and removals) and also
         * specify preconditions
         *
         * Here we specify two preconditions (which should succeed):
         *      - TXT records match the given RRSet version
         *      - A records have the given TTL
         *
         * And if that is successful we'll update the TTL of the existing A record
         */
        final List<RecordOperation> domainPatchOperations = new ArrayList<>();
        domainPatchOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .rrsetVersion(txtRecord.getRrsetVersion())
                        .operation(RecordOperation.Operation.Require)
                        .build());
        domainPatchOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("A")
                        .ttl(aRecord.getTtl())
                        .operation(RecordOperation.Operation.Require)
                        .build());
        domainPatchOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("A")
                        .ttl(1000)
                        .rdata("127.0.0.3")
                        .operation(RecordOperation.Operation.Add)
                        .build());

        client.patchDomainRecords(
                PatchDomainRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .patchDomainRecordsDetails(
                                PatchDomainRecordsDetails.builder()
                                        .items(domainPatchOperations)
                                        .build())
                        .build());

        final List<Record> domainRecordsAfterPatch =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder().zoneNameOrId(zoneName).domain(subdomain));
        System.out.println();
        System.out.println("Domain records after patch");
        System.out.println("==========================");
        System.out.println(domainRecordsAfterPatch);

        // We can also delete the domain records
        client.deleteDomainRecords(
                DeleteDomainRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .build());

        final List<Record> domainRecordsAfterDelete =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder().zoneNameOrId(zoneName).domain(subdomain));
        System.out.println();
        System.out.println("Domain records after delete");
        System.out.println("==========================");
        System.out.println(domainRecordsAfterDelete);
    }

    /**
     * We can also do update and patch operations at the RRSet level. This is scoped to a particular
     * domain (FQDN) and rtype.
     */
    private static void updateAndPatchRRSet(
            final Dns client, final String zoneName, final String compartmentId) {
        final String subdomain = "testsubdomain3." + zoneName;

        // When retrieving records, we can optionally specify what version of the zone we want
        // records for. In this case, we explicitly want the latest version, which is the default
        // behavior. Specifying different versions is also possible.
        final List<Record> originalRRSetRecords =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .domain(subdomain)
                                .rtype("TXT"));
        System.out.println();
        System.out.println("Current RRSet Records");
        System.out.println("==========================");
        System.out.println(originalRRSetRecords);

        final List<RecordDetails> updateRRSetItems = new ArrayList<>();
        updateRRSetItems.add(
                RecordDetails.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .ttl(100) // This should be consistent on each RecordDetails for the same
                        // rtype
                        .rdata("rec1")
                        .build());
        updateRRSetItems.add(
                RecordDetails.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .ttl(100) // This should be consistent on each RecordDetails for the same
                        // rtype
                        .rdata("rec2")
                        .build());

        client.updateRRSet(
                UpdateRRSetRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .rtype("TXT")
                        .updateRRSetDetails(
                                UpdateRRSetDetails.builder().items(updateRRSetItems).build())
                        .build());

        final List<Record> rrSetAfterUpdate =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .domain(subdomain)
                                .rtype("TXT"));
        System.out.println();
        System.out.println("RRSet Records After Update");
        System.out.println("==========================");
        System.out.println(rrSetAfterUpdate);

        /*
         * Patch operations on RRSets function similar to elsewhere in that we can send through
         * partial updates (additions and removals) and also specify preconditions.
         *
         * Here we specify a precondition on the TTL, and also remove one record and add another. Note that the new TTL specified
         * will apply to all records
         */
        final List<RecordOperation> patchRRSetOperations = new ArrayList<>();
        patchRRSetOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .ttl(101)
                        .operation(RecordOperation.Operation.Prohibit)
                        .build());
        patchRRSetOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .recordHash(rrSetAfterUpdate.get(1).getRecordHash())
                        // Currently (as of 6 Feb 2018) for a TXT record, if you want to send in
                        // rdata for an EXISTING record then it should be quoted. For example:
                        //   - '"Hello" "World"' instead of 'Hello World'
                        //   - '"rec3"' instead of 'rec3'
                        .rdata(rrSetAfterUpdate.get(1).getRdata())
                        .operation(RecordOperation.Operation.Remove)
                        .build());
        patchRRSetOperations.add(
                RecordOperation.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .ttl(101)
                        .rdata("rec3") // For new TXT records, we don't have to quote it
                        .operation(RecordOperation.Operation.Add)
                        .build());

        client.patchRRSet(
                PatchRRSetRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .rtype("TXT")
                        .patchRRSetDetails(
                                PatchRRSetDetails.builder().items(patchRRSetOperations).build())
                        .build());

        final List<Record> rrSetAfterPatch =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .domain(subdomain)
                                .rtype("TXT"));
        System.out.println();
        System.out.println("RRSet Records After Patch");
        System.out.println("==========================");
        System.out.println(rrSetAfterPatch);

        // We can also delete the records in a RRSet
        client.deleteRRSet(
                DeleteRRSetRequest.builder()
                        .zoneNameOrId(zoneName)
                        .domain(subdomain)
                        .rtype("TXT")
                        .build());

        final List<Record> rrSetAfterDelete =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(subdomain)
                                .rtype("TXT"));
        System.out.println();
        System.out.println("RRSet Records After Delete");
        System.out.println("==========================");
        System.out.println(rrSetAfterDelete);
    }

    private static Zone getZone(final Dns client, final String zoneName) {
        return client.getZone(GetZoneRequest.builder().zoneNameOrId(zoneName).build()).getZone();
    }

    private static List<Record> getZoneRecords(
            final Dns client, final GetZoneRecordsRequest.Builder requestBuilder) {
        final List<Record> results = new ArrayList<>();
        String nextPage = null;
        do {
            GetZoneRecordsResponse response =
                    client.getZoneRecords(requestBuilder.page(nextPage).build());
            nextPage = response.getOpcNextPage();
            results.addAll(response.getRecordCollection().getItems());
        } while (nextPage != null);

        return results;
    }

    private static List<Record> getDomainRecords(
            final Dns client, final GetDomainRecordsRequest.Builder requestBuilder) {
        final List<Record> results = new ArrayList<>();
        String nextPage = null;
        do {
            GetDomainRecordsResponse response =
                    client.getDomainRecords(requestBuilder.page(nextPage).build());
            nextPage = response.getOpcNextPage();
            results.addAll(response.getRecordCollection().getItems());
        } while (nextPage != null);

        return results;
    }

    private static List<Record> getRRSetRecords(
            final Dns client, final GetRRSetRequest.Builder requestBuilder) {
        final List<Record> results = new ArrayList<>();
        String nextPage = null;
        do {
            GetRRSetResponse response = client.getRRSet(requestBuilder.page(nextPage).build());
            nextPage = response.getOpcNextPage();
            results.addAll(response.getRRSet().getItems());
        } while (nextPage != null);
        return results;
    }

    private static void getZones(final Dns client, final ListZonesRequest.Builder requestBuilder) {
        String nextPageToken = null;
        do {
            ListZonesResponse response =
                    client.listZones(requestBuilder.page(nextPageToken).build());
            for (ZoneSummary z : response.getItems()) {
                System.out.println(z);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);
    }
}

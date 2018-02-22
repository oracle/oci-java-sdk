/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dns.Dns;
import com.oracle.bmc.dns.DnsClient;
import com.oracle.bmc.dns.model.*;
import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;
import com.oracle.bmc.model.BmcException;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a basic example of how to use the DNS service in the Java SDK. The main() method
 * in this class can take in two parameters:
 *
 *      - The first is the OCID of the compartment where we'll create the DNS Zone
 *      - The second is the name of the DNS zone (e.g. my-example-zone.com) to create
 */
public class DnsExample {
    public static void main(String[] args) throws Exception {
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final Dns client = new DnsClient(provider);
        client.setRegion(Region.US_PHOENIX_1);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if known)
        final String compartmentId = args[0];
        final String zoneName = args[1];

        final CreateZoneResponse createZoneResponse =
                client.createZone(
                        CreateZoneRequest.builder()
                                .compartmentId(compartmentId)
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
    }

    /**
     * We can update records in the zone. This will overwrite any existing records so if there are items
     * we wish to keep (e.g. the NS records in the zone) we need to read those out first and make
     * sure they are included in the update.
     *
     * Note, also, that when updating zone records we can add records with different rtypes and also
     * for different domains in the zone
     */
    private static void updateZoneRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        // Here we get all NS records in the zone so that we can preserve them on update. Note that getting
        // zones records is a paginated operation and we're also applying filters to narrow down our records
        final List<Record> originalNsRecords =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(zoneName)
                                .compartmentId(compartmentId)
                                .rtype("NS"));

        // Now we prepare our update - this will contain the NS records  we retrieved, as well as a TXT record
        // for the top level domain and an A record for a subdomain
        final List<RecordDetails> updateZoneRecordItems = new ArrayList<>();
        for (Record r : originalNsRecords) {
            updateZoneRecordItems.add(
                    RecordDetails.builder()
                            .domain(zoneName)
                            .ttl(r.getTtl())
                            .rtype("NS")
                            .recordHash(r.getRecordHash())
                            .rdata(r.getRdata())
                            .rrsetVersion(r.getRrsetVersion())
                            .isProtected(true)
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
                        .compartmentId(compartmentId)
                        .updateZoneRecordsDetails(
                                UpdateZoneRecordsDetails.builder()
                                        .items(updateZoneRecordItems)
                                        .build())
                        .build());

        // When retrieving records, we can optionally specify what version of the zone we want records for. In this case,
        // we explicitly want the latest version, which we can get by retrieving the zone and then interrogating its
        // version. Specifying different versions is also possible
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
     * In addition to updates, we can use the patch operation to add and remove records from the zone without
     * having to send through the complete list of records each time. In this example, we'll remove the existing
     * TXT record that updateZoneRecords() added, and add a new one in
     */
    private static void patchZoneRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        final List<Record> allZoneRecords =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion()));

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
                        .operation(RecordOperation.Operation.Remove)
                        .build());

        client.patchZoneRecords(
                PatchZoneRecordsRequest.builder()
                        .zoneNameOrId(zoneName)
                        .compartmentId(compartmentId)
                        .patchZoneRecordsDetails(
                                PatchZoneRecordsDetails.builder()
                                        .items(patchAddRemoveTxtRecord)
                                        .build())
                        .build());

        final List<Record> recordsAfterPatch =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion()));
        System.out.println();
        System.out.println("Zone records after patch");
        System.out.println("==========================");
        System.out.println(recordsAfterPatch);

        // As part of patch operations, we can also specify preconditions (REQUIRE - data must be present, and
        // PROHIBIT - data must not be present) which must be met for the operation to succeed.
        //
        // Note that currently (as of 6 February 2018) sending through rdata or a record hash as part of a
        // precondition is not supported

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

        // This operation will succeed since we're asking that something matching the criteria doesn't exist (PROHIBIT). Note
        // also that the TTL will be applied to all other A records in the domain (i.e. our existing A record will have its
        // TTL changed to 2100)
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
                        .compartmentId(compartmentId)
                        .patchZoneRecordsDetails(
                                PatchZoneRecordsDetails.builder()
                                        .items(patchAddRemoveTxtRecord)
                                        .build())
                        .build());

        final List<Record> recordsAfterPatchWithPreconditions =
                getZoneRecords(
                        client,
                        GetZoneRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion()));
        System.out.println();
        System.out.println("Zone records after patch with preconditions");
        System.out.println("==========================");
        System.out.println(recordsAfterPatchWithPreconditions);
    }

    /**
     *  We can also do update and patch operations at the domain level. This can handle records with different rtypes
     * but they must all be in the same domain
     */
    private static void updateAndPatchDomainRecords(
            final Dns client, final String zoneName, final String compartmentId) {
        final String subdomain = "testsubdomain2." + zoneName;

        // When retrieving records, we can optionally specify what version of the zone we want records for. In this case,
        // we explicitly want the latest version, which we can get by retrieving the zone and then interrogating its
        // version. Specifying different versions is also possible
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
                        .compartmentId(compartmentId)
                        .updateDomainRecordsDetails(
                                UpdateDomainRecordsDetails.builder()
                                        .items(updateDomainRecords)
                                        .build())
                        .build());

        final List<Record> updatedDomainRecords =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(subdomain));
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
         * Patch operations at the domain level function similarly to patch operations at the zone level, in that we can send through
         * partial updates (additions and removals) and also specify preconditions
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
                        .compartmentId(compartmentId)
                        .patchDomainRecordsDetails(
                                PatchDomainRecordsDetails.builder()
                                        .items(domainPatchOperations)
                                        .build())
                        .build());

        final List<Record> domainRecordsAfterPatch =
                getDomainRecords(
                        client,
                        GetDomainRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(subdomain));
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
                        GetDomainRecordsRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
                                .domain(subdomain));
        System.out.println();
        System.out.println("Domain records after delete");
        System.out.println("==========================");
        System.out.println(domainRecordsAfterDelete);
    }

    /**
     * We can also do update and patch operations at the RRSet level. This is scoped to a particular domain and rtype.
     */
    private static void updateAndPatchRRSet(
            final Dns client, final String zoneName, final String compartmentId) {
        final String subdomain = "testsubdomain3." + zoneName;

        // When retrieving records, we can optionally specify what version of the zone we want records for. In this case,
        // we explicitly want the latest version, which we can get by retrieving the zone and then interrogating its
        // version. Specifying different versions is also possible
        final List<Record> originalRRSetRecords =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
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
                        .ttl(
                                100) // This should be consistent on each RecordDetails for the same rtype
                        .rdata("rec1")
                        .build());
        updateRRSetItems.add(
                RecordDetails.builder()
                        .domain(subdomain)
                        .rtype("TXT")
                        .ttl(
                                100) // This should be consistent on each RecordDetails for the same rtype
                        .rdata("rec2")
                        .build());

        client.updateRRSet(
                UpdateRRSetRequest.builder()
                        .zoneNameOrId(zoneName)
                        .compartmentId(compartmentId)
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
                                .zoneVersion(getZone(client, zoneName).getVersion())
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
                        // Currently (as of 6 Feb 2018) for a TXT record, if you want to send in rdata for an EXISTING record then it should be quoted. For example:
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
                        .compartmentId(compartmentId)
                        .patchRRSetDetails(
                                PatchRRSetDetails.builder().items(patchRRSetOperations).build())
                        .build());

        final List<Record> rrSetAfterPatch =
                getRRSetRecords(
                        client,
                        GetRRSetRequest.builder()
                                .zoneNameOrId(zoneName)
                                .zoneVersion(getZone(client, zoneName).getVersion())
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

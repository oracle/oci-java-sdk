/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AddDrgRouteDistributionStatementDetails;
import com.oracle.bmc.core.model.AddDrgRouteDistributionStatementsDetails;
import com.oracle.bmc.core.model.CreateDrgAttachmentDetails;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CreateDrgRouteDistributionDetails;
import com.oracle.bmc.core.model.CreateDrgRouteTableDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.DrgAttachment;
import com.oracle.bmc.core.model.DrgAttachmentIdDrgRouteDistributionMatchCriteria;
import com.oracle.bmc.core.model.DrgAttachmentTypeDrgRouteDistributionMatchCriteria;
import com.oracle.bmc.core.model.DrgRouteDistribution;
import com.oracle.bmc.core.model.DrgRouteDistributionMatchCriteria;
import com.oracle.bmc.core.model.DrgRouteDistributionStatement;
import com.oracle.bmc.core.model.DrgRouteRule;
import com.oracle.bmc.core.model.DrgRouteTable;
import com.oracle.bmc.core.model.RemoveDrgRouteDistributionStatementsDetails;
import com.oracle.bmc.core.model.UpdateDrgAttachmentDetails;
import com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementDetails;
import com.oracle.bmc.core.model.UpdateDrgRouteDistributionStatementsDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.AddDrgRouteDistributionStatementsRequest;
import com.oracle.bmc.core.requests.CreateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.CreateDrgRouteDistributionRequest;
import com.oracle.bmc.core.requests.CreateDrgRouteTableRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteDrgAttachmentRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetDrgAttachmentRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.ListDrgRouteDistributionStatementsRequest;
import com.oracle.bmc.core.requests.ListDrgRouteRulesRequest;
import com.oracle.bmc.core.requests.RemoveDrgRouteDistributionStatementsRequest;
import com.oracle.bmc.core.requests.UpdateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.UpdateDrgRouteDistributionStatementsRequest;
import com.oracle.bmc.core.requests.GetDrgRouteTableRequest;
import com.oracle.bmc.core.responses.CreateDrgAttachmentResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateDrgRouteDistributionResponse;
import com.oracle.bmc.core.responses.CreateDrgRouteTableResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.ListDrgRouteDistributionStatementsResponse;
import com.oracle.bmc.core.responses.ListDrgRouteRulesResponse;
import com.oracle.bmc.workrequests.WorkRequestClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate how to add, update, delete, and list statements in a DRG Route Distribution
 * for managing dynamic route rules in DRG Route Tables
 *
 * <p>Details information on DRG:
 * https://docs.oracle.com/en-us/iaas/Content/Network/Tasks/managingDRGs.htm
 *
 * <p>Details DrgRouteDistribution API:
 * https://docs.oracle.com/en-us/iaas/api/#/en/iaas/20160918/DrgRouteDistribution
 */
public class DRGRouteDistributionExample {
    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;
    private static String COMPARTMENT_ID;
    private static String VCN_CIDR_1;
    private static String VCN_CIDR_2;

    public DRGRouteDistributionExample(VirtualNetworkClient virtualNetworkClient, Region region) {
        this.virtualNetworkClient = virtualNetworkClient;
        this.region = region;
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalStateException(
                    "Compartment ID, CIDRs for VCN 1 and VCN 2 must be passed in as "
                            + "arguments 1, 2, and 3 respectively");
        }

        COMPARTMENT_ID = args[0];
        VCN_CIDR_1 = args[1];
        VCN_CIDR_2 = args[2];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient phxVirtualNetworkClient =
                VirtualNetworkClient.builder().region(Region.US_PHOENIX_1).build(authProvider);
        final DRGRouteDistributionExample example =
                new DRGRouteDistributionExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);

        example.run(authProvider);
    }

    public void run(final AuthenticationDetailsProvider authProvider) throws Exception {
        System.out.println("DRG Route Distributions statements example..");
        Drg drg = null;
        Vcn vcn1 = null;
        Vcn vcn2 = null;
        DrgAttachment drgAttachment1 = null;
        DrgAttachment drgAttachment2 = null;
        try {
            System.out.println("Creating DRG.");
            drg = createDrg(virtualNetworkClient, authProvider, region);

            System.out.println("Creating VCN 1.");
            vcn1 = createVcn(virtualNetworkClient, region, VCN_CIDR_1, "SPOKEVCN");

            System.out.println("Creating DRG Attachment 1.");
            drgAttachment1 = createDrgAttachment(virtualNetworkClient, region, vcn1, drg);

            System.out.println("Creating VCN 2.");
            vcn2 = createVcn(virtualNetworkClient, region, VCN_CIDR_2, "SPOKEVCN");

            System.out.println("Creating DRG Attachment 2.");
            drgAttachment2 = createDrgAttachment(virtualNetworkClient, region, vcn2, drg);

            System.out.println("Creating DRG Route Distribution.");
            final CreateDrgRouteDistributionDetails createDrgRouteDistributionDetails =
                    CreateDrgRouteDistributionDetails.builder()
                            .drgId(drg.getId())
                            .distributionType(
                                    CreateDrgRouteDistributionDetails.DistributionType.Import)
                            .build();
            final CreateDrgRouteDistributionResponse createDrgRouteDistributionResponse =
                    virtualNetworkClient.createDrgRouteDistribution(
                            CreateDrgRouteDistributionRequest.builder()
                                    .createDrgRouteDistributionDetails(
                                            createDrgRouteDistributionDetails)
                                    .build());

            System.out.println(
                    "Add a statement to the route distribution to import from DRG Attachment 2");
            DrgRouteDistributionMatchCriteria drgRouteDistributionMatchCriteria =
                    DrgAttachmentIdDrgRouteDistributionMatchCriteria.builder()
                            .drgAttachmentId(drgAttachment2.getId())
                            .build();
            List<DrgRouteDistributionMatchCriteria> drgRouteDistributionMatchCriteriaList =
                    new ArrayList<>();
            drgRouteDistributionMatchCriteriaList.add(drgRouteDistributionMatchCriteria);
            final AddDrgRouteDistributionStatementDetails addDrgRouteDistributionStatementDetails =
                    AddDrgRouteDistributionStatementDetails.builder()
                            .matchCriteria(drgRouteDistributionMatchCriteriaList)
                            .priority(1)
                            .action(AddDrgRouteDistributionStatementDetails.Action.Accept)
                            .build();
            final AddDrgRouteDistributionStatementsDetails
                    addDrgRouteDistributionStatementsDetails =
                            AddDrgRouteDistributionStatementsDetails.builder()
                                    .statements(
                                            Collections.singletonList(
                                                    addDrgRouteDistributionStatementDetails))
                                    .build();
            final DrgRouteDistribution drgRouteDistribution =
                    createDrgRouteDistributionResponse.getDrgRouteDistribution();
            virtualNetworkClient.addDrgRouteDistributionStatements(
                    AddDrgRouteDistributionStatementsRequest.builder()
                            .addDrgRouteDistributionStatementsDetails(
                                    addDrgRouteDistributionStatementsDetails)
                            .drgRouteDistributionId(drgRouteDistribution.getId())
                            .build());

            System.out.println("Create a new route table pointing to the route distribution.");
            final CreateDrgRouteTableResponse drgRouteTable =
                    virtualNetworkClient.createDrgRouteTable(
                            CreateDrgRouteTableRequest.builder()
                                    .createDrgRouteTableDetails(
                                            CreateDrgRouteTableDetails.builder()
                                                    .drgId(drg.getId())
                                                    .importDrgRouteDistributionId(
                                                            drgRouteDistribution.getId())
                                                    .build())
                                    .build());

            WorkRequestClient workRequestClient = WorkRequestClient.builder().build(authProvider);
            virtualNetworkClient
                    .newWaiters(workRequestClient)
                    .forDrgRouteTable(
                            GetDrgRouteTableRequest.builder()
                                    .drgRouteTableId(drgRouteTable.getDrgRouteTable().getId())
                                    .build(),
                            DrgRouteTable.LifecycleState.Available)
                    .execute();

            System.out.println(
                    "Assign the newly created route table to drg attachment 1 (with VCN1).");
            final DrgRouteTable routeTable = drgRouteTable.getDrgRouteTable();
            virtualNetworkClient.updateDrgAttachment(
                    UpdateDrgAttachmentRequest.builder()
                            .drgAttachmentId(drgAttachment1.getId())
                            .updateDrgAttachmentDetails(
                                    UpdateDrgAttachmentDetails.builder()
                                            .drgRouteTableId(routeTable.getId())
                                            .build())
                            .build());

            System.out.println("List route distribution statements in the route distribution.");
            final List<DrgRouteDistributionStatement> drgRouteDistributionStatements =
                    listRouteDistributionStatements(drgRouteDistribution);

            System.out.println("List dynamic route rules in the route table.");
            listDynamicDrgRouteRules(routeTable);

            System.out.println("Update route distribution statement.");
            final DrgAttachmentTypeDrgRouteDistributionMatchCriteria
                    drgAttachmentTypeDrgRouteDistributionMatchCriteria =
                            DrgAttachmentTypeDrgRouteDistributionMatchCriteria.builder()
                                    .attachmentType(
                                            DrgAttachmentTypeDrgRouteDistributionMatchCriteria
                                                    .AttachmentType.IpsecTunnel)
                                    .build();
            List<DrgRouteDistributionMatchCriteria> drgRouteDistributionMatchCriteriaList2 =
                    new ArrayList<>();
            drgRouteDistributionMatchCriteriaList2.add(
                    drgAttachmentTypeDrgRouteDistributionMatchCriteria);
            final UpdateDrgRouteDistributionStatementDetails
                    updateDrgRouteDistributionStatementDetails =
                            UpdateDrgRouteDistributionStatementDetails.builder()
                                    .id(drgRouteDistributionStatements.get(0).getId())
                                    .matchCriteria(drgRouteDistributionMatchCriteriaList2)
                                    .build();
            final UpdateDrgRouteDistributionStatementsDetails
                    updateDrgRouteDistributionStatementsDetails =
                            UpdateDrgRouteDistributionStatementsDetails.builder()
                                    .statements(
                                            Collections.singletonList(
                                                    updateDrgRouteDistributionStatementDetails))
                                    .build();
            virtualNetworkClient.updateDrgRouteDistributionStatements(
                    UpdateDrgRouteDistributionStatementsRequest.builder()
                            .drgRouteDistributionId(drgRouteDistribution.getId())
                            .updateDrgRouteDistributionStatementsDetails(
                                    updateDrgRouteDistributionStatementsDetails)
                            .build());

            System.out.println("List route distribution statements in the route distribution.");
            listRouteDistributionStatements(drgRouteDistribution);

            System.out.println("List dynamic route rules in the route table.");
            listDynamicDrgRouteRules(routeTable);

            System.out.println("Remove route distribution statement.");
            virtualNetworkClient.removeDrgRouteDistributionStatements(
                    RemoveDrgRouteDistributionStatementsRequest.builder()
                            .removeDrgRouteDistributionStatementsDetails(
                                    RemoveDrgRouteDistributionStatementsDetails.builder()
                                            .statementIds(
                                                    Collections.singletonList(
                                                            drgRouteDistributionStatements
                                                                    .get(0)
                                                                    .getId()))
                                            .build())
                            .drgRouteDistributionId(drgRouteDistribution.getId())
                            .build());

            System.out.println("List route distribution statements in the route distribution.");
            listRouteDistributionStatements(drgRouteDistribution);

            System.out.println("List dynamic route rules in the route table.");
            listDynamicDrgRouteRules(routeTable);

        } finally {
            System.out.println("Deleting DRG Attachments.");
            if (drgAttachment1 != null) {
                deleteDrgAttachment(virtualNetworkClient, drgAttachment1.getId());
            }
            if (drgAttachment2 != null) {
                deleteDrgAttachment(virtualNetworkClient, drgAttachment2.getId());
            }

            System.out.println("Deleting VCNs.");
            if (vcn1 != null) {
                deleteVcn(virtualNetworkClient, vcn1);
            }
            if (vcn2 != null) {
                deleteVcn(virtualNetworkClient, vcn2);
            }

            System.out.println("Deleting DRG.");
            if (drg != null) {
                deleteDrg(virtualNetworkClient, authProvider, drg);
            }
        }
    }

    private List<DrgRouteDistributionStatement> listRouteDistributionStatements(
            final DrgRouteDistribution drgRouteDistribution) {
        final ListDrgRouteDistributionStatementsResponse
                listDrgRouteDistributionStatementsResponse =
                        virtualNetworkClient.listDrgRouteDistributionStatements(
                                ListDrgRouteDistributionStatementsRequest.builder()
                                        .drgRouteDistributionId(drgRouteDistribution.getId())
                                        .build());
        final List<DrgRouteDistributionStatement> drgRouteDistributionStatementsResponseItems =
                listDrgRouteDistributionStatementsResponse.getItems();
        for (DrgRouteDistributionStatement drgRouteDistributionStatementsResponseItem :
                drgRouteDistributionStatementsResponseItems) {
            System.out.println(
                    "statement id: " + drgRouteDistributionStatementsResponseItem.getId());
        }
        return drgRouteDistributionStatementsResponseItems;
    }

    private void listDynamicDrgRouteRules(final DrgRouteTable routeTable) {
        final ListDrgRouteRulesResponse listDrgRouteRulesResponse =
                virtualNetworkClient.listDrgRouteRules(
                        ListDrgRouteRulesRequest.builder()
                                .drgRouteTableId(routeTable.getId())
                                .routeType(ListDrgRouteRulesRequest.RouteType.Dynamic)
                                .build());
        final List<DrgRouteRule> drgRouteRules = listDrgRouteRulesResponse.getItems();
        for (DrgRouteRule drgRouteRule : drgRouteRules) {
            System.out.println("id: " + drgRouteRule.getId());
            System.out.println("destination type: " + drgRouteRule.getDestinationType());
            System.out.println("destination: " + drgRouteRule.getDestination());
        }
    }

    private Drg createDrg(
            final VirtualNetworkClient virtualNetwork,
            final AuthenticationDetailsProvider authProvider,
            final Region region)
            throws Exception {
        final CreateDrgRequest request =
                CreateDrgRequest.builder()
                        .createDrgDetails(
                                CreateDrgDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "Drg-%s-%s",
                                                        region.getRegionId(), TIMESTAMP_SUFFIX))
                                        .build())
                        .build();

        final CreateDrgResponse response = virtualNetwork.createDrg(request);
        WorkRequestClient workRequestClient = WorkRequestClient.builder().build(authProvider);
        virtualNetwork
                .newWaiters(workRequestClient)
                .forDrg(
                        GetDrgRequest.builder().drgId(response.getDrg().getId()).build(),
                        Drg.LifecycleState.Available)
                .execute();

        System.out.println("Created DRG: " + response.getDrg().getId());

        return response.getDrg();
    }

    public static void deleteDrg(
            final VirtualNetwork virtualNetwork,
            final AuthenticationDetailsProvider authProvider,
            final Drg drg)
            throws Exception {
        final DeleteDrgRequest request = DeleteDrgRequest.builder().drgId(drg.getId()).build();
        virtualNetwork.deleteDrg(request);

        WorkRequestClient workRequestClient = WorkRequestClient.builder().build(authProvider);
        virtualNetwork
                .newWaiters(workRequestClient)
                .forDrg(
                        GetDrgRequest.builder().drgId(drg.getId()).build(),
                        Drg.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted DRG: " + drg.getId());
    }

    private static Vcn createVcn(
            final VirtualNetwork virtualNetwork,
            final Region region,
            final String cidrBlock,
            final String label)
            throws Exception {
        final CreateVcnRequest request =
                CreateVcnRequest.builder()
                        .createVcnDetails(
                                CreateVcnDetails.builder()
                                        .cidrBlock(cidrBlock)
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "%s-%s-%s",
                                                        region.getRegionId(),
                                                        label,
                                                        TIMESTAMP_SUFFIX))
                                        .dnsLabel(
                                                String.format(
                                                        "dns%s%s", region.getRegionCode(), label))
                                        .build())
                        .build();

        final CreateVcnResponse response = virtualNetwork.createVcn(request);

        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(response.getVcn().getId()).build(),
                        Vcn.LifecycleState.Available)
                .execute();
        return response.getVcn();
    }

    private static DrgAttachment createDrgAttachment(
            final VirtualNetwork virtualNetwork, final Region region, final Vcn vcn, final Drg drg)
            throws Exception {
        final CreateDrgAttachmentRequest request =
                CreateDrgAttachmentRequest.builder()
                        .createDrgAttachmentDetails(
                                CreateDrgAttachmentDetails.builder()
                                        .displayName(
                                                String.format(
                                                        "DrgAttachment-%s-%s",
                                                        region.getRegionId(), TIMESTAMP_SUFFIX))
                                        .drgId(drg.getId())
                                        .vcnId(vcn.getId())
                                        .build())
                        .build();

        final CreateDrgAttachmentResponse response = virtualNetwork.createDrgAttachment(request);

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder()
                                .drgAttachmentId(response.getDrgAttachment().getId())
                                .build(),
                        DrgAttachment.LifecycleState.Attached)
                .execute();
        return response.getDrgAttachment();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    private static void deleteVcn(final VirtualNetworkClient vcnClient, final Vcn vcn)
            throws Exception {

        vcnClient.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());

        vcnClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Vcn");
    }

    public static void deleteDrgAttachment(
            final VirtualNetwork virtualNetwork, final String drgAttachmentId) throws Exception {
        final DeleteDrgAttachmentRequest request =
                DeleteDrgAttachmentRequest.builder().drgAttachmentId(drgAttachmentId).build();
        virtualNetwork.deleteDrgAttachment(request);

        virtualNetwork
                .getWaiters()
                .forDrgAttachment(
                        GetDrgAttachmentRequest.builder().drgAttachmentId(drgAttachmentId).build(),
                        DrgAttachment.LifecycleState.Detached)
                .execute();
    }
}

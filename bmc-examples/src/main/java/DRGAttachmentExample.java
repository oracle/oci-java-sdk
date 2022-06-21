/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AddDrgRouteRuleDetails;
import com.oracle.bmc.core.model.AddDrgRouteRulesDetails;
import com.oracle.bmc.core.model.Cpe;
import com.oracle.bmc.core.model.CreateCpeDetails;
import com.oracle.bmc.core.model.CreateDrgAttachmentDetails;
import com.oracle.bmc.core.model.CreateDrgDetails;
import com.oracle.bmc.core.model.CreateDrgRouteTableDetails;
import com.oracle.bmc.core.model.CreateIPSecConnectionDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Drg;
import com.oracle.bmc.core.model.DrgAttachment;
import com.oracle.bmc.core.model.DrgRouteTable;
import com.oracle.bmc.core.model.IPSecConnection;
import com.oracle.bmc.core.model.UpdateDrgAttachmentDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.AddDrgRouteRulesRequest;
import com.oracle.bmc.core.requests.CreateCpeRequest;
import com.oracle.bmc.core.requests.CreateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.CreateDrgRequest;
import com.oracle.bmc.core.requests.CreateDrgRouteTableRequest;
import com.oracle.bmc.core.requests.CreateIPSecConnectionRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteCpeRequest;
import com.oracle.bmc.core.requests.DeleteDrgAttachmentRequest;
import com.oracle.bmc.core.requests.DeleteDrgRequest;
import com.oracle.bmc.core.requests.DeleteIPSecConnectionRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetDrgAttachmentRequest;
import com.oracle.bmc.core.requests.GetDrgRequest;
import com.oracle.bmc.core.requests.GetIPSecConnectionRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.ListDrgAttachmentsRequest;
import com.oracle.bmc.core.requests.RemoveExportDrgRouteDistributionRequest;
import com.oracle.bmc.core.requests.UpdateDrgAttachmentRequest;
import com.oracle.bmc.core.requests.GetDrgRouteTableRequest;
import com.oracle.bmc.core.responses.CreateCpeResponse;
import com.oracle.bmc.core.responses.CreateDrgAttachmentResponse;
import com.oracle.bmc.core.responses.CreateDrgResponse;
import com.oracle.bmc.core.responses.CreateDrgRouteTableResponse;
import com.oracle.bmc.core.responses.CreateIPSecConnectionResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetIPSecConnectionResponse;
import com.oracle.bmc.core.responses.ListDrgAttachmentsResponse;
import com.oracle.bmc.workrequests.WorkRequestClient;
import com.oracle.bmc.util.internal.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Sample to demonstrate how to attach two Virtual Cloud Networks (VCN) to a single Dynamic Routing Gateway (DRG) to provide
 * inter-VCN network connectivity, and remove and add back export route distribution to a DRG Attachment
 * <p>
 *
 *  Details information on DRG: https://docs.oracle.com/en-us/iaas/Content/Network/Tasks/managingDRGs.htm
 *
 *  Details DrgAttachment API: https://docs.oracle.com/en-us/iaas/api/#/en/iaas/20160918/DrgAttachment
 */
public class DRGAttachmentExample {
    private static final String TIMESTAMP_SUFFIX =
            String.valueOf(System.currentTimeMillis() % TimeUnit.SECONDS.toMillis(10L));

    private final VirtualNetworkClient virtualNetworkClient;
    private final Region region;
    private static String COMPARTMENT_ID;
    private static String VCN_CIDR_1;
    private static String VCN_CIDR_2;

    public DRGAttachmentExample(VirtualNetworkClient virtualNetworkClient, Region region) {
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

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient phxVirtualNetworkClient = new VirtualNetworkClient(authProvider);
        phxVirtualNetworkClient.setRegion(Region.US_PHOENIX_1);
        final DRGAttachmentExample example =
                new DRGAttachmentExample(phxVirtualNetworkClient, Region.US_PHOENIX_1);

        example.run(authProvider);
    }

    public void run(final AuthenticationDetailsProvider authProvider) throws Exception {
        System.out.println("DRG Attachment example.");
        Drg drg = null;
        IPSecConnection ipsec = null;
        Cpe cpe = null;
        Vcn vcn1 = null;
        Vcn vcn2 = null;
        DrgAttachment drgAttachment1 = null;
        DrgAttachment drgAttachment2 = null;
        DrgAttachment ipsecDrgAttachment = null;
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

            System.out.println("Create a new route table.");
            final CreateDrgRouteTableResponse drgRouteTable =
                    virtualNetworkClient.createDrgRouteTable(
                            CreateDrgRouteTableRequest.builder()
                                    .createDrgRouteTableDetails(
                                            CreateDrgRouteTableDetails.builder()
                                                    .drgId(drg.getId())
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

            System.out.println("Add a static route rule pointing to attachment 2.");
            final AddDrgRouteRuleDetails addDrgRouteRuleDetails =
                    AddDrgRouteRuleDetails.builder()
                            .nextHopDrgAttachmentId(drgAttachment2.getId())
                            .destinationType(AddDrgRouteRuleDetails.DestinationType.CidrBlock)
                            .destination("192.168.250.0/24")
                            .build();
            List<AddDrgRouteRuleDetails> routeRuleDetailsList = new ArrayList<>();
            routeRuleDetailsList.add(addDrgRouteRuleDetails);
            final AddDrgRouteRulesDetails addDrgRouteRulesDetails =
                    AddDrgRouteRulesDetails.builder().routeRules(routeRuleDetailsList).build();
            virtualNetworkClient.addDrgRouteRules(
                    AddDrgRouteRulesRequest.builder()
                            .drgRouteTableId(routeTable.getId())
                            .addDrgRouteRulesDetails(addDrgRouteRulesDetails)
                            .build());

            System.out.println("Create Cpe.");
            cpe = createCpe(virtualNetworkClient, region);

            System.out.println("Create IpSec connection.");
            ipsec = createIPSecConnection(virtualNetworkClient, COMPARTMENT_ID, cpe, drg);

            System.out.println("Get the attachment for Ipsec tunnel.");
            final ListDrgAttachmentsResponse drgAttachments =
                    virtualNetworkClient.listDrgAttachments(
                            ListDrgAttachmentsRequest.builder()
                                    .compartmentId(COMPARTMENT_ID)
                                    .drgId(drg.getId())
                                    .attachmentType(
                                            ListDrgAttachmentsRequest.AttachmentType.IpsecTunnel)
                                    .build());

            final List<DrgAttachment> attachmentList = drgAttachments.getItems();

            System.out.println("Remove export route distribution.");
            ipsecDrgAttachment = attachmentList.get(0);
            final String exportDrgRouteDistributionId =
                    ipsecDrgAttachment.getExportDrgRouteDistributionId();
            virtualNetworkClient.removeExportDrgRouteDistribution(
                    RemoveExportDrgRouteDistributionRequest.builder()
                            .drgAttachmentId(ipsecDrgAttachment.getId())
                            .build());

            System.out.println("Add the export route distribution back.");
            virtualNetworkClient.updateDrgAttachment(
                    UpdateDrgAttachmentRequest.builder()
                            .drgAttachmentId(ipsecDrgAttachment.getId())
                            .updateDrgAttachmentDetails(
                                    UpdateDrgAttachmentDetails.builder()
                                            .exportDrgRouteDistributionId(
                                                    exportDrgRouteDistributionId)
                                            .build())
                            .build());

        } finally {
            System.out.println("Deleting IPSecConnection.");
            if (ipsec != null) {
                deleteIPSecConnection(virtualNetworkClient, ipsec.getId());
            }

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

            System.out.println("Deleting Cpe.");
            if (cpe != null) {
                deleteCpe(virtualNetworkClient, cpe);
            }
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
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
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
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
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

    /*
     * Use CREATE to create a IPSec connection and activate connection
     */
    private static IPSecConnection createIPSecConnection(
            final VirtualNetwork virtualNetwork,
            final String compartmentId,
            final Cpe cpe,
            final Drg drg)
            throws Exception {
        List<String> items = new ArrayList<>();
        items.add("192.168.1.0/24");

        final CreateIPSecConnectionRequest request =
                CreateIPSecConnectionRequest.builder()
                        .createIPSecConnectionDetails(
                                CreateIPSecConnectionDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName(String.format("IPSec-%s", TIMESTAMP_SUFFIX))
                                        .cpeId(cpe.getId())
                                        .drgId(drg.getId())
                                        .staticRoutes(items)
                                        .build())
                        .build();

        final CreateIPSecConnectionResponse response =
                virtualNetwork.createIPSecConnection(request);

        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder()
                                .ipscId(response.getIPSecConnection().getId())
                                .build(),
                        IPSecConnection.LifecycleState.Available)
                .execute();
        return response.getIPSecConnection();
    }

    public static Cpe createCpe(final VirtualNetwork virtualNetwork, final Region region) {
        final CreateCpeRequest request =
                CreateCpeRequest.builder()
                        .createCpeDetails(
                                CreateCpeDetails.builder()
                                        .compartmentId(COMPARTMENT_ID)
                                        .displayName(
                                                String.format(
                                                        "Drg-%s-%s",
                                                        region.getRegionId(),
                                                        TIMESTAMP_SUFFIX))
                                        .ipAddress("192.168.0.2")
                                        .build())
                        .build();

        final CreateCpeResponse response = virtualNetwork.createCpe(request);

        System.out.println("Created Cpe: " + response.getCpe().getId());

        return response.getCpe();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     *
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

    /*
     * Use DELETE to delete the IPSec connection
     */
    private static void deleteIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ipsecId) throws Exception {
        // if resource is in provisioning state, wait until provisioned
        IPSecConnection ipsec = getIPSecConnection(virtualNetwork, ipsecId);
        if (ipsec.getLifecycleState() != IPSecConnection.LifecycleState.Available
                && ipsec.getLifecycleState() != IPSecConnection.LifecycleState.Provisioning) {
            throw new IllegalStateException(
                    "Failed to start deleting IPSecConnection due to IPSecConnection in invalid state.");
        }

        virtualNetwork.deleteIPSecConnection(
                DeleteIPSecConnectionRequest.builder().ipscId(ipsecId).build());
        virtualNetwork
                .getWaiters()
                .forIPSecConnection(
                        GetIPSecConnectionRequest.builder().ipscId(ipsecId).build(),
                        IPSecConnection.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted IPSecConnection: " + ipsec.getId());
    }

    /*
     * Use GET to get the IPSec connection
     */
    private static IPSecConnection getIPSecConnection(
            final VirtualNetwork virtualNetwork, final String ipsecId) {

        final GetIPSecConnectionRequest request =
                GetIPSecConnectionRequest.builder().ipscId(ipsecId).build();
        final GetIPSecConnectionResponse response = virtualNetwork.getIPSecConnection(request);

        return response.getIPSecConnection();
    }

    /*
     * Use DELETE to delete the CPE
     */
    public static void deleteCpe(final VirtualNetwork virtualNetwork, final Cpe cpe)
            throws Exception {
        final DeleteCpeRequest request = DeleteCpeRequest.builder().cpeId(cpe.getId()).build();
        virtualNetwork.deleteCpe(request);

        System.out.println("Deleted Cpe: " + cpe.getId());
    }
}

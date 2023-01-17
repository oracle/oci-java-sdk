/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.core.VirtualNetwork;
import com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails;
import com.oracle.bmc.core.model.CreateNetworkSecurityGroupDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.EgressSecurityRule;
import com.oracle.bmc.core.model.IngressSecurityRule;
import com.oracle.bmc.core.model.PortRange;
import com.oracle.bmc.core.model.SecurityList;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.TcpOptions;
import com.oracle.bmc.core.model.UdpOptions;
import com.oracle.bmc.core.model.UpdateSecurityListDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.AddNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.CreateNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetSecurityListRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.UpdateSecurityListRequest;
import com.oracle.bmc.core.responses.CreateNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetSecurityListResponse;
import com.oracle.bmc.core.responses.UpdateSecurityListResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DatabaseExampleHelper {

    private static Random rand = new Random();

    /**
     *  Protocol Numbers:
     *  @link https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml
     */
    public enum NetworkProtocol {
        Icmp(1),
        Tcp(6),
        Udp(17);

        private final Integer protocolNumber;

        public Integer getProtocolNumber() {
            return protocolNumber;
        }

        NetworkProtocol(Integer protocol) {
            this.protocolNumber = protocol;
        }
    }

    public static Vcn createVcn(
            VirtualNetwork virtualNetwork, String compartmentId, String cidrBlock)
            throws Exception {
        final String vcnName = "JavaSDK.DB.VCN." + System.currentTimeMillis();
        CreateVcnResponse response =
                virtualNetwork.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(cidrBlock)
                                                .compartmentId(compartmentId)
                                                .displayName(vcnName)
                                                .dnsLabel("javasdkex" + rand.nextInt(999))
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(response.getVcn().getId()).build(),
                        Vcn.LifecycleState.Available)
                .execute();
        Vcn vcn = response.getVcn();
        System.out.println("Created VCN: " + vcn.getId());

        EgressSecurityRule egressRule =
                EgressSecurityRule.builder().destination("0.0.0.0/0").protocol("all").build();
        IngressSecurityRule ingressRule =
                IngressSecurityRule.builder().source(cidrBlock).protocol("all").build();

        GetSecurityListRequest getSecurityListRequest =
                GetSecurityListRequest.builder()
                        .securityListId(vcn.getDefaultSecurityListId())
                        .build();
        GetSecurityListResponse getSecurityListResponse =
                virtualNetwork.getSecurityList(getSecurityListRequest);

        SecurityList securityList = getSecurityListResponse.getSecurityList();

        securityList.getEgressSecurityRules().add(egressRule);
        securityList.getIngressSecurityRules().add(ingressRule);

        UpdateSecurityListDetails updateSecurityListDetails =
                UpdateSecurityListDetails.builder()
                        .egressSecurityRules(securityList.getEgressSecurityRules())
                        .ingressSecurityRules(securityList.getIngressSecurityRules())
                        .build();

        UpdateSecurityListRequest updateSecurityListRequest =
                UpdateSecurityListRequest.builder()
                        .securityListId(securityList.getId())
                        .updateSecurityListDetails(updateSecurityListDetails)
                        .build();

        UpdateSecurityListResponse updateSecurityListResponse =
                virtualNetwork.updateSecurityList(updateSecurityListRequest);

        virtualNetwork
                .getWaiters()
                .forSecurityList(
                        GetSecurityListRequest.builder()
                                .securityListId(securityList.getId())
                                .build(),
                        SecurityList.LifecycleState.Available)
                .execute();

        return vcn;
    }

    public static void deleteVcn(VirtualNetwork virtualNetwork, Vcn vcn) throws Exception {
        virtualNetwork.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());
        virtualNetwork
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted VCN: " + vcn.getId());
    }

    public static Subnet createSubnet(
            VirtualNetwork virtualNetwork, Vcn vcn, String availabilityDomain, String cidrBlock)
            throws Exception {

        final String subnetName = "SubnetFor." + vcn.getDisplayName() + "." + rand.nextInt(999);
        CreateSubnetResponse response =
                virtualNetwork.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .compartmentId(vcn.getCompartmentId())
                                                .availabilityDomain(availabilityDomain)
                                                .displayName(subnetName)
                                                .vcnId(vcn.getId())
                                                .cidrBlock(cidrBlock)
                                                .dnsLabel("javasdksubex" + rand.nextInt(999))
                                                .build())
                                .build());

        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(response.getSubnet().getId()).build(),
                        Subnet.LifecycleState.Available)
                .execute();
        System.out.println("Created Subnet: " + response.getSubnet().getId());
        return response.getSubnet();
    }

    public static void deleteSubnet(VirtualNetwork virtualNetwork, Subnet subnet) throws Exception {
        virtualNetwork.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());
        virtualNetwork
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Subnet: " + subnet.getId());
    }

    public static List<String> createNSGs(
            VirtualNetwork virtualNetwork, String vcnId, String compartmentId) throws Exception {

        try {

            CreateNetworkSecurityGroupDetails createNetworkSecurityGroupDetails =
                    CreateNetworkSecurityGroupDetails.builder()
                            .vcnId(vcnId)
                            .compartmentId(compartmentId)
                            .build();

            CreateNetworkSecurityGroupRequest createNetworkSecurityGroupRequest =
                    CreateNetworkSecurityGroupRequest.builder()
                            .createNetworkSecurityGroupDetails(createNetworkSecurityGroupDetails)
                            .build();

            CreateNetworkSecurityGroupResponse response =
                    virtualNetwork.createNetworkSecurityGroup(createNetworkSecurityGroupRequest);

            AddSecurityRuleDetails allowAllIngressIcmpTraffic =
                    AddSecurityRuleDetails.builder()
                            .description("Security Rule to allow all ICMP Ingress Traffic")
                            .direction(AddSecurityRuleDetails.Direction.Ingress)
                            .isStateless(false)
                            .source("0.0.0.0/0")
                            .protocol(NetworkProtocol.Icmp.getProtocolNumber().toString())
                            .sourceType(AddSecurityRuleDetails.SourceType.CidrBlock)
                            .build();

            AddSecurityRuleDetails allowAllIngressTcpTraffic =
                    AddSecurityRuleDetails.builder()
                            .description("Security Rule to allow all TCP Ingress Traffic")
                            .direction(AddSecurityRuleDetails.Direction.Ingress)
                            .isStateless(false)
                            .source("0.0.0.0/0")
                            .protocol(NetworkProtocol.Tcp.getProtocolNumber().toString())
                            .sourceType(AddSecurityRuleDetails.SourceType.CidrBlock)
                            .tcpOptions(
                                    TcpOptions.builder()
                                            .destinationPortRange(
                                                    PortRange.builder().min(22).max(22).build())
                                            .sourcePortRange(null)
                                            .build())
                            .build();

            AddSecurityRuleDetails allowAllIngressUdpTraffic =
                    AddSecurityRuleDetails.builder()
                            .description("Security Rule to allow all UDP Ingress Traffic")
                            .direction(AddSecurityRuleDetails.Direction.Ingress)
                            .isStateless(false)
                            .source("0.0.0.0/0")
                            .protocol(NetworkProtocol.Udp.getProtocolNumber().toString())
                            .sourceType(AddSecurityRuleDetails.SourceType.CidrBlock)
                            .udpOptions(
                                    UdpOptions.builder()
                                            .destinationPortRange(
                                                    PortRange.builder().min(53).max(53).build())
                                            .sourcePortRange(
                                                    PortRange.builder().min(1).max(65535).build())
                                            .build())
                            .build();

            AddSecurityRuleDetails allowAllEgressTcpTraffic =
                    AddSecurityRuleDetails.builder()
                            .description("Security Rule to allow all TCP Egress Traffic")
                            .direction(AddSecurityRuleDetails.Direction.Egress)
                            .isStateless(false)
                            .destination("0.0.0.0/0")
                            .protocol(NetworkProtocol.Tcp.getProtocolNumber().toString())
                            .sourceType(AddSecurityRuleDetails.SourceType.CidrBlock)
                            .tcpOptions(
                                    TcpOptions.builder()
                                            .destinationPortRange(
                                                    PortRange.builder().min(1).max(65535).build())
                                            .sourcePortRange(null)
                                            .build())
                            .build();

            List<AddSecurityRuleDetails> addSecurityRuleDetailsList = new ArrayList<>();
            addSecurityRuleDetailsList.add(allowAllIngressIcmpTraffic);
            addSecurityRuleDetailsList.add(allowAllIngressTcpTraffic);
            addSecurityRuleDetailsList.add(allowAllIngressUdpTraffic);
            addSecurityRuleDetailsList.add(allowAllEgressTcpTraffic);

            AddNetworkSecurityGroupSecurityRulesDetails
                    addNetworkSecurityGroupSecurityRulesDetails =
                            AddNetworkSecurityGroupSecurityRulesDetails.builder()
                                    .securityRules(addSecurityRuleDetailsList)
                                    .build();

            AddNetworkSecurityGroupSecurityRulesRequest
                    addNetworkSecurityGroupSecurityRulesRequest =
                            AddNetworkSecurityGroupSecurityRulesRequest.builder()
                                    .networkSecurityGroupId(
                                            response.getNetworkSecurityGroup().getId())
                                    .addNetworkSecurityGroupSecurityRulesDetails(
                                            addNetworkSecurityGroupSecurityRulesDetails)
                                    .build();

            virtualNetwork.addNetworkSecurityGroupSecurityRules(
                    addNetworkSecurityGroupSecurityRulesRequest);
            return Arrays.asList(response.getNetworkSecurityGroup().getId());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }

        return new ArrayList<>();
    }
}

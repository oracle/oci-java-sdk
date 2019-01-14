/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.Collections;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateDhcpDetails;
import com.oracle.bmc.core.model.CreateRouteTableDetails;
import com.oracle.bmc.core.model.CreateSecurityListDetails;
import com.oracle.bmc.core.model.DhcpOptions;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.SecurityList;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.UpdateSubnetDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateDhcpOptionsRequest;
import com.oracle.bmc.core.requests.CreateRouteTableRequest;
import com.oracle.bmc.core.requests.CreateSecurityListRequest;
import com.oracle.bmc.core.requests.GetDhcpOptionsRequest;
import com.oracle.bmc.core.requests.GetRouteTableRequest;
import com.oracle.bmc.core.requests.GetSecurityListRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.UpdateSubnetRequest;
import com.oracle.bmc.core.responses.CreateDhcpOptionsResponse;
import com.oracle.bmc.core.responses.CreateRouteTableResponse;
import com.oracle.bmc.core.responses.CreateSecurityListResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.UpdateSubnetResponse;

public class CopySubnetResourcesFromVcnExample {
    /**
     * If the provided subnet inherited its containing VCN's default route table, DHCP options, and security list,
     * then this example will copy those objects and attach the subnet to the newly created versions. This allows you
     * to modify them freely without affecting your other subnets.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO: Fill in these values
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";
        String subnetId = "ocid1.subnet.FILL THIS IN";
        Region region = Region.US_PHOENIX_1;

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        try (VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider)) {
            vcnClient.setRegion(region);

            Subnet subnet = getSubnet(vcnClient, subnetId);
            Vcn vcn = getVcn(vcnClient, subnet.getVcnId());

            UpdateSubnetDetails.Builder details = UpdateSubnetDetails.builder();
            boolean needToUpdate = false;
            if (subnet.getRouteTableId().equals(vcn.getDefaultRouteTableId())) {
                System.out.println("Copying subnet's route table");
                RouteTable newRouteTable = copyRouteTable(vcnClient, vcn.getDefaultRouteTableId());
                details.routeTableId(newRouteTable.getId());
                needToUpdate = true;
            }
            if (subnet.getDhcpOptionsId().equals(vcn.getDefaultDhcpOptionsId())) {
                System.out.println("Copying subnet's DHCP options");
                DhcpOptions newDhcpOptions =
                        copyDhcpOptions(vcnClient, vcn.getDefaultDhcpOptionsId());
                details.dhcpOptionsId(newDhcpOptions.getId());
                needToUpdate = true;
            }
            if (subnet.getSecurityListIds()
                    .equals(Collections.singletonList(vcn.getDefaultSecurityListId()))) {
                System.out.println("Copying subnet's security list");
                SecurityList newSecurityList =
                        copySecurityList(vcnClient, vcn.getDefaultSecurityListId());
                details.securityListIds(Collections.singletonList(newSecurityList.getId()));
                needToUpdate = true;
            }

            if (needToUpdate) {
                System.out.println("Updating subnet");
                subnet = updateSubnet(vcnClient, subnetId, details.build());
                System.out.println("Subnet update done!");
            } else {
                System.out.println("Not updating subnet; none of its settings are non-default");
            }
        }
    }

    public static Vcn getVcn(VirtualNetworkClient vcnClient, String vcnId) {
        GetVcnResponse response = vcnClient.getVcn(GetVcnRequest.builder().vcnId(vcnId).build());
        return response.getVcn();
    }

    public static Subnet getSubnet(VirtualNetworkClient vcnClient, String subnetId) {
        GetSubnetResponse response =
                vcnClient.getSubnet(GetSubnetRequest.builder().subnetId(subnetId).build());
        return response.getSubnet();
    }

    public static Subnet updateSubnet(
            VirtualNetworkClient vcnClient, String subnetId, UpdateSubnetDetails details) {
        UpdateSubnetResponse response =
                vcnClient.updateSubnet(
                        UpdateSubnetRequest.builder()
                                .subnetId(subnetId)
                                .updateSubnetDetails(details)
                                .build());

        return response.getSubnet();
    }

    public static RouteTable copyRouteTable(VirtualNetworkClient vcnClient, String routeTableId) {
        RouteTable oldRouteTable =
                vcnClient
                        .getRouteTable(GetRouteTableRequest.builder().rtId(routeTableId).build())
                        .getRouteTable();

        // Note that this does not include all route table parameters, only the required ones.
        CreateRouteTableResponse response =
                vcnClient.createRouteTable(
                        CreateRouteTableRequest.builder()
                                .createRouteTableDetails(
                                        CreateRouteTableDetails.builder()
                                                .compartmentId(oldRouteTable.getCompartmentId())
                                                .vcnId(oldRouteTable.getVcnId())
                                                .routeRules(oldRouteTable.getRouteRules())
                                                .build())
                                .build());
        return response.getRouteTable();
    }

    public static DhcpOptions copyDhcpOptions(
            VirtualNetworkClient vcnClient, String dhcpOptionsId) {
        DhcpOptions oldDhcpOptions =
                vcnClient
                        .getDhcpOptions(
                                GetDhcpOptionsRequest.builder().dhcpId(dhcpOptionsId).build())
                        .getDhcpOptions();

        // Note that this does not include all DHCP options parameters, only the required ones.
        CreateDhcpOptionsResponse response =
                vcnClient.createDhcpOptions(
                        CreateDhcpOptionsRequest.builder()
                                .createDhcpDetails(
                                        CreateDhcpDetails.builder()
                                                .compartmentId(oldDhcpOptions.getCompartmentId())
                                                .vcnId(oldDhcpOptions.getVcnId())
                                                .options(oldDhcpOptions.getOptions())
                                                .build())
                                .build());
        return response.getDhcpOptions();
    }

    public static SecurityList copySecurityList(
            VirtualNetworkClient vcnClient, String securityListId) {
        SecurityList oldSecurityList =
                vcnClient
                        .getSecurityList(
                                GetSecurityListRequest.builder()
                                        .securityListId(securityListId)
                                        .build())
                        .getSecurityList();

        // Note that this does not include all security list parameters, only the required ones.
        CreateSecurityListResponse response =
                vcnClient.createSecurityList(
                        CreateSecurityListRequest.builder()
                                .createSecurityListDetails(
                                        CreateSecurityListDetails.builder()
                                                .compartmentId(oldSecurityList.getCompartmentId())
                                                .vcnId(oldSecurityList.getVcnId())
                                                .ingressSecurityRules(
                                                        oldSecurityList.getIngressSecurityRules())
                                                .egressSecurityRules(
                                                        oldSecurityList.getEgressSecurityRules())
                                                .build())
                                .build());
        return response.getSecurityList();
    }
}

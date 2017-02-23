/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateSubnetDetails.Builder.class)
public class CreateSubnetDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("cidrBlock")
        private String cidrBlock;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("routeTableId")
        private String routeTableId;

        @JsonProperty("securityListIds")
        private List<String> securityListIds;

        @JsonProperty("vcnId")
        private String vcnId;

        public CreateSubnetDetails build() {
            return new CreateSubnetDetails(
                    availabilityDomain,
                    cidrBlock,
                    compartmentId,
                    dhcpOptionsId,
                    displayName,
                    routeTableId,
                    securityListIds,
                    vcnId);
        }

        @JsonIgnore
        public Builder copy(CreateSubnetDetails o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .dhcpOptionsId(o.getDhcpOptionsId())
                    .displayName(o.getDisplayName())
                    .routeTableId(o.getRouteTableId())
                    .securityListIds(o.getSecurityListIds())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain to contain the subnet.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The CIDR IP address range of the subnet.
     * <p>
     * Example: `172.16.1.0/24`
     *
     **/
    @JsonProperty("cidrBlock")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment to contain the subnet.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the set of DHCP options the subnet will use. If you don't
     * provide a value, the subnet will use the VCN's default set of DHCP options.
     *
     **/
    @JsonProperty("dhcpOptionsId")
    @Size(min = 1, max = 255)
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the route table the subnet will use. If you don't provide a value,
     * the subnet will use the VCN's default route table.
     *
     **/
    @JsonProperty("routeTableId")
    @Size(min = 1, max = 255)
    String routeTableId;

    /**
     * OCIDs for the security lists to associate with the subnet. If you don't
     * provide a value, the VCN's default security list will be associated with
     * the subnet. Remember that security lists are associated at the subnet
     * level, but the rules are applied to the individual VNICs in the subnet.
     *
     **/
    @JsonProperty("securityListIds")
    List<String> securityListIds;

    /**
     * The OCID of the VCN to contain the subnet.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}

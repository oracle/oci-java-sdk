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

/**
 * A virtual network interface card. Each instance automatically has a VNIC attached to it,
 * and the VNIC connects the instance to the subnet. For more information, see
 * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Vnic.Builder.class)
public class Vnic {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("privateIp")
        private String privateIp;

        @JsonProperty("publicIp")
        private String publicIp;

        @JsonProperty("subnetId")
        private String subnetId;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public Vnic build() {
            return new Vnic(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    id,
                    lifecycleState,
                    privateIp,
                    publicIp,
                    subnetId,
                    timeCreated);
        }

        @JsonIgnore
        public Builder copy(Vnic o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .privateIp(o.getPrivateIp())
                    .publicIp(o.getPublicIp())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The VNIC's Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @JsonProperty("availabilityDomain")
    @Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The OCID of the compartment containing the VNIC.
     **/
    @JsonProperty("compartmentId")
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The VNIC's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Size(min = 1, max = 255)
    String id;
    /**
     * The current state of the VNIC.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The current state of the VNIC.
     **/
    @JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The private IP addresses of the VNIC, which is within the VNIC subnet
     * and is accessible within the VCN.
     *
     **/
    @JsonProperty("privateIp")
    String privateIp;

    /**
     * The public IP address of the VNIC, which Oracle performs NAT for at the gateway.
     *
     **/
    @JsonProperty("publicIp")
    String publicIp;

    /**
     * The OCID of the subnet the VNIC is in.
     **/
    @JsonProperty("subnetId")
    @Size(min = 1, max = 255)
    String subnetId;

    /**
     * The date and time the VNIC was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
}

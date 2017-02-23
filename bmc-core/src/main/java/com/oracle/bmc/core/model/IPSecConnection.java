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
 * A connection between a DRG and CPE. This connection consists of multiple IPSec
 * tunnels. Creating this connection is one of the steps required when setting up
 * a VPN. For more information, see
 * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = IPSecConnection.Builder.class)
public class IPSecConnection {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("cpeId")
        private String cpeId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("drgId")
        private String drgId;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("staticRoutes")
        private List<String> staticRoutes;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public IPSecConnection build() {
            return new IPSecConnection(
                    compartmentId,
                    cpeId,
                    displayName,
                    drgId,
                    id,
                    lifecycleState,
                    staticRoutes,
                    timeCreated);
        }

        @JsonIgnore
        public Builder copy(IPSecConnection o) {
            return compartmentId(o.getCompartmentId())
                    .cpeId(o.getCpeId())
                    .displayName(o.getDisplayName())
                    .drgId(o.getDrgId())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .staticRoutes(o.getStaticRoutes())
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
     * The OCID of the compartment containing the IPSec connection.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the CPE.
     **/
    @JsonProperty("cpeId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String cpeId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the DRG.
     **/
    @JsonProperty("drgId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String drgId;

    /**
     * The IPSec connection's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;
    /**
     * The IPSec connection's current state.
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
     * The IPSec connection's current state.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * Static routes to the CPE. At least one route must be included. The CIDR must not be a
     * multicast address or class E address.
     * <p>
     * Example: `10.0.1.0/24`
     *
     **/
    @JsonProperty("staticRoutes")
    @Valid
    @NotNull
    List<String> staticRoutes;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
}

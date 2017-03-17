/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
 * A set of virtual firewall rules for your VCN. Security lists are configured at the subnet
 * level, but the rules are applied to the ingress and egress traffic for the individual instances
 * in the subnet. The rules can be stateful or stateless. For more information, see
 * [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
 * <p>
 **Important:** Oracle Bare Metal Cloud Services images that run Oracle Linux automatically include iptables rules.
 * If there are issues with some type of access to an instance, make sure both the security lists associated
 * with the instance's subnet and the instance's iptables rules are set correctly.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = SecurityList.Builder.class)
public class SecurityList {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("egressSecurityRules")
        private List<EgressSecurityRule> egressSecurityRules;

        @JsonProperty("id")
        private String id;

        @JsonProperty("ingressSecurityRules")
        private List<IngressSecurityRule> ingressSecurityRules;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("vcnId")
        private String vcnId;

        public SecurityList build() {
            return new SecurityList(
                    compartmentId,
                    displayName,
                    egressSecurityRules,
                    id,
                    ingressSecurityRules,
                    lifecycleState,
                    timeCreated,
                    vcnId);
        }

        @JsonIgnore
        public Builder copy(SecurityList o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .egressSecurityRules(o.getEgressSecurityRules())
                    .id(o.getId())
                    .ingressSecurityRules(o.getIngressSecurityRules())
                    .lifecycleState(o.getLifecycleState())
                    .timeCreated(o.getTimeCreated())
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
     * The OCID of the compartment containing the security list.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @JsonProperty("egressSecurityRules")
    @Valid
    @NotNull
    List<EgressSecurityRule> egressSecurityRules;

    /**
     * The security list's Oracle Cloud ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @JsonProperty("ingressSecurityRules")
    @Valid
    @NotNull
    List<IngressSecurityRule> ingressSecurityRules;
    /**
     * The security list's current state.
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
     * The security list's current state.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the security list was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;

    /**
     * The OCID of the VCN the security list belongs to.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}

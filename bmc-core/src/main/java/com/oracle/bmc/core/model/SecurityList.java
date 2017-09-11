/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A set of virtual firewall rules for your VCN. Security lists are configured at the subnet
 * level, but the rules are applied to the ingress and egress traffic for the individual instances
 * in the subnet. The rules can be stateful or stateless. For more information, see
 * [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
 * <p>
 **Important:** Oracle Bare Metal Cloud Services images automatically include firewall rules (for example,
 * Linux iptables, Windows firewall). If there are issues with some type of access to an instance,
 * make sure both the security lists associated with the instance's subnet and the instance's
 * firewall rules are set correctly.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecurityList.Builder.class)
public class SecurityList {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
        private java.util.List<EgressSecurityRule> egressSecurityRules;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
        private java.util.List<IngressSecurityRule> ingressSecurityRules;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
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

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<EgressSecurityRule> egressSecurityRules;

    /**
     * The security list's Oracle Cloud ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String id;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<IngressSecurityRule> ingressSecurityRules;
    /**
     * The security list's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The security list's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the security list was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;

    /**
     * The OCID of the VCN the security list belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;
}

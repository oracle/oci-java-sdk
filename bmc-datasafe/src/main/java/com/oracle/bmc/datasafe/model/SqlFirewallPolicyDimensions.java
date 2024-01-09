/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The dimensions available for SQL Firewall policy analytics. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlFirewallPolicyDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlFirewallPolicyDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "securityPolicyId",
        "enforcementScope",
        "violationAction",
        "lifecycleState"
    })
    public SqlFirewallPolicyDimensions(
            String securityPolicyId,
            EnforcementScope enforcementScope,
            ViolationAction violationAction,
            SqlFirewallPolicyLifecycleState lifecycleState) {
        super();
        this.securityPolicyId = securityPolicyId;
        this.enforcementScope = enforcementScope;
        this.violationAction = violationAction;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the security policy corresponding to the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
        private String securityPolicyId;

        /**
         * The OCID of the security policy corresponding to the SQL Firewall policy.
         *
         * @param securityPolicyId the value to set
         * @return this builder
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            this.__explicitlySet__.add("securityPolicyId");
            return this;
        }
        /** Specifies the SQL Firewall policy enforcement option. */
        @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
        private EnforcementScope enforcementScope;

        /**
         * Specifies the SQL Firewall policy enforcement option.
         *
         * @param enforcementScope the value to set
         * @return this builder
         */
        public Builder enforcementScope(EnforcementScope enforcementScope) {
            this.enforcementScope = enforcementScope;
            this.__explicitlySet__.add("enforcementScope");
            return this;
        }
        /** Specifies the mode in which the SQL Firewall policy is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
        private ViolationAction violationAction;

        /**
         * Specifies the mode in which the SQL Firewall policy is enabled.
         *
         * @param violationAction the value to set
         * @return this builder
         */
        public Builder violationAction(ViolationAction violationAction) {
            this.violationAction = violationAction;
            this.__explicitlySet__.add("violationAction");
            return this;
        }
        /** The current state of the SQL Firewall policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SqlFirewallPolicyLifecycleState lifecycleState;

        /**
         * The current state of the SQL Firewall policy.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SqlFirewallPolicyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlFirewallPolicyDimensions build() {
            SqlFirewallPolicyDimensions model =
                    new SqlFirewallPolicyDimensions(
                            this.securityPolicyId,
                            this.enforcementScope,
                            this.violationAction,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlFirewallPolicyDimensions model) {
            if (model.wasPropertyExplicitlySet("securityPolicyId")) {
                this.securityPolicyId(model.getSecurityPolicyId());
            }
            if (model.wasPropertyExplicitlySet("enforcementScope")) {
                this.enforcementScope(model.getEnforcementScope());
            }
            if (model.wasPropertyExplicitlySet("violationAction")) {
                this.violationAction(model.getViolationAction());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the security policy corresponding to the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyId")
    private final String securityPolicyId;

    /**
     * The OCID of the security policy corresponding to the SQL Firewall policy.
     *
     * @return the value
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    /** Specifies the SQL Firewall policy enforcement option. */
    public enum EnforcementScope implements com.oracle.bmc.http.internal.BmcEnum {
        EnforceContext("ENFORCE_CONTEXT"),
        EnforceSql("ENFORCE_SQL"),
        EnforceAll("ENFORCE_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnforcementScope.class);

        private final String value;
        private static java.util.Map<String, EnforcementScope> map;

        static {
            map = new java.util.HashMap<>();
            for (EnforcementScope v : EnforcementScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnforcementScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnforcementScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnforcementScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the SQL Firewall policy enforcement option. */
    @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
    private final EnforcementScope enforcementScope;

    /**
     * Specifies the SQL Firewall policy enforcement option.
     *
     * @return the value
     */
    public EnforcementScope getEnforcementScope() {
        return enforcementScope;
    }

    /** Specifies the mode in which the SQL Firewall policy is enabled. */
    public enum ViolationAction implements com.oracle.bmc.http.internal.BmcEnum {
        Block("BLOCK"),
        Observe("OBSERVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ViolationAction.class);

        private final String value;
        private static java.util.Map<String, ViolationAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAction v : ViolationAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ViolationAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ViolationAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the mode in which the SQL Firewall policy is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
    private final ViolationAction violationAction;

    /**
     * Specifies the mode in which the SQL Firewall policy is enabled.
     *
     * @return the value
     */
    public ViolationAction getViolationAction() {
        return violationAction;
    }

    /** The current state of the SQL Firewall policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SqlFirewallPolicyLifecycleState lifecycleState;

    /**
     * The current state of the SQL Firewall policy.
     *
     * @return the value
     */
    public SqlFirewallPolicyLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlFirewallPolicyDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("securityPolicyId=").append(String.valueOf(this.securityPolicyId));
        sb.append(", enforcementScope=").append(String.valueOf(this.enforcementScope));
        sb.append(", violationAction=").append(String.valueOf(this.violationAction));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlFirewallPolicyDimensions)) {
            return false;
        }

        SqlFirewallPolicyDimensions other = (SqlFirewallPolicyDimensions) o;
        return java.util.Objects.equals(this.securityPolicyId, other.securityPolicyId)
                && java.util.Objects.equals(this.enforcementScope, other.enforcementScope)
                && java.util.Objects.equals(this.violationAction, other.violationAction)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.securityPolicyId == null ? 43 : this.securityPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.enforcementScope == null ? 43 : this.enforcementScope.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAction == null ? 43 : this.violationAction.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

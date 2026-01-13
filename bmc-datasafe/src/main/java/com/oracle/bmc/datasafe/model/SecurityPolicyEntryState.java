/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents the state of a specific entry type deployment on a target. <br>
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
        builder = SecurityPolicyEntryState.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityPolicyEntryState
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "securityPolicyEntryId",
        "securityPolicyDeploymentId",
        "targetId",
        "entryType",
        "deploymentStatusDetails",
        "deploymentStatus",
        "entryDetails"
    })
    public SecurityPolicyEntryState(
            String id,
            String securityPolicyEntryId,
            String securityPolicyDeploymentId,
            String targetId,
            EntryType entryType,
            String deploymentStatusDetails,
            SecurityPolicyEntryStateDeploymentStatus deploymentStatus,
            EntryDetails entryDetails) {
        super();
        this.id = id;
        this.securityPolicyEntryId = securityPolicyEntryId;
        this.securityPolicyDeploymentId = securityPolicyDeploymentId;
        this.targetId = targetId;
        this.entryType = entryType;
        this.deploymentStatusDetails = deploymentStatusDetails;
        this.deploymentStatus = deploymentStatus;
        this.entryDetails = entryDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique id of the security policy entry state. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique id of the security policy entry state.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the security policy entry type associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyEntryId")
        private String securityPolicyEntryId;

        /**
         * The OCID of the security policy entry type associated.
         *
         * @param securityPolicyEntryId the value to set
         * @return this builder
         */
        public Builder securityPolicyEntryId(String securityPolicyEntryId) {
            this.securityPolicyEntryId = securityPolicyEntryId;
            this.__explicitlySet__.add("securityPolicyEntryId");
            return this;
        }
        /** The OCID of the security policy deployment associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyDeploymentId")
        private String securityPolicyDeploymentId;

        /**
         * The OCID of the security policy deployment associated.
         *
         * @param securityPolicyDeploymentId the value to set
         * @return this builder
         */
        public Builder securityPolicyDeploymentId(String securityPolicyDeploymentId) {
            this.securityPolicyDeploymentId = securityPolicyDeploymentId;
            this.__explicitlySet__.add("securityPolicyDeploymentId");
            return this;
        }
        /** The OCID of the target on which the security policy is deployed. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target on which the security policy is deployed.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The security policy entry type. Allowed values: - FIREWALL_POLICY - The SQL Firewall
         * policy entry type. - AUDIT_POLICY - The audit policy entry type. - CONFIG - Config
         * changes deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entryType")
        private EntryType entryType;

        /**
         * The security policy entry type. Allowed values: - FIREWALL_POLICY - The SQL Firewall
         * policy entry type. - AUDIT_POLICY - The audit policy entry type. - CONFIG - Config
         * changes deployment.
         *
         * @param entryType the value to set
         * @return this builder
         */
        public Builder entryType(EntryType entryType) {
            this.entryType = entryType;
            this.__explicitlySet__.add("entryType");
            return this;
        }
        /** Details about the current deployment status. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatusDetails")
        private String deploymentStatusDetails;

        /**
         * Details about the current deployment status.
         *
         * @param deploymentStatusDetails the value to set
         * @return this builder
         */
        public Builder deploymentStatusDetails(String deploymentStatusDetails) {
            this.deploymentStatusDetails = deploymentStatusDetails;
            this.__explicitlySet__.add("deploymentStatusDetails");
            return this;
        }
        /**
         * The current deployment status of the security policy deployment and the security policy
         * entry associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatus")
        private SecurityPolicyEntryStateDeploymentStatus deploymentStatus;

        /**
         * The current deployment status of the security policy deployment and the security policy
         * entry associated.
         *
         * @param deploymentStatus the value to set
         * @return this builder
         */
        public Builder deploymentStatus(SecurityPolicyEntryStateDeploymentStatus deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            this.__explicitlySet__.add("deploymentStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entryDetails")
        private EntryDetails entryDetails;

        public Builder entryDetails(EntryDetails entryDetails) {
            this.entryDetails = entryDetails;
            this.__explicitlySet__.add("entryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityPolicyEntryState build() {
            SecurityPolicyEntryState model =
                    new SecurityPolicyEntryState(
                            this.id,
                            this.securityPolicyEntryId,
                            this.securityPolicyDeploymentId,
                            this.targetId,
                            this.entryType,
                            this.deploymentStatusDetails,
                            this.deploymentStatus,
                            this.entryDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityPolicyEntryState model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("securityPolicyEntryId")) {
                this.securityPolicyEntryId(model.getSecurityPolicyEntryId());
            }
            if (model.wasPropertyExplicitlySet("securityPolicyDeploymentId")) {
                this.securityPolicyDeploymentId(model.getSecurityPolicyDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("entryType")) {
                this.entryType(model.getEntryType());
            }
            if (model.wasPropertyExplicitlySet("deploymentStatusDetails")) {
                this.deploymentStatusDetails(model.getDeploymentStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("deploymentStatus")) {
                this.deploymentStatus(model.getDeploymentStatus());
            }
            if (model.wasPropertyExplicitlySet("entryDetails")) {
                this.entryDetails(model.getEntryDetails());
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

    /** Unique id of the security policy entry state. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique id of the security policy entry state.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the security policy entry type associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyEntryId")
    private final String securityPolicyEntryId;

    /**
     * The OCID of the security policy entry type associated.
     *
     * @return the value
     */
    public String getSecurityPolicyEntryId() {
        return securityPolicyEntryId;
    }

    /** The OCID of the security policy deployment associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPolicyDeploymentId")
    private final String securityPolicyDeploymentId;

    /**
     * The OCID of the security policy deployment associated.
     *
     * @return the value
     */
    public String getSecurityPolicyDeploymentId() {
        return securityPolicyDeploymentId;
    }

    /** The OCID of the target on which the security policy is deployed. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target on which the security policy is deployed.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The security policy entry type. Allowed values: - FIREWALL_POLICY - The SQL Firewall policy
     * entry type. - AUDIT_POLICY - The audit policy entry type. - CONFIG - Config changes
     * deployment.
     */
    public enum EntryType implements com.oracle.bmc.http.internal.BmcEnum {
        FirewallPolicy("FIREWALL_POLICY"),
        AuditPolicy("AUDIT_POLICY"),
        Config("CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntryType.class);

        private final String value;
        private static java.util.Map<String, EntryType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntryType v : EntryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The security policy entry type. Allowed values: - FIREWALL_POLICY - The SQL Firewall policy
     * entry type. - AUDIT_POLICY - The audit policy entry type. - CONFIG - Config changes
     * deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entryType")
    private final EntryType entryType;

    /**
     * The security policy entry type. Allowed values: - FIREWALL_POLICY - The SQL Firewall policy
     * entry type. - AUDIT_POLICY - The audit policy entry type. - CONFIG - Config changes
     * deployment.
     *
     * @return the value
     */
    public EntryType getEntryType() {
        return entryType;
    }

    /** Details about the current deployment status. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatusDetails")
    private final String deploymentStatusDetails;

    /**
     * Details about the current deployment status.
     *
     * @return the value
     */
    public String getDeploymentStatusDetails() {
        return deploymentStatusDetails;
    }

    /**
     * The current deployment status of the security policy deployment and the security policy entry
     * associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentStatus")
    private final SecurityPolicyEntryStateDeploymentStatus deploymentStatus;

    /**
     * The current deployment status of the security policy deployment and the security policy entry
     * associated.
     *
     * @return the value
     */
    public SecurityPolicyEntryStateDeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entryDetails")
    private final EntryDetails entryDetails;

    public EntryDetails getEntryDetails() {
        return entryDetails;
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
        sb.append("SecurityPolicyEntryState(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", securityPolicyEntryId=").append(String.valueOf(this.securityPolicyEntryId));
        sb.append(", securityPolicyDeploymentId=")
                .append(String.valueOf(this.securityPolicyDeploymentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", entryType=").append(String.valueOf(this.entryType));
        sb.append(", deploymentStatusDetails=")
                .append(String.valueOf(this.deploymentStatusDetails));
        sb.append(", deploymentStatus=").append(String.valueOf(this.deploymentStatus));
        sb.append(", entryDetails=").append(String.valueOf(this.entryDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityPolicyEntryState)) {
            return false;
        }

        SecurityPolicyEntryState other = (SecurityPolicyEntryState) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.securityPolicyEntryId, other.securityPolicyEntryId)
                && java.util.Objects.equals(
                        this.securityPolicyDeploymentId, other.securityPolicyDeploymentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.entryType, other.entryType)
                && java.util.Objects.equals(
                        this.deploymentStatusDetails, other.deploymentStatusDetails)
                && java.util.Objects.equals(this.deploymentStatus, other.deploymentStatus)
                && java.util.Objects.equals(this.entryDetails, other.entryDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyEntryId == null
                                ? 43
                                : this.securityPolicyEntryId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyDeploymentId == null
                                ? 43
                                : this.securityPolicyDeploymentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.entryType == null ? 43 : this.entryType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentStatusDetails == null
                                ? 43
                                : this.deploymentStatusDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentStatus == null ? 43 : this.deploymentStatus.hashCode());
        result = (result * PRIME) + (this.entryDetails == null ? 43 : this.entryDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Status of management audit logging for the cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HsmClusterAuditLoggingInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HsmClusterAuditLoggingInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "bucketName",
        "namespace",
        "compartmentId",
        "dynamicGroupName",
        "auditLogLifecycleState"
    })
    public HsmClusterAuditLoggingInfo(
            Boolean isEnabled,
            String bucketName,
            String namespace,
            String compartmentId,
            String dynamicGroupName,
            AuditLogLifecycleState auditLogLifecycleState) {
        super();
        this.isEnabled = isEnabled;
        this.bucketName = bucketName;
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.dynamicGroupName = dynamicGroupName;
        this.auditLogLifecycleState = auditLogLifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether audit logging is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether audit logging is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** Audit logs bucket name. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Audit logs bucket name.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Bucket namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Bucket namespace.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Compartment of the bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment of the bucket.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of dynamic group used for audit log upload. */
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupName")
        private String dynamicGroupName;

        /**
         * Name of dynamic group used for audit log upload.
         *
         * @param dynamicGroupName the value to set
         * @return this builder
         */
        public Builder dynamicGroupName(String dynamicGroupName) {
            this.dynamicGroupName = dynamicGroupName;
            this.__explicitlySet__.add("dynamicGroupName");
            return this;
        }
        /** The current lifecycle state of the audit logs. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditLogLifecycleState")
        private AuditLogLifecycleState auditLogLifecycleState;

        /**
         * The current lifecycle state of the audit logs.
         *
         * @param auditLogLifecycleState the value to set
         * @return this builder
         */
        public Builder auditLogLifecycleState(AuditLogLifecycleState auditLogLifecycleState) {
            this.auditLogLifecycleState = auditLogLifecycleState;
            this.__explicitlySet__.add("auditLogLifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HsmClusterAuditLoggingInfo build() {
            HsmClusterAuditLoggingInfo model =
                    new HsmClusterAuditLoggingInfo(
                            this.isEnabled,
                            this.bucketName,
                            this.namespace,
                            this.compartmentId,
                            this.dynamicGroupName,
                            this.auditLogLifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HsmClusterAuditLoggingInfo model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dynamicGroupName")) {
                this.dynamicGroupName(model.getDynamicGroupName());
            }
            if (model.wasPropertyExplicitlySet("auditLogLifecycleState")) {
                this.auditLogLifecycleState(model.getAuditLogLifecycleState());
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

    /** Whether audit logging is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether audit logging is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** Audit logs bucket name. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Audit logs bucket name.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Bucket namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Bucket namespace.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Compartment of the bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment of the bucket.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of dynamic group used for audit log upload. */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupName")
    private final String dynamicGroupName;

    /**
     * Name of dynamic group used for audit log upload.
     *
     * @return the value
     */
    public String getDynamicGroupName() {
        return dynamicGroupName;
    }

    /** The current lifecycle state of the audit logs. */
    public enum AuditLogLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        WaitingForCustomer("WAITING_FOR_CUSTOMER"),
        Verifying("VERIFYING"),
        DisablingInProgress("DISABLING_IN_PROGRESS"),
        DisablingBroken("DISABLING_BROKEN"),
        DisabledValidated("DISABLED_VALIDATED"),
        Failed("FAILED"),
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuditLogLifecycleState.class);

        private final String value;
        private static java.util.Map<String, AuditLogLifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (AuditLogLifecycleState v : AuditLogLifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuditLogLifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuditLogLifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuditLogLifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the audit logs. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditLogLifecycleState")
    private final AuditLogLifecycleState auditLogLifecycleState;

    /**
     * The current lifecycle state of the audit logs.
     *
     * @return the value
     */
    public AuditLogLifecycleState getAuditLogLifecycleState() {
        return auditLogLifecycleState;
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
        sb.append("HsmClusterAuditLoggingInfo(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dynamicGroupName=").append(String.valueOf(this.dynamicGroupName));
        sb.append(", auditLogLifecycleState=").append(String.valueOf(this.auditLogLifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HsmClusterAuditLoggingInfo)) {
            return false;
        }

        HsmClusterAuditLoggingInfo other = (HsmClusterAuditLoggingInfo) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dynamicGroupName, other.dynamicGroupName)
                && java.util.Objects.equals(
                        this.auditLogLifecycleState, other.auditLogLifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicGroupName == null ? 43 : this.dynamicGroupName.hashCode());
        result =
                (result * PRIME)
                        + (this.auditLogLifecycleState == null
                                ? 43
                                : this.auditLogLifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

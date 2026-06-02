/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Audit Log resource for tracking status and details of audit logging operations on HSM clusters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EnableAuditMgmtLogging.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EnableAuditMgmtLogging
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "hsmClusterId",
        "customerBucketName",
        "namespace",
        "clusterCompartmentId",
        "auditLoggingStatus"
    })
    public EnableAuditMgmtLogging(
            String id,
            String hsmClusterId,
            String customerBucketName,
            String namespace,
            String clusterCompartmentId,
            AuditLoggingStatus auditLoggingStatus) {
        super();
        this.id = id;
        this.hsmClusterId = hsmClusterId;
        this.customerBucketName = customerBucketName;
        this.namespace = namespace;
        this.clusterCompartmentId = clusterCompartmentId;
        this.auditLoggingStatus = auditLoggingStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Workflow request identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Workflow request identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the HSM Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hsmClusterId")
        private String hsmClusterId;

        /**
         * OCID of the HSM Cluster.
         * @param hsmClusterId the value to set
         * @return this builder
         **/
        public Builder hsmClusterId(String hsmClusterId) {
            this.hsmClusterId = hsmClusterId;
            this.__explicitlySet__.add("hsmClusterId");
            return this;
        }
        /**
         * Name of the audit log's associated customer bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerBucketName")
        private String customerBucketName;

        /**
         * Name of the audit log's associated customer bucket.
         * @param customerBucketName the value to set
         * @return this builder
         **/
        public Builder customerBucketName(String customerBucketName) {
            this.customerBucketName = customerBucketName;
            this.__explicitlySet__.add("customerBucketName");
            return this;
        }
        /**
         * Object Storage namespace of the bucket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Object Storage namespace of the bucket.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Compartment OCID for the HSM cluster (bucket compartment).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterCompartmentId")
        private String clusterCompartmentId;

        /**
         * Compartment OCID for the HSM cluster (bucket compartment).
         * @param clusterCompartmentId the value to set
         * @return this builder
         **/
        public Builder clusterCompartmentId(String clusterCompartmentId) {
            this.clusterCompartmentId = clusterCompartmentId;
            this.__explicitlySet__.add("clusterCompartmentId");
            return this;
        }
        /**
         * Status of the audit logging.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditLoggingStatus")
        private AuditLoggingStatus auditLoggingStatus;

        /**
         * Status of the audit logging.
         * @param auditLoggingStatus the value to set
         * @return this builder
         **/
        public Builder auditLoggingStatus(AuditLoggingStatus auditLoggingStatus) {
            this.auditLoggingStatus = auditLoggingStatus;
            this.__explicitlySet__.add("auditLoggingStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableAuditMgmtLogging build() {
            EnableAuditMgmtLogging model =
                    new EnableAuditMgmtLogging(
                            this.id,
                            this.hsmClusterId,
                            this.customerBucketName,
                            this.namespace,
                            this.clusterCompartmentId,
                            this.auditLoggingStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableAuditMgmtLogging model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("hsmClusterId")) {
                this.hsmClusterId(model.getHsmClusterId());
            }
            if (model.wasPropertyExplicitlySet("customerBucketName")) {
                this.customerBucketName(model.getCustomerBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("clusterCompartmentId")) {
                this.clusterCompartmentId(model.getClusterCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("auditLoggingStatus")) {
                this.auditLoggingStatus(model.getAuditLoggingStatus());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Workflow request identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Workflow request identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the HSM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hsmClusterId")
    private final String hsmClusterId;

    /**
     * OCID of the HSM Cluster.
     * @return the value
     **/
    public String getHsmClusterId() {
        return hsmClusterId;
    }

    /**
     * Name of the audit log's associated customer bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBucketName")
    private final String customerBucketName;

    /**
     * Name of the audit log's associated customer bucket.
     * @return the value
     **/
    public String getCustomerBucketName() {
        return customerBucketName;
    }

    /**
     * Object Storage namespace of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Object Storage namespace of the bucket.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Compartment OCID for the HSM cluster (bucket compartment).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCompartmentId")
    private final String clusterCompartmentId;

    /**
     * Compartment OCID for the HSM cluster (bucket compartment).
     * @return the value
     **/
    public String getClusterCompartmentId() {
        return clusterCompartmentId;
    }

    /**
     * Status of the audit logging.
     **/
    public enum AuditLoggingStatus {
        Creating("CREATING"),
        WaitingForCustomer("WAITING_FOR_CUSTOMER"),
        Verifying("VERIFYING"),
        DisablingInProgress("DISABLING_IN_PROGRESS"),
        DisabledValidated("DISABLED_VALIDATED"),
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuditLoggingStatus.class);

        private final String value;
        private static java.util.Map<String, AuditLoggingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AuditLoggingStatus v : AuditLoggingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuditLoggingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuditLoggingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuditLoggingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the audit logging.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditLoggingStatus")
    private final AuditLoggingStatus auditLoggingStatus;

    /**
     * Status of the audit logging.
     * @return the value
     **/
    public AuditLoggingStatus getAuditLoggingStatus() {
        return auditLoggingStatus;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EnableAuditMgmtLogging(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", hsmClusterId=").append(String.valueOf(this.hsmClusterId));
        sb.append(", customerBucketName=").append(String.valueOf(this.customerBucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", clusterCompartmentId=").append(String.valueOf(this.clusterCompartmentId));
        sb.append(", auditLoggingStatus=").append(String.valueOf(this.auditLoggingStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableAuditMgmtLogging)) {
            return false;
        }

        EnableAuditMgmtLogging other = (EnableAuditMgmtLogging) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.hsmClusterId, other.hsmClusterId)
                && java.util.Objects.equals(this.customerBucketName, other.customerBucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.clusterCompartmentId, other.clusterCompartmentId)
                && java.util.Objects.equals(this.auditLoggingStatus, other.auditLoggingStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.hsmClusterId == null ? 43 : this.hsmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBucketName == null
                                ? 43
                                : this.customerBucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterCompartmentId == null
                                ? 43
                                : this.clusterCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.auditLoggingStatus == null
                                ? 43
                                : this.auditLoggingStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

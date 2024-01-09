/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Infrastructure target version details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InfrastructureTargetVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InfrastructureTargetVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetDbVersionHistoryEntry",
        "targetStorageVersionHistoryEntry",
        "targetResourceType",
        "targetResourceId"
    })
    public InfrastructureTargetVersion(
            java.util.List<String> targetDbVersionHistoryEntry,
            java.util.List<String> targetStorageVersionHistoryEntry,
            TargetResourceType targetResourceType,
            String targetResourceId) {
        super();
        this.targetDbVersionHistoryEntry = targetDbVersionHistoryEntry;
        this.targetStorageVersionHistoryEntry = targetStorageVersionHistoryEntry;
        this.targetResourceType = targetResourceType;
        this.targetResourceId = targetResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The history entry of the target system software version for the database server patching
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbVersionHistoryEntry")
        private java.util.List<String> targetDbVersionHistoryEntry;

        /**
         * The history entry of the target system software version for the database server patching
         * operation.
         *
         * @param targetDbVersionHistoryEntry the value to set
         * @return this builder
         */
        public Builder targetDbVersionHistoryEntry(
                java.util.List<String> targetDbVersionHistoryEntry) {
            this.targetDbVersionHistoryEntry = targetDbVersionHistoryEntry;
            this.__explicitlySet__.add("targetDbVersionHistoryEntry");
            return this;
        }
        /**
         * The history entry of the target storage cell system software version for the storage cell
         * patching operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetStorageVersionHistoryEntry")
        private java.util.List<String> targetStorageVersionHistoryEntry;

        /**
         * The history entry of the target storage cell system software version for the storage cell
         * patching operation.
         *
         * @param targetStorageVersionHistoryEntry the value to set
         * @return this builder
         */
        public Builder targetStorageVersionHistoryEntry(
                java.util.List<String> targetStorageVersionHistoryEntry) {
            this.targetStorageVersionHistoryEntry = targetStorageVersionHistoryEntry;
            this.__explicitlySet__.add("targetStorageVersionHistoryEntry");
            return this;
        }
        /**
         * The resource type of the target Exadata infrastructure resource that will receive the
         * system software update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        /**
         * The resource type of the target Exadata infrastructure resource that will receive the
         * system software update.
         *
         * @param targetResourceType the value to set
         * @return this builder
         */
        public Builder targetResourceType(TargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }
        /**
         * The OCID of the target Exadata Infrastructure resource that will receive the maintenance
         * update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The OCID of the target Exadata Infrastructure resource that will receive the maintenance
         * update.
         *
         * @param targetResourceId the value to set
         * @return this builder
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InfrastructureTargetVersion build() {
            InfrastructureTargetVersion model =
                    new InfrastructureTargetVersion(
                            this.targetDbVersionHistoryEntry,
                            this.targetStorageVersionHistoryEntry,
                            this.targetResourceType,
                            this.targetResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InfrastructureTargetVersion model) {
            if (model.wasPropertyExplicitlySet("targetDbVersionHistoryEntry")) {
                this.targetDbVersionHistoryEntry(model.getTargetDbVersionHistoryEntry());
            }
            if (model.wasPropertyExplicitlySet("targetStorageVersionHistoryEntry")) {
                this.targetStorageVersionHistoryEntry(model.getTargetStorageVersionHistoryEntry());
            }
            if (model.wasPropertyExplicitlySet("targetResourceType")) {
                this.targetResourceType(model.getTargetResourceType());
            }
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
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

    /**
     * The history entry of the target system software version for the database server patching
     * operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbVersionHistoryEntry")
    private final java.util.List<String> targetDbVersionHistoryEntry;

    /**
     * The history entry of the target system software version for the database server patching
     * operation.
     *
     * @return the value
     */
    public java.util.List<String> getTargetDbVersionHistoryEntry() {
        return targetDbVersionHistoryEntry;
    }

    /**
     * The history entry of the target storage cell system software version for the storage cell
     * patching operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetStorageVersionHistoryEntry")
    private final java.util.List<String> targetStorageVersionHistoryEntry;

    /**
     * The history entry of the target storage cell system software version for the storage cell
     * patching operation.
     *
     * @return the value
     */
    public java.util.List<String> getTargetStorageVersionHistoryEntry() {
        return targetStorageVersionHistoryEntry;
    }

    /**
     * The resource type of the target Exadata infrastructure resource that will receive the system
     * software update.
     */
    public enum TargetResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        ExadataDbSystem("EXADATA_DB_SYSTEM"),
        CloudExadataInfrastructure("CLOUD_EXADATA_INFRASTRUCTURE"),
        ExaccInfrastructure("EXACC_INFRASTRUCTURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetResourceType.class);

        private final String value;
        private static java.util.Map<String, TargetResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetResourceType v : TargetResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The resource type of the target Exadata infrastructure resource that will receive the system
     * software update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    private final TargetResourceType targetResourceType;

    /**
     * The resource type of the target Exadata infrastructure resource that will receive the system
     * software update.
     *
     * @return the value
     */
    public TargetResourceType getTargetResourceType() {
        return targetResourceType;
    }

    /**
     * The OCID of the target Exadata Infrastructure resource that will receive the maintenance
     * update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The OCID of the target Exadata Infrastructure resource that will receive the maintenance
     * update.
     *
     * @return the value
     */
    public String getTargetResourceId() {
        return targetResourceId;
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
        sb.append("InfrastructureTargetVersion(");
        sb.append("super=").append(super.toString());
        sb.append("targetDbVersionHistoryEntry=")
                .append(String.valueOf(this.targetDbVersionHistoryEntry));
        sb.append(", targetStorageVersionHistoryEntry=")
                .append(String.valueOf(this.targetStorageVersionHistoryEntry));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfrastructureTargetVersion)) {
            return false;
        }

        InfrastructureTargetVersion other = (InfrastructureTargetVersion) o;
        return java.util.Objects.equals(
                        this.targetDbVersionHistoryEntry, other.targetDbVersionHistoryEntry)
                && java.util.Objects.equals(
                        this.targetStorageVersionHistoryEntry,
                        other.targetStorageVersionHistoryEntry)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetDbVersionHistoryEntry == null
                                ? 43
                                : this.targetDbVersionHistoryEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.targetStorageVersionHistoryEntry == null
                                ? 43
                                : this.targetStorageVersionHistoryEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

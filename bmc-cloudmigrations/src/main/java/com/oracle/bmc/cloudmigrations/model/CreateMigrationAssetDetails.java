/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Details of the new migration asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMigrationAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMigrationAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "inventoryAssetId",
        "migrationId",
        "replicationScheduleId",
        "availabilityDomain",
        "replicationCompartmentId",
        "snapShotBucketName",
        "dependsOn"
    })
    public CreateMigrationAssetDetails(
            String displayName,
            String inventoryAssetId,
            String migrationId,
            String replicationScheduleId,
            String availabilityDomain,
            String replicationCompartmentId,
            String snapShotBucketName,
            java.util.List<String> dependsOn) {
        super();
        this.displayName = displayName;
        this.inventoryAssetId = inventoryAssetId;
        this.migrationId = migrationId;
        this.replicationScheduleId = replicationScheduleId;
        this.availabilityDomain = availabilityDomain;
        this.replicationCompartmentId = replicationCompartmentId;
        this.snapShotBucketName = snapShotBucketName;
        this.dependsOn = dependsOn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. If empty, then source asset name will be used. Does not have to be
         * unique, and it's changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. If empty, then source asset name will be used. Does not have to be
         * unique, and it's changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCID of an asset for an inventory. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryAssetId")
        private String inventoryAssetId;

        /**
         * OCID of an asset for an inventory.
         *
         * @param inventoryAssetId the value to set
         * @return this builder
         */
        public Builder inventoryAssetId(String inventoryAssetId) {
            this.inventoryAssetId = inventoryAssetId;
            this.__explicitlySet__.add("inventoryAssetId");
            return this;
        }
        /** OCID of the associated migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
        private String migrationId;

        /**
         * OCID of the associated migration.
         *
         * @param migrationId the value to set
         * @return this builder
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            this.__explicitlySet__.add("migrationId");
            return this;
        }
        /** Replication schedule identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationScheduleId")
        private String replicationScheduleId;

        /**
         * Replication schedule identifier
         *
         * @param replicationScheduleId the value to set
         * @return this builder
         */
        public Builder replicationScheduleId(String replicationScheduleId) {
            this.replicationScheduleId = replicationScheduleId;
            this.__explicitlySet__.add("replicationScheduleId");
            return this;
        }
        /** Availability domain */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability domain
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Replication compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationCompartmentId")
        private String replicationCompartmentId;

        /**
         * Replication compartment identifier
         *
         * @param replicationCompartmentId the value to set
         * @return this builder
         */
        public Builder replicationCompartmentId(String replicationCompartmentId) {
            this.replicationCompartmentId = replicationCompartmentId;
            this.__explicitlySet__.add("replicationCompartmentId");
            return this;
        }
        /** Name of snapshot bucket */
        @com.fasterxml.jackson.annotation.JsonProperty("snapShotBucketName")
        private String snapShotBucketName;

        /**
         * Name of snapshot bucket
         *
         * @param snapShotBucketName the value to set
         * @return this builder
         */
        public Builder snapShotBucketName(String snapShotBucketName) {
            this.snapShotBucketName = snapShotBucketName;
            this.__explicitlySet__.add("snapShotBucketName");
            return this;
        }
        /** List of migration assets that depends on this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
        private java.util.List<String> dependsOn;

        /**
         * List of migration assets that depends on this asset.
         *
         * @param dependsOn the value to set
         * @return this builder
         */
        public Builder dependsOn(java.util.List<String> dependsOn) {
            this.dependsOn = dependsOn;
            this.__explicitlySet__.add("dependsOn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMigrationAssetDetails build() {
            CreateMigrationAssetDetails model =
                    new CreateMigrationAssetDetails(
                            this.displayName,
                            this.inventoryAssetId,
                            this.migrationId,
                            this.replicationScheduleId,
                            this.availabilityDomain,
                            this.replicationCompartmentId,
                            this.snapShotBucketName,
                            this.dependsOn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMigrationAssetDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("inventoryAssetId")) {
                this.inventoryAssetId(model.getInventoryAssetId());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("replicationScheduleId")) {
                this.replicationScheduleId(model.getReplicationScheduleId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("replicationCompartmentId")) {
                this.replicationCompartmentId(model.getReplicationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("snapShotBucketName")) {
                this.snapShotBucketName(model.getSnapShotBucketName());
            }
            if (model.wasPropertyExplicitlySet("dependsOn")) {
                this.dependsOn(model.getDependsOn());
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
     * A user-friendly name. If empty, then source asset name will be used. Does not have to be
     * unique, and it's changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. If empty, then source asset name will be used. Does not have to be
     * unique, and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCID of an asset for an inventory. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryAssetId")
    private final String inventoryAssetId;

    /**
     * OCID of an asset for an inventory.
     *
     * @return the value
     */
    public String getInventoryAssetId() {
        return inventoryAssetId;
    }

    /** OCID of the associated migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
    private final String migrationId;

    /**
     * OCID of the associated migration.
     *
     * @return the value
     */
    public String getMigrationId() {
        return migrationId;
    }

    /** Replication schedule identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationScheduleId")
    private final String replicationScheduleId;

    /**
     * Replication schedule identifier
     *
     * @return the value
     */
    public String getReplicationScheduleId() {
        return replicationScheduleId;
    }

    /** Availability domain */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability domain
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Replication compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationCompartmentId")
    private final String replicationCompartmentId;

    /**
     * Replication compartment identifier
     *
     * @return the value
     */
    public String getReplicationCompartmentId() {
        return replicationCompartmentId;
    }

    /** Name of snapshot bucket */
    @com.fasterxml.jackson.annotation.JsonProperty("snapShotBucketName")
    private final String snapShotBucketName;

    /**
     * Name of snapshot bucket
     *
     * @return the value
     */
    public String getSnapShotBucketName() {
        return snapShotBucketName;
    }

    /** List of migration assets that depends on this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    private final java.util.List<String> dependsOn;

    /**
     * List of migration assets that depends on this asset.
     *
     * @return the value
     */
    public java.util.List<String> getDependsOn() {
        return dependsOn;
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
        sb.append("CreateMigrationAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", inventoryAssetId=").append(String.valueOf(this.inventoryAssetId));
        sb.append(", migrationId=").append(String.valueOf(this.migrationId));
        sb.append(", replicationScheduleId=").append(String.valueOf(this.replicationScheduleId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", replicationCompartmentId=")
                .append(String.valueOf(this.replicationCompartmentId));
        sb.append(", snapShotBucketName=").append(String.valueOf(this.snapShotBucketName));
        sb.append(", dependsOn=").append(String.valueOf(this.dependsOn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMigrationAssetDetails)) {
            return false;
        }

        CreateMigrationAssetDetails other = (CreateMigrationAssetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.inventoryAssetId, other.inventoryAssetId)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.replicationScheduleId, other.replicationScheduleId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.replicationCompartmentId, other.replicationCompartmentId)
                && java.util.Objects.equals(this.snapShotBucketName, other.snapShotBucketName)
                && java.util.Objects.equals(this.dependsOn, other.dependsOn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryAssetId == null ? 43 : this.inventoryAssetId.hashCode());
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationScheduleId == null
                                ? 43
                                : this.replicationScheduleId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationCompartmentId == null
                                ? 43
                                : this.replicationCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.snapShotBucketName == null
                                ? 43
                                : this.snapShotBucketName.hashCode());
        result = (result * PRIME) + (this.dependsOn == null ? 43 : this.dependsOn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

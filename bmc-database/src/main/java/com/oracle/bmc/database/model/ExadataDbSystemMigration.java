/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Information about the Exadata DB system migration. The migration is used to move the Exadata Cloud Service instance from the DB system resource model to the new cloud Exadata infrastructure resource model.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataDbSystemMigration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataDbSystemMigration {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbSystemId",
        "cloudVmClusterId",
        "cloudExadataInfrastructureId",
        "additionalMigrations"
    })
    public ExadataDbSystemMigration(
            String dbSystemId,
            String cloudVmClusterId,
            String cloudExadataInfrastructureId,
            java.util.List<ExadataDbSystemMigrationSummary> additionalMigrations) {
        super();
        this.dbSystemId = dbSystemId;
        this.cloudVmClusterId = cloudVmClusterId;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.additionalMigrations = additionalMigrations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudVmClusterId")
        private String cloudVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
         * @param cloudVmClusterId the value to set
         * @return this builder
         **/
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            this.cloudVmClusterId = cloudVmClusterId;
            this.__explicitlySet__.add("cloudVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
            return this;
        }
        /**
         * The details of addtional resources related to the migration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalMigrations")
        private java.util.List<ExadataDbSystemMigrationSummary> additionalMigrations;

        /**
         * The details of addtional resources related to the migration.
         * @param additionalMigrations the value to set
         * @return this builder
         **/
        public Builder additionalMigrations(
                java.util.List<ExadataDbSystemMigrationSummary> additionalMigrations) {
            this.additionalMigrations = additionalMigrations;
            this.__explicitlySet__.add("additionalMigrations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataDbSystemMigration build() {
            ExadataDbSystemMigration __instance__ =
                    new ExadataDbSystemMigration(
                            dbSystemId,
                            cloudVmClusterId,
                            cloudExadataInfrastructureId,
                            additionalMigrations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataDbSystemMigration o) {
            Builder copiedBuilder =
                    dbSystemId(o.getDbSystemId())
                            .cloudVmClusterId(o.getCloudVmClusterId())
                            .cloudExadataInfrastructureId(o.getCloudExadataInfrastructureId())
                            .additionalMigrations(o.getAdditionalMigrations());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudVmClusterId")
    private final String cloudVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud VM cluster.
     * @return the value
     **/
    public String getCloudVmClusterId() {
        return cloudVmClusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     * @return the value
     **/
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }

    /**
     * The details of addtional resources related to the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMigrations")
    private final java.util.List<ExadataDbSystemMigrationSummary> additionalMigrations;

    /**
     * The details of addtional resources related to the migration.
     * @return the value
     **/
    public java.util.List<ExadataDbSystemMigrationSummary> getAdditionalMigrations() {
        return additionalMigrations;
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
        sb.append("ExadataDbSystemMigration(");
        sb.append("dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", cloudVmClusterId=").append(String.valueOf(this.cloudVmClusterId));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", additionalMigrations=").append(String.valueOf(this.additionalMigrations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataDbSystemMigration)) {
            return false;
        }

        ExadataDbSystemMigration other = (ExadataDbSystemMigration) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.cloudVmClusterId, other.cloudVmClusterId)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(this.additionalMigrations, other.additionalMigrations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudVmClusterId == null ? 43 : this.cloudVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalMigrations == null
                                ? 43
                                : this.additionalMigrations.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

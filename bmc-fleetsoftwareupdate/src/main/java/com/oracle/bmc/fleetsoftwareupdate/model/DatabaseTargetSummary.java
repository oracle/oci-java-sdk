/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of a Database target member of a Exadata Fleet Update Collection. Stored references of
 * the resource documented in
 * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/Database/ <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseTargetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseTargetSummary extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the database home. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        /**
         * OCID of the database home.
         *
         * @param dbHomeId the value to set
         * @return this builder
         */
        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }
        /** OCID of the related VM Cluster or Cloud VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * OCID of the related VM Cluster or Cloud VM Cluster.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /** OCID of the related Exadata Infrastructure or Cloud Exadata Infrastructure resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
        private String infrastructureId;

        /**
         * OCID of the related Exadata Infrastructure or Cloud Exadata Infrastructure resource.
         *
         * @param infrastructureId the value to set
         * @return this builder
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            this.__explicitlySet__.add("infrastructureId");
            return this;
        }
        /** OCID of the Database sofware image. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareImageId")
        private String softwareImageId;

        /**
         * OCID of the Database sofware image.
         *
         * @param softwareImageId the value to set
         * @return this builder
         */
        public Builder softwareImageId(String softwareImageId) {
            this.softwareImageId = softwareImageId;
            this.__explicitlySet__.add("softwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseTargetSummary build() {
            DatabaseTargetSummary model =
                    new DatabaseTargetSummary(
                            this.id,
                            this.compartmentId,
                            this.dbHomeId,
                            this.vmClusterId,
                            this.infrastructureId,
                            this.softwareImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTargetSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbHomeId")) {
                this.dbHomeId(model.getDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("infrastructureId")) {
                this.infrastructureId(model.getInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("softwareImageId")) {
                this.softwareImageId(model.getSoftwareImageId());
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

    @Deprecated
    public DatabaseTargetSummary(
            String id,
            String compartmentId,
            String dbHomeId,
            String vmClusterId,
            String infrastructureId,
            String softwareImageId) {
        super(id, compartmentId);
        this.dbHomeId = dbHomeId;
        this.vmClusterId = vmClusterId;
        this.infrastructureId = infrastructureId;
        this.softwareImageId = softwareImageId;
    }

    /** OCID of the database home. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    /**
     * OCID of the database home.
     *
     * @return the value
     */
    public String getDbHomeId() {
        return dbHomeId;
    }

    /** OCID of the related VM Cluster or Cloud VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * OCID of the related VM Cluster or Cloud VM Cluster.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    /** OCID of the related Exadata Infrastructure or Cloud Exadata Infrastructure resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
    private final String infrastructureId;

    /**
     * OCID of the related Exadata Infrastructure or Cloud Exadata Infrastructure resource.
     *
     * @return the value
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }

    /** OCID of the Database sofware image. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareImageId")
    private final String softwareImageId;

    /**
     * OCID of the Database sofware image.
     *
     * @return the value
     */
    public String getSoftwareImageId() {
        return softwareImageId;
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
        sb.append("DatabaseTargetSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", softwareImageId=").append(String.valueOf(this.softwareImageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTargetSummary)) {
            return false;
        }

        DatabaseTargetSummary other = (DatabaseTargetSummary) o;
        return java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.softwareImageId, other.softwareImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareImageId == null ? 43 : this.softwareImageId.hashCode());
        return result;
    }
}

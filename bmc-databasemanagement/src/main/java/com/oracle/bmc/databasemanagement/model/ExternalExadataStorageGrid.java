/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The Exadata storage grid details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalExadataStorageGrid.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalExadataStorageGrid extends DbmResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalId")
        private String internalId;

        public Builder internalId(String internalId) {
            this.internalId = internalId;
            this.__explicitlySet__.add("internalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata infrastructure system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Exadata infrastructure system.
         *
         * @param exadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /** The number of the storage servers in the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCount")
        private java.math.BigDecimal serverCount;

        /**
         * The number of the storage servers in the Exadata infrastructure.
         *
         * @param serverCount the value to set
         * @return this builder
         */
        public Builder serverCount(java.math.BigDecimal serverCount) {
            this.serverCount = serverCount;
            this.__explicitlySet__.add("serverCount");
            return this;
        }
        /** A list of monitored Exadata storage server. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServers")
        private java.util.List<ExternalExadataStorageServerSummary> storageServers;

        /**
         * A list of monitored Exadata storage server.
         *
         * @param storageServers the value to set
         * @return this builder
         */
        public Builder storageServers(
                java.util.List<ExternalExadataStorageServerSummary> storageServers) {
            this.storageServers = storageServers;
            this.__explicitlySet__.add("storageServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalExadataStorageGrid build() {
            ExternalExadataStorageGrid model =
                    new ExternalExadataStorageGrid(
                            this.id,
                            this.displayName,
                            this.version,
                            this.internalId,
                            this.status,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.additionalDetails,
                            this.exadataInfrastructureId,
                            this.serverCount,
                            this.storageServers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalExadataStorageGrid model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("internalId")) {
                this.internalId(model.getInternalId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("serverCount")) {
                this.serverCount(model.getServerCount());
            }
            if (model.wasPropertyExplicitlySet("storageServers")) {
                this.storageServers(model.getStorageServers());
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
    public ExternalExadataStorageGrid(
            String id,
            String displayName,
            String version,
            String internalId,
            String status,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            java.util.Map<String, String> additionalDetails,
            String exadataInfrastructureId,
            java.math.BigDecimal serverCount,
            java.util.List<ExternalExadataStorageServerSummary> storageServers) {
        super(
                id,
                displayName,
                version,
                internalId,
                status,
                lifecycleState,
                timeCreated,
                timeUpdated,
                lifecycleDetails,
                additionalDetails);
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.serverCount = serverCount;
        this.storageServers = storageServers;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * infrastructure system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Exadata
     * infrastructure system.
     *
     * @return the value
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /** The number of the storage servers in the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCount")
    private final java.math.BigDecimal serverCount;

    /**
     * The number of the storage servers in the Exadata infrastructure.
     *
     * @return the value
     */
    public java.math.BigDecimal getServerCount() {
        return serverCount;
    }

    /** A list of monitored Exadata storage server. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServers")
    private final java.util.List<ExternalExadataStorageServerSummary> storageServers;

    /**
     * A list of monitored Exadata storage server.
     *
     * @return the value
     */
    public java.util.List<ExternalExadataStorageServerSummary> getStorageServers() {
        return storageServers;
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
        sb.append("ExternalExadataStorageGrid(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", serverCount=").append(String.valueOf(this.serverCount));
        sb.append(", storageServers=").append(String.valueOf(this.storageServers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalExadataStorageGrid)) {
            return false;
        }

        ExternalExadataStorageGrid other = (ExternalExadataStorageGrid) o;
        return java.util.Objects.equals(this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.serverCount, other.serverCount)
                && java.util.Objects.equals(this.storageServers, other.storageServers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.serverCount == null ? 43 : this.serverCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServers == null ? 43 : this.storageServers.hashCode());
        return result;
    }
}

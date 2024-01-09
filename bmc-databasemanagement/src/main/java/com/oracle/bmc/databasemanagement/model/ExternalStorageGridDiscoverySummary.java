/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Exadata storage server grid discovery. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalStorageGridDiscoverySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalStorageGridDiscoverySummary extends EntityDiscovered {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("discoverStatus")
        private DiscoverStatus discoverStatus;

        public Builder discoverStatus(DiscoverStatus discoverStatus) {
            this.discoverStatus = discoverStatus;
            this.__explicitlySet__.add("discoverStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorCode")
        private String discoverErrorCode;

        public Builder discoverErrorCode(String discoverErrorCode) {
            this.discoverErrorCode = discoverErrorCode;
            this.__explicitlySet__.add("discoverErrorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorMsg")
        private String discoverErrorMsg;

        public Builder discoverErrorMsg(String discoverErrorMsg) {
            this.discoverErrorMsg = discoverErrorMsg;
            this.__explicitlySet__.add("discoverErrorMsg");
            return this;
        }
        /** The total number of Exadata storage servers discovered. */
        @com.fasterxml.jackson.annotation.JsonProperty("countOfStorageServersDiscovered")
        private Integer countOfStorageServersDiscovered;

        /**
         * The total number of Exadata storage servers discovered.
         *
         * @param countOfStorageServersDiscovered the value to set
         * @return this builder
         */
        public Builder countOfStorageServersDiscovered(Integer countOfStorageServersDiscovered) {
            this.countOfStorageServersDiscovered = countOfStorageServersDiscovered;
            this.__explicitlySet__.add("countOfStorageServersDiscovered");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalStorageGridDiscoverySummary build() {
            ExternalStorageGridDiscoverySummary model =
                    new ExternalStorageGridDiscoverySummary(
                            this.id,
                            this.agentId,
                            this.connectorId,
                            this.displayName,
                            this.version,
                            this.internalId,
                            this.status,
                            this.discoverStatus,
                            this.discoverErrorCode,
                            this.discoverErrorMsg,
                            this.countOfStorageServersDiscovered);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalStorageGridDiscoverySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
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
            if (model.wasPropertyExplicitlySet("discoverStatus")) {
                this.discoverStatus(model.getDiscoverStatus());
            }
            if (model.wasPropertyExplicitlySet("discoverErrorCode")) {
                this.discoverErrorCode(model.getDiscoverErrorCode());
            }
            if (model.wasPropertyExplicitlySet("discoverErrorMsg")) {
                this.discoverErrorMsg(model.getDiscoverErrorMsg());
            }
            if (model.wasPropertyExplicitlySet("countOfStorageServersDiscovered")) {
                this.countOfStorageServersDiscovered(model.getCountOfStorageServersDiscovered());
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
    public ExternalStorageGridDiscoverySummary(
            String id,
            String agentId,
            String connectorId,
            String displayName,
            String version,
            String internalId,
            String status,
            DiscoverStatus discoverStatus,
            String discoverErrorCode,
            String discoverErrorMsg,
            Integer countOfStorageServersDiscovered) {
        super(
                id,
                agentId,
                connectorId,
                displayName,
                version,
                internalId,
                status,
                discoverStatus,
                discoverErrorCode,
                discoverErrorMsg);
        this.countOfStorageServersDiscovered = countOfStorageServersDiscovered;
    }

    /** The total number of Exadata storage servers discovered. */
    @com.fasterxml.jackson.annotation.JsonProperty("countOfStorageServersDiscovered")
    private final Integer countOfStorageServersDiscovered;

    /**
     * The total number of Exadata storage servers discovered.
     *
     * @return the value
     */
    public Integer getCountOfStorageServersDiscovered() {
        return countOfStorageServersDiscovered;
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
        sb.append("ExternalStorageGridDiscoverySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", countOfStorageServersDiscovered=")
                .append(String.valueOf(this.countOfStorageServersDiscovered));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalStorageGridDiscoverySummary)) {
            return false;
        }

        ExternalStorageGridDiscoverySummary other = (ExternalStorageGridDiscoverySummary) o;
        return java.util.Objects.equals(
                        this.countOfStorageServersDiscovered, other.countOfStorageServersDiscovered)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.countOfStorageServersDiscovered == null
                                ? 43
                                : this.countOfStorageServersDiscovered.hashCode());
        return result;
    }
}

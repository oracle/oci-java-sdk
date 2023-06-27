/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Exadata storage server discovery.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalStorageServerDiscoverySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalStorageServerDiscoverySummary extends EntityDiscovered {
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
        /**
         * The IP address of the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the Exadata storage server.
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * The make model of the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("makeModel")
        private String makeModel;

        /**
         * The make model of the Exadata storage server.
         * @param makeModel the value to set
         * @return this builder
         **/
        public Builder makeModel(String makeModel) {
            this.makeModel = makeModel;
            this.__explicitlySet__.add("makeModel");
            return this;
        }
        /**
         * The CPU count of the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        /**
         * The CPU count of the Exadata storage server.
         * @param cpuCount the value to set
         * @return this builder
         **/
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }
        /**
         * The memory size in GB of the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
        private Double memoryGB;

        /**
         * The memory size in GB of the Exadata storage server.
         * @param memoryGB the value to set
         * @return this builder
         **/
        public Builder memoryGB(Double memoryGB) {
            this.memoryGB = memoryGB;
            this.__explicitlySet__.add("memoryGB");
            return this;
        }
        /**
         * The name of the Exadata storage server connector in case of rediscovery.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
        private String connectorName;

        /**
         * The name of the Exadata storage server connector in case of rediscovery.
         * @param connectorName the value to set
         * @return this builder
         **/
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            this.__explicitlySet__.add("connectorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalStorageServerDiscoverySummary build() {
            ExternalStorageServerDiscoverySummary model =
                    new ExternalStorageServerDiscoverySummary(
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
                            this.ipAddress,
                            this.makeModel,
                            this.cpuCount,
                            this.memoryGB,
                            this.connectorName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalStorageServerDiscoverySummary model) {
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
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("makeModel")) {
                this.makeModel(model.getMakeModel());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("memoryGB")) {
                this.memoryGB(model.getMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("connectorName")) {
                this.connectorName(model.getConnectorName());
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

    @Deprecated
    public ExternalStorageServerDiscoverySummary(
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
            String ipAddress,
            String makeModel,
            Integer cpuCount,
            Double memoryGB,
            String connectorName) {
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
        this.ipAddress = ipAddress;
        this.makeModel = makeModel;
        this.cpuCount = cpuCount;
        this.memoryGB = memoryGB;
        this.connectorName = connectorName;
    }

    /**
     * The IP address of the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the Exadata storage server.
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * The make model of the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("makeModel")
    private final String makeModel;

    /**
     * The make model of the Exadata storage server.
     * @return the value
     **/
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * The CPU count of the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final Integer cpuCount;

    /**
     * The CPU count of the Exadata storage server.
     * @return the value
     **/
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * The memory size in GB of the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
    private final Double memoryGB;

    /**
     * The memory size in GB of the Exadata storage server.
     * @return the value
     **/
    public Double getMemoryGB() {
        return memoryGB;
    }

    /**
     * The name of the Exadata storage server connector in case of rediscovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
    private final String connectorName;

    /**
     * The name of the Exadata storage server connector in case of rediscovery.
     * @return the value
     **/
    public String getConnectorName() {
        return connectorName;
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
        sb.append("ExternalStorageServerDiscoverySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", makeModel=").append(String.valueOf(this.makeModel));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", memoryGB=").append(String.valueOf(this.memoryGB));
        sb.append(", connectorName=").append(String.valueOf(this.connectorName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalStorageServerDiscoverySummary)) {
            return false;
        }

        ExternalStorageServerDiscoverySummary other = (ExternalStorageServerDiscoverySummary) o;
        return java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.makeModel, other.makeModel)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.memoryGB, other.memoryGB)
                && java.util.Objects.equals(this.connectorName, other.connectorName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.makeModel == null ? 43 : this.makeModel.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.memoryGB == null ? 43 : this.memoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorName == null ? 43 : this.connectorName.hashCode());
        return result;
    }
}

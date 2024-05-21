/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Details of global service manager(GSM also known as shard director) instances for sharded database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GsmDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GsmDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "computeCount",
        "dataStorageSizeInGbs",
        "timeCreated",
        "timeUpdated",
        "timeSslCertificateExpires",
        "status",
        "supportingResourceId",
        "metadata"
    })
    public GsmDetails(
            String name,
            Float computeCount,
            Double dataStorageSizeInGbs,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeSslCertificateExpires,
            Status status,
            String supportingResourceId,
            java.util.Map<String, Object> metadata) {
        super();
        this.name = name;
        this.computeCount = computeCount;
        this.dataStorageSizeInGbs = dataStorageSizeInGbs;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeSslCertificateExpires = timeSslCertificateExpires;
        this.status = status;
        this.supportingResourceId = supportingResourceId;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the GSM instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the GSM instance
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The compute count for the GSM instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute count for the GSM instance.
         * @param computeCount the value to set
         * @return this builder
         **/
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The data disk group size to be allocated in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
        private Double dataStorageSizeInGbs;

        /**
         * The data disk group size to be allocated in GBs.
         * @param dataStorageSizeInGbs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGbs(Double dataStorageSizeInGbs) {
            this.dataStorageSizeInGbs = dataStorageSizeInGbs;
            this.__explicitlySet__.add("dataStorageSizeInGbs");
            return this;
        }
        /**
         * The time the GSM instance was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the GSM instance was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the GSM instance was last updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the GSM instance was last updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the ssl certificate associated with GSM expires. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeSslCertificateExpires")
        private java.util.Date timeSslCertificateExpires;

        /**
         * The time the ssl certificate associated with GSM expires. An RFC3339 formatted datetime string
         * @param timeSslCertificateExpires the value to set
         * @return this builder
         **/
        public Builder timeSslCertificateExpires(java.util.Date timeSslCertificateExpires) {
            this.timeSslCertificateExpires = timeSslCertificateExpires;
            this.__explicitlySet__.add("timeSslCertificateExpires");
            return this;
        }
        /**
         * Status of shard or catalog or gsm for the sharded database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of shard or catalog or gsm for the sharded database.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Identifier of the underlying supporting resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
        private String supportingResourceId;

        /**
         * Identifier of the underlying supporting resource.
         *
         * @param supportingResourceId the value to set
         * @return this builder
         **/
        public Builder supportingResourceId(String supportingResourceId) {
            this.supportingResourceId = supportingResourceId;
            this.__explicitlySet__.add("supportingResourceId");
            return this;
        }
        /**
         * Additional metadata related to GSM's underlying supporting resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        /**
         * Additional metadata related to GSM's underlying supporting resource.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GsmDetails build() {
            GsmDetails model =
                    new GsmDetails(
                            this.name,
                            this.computeCount,
                            this.dataStorageSizeInGbs,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeSslCertificateExpires,
                            this.status,
                            this.supportingResourceId,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GsmDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGbs")) {
                this.dataStorageSizeInGbs(model.getDataStorageSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeSslCertificateExpires")) {
                this.timeSslCertificateExpires(model.getTimeSslCertificateExpires());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("supportingResourceId")) {
                this.supportingResourceId(model.getSupportingResourceId());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * Name of the GSM instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the GSM instance
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The compute count for the GSM instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute count for the GSM instance.
     * @return the value
     **/
    public Float getComputeCount() {
        return computeCount;
    }

    /**
     * The data disk group size to be allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
    private final Double dataStorageSizeInGbs;

    /**
     * The data disk group size to be allocated in GBs.
     * @return the value
     **/
    public Double getDataStorageSizeInGbs() {
        return dataStorageSizeInGbs;
    }

    /**
     * The time the GSM instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the GSM instance was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the GSM instance was last updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the GSM instance was last updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the ssl certificate associated with GSM expires. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSslCertificateExpires")
    private final java.util.Date timeSslCertificateExpires;

    /**
     * The time the ssl certificate associated with GSM expires. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeSslCertificateExpires() {
        return timeSslCertificateExpires;
    }

    /**
     * Status of shard or catalog or gsm for the sharded database.
     **/
    public enum Status {
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Created("CREATED"),
        ReadyForConfiguration("READY_FOR_CONFIGURATION"),
        Configured("CONFIGURED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of shard or catalog or gsm for the sharded database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of shard or catalog or gsm for the sharded database.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Identifier of the underlying supporting resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
    private final String supportingResourceId;

    /**
     * Identifier of the underlying supporting resource.
     *
     * @return the value
     **/
    public String getSupportingResourceId() {
        return supportingResourceId;
    }

    /**
     * Additional metadata related to GSM's underlying supporting resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

    /**
     * Additional metadata related to GSM's underlying supporting resource.
     * @return the value
     **/
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
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
        sb.append("GsmDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", dataStorageSizeInGbs=").append(String.valueOf(this.dataStorageSizeInGbs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeSslCertificateExpires=")
                .append(String.valueOf(this.timeSslCertificateExpires));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", supportingResourceId=").append(String.valueOf(this.supportingResourceId));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GsmDetails)) {
            return false;
        }

        GsmDetails other = (GsmDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.dataStorageSizeInGbs, other.dataStorageSizeInGbs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.timeSslCertificateExpires, other.timeSslCertificateExpires)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.supportingResourceId, other.supportingResourceId)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGbs == null
                                ? 43
                                : this.dataStorageSizeInGbs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSslCertificateExpires == null
                                ? 43
                                : this.timeSslCertificateExpires.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.supportingResourceId == null
                                ? 43
                                : this.supportingResourceId.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

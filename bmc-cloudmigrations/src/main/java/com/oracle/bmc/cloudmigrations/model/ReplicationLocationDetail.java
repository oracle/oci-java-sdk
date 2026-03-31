/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Replication location detail where the snapshots reside
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplicationLocationDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicationLocationDetail
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"replicationLocationType", "metadata"})
    public ReplicationLocationDetail(
            ReplicationLocationType replicationLocationType, Object metadata) {
        super();
        this.replicationLocationType = replicationLocationType;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of replication location
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationLocationType")
        private ReplicationLocationType replicationLocationType;

        /**
         * The type of replication location
         * @param replicationLocationType the value to set
         * @return this builder
         **/
        public Builder replicationLocationType(ReplicationLocationType replicationLocationType) {
            this.replicationLocationType = replicationLocationType;
            this.__explicitlySet__.add("replicationLocationType");
            return this;
        }
        /**
         * Properties for each of the replication location types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private Object metadata;

        /**
         * Properties for each of the replication location types
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationLocationDetail build() {
            ReplicationLocationDetail model =
                    new ReplicationLocationDetail(this.replicationLocationType, this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationLocationDetail model) {
            if (model.wasPropertyExplicitlySet("replicationLocationType")) {
                this.replicationLocationType(model.getReplicationLocationType());
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
     * The type of replication location
     **/
    public enum ReplicationLocationType {
        OciObjectStore("OCI_OBJECT_STORE"),
        OlvmStorageDomain("OLVM_STORAGE_DOMAIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReplicationLocationType.class);

        private final String value;
        private static java.util.Map<String, ReplicationLocationType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReplicationLocationType v : ReplicationLocationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReplicationLocationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReplicationLocationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReplicationLocationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of replication location
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationLocationType")
    private final ReplicationLocationType replicationLocationType;

    /**
     * The type of replication location
     * @return the value
     **/
    public ReplicationLocationType getReplicationLocationType() {
        return replicationLocationType;
    }

    /**
     * Properties for each of the replication location types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final Object metadata;

    /**
     * Properties for each of the replication location types
     * @return the value
     **/
    public Object getMetadata() {
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
        sb.append("ReplicationLocationDetail(");
        sb.append("super=").append(super.toString());
        sb.append("replicationLocationType=").append(String.valueOf(this.replicationLocationType));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationLocationDetail)) {
            return false;
        }

        ReplicationLocationDetail other = (ReplicationLocationDetail) o;
        return java.util.Objects.equals(this.replicationLocationType, other.replicationLocationType)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.replicationLocationType == null
                                ? 43
                                : this.replicationLocationType.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

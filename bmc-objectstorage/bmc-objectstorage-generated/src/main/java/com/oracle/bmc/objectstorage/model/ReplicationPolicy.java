/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details of a replication policy.
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
    builder = ReplicationPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicationPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "destinationRegionName",
        "destinationBucketName",
        "timeCreated",
        "timeLastSync",
        "status",
        "statusMessage"
    })
    public ReplicationPolicy(
            String id,
            String name,
            String destinationRegionName,
            String destinationBucketName,
            java.util.Date timeCreated,
            java.util.Date timeLastSync,
            Status status,
            String statusMessage) {
        super();
        this.id = id;
        this.name = name;
        this.destinationRegionName = destinationRegionName;
        this.destinationBucketName = destinationBucketName;
        this.timeCreated = timeCreated;
        this.timeLastSync = timeLastSync;
        this.status = status;
        this.statusMessage = statusMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the replication policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the replication policy.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the policy.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The destination region to replicate to, for example "us-ashburn-1".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
        private String destinationRegionName;

        /**
         * The destination region to replicate to, for example "us-ashburn-1".
         * @param destinationRegionName the value to set
         * @return this builder
         **/
        public Builder destinationRegionName(String destinationRegionName) {
            this.destinationRegionName = destinationRegionName;
            this.__explicitlySet__.add("destinationRegionName");
            return this;
        }
        /**
         * The bucket to replicate to in the destination region. Replication policy creation does not automatically
         * create a destination bucket. Create the destination bucket before creating the policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
        private String destinationBucketName;

        /**
         * The bucket to replicate to in the destination region. Replication policy creation does not automatically
         * create a destination bucket. Create the destination bucket before creating the policy.
         *
         * @param destinationBucketName the value to set
         * @return this builder
         **/
        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            this.__explicitlySet__.add("destinationBucketName");
            return this;
        }
        /**
         * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Changes made to the source bucket before this time has been replicated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSync")
        private java.util.Date timeLastSync;

        /**
         * Changes made to the source bucket before this time has been replicated.
         *
         * @param timeLastSync the value to set
         * @return this builder
         **/
        public Builder timeLastSync(java.util.Date timeLastSync) {
            this.timeLastSync = timeLastSync;
            this.__explicitlySet__.add("timeLastSync");
            return this;
        }
        /**
         * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
         * described in the status message, the status will become ACTIVE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
         * described in the status message, the status will become ACTIVE.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * A human-readable description of the status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        /**
         * A human-readable description of the status.
         * @param statusMessage the value to set
         * @return this builder
         **/
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationPolicy build() {
            ReplicationPolicy model =
                    new ReplicationPolicy(
                            this.id,
                            this.name,
                            this.destinationRegionName,
                            this.destinationBucketName,
                            this.timeCreated,
                            this.timeLastSync,
                            this.status,
                            this.statusMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationPolicy model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("destinationRegionName")) {
                this.destinationRegionName(model.getDestinationRegionName());
            }
            if (model.wasPropertyExplicitlySet("destinationBucketName")) {
                this.destinationBucketName(model.getDestinationBucketName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSync")) {
                this.timeLastSync(model.getTimeLastSync());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusMessage")) {
                this.statusMessage(model.getStatusMessage());
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
     * The id of the replication policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the replication policy.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the policy.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The destination region to replicate to, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
    private final String destinationRegionName;

    /**
     * The destination region to replicate to, for example "us-ashburn-1".
     * @return the value
     **/
    public String getDestinationRegionName() {
        return destinationRegionName;
    }

    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically
     * create a destination bucket. Create the destination bucket before creating the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
    private final String destinationBucketName;

    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically
     * create a destination bucket. Create the destination bucket before creating the policy.
     *
     * @return the value
     **/
    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    /**
     * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Changes made to the source bucket before this time has been replicated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSync")
    private final java.util.Date timeLastSync;

    /**
     * Changes made to the source bucket before this time has been replicated.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSync() {
        return timeLastSync;
    }

    /**
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
     * described in the status message, the status will become ACTIVE.
     *
     **/
    public enum Status {
        Active("ACTIVE"),
        ClientError("CLIENT_ERROR"),

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
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
     * described in the status message, the status will become ACTIVE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
     * described in the status message, the status will become ACTIVE.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * A human-readable description of the status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    private final String statusMessage;

    /**
     * A human-readable description of the status.
     * @return the value
     **/
    public String getStatusMessage() {
        return statusMessage;
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
        sb.append("ReplicationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", destinationRegionName=").append(String.valueOf(this.destinationRegionName));
        sb.append(", destinationBucketName=").append(String.valueOf(this.destinationBucketName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastSync=").append(String.valueOf(this.timeLastSync));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationPolicy)) {
            return false;
        }

        ReplicationPolicy other = (ReplicationPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.destinationRegionName, other.destinationRegionName)
                && java.util.Objects.equals(this.destinationBucketName, other.destinationBucketName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastSync, other.timeLastSync)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusMessage, other.statusMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationRegionName == null
                                ? 43
                                : this.destinationRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucketName == null
                                ? 43
                                : this.destinationBucketName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeLastSync == null ? 43 : this.timeLastSync.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

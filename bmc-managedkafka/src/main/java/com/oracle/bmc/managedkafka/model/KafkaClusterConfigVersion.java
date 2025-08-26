/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * A shared configuration object used by 0 or more kafka clusters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KafkaClusterConfigVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KafkaClusterConfigVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configId", "versionNumber", "timeCreated", "properties"})
    public KafkaClusterConfigVersion(
            String configId,
            Integer versionNumber,
            java.util.Date timeCreated,
            java.util.Map<String, String> properties) {
        super();
        this.configId = configId;
        this.versionNumber = versionNumber;
        this.timeCreated = timeCreated;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID cluster configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * ID cluster configuration
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }
        /** Version of the cluster configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Integer versionNumber;

        /**
         * Version of the cluster configuration
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }
        /**
         * The date and time the KafkaClusterConfigVersion was created, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the KafkaClusterConfigVersion was created, in the format defined by
         * [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Cluster configuration key-value pairs */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        /**
         * Cluster configuration key-value pairs
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KafkaClusterConfigVersion build() {
            KafkaClusterConfigVersion model =
                    new KafkaClusterConfigVersion(
                            this.configId, this.versionNumber, this.timeCreated, this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaClusterConfigVersion model) {
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** ID cluster configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * ID cluster configuration
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
    }

    /** Version of the cluster configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Integer versionNumber;

    /**
     * Version of the cluster configuration
     *
     * @return the value
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * The date and time the KafkaClusterConfigVersion was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the KafkaClusterConfigVersion was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Cluster configuration key-value pairs */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

    /**
     * Cluster configuration key-value pairs
     *
     * @return the value
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
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
        sb.append("KafkaClusterConfigVersion(");
        sb.append("super=").append(super.toString());
        sb.append("configId=").append(String.valueOf(this.configId));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaClusterConfigVersion)) {
            return false;
        }

        KafkaClusterConfigVersion other = (KafkaClusterConfigVersion) o;
        return java.util.Objects.equals(this.configId, other.configId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

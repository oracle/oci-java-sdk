/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute global image capability schema
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
    builder = ComputeGlobalImageCapabilitySchemaVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeGlobalImageCapabilitySchemaVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "computeGlobalImageCapabilitySchemaId",
        "displayName",
        "timeCreated"
    })
    public ComputeGlobalImageCapabilitySchemaVersionSummary(
            String name,
            String computeGlobalImageCapabilitySchemaId,
            String displayName,
            java.util.Date timeCreated) {
        super();
        this.name = name;
        this.computeGlobalImageCapabilitySchemaId = computeGlobalImageCapabilitySchemaId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compute global image capability schema version name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The compute global image capability schema version name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the compute global image capability schema
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaId")
        private String computeGlobalImageCapabilitySchemaId;

        /**
         * The OCID of the compute global image capability schema
         *
         * @param computeGlobalImageCapabilitySchemaId the value to set
         * @return this builder
         **/
        public Builder computeGlobalImageCapabilitySchemaId(
                String computeGlobalImageCapabilitySchemaId) {
            this.computeGlobalImageCapabilitySchemaId = computeGlobalImageCapabilitySchemaId;
            this.__explicitlySet__.add("computeGlobalImageCapabilitySchemaId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the compute global image capability schema version was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the compute global image capability schema version was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeGlobalImageCapabilitySchemaVersionSummary build() {
            ComputeGlobalImageCapabilitySchemaVersionSummary model =
                    new ComputeGlobalImageCapabilitySchemaVersionSummary(
                            this.name,
                            this.computeGlobalImageCapabilitySchemaId,
                            this.displayName,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeGlobalImageCapabilitySchemaVersionSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("computeGlobalImageCapabilitySchemaId")) {
                this.computeGlobalImageCapabilitySchemaId(
                        model.getComputeGlobalImageCapabilitySchemaId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The compute global image capability schema version name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The compute global image capability schema version name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the compute global image capability schema
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeGlobalImageCapabilitySchemaId")
    private final String computeGlobalImageCapabilitySchemaId;

    /**
     * The OCID of the compute global image capability schema
     *
     * @return the value
     **/
    public String getComputeGlobalImageCapabilitySchemaId() {
        return computeGlobalImageCapabilitySchemaId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the compute global image capability schema version was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the compute global image capability schema version was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ComputeGlobalImageCapabilitySchemaVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", computeGlobalImageCapabilitySchemaId=")
                .append(String.valueOf(this.computeGlobalImageCapabilitySchemaId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeGlobalImageCapabilitySchemaVersionSummary)) {
            return false;
        }

        ComputeGlobalImageCapabilitySchemaVersionSummary other =
                (ComputeGlobalImageCapabilitySchemaVersionSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.computeGlobalImageCapabilitySchemaId,
                        other.computeGlobalImageCapabilitySchemaId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.computeGlobalImageCapabilitySchemaId == null
                                ? 43
                                : this.computeGlobalImageCapabilitySchemaId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Additional metadata related to Globally distributed autonomous database resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedAutonomousDbMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedAutonomousDbMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"map"})
    public DistributedAutonomousDbMetadata(java.util.Map<String, String> map) {
        super();
        this.map = map;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The map containing key-value pair of additional metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("map")
        private java.util.Map<String, String> map;

        /**
         * The map containing key-value pair of additional metadata.
         *
         * @param map the value to set
         * @return this builder
         */
        public Builder map(java.util.Map<String, String> map) {
            this.map = map;
            this.__explicitlySet__.add("map");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedAutonomousDbMetadata build() {
            DistributedAutonomousDbMetadata model = new DistributedAutonomousDbMetadata(this.map);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedAutonomousDbMetadata model) {
            if (model.wasPropertyExplicitlySet("map")) {
                this.map(model.getMap());
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

    /** The map containing key-value pair of additional metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("map")
    private final java.util.Map<String, String> map;

    /**
     * The map containing key-value pair of additional metadata.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMap() {
        return map;
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
        sb.append("DistributedAutonomousDbMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("map=").append(String.valueOf(this.map));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedAutonomousDbMetadata)) {
            return false;
        }

        DistributedAutonomousDbMetadata other = (DistributedAutonomousDbMetadata) o;
        return java.util.Objects.equals(this.map, other.map) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.map == null ? 43 : this.map.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

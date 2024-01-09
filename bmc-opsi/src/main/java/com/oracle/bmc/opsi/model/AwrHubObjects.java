/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Awr Hub Object operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrHubObjects.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrHubObjects extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"awrSnapshots"})
    public AwrHubObjects(Object awrSnapshots) {
        super();
        this.awrSnapshots = awrSnapshots;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Awr Hub Object. */
        @com.fasterxml.jackson.annotation.JsonProperty("awrSnapshots")
        private Object awrSnapshots;

        /**
         * Awr Hub Object.
         *
         * @param awrSnapshots the value to set
         * @return this builder
         */
        public Builder awrSnapshots(Object awrSnapshots) {
            this.awrSnapshots = awrSnapshots;
            this.__explicitlySet__.add("awrSnapshots");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrHubObjects build() {
            AwrHubObjects model = new AwrHubObjects(this.awrSnapshots);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrHubObjects model) {
            if (model.wasPropertyExplicitlySet("awrSnapshots")) {
                this.awrSnapshots(model.getAwrSnapshots());
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

    /** Awr Hub Object. */
    @com.fasterxml.jackson.annotation.JsonProperty("awrSnapshots")
    private final Object awrSnapshots;

    /**
     * Awr Hub Object.
     *
     * @return the value
     */
    public Object getAwrSnapshots() {
        return awrSnapshots;
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
        sb.append("AwrHubObjects(");
        sb.append("super=").append(super.toString());
        sb.append("awrSnapshots=").append(String.valueOf(this.awrSnapshots));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrHubObjects)) {
            return false;
        }

        AwrHubObjects other = (AwrHubObjects) o;
        return java.util.Objects.equals(this.awrSnapshots, other.awrSnapshots)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.awrSnapshots == null ? 43 : this.awrSnapshots.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

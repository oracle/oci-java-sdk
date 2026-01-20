/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Awr Hub Source operations. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrHubSources.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrHubSources extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"awrHubSources"})
    public AwrHubSources(Object awrHubSources) {
        super();
        this.awrHubSources = awrHubSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Awr Hub Source Object. */
        @com.fasterxml.jackson.annotation.JsonProperty("awrHubSources")
        private Object awrHubSources;

        /**
         * Awr Hub Source Object.
         *
         * @param awrHubSources the value to set
         * @return this builder
         */
        public Builder awrHubSources(Object awrHubSources) {
            this.awrHubSources = awrHubSources;
            this.__explicitlySet__.add("awrHubSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrHubSources build() {
            AwrHubSources model = new AwrHubSources(this.awrHubSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrHubSources model) {
            if (model.wasPropertyExplicitlySet("awrHubSources")) {
                this.awrHubSources(model.getAwrHubSources());
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

    /** Awr Hub Source Object. */
    @com.fasterxml.jackson.annotation.JsonProperty("awrHubSources")
    private final Object awrHubSources;

    /**
     * Awr Hub Source Object.
     *
     * @return the value
     */
    public Object getAwrHubSources() {
        return awrHubSources;
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
        sb.append("AwrHubSources(");
        sb.append("super=").append(super.toString());
        sb.append("awrHubSources=").append(String.valueOf(this.awrHubSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrHubSources)) {
            return false;
        }

        AwrHubSources other = (AwrHubSources) o;
        return java.util.Objects.equals(this.awrHubSources, other.awrHubSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.awrHubSources == null ? 43 : this.awrHubSources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

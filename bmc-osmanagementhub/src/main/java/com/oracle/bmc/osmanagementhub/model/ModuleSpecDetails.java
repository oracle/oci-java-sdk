/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Details about a specific appstream module. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ModuleSpecDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleSpecDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "stream", "profile"})
    public ModuleSpecDetails(String name, String stream, String profile) {
        super();
        this.name = name;
        this.stream = stream;
        this.profile = profile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the module.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The stream of the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("stream")
        private String stream;

        /**
         * The stream of the module.
         *
         * @param stream the value to set
         * @return this builder
         */
        public Builder stream(String stream) {
            this.stream = stream;
            this.__explicitlySet__.add("stream");
            return this;
        }
        /** The module profile to be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

        /**
         * The module profile to be used.
         *
         * @param profile the value to set
         * @return this builder
         */
        public Builder profile(String profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleSpecDetails build() {
            ModuleSpecDetails model = new ModuleSpecDetails(this.name, this.stream, this.profile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleSpecDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("stream")) {
                this.stream(model.getStream());
            }
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
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

    /** Name of the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the module.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The stream of the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("stream")
    private final String stream;

    /**
     * The stream of the module.
     *
     * @return the value
     */
    public String getStream() {
        return stream;
    }

    /** The module profile to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final String profile;

    /**
     * The module profile to be used.
     *
     * @return the value
     */
    public String getProfile() {
        return profile;
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
        sb.append("ModuleSpecDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", stream=").append(String.valueOf(this.stream));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleSpecDetails)) {
            return false;
        }

        ModuleSpecDetails other = (ModuleSpecDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.stream, other.stream)
                && java.util.Objects.equals(this.profile, other.profile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.stream == null ? 43 : this.stream.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Summary information pertaining to a module stream profile provided by a software source <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ModuleStreamProfileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleStreamProfileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"moduleName", "streamName", "profileName"})
    public ModuleStreamProfileSummary(String moduleName, String streamName, String profileName) {
        super();
        this.moduleName = moduleName;
        this.streamName = streamName;
        this.profileName = profileName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the module that contains the stream profile */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * The name of the module that contains the stream profile
         *
         * @param moduleName the value to set
         * @return this builder
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /** The name of the stream that contains the profile */
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * The name of the stream that contains the profile
         *
         * @param streamName the value to set
         * @return this builder
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /** The name of the profile */
        @com.fasterxml.jackson.annotation.JsonProperty("profileName")
        private String profileName;

        /**
         * The name of the profile
         *
         * @param profileName the value to set
         * @return this builder
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            this.__explicitlySet__.add("profileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamProfileSummary build() {
            ModuleStreamProfileSummary model =
                    new ModuleStreamProfileSummary(
                            this.moduleName, this.streamName, this.profileName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamProfileSummary model) {
            if (model.wasPropertyExplicitlySet("moduleName")) {
                this.moduleName(model.getModuleName());
            }
            if (model.wasPropertyExplicitlySet("streamName")) {
                this.streamName(model.getStreamName());
            }
            if (model.wasPropertyExplicitlySet("profileName")) {
                this.profileName(model.getProfileName());
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

    /** The name of the module that contains the stream profile */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * The name of the module that contains the stream profile
     *
     * @return the value
     */
    public String getModuleName() {
        return moduleName;
    }

    /** The name of the stream that contains the profile */
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * The name of the stream that contains the profile
     *
     * @return the value
     */
    public String getStreamName() {
        return streamName;
    }

    /** The name of the profile */
    @com.fasterxml.jackson.annotation.JsonProperty("profileName")
    private final String profileName;

    /**
     * The name of the profile
     *
     * @return the value
     */
    public String getProfileName() {
        return profileName;
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
        sb.append("ModuleStreamProfileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", streamName=").append(String.valueOf(this.streamName));
        sb.append(", profileName=").append(String.valueOf(this.profileName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStreamProfileSummary)) {
            return false;
        }

        ModuleStreamProfileSummary other = (ModuleStreamProfileSummary) o;
        return java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

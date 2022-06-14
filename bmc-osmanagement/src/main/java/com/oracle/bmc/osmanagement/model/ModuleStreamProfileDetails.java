/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Updatable information for a module stream profile
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModuleStreamProfileDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModuleStreamProfileDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"moduleName", "streamName", "profileName"})
    public ModuleStreamProfileDetails(String moduleName, String streamName, String profileName) {
        super();
        this.moduleName = moduleName;
        this.streamName = streamName;
        this.profileName = profileName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of a module
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * The name of a module
         * @param moduleName the value to set
         * @return this builder
         **/
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /**
         * The name of a stream of the specified module
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * The name of a stream of the specified module
         * @param streamName the value to set
         * @return this builder
         **/
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /**
         * The name of a profile of the specified module stream
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profileName")
        private String profileName;

        /**
         * The name of a profile of the specified module stream
         * @param profileName the value to set
         * @return this builder
         **/
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            this.__explicitlySet__.add("profileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamProfileDetails build() {
            ModuleStreamProfileDetails __instance__ =
                    new ModuleStreamProfileDetails(moduleName, streamName, profileName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamProfileDetails o) {
            Builder copiedBuilder =
                    moduleName(o.getModuleName())
                            .streamName(o.getStreamName())
                            .profileName(o.getProfileName());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The name of a module
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * The name of a module
     * @return the value
     **/
    public String getModuleName() {
        return moduleName;
    }

    /**
     * The name of a stream of the specified module
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * The name of a stream of the specified module
     * @return the value
     **/
    public String getStreamName() {
        return streamName;
    }

    /**
     * The name of a profile of the specified module stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profileName")
    private final String profileName;

    /**
     * The name of a profile of the specified module stream
     * @return the value
     **/
    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ModuleStreamProfileDetails(");
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", streamName=").append(String.valueOf(this.streamName));
        sb.append(", profileName=").append(String.valueOf(this.profileName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStreamProfileDetails)) {
            return false;
        }

        ModuleStreamProfileDetails other = (ModuleStreamProfileDetails) o;
        return java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

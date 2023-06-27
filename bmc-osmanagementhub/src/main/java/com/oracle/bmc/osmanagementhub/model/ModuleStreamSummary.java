/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Summary information pertaining to a module stream provided by a software source. <br>
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
        builder = ModuleStreamSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleStreamSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "moduleName",
        "profiles",
        "isLatest",
        "softwareSourceId"
    })
    public ModuleStreamSummary(
            String name,
            String moduleName,
            java.util.List<String> profiles,
            Boolean isLatest,
            String softwareSourceId) {
        super();
        this.name = name;
        this.moduleName = moduleName;
        this.profiles = profiles;
        this.isLatest = isLatest;
        this.softwareSourceId = softwareSourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the stream.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the module that contains the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * The name of the module that contains the stream.
         *
         * @param moduleName the value to set
         * @return this builder
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /** List of profiles in the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<String> profiles;

        /**
         * List of profiles in the stream.
         *
         * @param profiles the value to set
         * @return this builder
         */
        public Builder profiles(java.util.List<String> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }
        /** Indicates whether this module stream is the latest. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
        private Boolean isLatest;

        /**
         * Indicates whether this module stream is the latest.
         *
         * @param isLatest the value to set
         * @return this builder
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            this.__explicitlySet__.add("isLatest");
            return this;
        }
        /** The software source id for the the module stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The software source id for the the module stream.
         *
         * @param softwareSourceId the value to set
         * @return this builder
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamSummary build() {
            ModuleStreamSummary model =
                    new ModuleStreamSummary(
                            this.name,
                            this.moduleName,
                            this.profiles,
                            this.isLatest,
                            this.softwareSourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("moduleName")) {
                this.moduleName(model.getModuleName());
            }
            if (model.wasPropertyExplicitlySet("profiles")) {
                this.profiles(model.getProfiles());
            }
            if (model.wasPropertyExplicitlySet("isLatest")) {
                this.isLatest(model.getIsLatest());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
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

    /** The name of the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the stream.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the module that contains the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * The name of the module that contains the stream.
     *
     * @return the value
     */
    public String getModuleName() {
        return moduleName;
    }

    /** List of profiles in the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<String> profiles;

    /**
     * List of profiles in the stream.
     *
     * @return the value
     */
    public java.util.List<String> getProfiles() {
        return profiles;
    }

    /** Indicates whether this module stream is the latest. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
    private final Boolean isLatest;

    /**
     * Indicates whether this module stream is the latest.
     *
     * @return the value
     */
    public Boolean getIsLatest() {
        return isLatest;
    }

    /** The software source id for the the module stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The software source id for the the module stream.
     *
     * @return the value
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
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
        sb.append("ModuleStreamSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append(", isLatest=").append(String.valueOf(this.isLatest));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStreamSummary)) {
            return false;
        }

        ModuleStreamSummary other = (ModuleStreamSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

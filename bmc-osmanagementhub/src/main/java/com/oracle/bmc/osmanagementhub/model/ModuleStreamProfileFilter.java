/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Used to select module stream/profiles from VendorSoftwareSources to create/update
 * CustomSoftwareSources. <br>
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
        builder = ModuleStreamProfileFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleStreamProfileFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"moduleName", "profileName", "streamName", "filterType"})
    public ModuleStreamProfileFilter(
            String moduleName, String profileName, String streamName, FilterType filterType) {
        super();
        this.moduleName = moduleName;
        this.profileName = profileName;
        this.streamName = streamName;
        this.filterType = filterType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Module name. */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * Module name.
         *
         * @param moduleName the value to set
         * @return this builder
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /** Profile name. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileName")
        private String profileName;

        /**
         * Profile name.
         *
         * @param profileName the value to set
         * @return this builder
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            this.__explicitlySet__.add("profileName");
            return this;
        }
        /** Stream name. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * Stream name.
         *
         * @param streamName the value to set
         * @return this builder
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /** The type of the filter, which can be of two types - INCLUDE or EXCLUDE. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private FilterType filterType;

        /**
         * The type of the filter, which can be of two types - INCLUDE or EXCLUDE.
         *
         * @param filterType the value to set
         * @return this builder
         */
        public Builder filterType(FilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStreamProfileFilter build() {
            ModuleStreamProfileFilter model =
                    new ModuleStreamProfileFilter(
                            this.moduleName, this.profileName, this.streamName, this.filterType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStreamProfileFilter model) {
            if (model.wasPropertyExplicitlySet("moduleName")) {
                this.moduleName(model.getModuleName());
            }
            if (model.wasPropertyExplicitlySet("profileName")) {
                this.profileName(model.getProfileName());
            }
            if (model.wasPropertyExplicitlySet("streamName")) {
                this.streamName(model.getStreamName());
            }
            if (model.wasPropertyExplicitlySet("filterType")) {
                this.filterType(model.getFilterType());
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

    /** Module name. */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * Module name.
     *
     * @return the value
     */
    public String getModuleName() {
        return moduleName;
    }

    /** Profile name. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileName")
    private final String profileName;

    /**
     * Profile name.
     *
     * @return the value
     */
    public String getProfileName() {
        return profileName;
    }

    /** Stream name. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * Stream name.
     *
     * @return the value
     */
    public String getStreamName() {
        return streamName;
    }

    /** The type of the filter, which can be of two types - INCLUDE or EXCLUDE. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final FilterType filterType;

    /**
     * The type of the filter, which can be of two types - INCLUDE or EXCLUDE.
     *
     * @return the value
     */
    public FilterType getFilterType() {
        return filterType;
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
        sb.append("ModuleStreamProfileFilter(");
        sb.append("super=").append(super.toString());
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", profileName=").append(String.valueOf(this.profileName));
        sb.append(", streamName=").append(String.valueOf(this.streamName));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStreamProfileFilter)) {
            return false;
        }

        ModuleStreamProfileFilter other = (ModuleStreamProfileFilter) o;
        return java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.filterType, other.filterType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

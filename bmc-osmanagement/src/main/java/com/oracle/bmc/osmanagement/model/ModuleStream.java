/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A module stream provided by a software source
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModuleStream.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModuleStream extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "moduleName",
        "streamName",
        "isDefault",
        "softwareSourceId",
        "architecture",
        "description",
        "profiles",
        "packages"
    })
    public ModuleStream(
            String moduleName,
            String streamName,
            Boolean isDefault,
            String softwareSourceId,
            String architecture,
            String description,
            java.util.List<String> profiles,
            java.util.List<String> packages) {
        super();
        this.moduleName = moduleName;
        this.streamName = streamName;
        this.isDefault = isDefault;
        this.softwareSourceId = softwareSourceId;
        this.architecture = architecture;
        this.description = description;
        this.profiles = profiles;
        this.packages = packages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the module that contains the stream
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
        private String moduleName;

        /**
         * The name of the module that contains the stream
         * @param moduleName the value to set
         * @return this builder
         **/
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            this.__explicitlySet__.add("moduleName");
            return this;
        }
        /**
         * The name of the stream
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streamName")
        private String streamName;

        /**
         * The name of the stream
         * @param streamName the value to set
         * @return this builder
         **/
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            this.__explicitlySet__.add("streamName");
            return this;
        }
        /**
         * Indicates if this stream is the default for its module.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates if this stream is the default for its module.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * The OCID of the software source that provides this module stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The OCID of the software source that provides this module stream.
         * @param softwareSourceId the value to set
         * @return this builder
         **/
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }
        /**
         * The architecture for which the packages in this module stream were built
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture for which the packages in this module stream were built
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * A description of the contents of the module stream
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the contents of the module stream
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A list of profiles that are part of the stream.  Each element in
         * the list is the name of a profile.  The name is suitable to use as
         * an argument to other OS Management APIs that interact directly with
         * module stream profiles.  However, it is not URL encoded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<String> profiles;

        /**
         * A list of profiles that are part of the stream.  Each element in
         * the list is the name of a profile.  The name is suitable to use as
         * an argument to other OS Management APIs that interact directly with
         * module stream profiles.  However, it is not URL encoded.
         *
         * @param profiles the value to set
         * @return this builder
         **/
        public Builder profiles(java.util.List<String> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }
        /**
         * A list of packages that are contained by the stream.  Each element
         * in the list is the name of a package.  The name is suitable to use
         * as an argument to other OS Management APIs that interact directly
         * with packages.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * A list of packages that are contained by the stream.  Each element
         * in the list is the name of a package.  The name is suitable to use
         * as an argument to other OS Management APIs that interact directly
         * with packages.
         *
         * @param packages the value to set
         * @return this builder
         **/
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStream build() {
            ModuleStream model =
                    new ModuleStream(
                            this.moduleName,
                            this.streamName,
                            this.isDefault,
                            this.softwareSourceId,
                            this.architecture,
                            this.description,
                            this.profiles,
                            this.packages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModuleStream model) {
            if (model.wasPropertyExplicitlySet("moduleName")) {
                this.moduleName(model.getModuleName());
            }
            if (model.wasPropertyExplicitlySet("streamName")) {
                this.streamName(model.getStreamName());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("profiles")) {
                this.profiles(model.getProfiles());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
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
     * The name of the module that contains the stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
    private final String moduleName;

    /**
     * The name of the module that contains the stream
     * @return the value
     **/
    public String getModuleName() {
        return moduleName;
    }

    /**
     * The name of the stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streamName")
    private final String streamName;

    /**
     * The name of the stream
     * @return the value
     **/
    public String getStreamName() {
        return streamName;
    }

    /**
     * Indicates if this stream is the default for its module.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates if this stream is the default for its module.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The OCID of the software source that provides this module stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The OCID of the software source that provides this module stream.
     * @return the value
     **/
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }

    /**
     * The architecture for which the packages in this module stream were built
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture for which the packages in this module stream were built
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    /**
     * A description of the contents of the module stream
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the contents of the module stream
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A list of profiles that are part of the stream.  Each element in
     * the list is the name of a profile.  The name is suitable to use as
     * an argument to other OS Management APIs that interact directly with
     * module stream profiles.  However, it is not URL encoded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<String> profiles;

    /**
     * A list of profiles that are part of the stream.  Each element in
     * the list is the name of a profile.  The name is suitable to use as
     * an argument to other OS Management APIs that interact directly with
     * module stream profiles.  However, it is not URL encoded.
     *
     * @return the value
     **/
    public java.util.List<String> getProfiles() {
        return profiles;
    }

    /**
     * A list of packages that are contained by the stream.  Each element
     * in the list is the name of a package.  The name is suitable to use
     * as an argument to other OS Management APIs that interact directly
     * with packages.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * A list of packages that are contained by the stream.  Each element
     * in the list is the name of a package.  The name is suitable to use
     * as an argument to other OS Management APIs that interact directly
     * with packages.
     *
     * @return the value
     **/
    public java.util.List<String> getPackages() {
        return packages;
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
        sb.append("ModuleStream(");
        sb.append("super=").append(super.toString());
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", streamName=").append(String.valueOf(this.streamName));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModuleStream)) {
            return false;
        }

        ModuleStream other = (ModuleStream) o;
        return java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && java.util.Objects.equals(this.packages, other.packages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

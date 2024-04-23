/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines a module stream provided by a software source. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModuleStream.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModuleStream extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "moduleName",
        "name",
        "isDefault",
        "softwareSourceId",
        "archType",
        "description",
        "profiles",
        "packages",
        "isLatest"
    })
    public ModuleStream(
            String moduleName,
            String name,
            Boolean isDefault,
            String softwareSourceId,
            ArchType archType,
            String description,
            java.util.List<String> profiles,
            java.util.List<String> packages,
            Boolean isLatest) {
        super();
        this.moduleName = moduleName;
        this.name = name;
        this.isDefault = isDefault;
        this.softwareSourceId = softwareSourceId;
        this.archType = archType;
        this.description = description;
        this.profiles = profiles;
        this.packages = packages;
        this.isLatest = isLatest;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Indicates if this stream is the default for its module. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates if this stream is the default for its module.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the software source that provides this module stream.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the software source that provides this module stream.
         *
         * @param softwareSourceId the value to set
         * @return this builder
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }
        /** The architecture for which the packages in this module stream were built. */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture for which the packages in this module stream were built.
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /** A description of the contents of the module stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the contents of the module stream.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A list of profiles that are part of the stream. Each element in the list is the name of a
         * profile. The name is suitable to use as an argument to other OS Management Hub APIs that
         * interact directly with module stream profiles. However, it is not URL encoded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<String> profiles;

        /**
         * A list of profiles that are part of the stream. Each element in the list is the name of a
         * profile. The name is suitable to use as an argument to other OS Management Hub APIs that
         * interact directly with module stream profiles. However, it is not URL encoded.
         *
         * @param profiles the value to set
         * @return this builder
         */
        public Builder profiles(java.util.List<String> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }
        /**
         * A list of packages that are contained by the stream. Each element in the list is the name
         * of a package. The name is suitable to use as an argument to other OS Management Hub APIs
         * that interact directly with packages.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * A list of packages that are contained by the stream. Each element in the list is the name
         * of a package. The name is suitable to use as an argument to other OS Management Hub APIs
         * that interact directly with packages.
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModuleStream build() {
            ModuleStream model =
                    new ModuleStream(
                            this.moduleName,
                            this.name,
                            this.isDefault,
                            this.softwareSourceId,
                            this.archType,
                            this.description,
                            this.profiles,
                            this.packages,
                            this.isLatest);
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
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
            if (model.wasPropertyExplicitlySet("isLatest")) {
                this.isLatest(model.getIsLatest());
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

    /** Indicates if this stream is the default for its module. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates if this stream is the default for its module.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source that provides this module stream.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source that provides this module stream.
     *
     * @return the value
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }

    /** The architecture for which the packages in this module stream were built. */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture for which the packages in this module stream were built.
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** A description of the contents of the module stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the contents of the module stream.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A list of profiles that are part of the stream. Each element in the list is the name of a
     * profile. The name is suitable to use as an argument to other OS Management Hub APIs that
     * interact directly with module stream profiles. However, it is not URL encoded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<String> profiles;

    /**
     * A list of profiles that are part of the stream. Each element in the list is the name of a
     * profile. The name is suitable to use as an argument to other OS Management Hub APIs that
     * interact directly with module stream profiles. However, it is not URL encoded.
     *
     * @return the value
     */
    public java.util.List<String> getProfiles() {
        return profiles;
    }

    /**
     * A list of packages that are contained by the stream. Each element in the list is the name of
     * a package. The name is suitable to use as an argument to other OS Management Hub APIs that
     * interact directly with packages.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * A list of packages that are contained by the stream. Each element in the list is the name of
     * a package. The name is suitable to use as an argument to other OS Management Hub APIs that
     * interact directly with packages.
     *
     * @return the value
     */
    public java.util.List<String> getPackages() {
        return packages;
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
        sb.append("ModuleStream(");
        sb.append("super=").append(super.toString());
        sb.append("moduleName=").append(String.valueOf(this.moduleName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(", isLatest=").append(String.valueOf(this.isLatest));
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
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

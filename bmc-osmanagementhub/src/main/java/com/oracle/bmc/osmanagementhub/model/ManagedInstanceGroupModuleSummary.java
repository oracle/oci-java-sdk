/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the summary information about a module on a managed instance group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedInstanceGroupModuleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedInstanceGroupModuleSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "enabledStream",
        "installedProfiles",
        "softwareSourceId"
    })
    public ManagedInstanceGroupModuleSummary(
            String name,
            String enabledStream,
            java.util.List<String> installedProfiles,
            String softwareSourceId) {
        super();
        this.name = name;
        this.enabledStream = enabledStream;
        this.installedProfiles = installedProfiles;
        this.softwareSourceId = softwareSourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the module.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the module.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the module stream that is enabled for the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabledStream")
        private String enabledStream;

        /**
         * The name of the module stream that is enabled for the group.
         * @param enabledStream the value to set
         * @return this builder
         **/
        public Builder enabledStream(String enabledStream) {
            this.enabledStream = enabledStream;
            this.__explicitlySet__.add("enabledStream");
            return this;
        }
        /**
         * The list of installed profiles under the currently enabled module stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installedProfiles")
        private java.util.List<String> installedProfiles;

        /**
         * The list of installed profiles under the currently enabled module stream.
         * @param installedProfiles the value to set
         * @return this builder
         **/
        public Builder installedProfiles(java.util.List<String> installedProfiles) {
            this.installedProfiles = installedProfiles;
            this.__explicitlySet__.add("installedProfiles");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source that provides this module stream.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source that provides this module stream.
         * @param softwareSourceId the value to set
         * @return this builder
         **/
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstanceGroupModuleSummary build() {
            ManagedInstanceGroupModuleSummary model =
                    new ManagedInstanceGroupModuleSummary(
                            this.name,
                            this.enabledStream,
                            this.installedProfiles,
                            this.softwareSourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceGroupModuleSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("enabledStream")) {
                this.enabledStream(model.getEnabledStream());
            }
            if (model.wasPropertyExplicitlySet("installedProfiles")) {
                this.installedProfiles(model.getInstalledProfiles());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
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
     * The name of the module.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the module.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of the module stream that is enabled for the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabledStream")
    private final String enabledStream;

    /**
     * The name of the module stream that is enabled for the group.
     * @return the value
     **/
    public String getEnabledStream() {
        return enabledStream;
    }

    /**
     * The list of installed profiles under the currently enabled module stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installedProfiles")
    private final java.util.List<String> installedProfiles;

    /**
     * The list of installed profiles under the currently enabled module stream.
     * @return the value
     **/
    public java.util.List<String> getInstalledProfiles() {
        return installedProfiles;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source that provides this module stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the software source that provides this module stream.
     * @return the value
     **/
    public String getSoftwareSourceId() {
        return softwareSourceId;
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
        sb.append("ManagedInstanceGroupModuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", enabledStream=").append(String.valueOf(this.enabledStream));
        sb.append(", installedProfiles=").append(String.valueOf(this.installedProfiles));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstanceGroupModuleSummary)) {
            return false;
        }

        ManagedInstanceGroupModuleSummary other = (ManagedInstanceGroupModuleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.enabledStream, other.enabledStream)
                && java.util.Objects.equals(this.installedProfiles, other.installedProfiles)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledStream == null ? 43 : this.enabledStream.hashCode());
        result =
                (result * PRIME)
                        + (this.installedProfiles == null ? 43 : this.installedProfiles.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

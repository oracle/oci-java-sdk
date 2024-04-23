/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a module on a managed instance. <br>
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
        builder = ManagedInstanceModuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstanceModuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "enabledStream",
        "installedProfiles",
        "activeStreams",
        "disabledStreams",
        "softwareSourceId"
    })
    public ManagedInstanceModuleSummary(
            String name,
            String enabledStream,
            java.util.List<String> installedProfiles,
            java.util.List<String> activeStreams,
            java.util.List<String> disabledStreams,
            String softwareSourceId) {
        super();
        this.name = name;
        this.enabledStream = enabledStream;
        this.installedProfiles = installedProfiles;
        this.activeStreams = activeStreams;
        this.disabledStreams = disabledStreams;
        this.softwareSourceId = softwareSourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The module name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The module name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The stream that is enabled in the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("enabledStream")
        private String enabledStream;

        /**
         * The stream that is enabled in the module.
         *
         * @param enabledStream the value to set
         * @return this builder
         */
        public Builder enabledStream(String enabledStream) {
            this.enabledStream = enabledStream;
            this.__explicitlySet__.add("enabledStream");
            return this;
        }
        /** List of installed profiles in the enabled stream of the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("installedProfiles")
        private java.util.List<String> installedProfiles;

        /**
         * List of installed profiles in the enabled stream of the module.
         *
         * @param installedProfiles the value to set
         * @return this builder
         */
        public Builder installedProfiles(java.util.List<String> installedProfiles) {
            this.installedProfiles = installedProfiles;
            this.__explicitlySet__.add("installedProfiles");
            return this;
        }
        /** List of streams that are active in the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("activeStreams")
        private java.util.List<String> activeStreams;

        /**
         * List of streams that are active in the module.
         *
         * @param activeStreams the value to set
         * @return this builder
         */
        public Builder activeStreams(java.util.List<String> activeStreams) {
            this.activeStreams = activeStreams;
            this.__explicitlySet__.add("activeStreams");
            return this;
        }
        /** List of streams that are disabled in the module. */
        @com.fasterxml.jackson.annotation.JsonProperty("disabledStreams")
        private java.util.List<String> disabledStreams;

        /**
         * List of streams that are disabled in the module.
         *
         * @param disabledStreams the value to set
         * @return this builder
         */
        public Builder disabledStreams(java.util.List<String> disabledStreams) {
            this.disabledStreams = disabledStreams;
            this.__explicitlySet__.add("disabledStreams");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the software source that provides this module and the associated streams.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the software source that provides this module and the associated streams.
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

        public ManagedInstanceModuleSummary build() {
            ManagedInstanceModuleSummary model =
                    new ManagedInstanceModuleSummary(
                            this.name,
                            this.enabledStream,
                            this.installedProfiles,
                            this.activeStreams,
                            this.disabledStreams,
                            this.softwareSourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstanceModuleSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("enabledStream")) {
                this.enabledStream(model.getEnabledStream());
            }
            if (model.wasPropertyExplicitlySet("installedProfiles")) {
                this.installedProfiles(model.getInstalledProfiles());
            }
            if (model.wasPropertyExplicitlySet("activeStreams")) {
                this.activeStreams(model.getActiveStreams());
            }
            if (model.wasPropertyExplicitlySet("disabledStreams")) {
                this.disabledStreams(model.getDisabledStreams());
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

    /** The module name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The module name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The stream that is enabled in the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledStream")
    private final String enabledStream;

    /**
     * The stream that is enabled in the module.
     *
     * @return the value
     */
    public String getEnabledStream() {
        return enabledStream;
    }

    /** List of installed profiles in the enabled stream of the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("installedProfiles")
    private final java.util.List<String> installedProfiles;

    /**
     * List of installed profiles in the enabled stream of the module.
     *
     * @return the value
     */
    public java.util.List<String> getInstalledProfiles() {
        return installedProfiles;
    }

    /** List of streams that are active in the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("activeStreams")
    private final java.util.List<String> activeStreams;

    /**
     * List of streams that are active in the module.
     *
     * @return the value
     */
    public java.util.List<String> getActiveStreams() {
        return activeStreams;
    }

    /** List of streams that are disabled in the module. */
    @com.fasterxml.jackson.annotation.JsonProperty("disabledStreams")
    private final java.util.List<String> disabledStreams;

    /**
     * List of streams that are disabled in the module.
     *
     * @return the value
     */
    public java.util.List<String> getDisabledStreams() {
        return disabledStreams;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source that provides this module and the associated streams.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the software source that provides this module and the associated streams.
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
        sb.append("ManagedInstanceModuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", enabledStream=").append(String.valueOf(this.enabledStream));
        sb.append(", installedProfiles=").append(String.valueOf(this.installedProfiles));
        sb.append(", activeStreams=").append(String.valueOf(this.activeStreams));
        sb.append(", disabledStreams=").append(String.valueOf(this.disabledStreams));
        sb.append(", softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstanceModuleSummary)) {
            return false;
        }

        ManagedInstanceModuleSummary other = (ManagedInstanceModuleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.enabledStream, other.enabledStream)
                && java.util.Objects.equals(this.installedProfiles, other.installedProfiles)
                && java.util.Objects.equals(this.activeStreams, other.activeStreams)
                && java.util.Objects.equals(this.disabledStreams, other.disabledStreams)
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
                        + (this.activeStreams == null ? 43 : this.activeStreams.hashCode());
        result =
                (result * PRIME)
                        + (this.disabledStreams == null ? 43 : this.disabledStreams.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

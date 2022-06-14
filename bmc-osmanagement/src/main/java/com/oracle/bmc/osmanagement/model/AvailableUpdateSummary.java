/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An update available for a managed instance
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
    builder = AvailableUpdateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AvailableUpdateSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "name",
        "updateType",
        "type",
        "installedVersion",
        "availableVersion",
        "architecture",
        "errata",
        "relatedCves",
        "softwareSources"
    })
    public AvailableUpdateSummary(
            String displayName,
            String name,
            UpdateTypes updateType,
            String type,
            String installedVersion,
            String availableVersion,
            String architecture,
            java.util.List<Id> errata,
            java.util.List<String> relatedCves,
            java.util.List<SoftwareSourceId> softwareSources) {
        super();
        this.displayName = displayName;
        this.name = name;
        this.updateType = updateType;
        this.type = type;
        this.installedVersion = installedVersion;
        this.availableVersion = availableVersion;
        this.architecture = architecture;
        this.errata = errata;
        this.relatedCves = relatedCves;
        this.softwareSources = softwareSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Package name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Package name
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Unique identifier for the package available for update. NOTE - This is not an OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique identifier for the package available for update. NOTE - This is not an OCID
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The purpose of this update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateTypes updateType;

        /**
         * The purpose of this update.
         * @param updateType the value to set
         * @return this builder
         **/
        public Builder updateType(UpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /**
         * Type of the package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of the package
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Version of the installed package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
        private String installedVersion;

        /**
         * Version of the installed package
         * @param installedVersion the value to set
         * @return this builder
         **/
        public Builder installedVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            this.__explicitlySet__.add("installedVersion");
            return this;
        }
        /**
         * Version of the package available for update
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableVersion")
        private String availableVersion;

        /**
         * Version of the package available for update
         * @param availableVersion the value to set
         * @return this builder
         **/
        public Builder availableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
            this.__explicitlySet__.add("availableVersion");
            return this;
        }
        /**
         * The architecture for which this package was built
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture for which this package was built
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * List of errata containing this update
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errata")
        private java.util.List<Id> errata;

        /**
         * List of errata containing this update
         * @param errata the value to set
         * @return this builder
         **/
        public Builder errata(java.util.List<Id> errata) {
            this.errata = errata;
            this.__explicitlySet__.add("errata");
            return this;
        }
        /**
         * List of CVEs applicable to this erratum
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * List of CVEs applicable to this erratum
         * @param relatedCves the value to set
         * @return this builder
         **/
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }
        /**
         * list of software sources that provide the software package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceId> softwareSources;

        /**
         * list of software sources that provide the software package
         * @param softwareSources the value to set
         * @return this builder
         **/
        public Builder softwareSources(java.util.List<SoftwareSourceId> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableUpdateSummary build() {
            AvailableUpdateSummary __instance__ =
                    new AvailableUpdateSummary(
                            displayName,
                            name,
                            updateType,
                            type,
                            installedVersion,
                            availableVersion,
                            architecture,
                            errata,
                            relatedCves,
                            softwareSources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableUpdateSummary o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .name(o.getName())
                            .updateType(o.getUpdateType())
                            .type(o.getType())
                            .installedVersion(o.getInstalledVersion())
                            .availableVersion(o.getAvailableVersion())
                            .architecture(o.getArchitecture())
                            .errata(o.getErrata())
                            .relatedCves(o.getRelatedCves())
                            .softwareSources(o.getSoftwareSources());

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
     * Package name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Package name
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Unique identifier for the package available for update. NOTE - This is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique identifier for the package available for update. NOTE - This is not an OCID
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The purpose of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final UpdateTypes updateType;

    /**
     * The purpose of this update.
     * @return the value
     **/
    public UpdateTypes getUpdateType() {
        return updateType;
    }

    /**
     * Type of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of the package
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Version of the installed package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
    private final String installedVersion;

    /**
     * Version of the installed package
     * @return the value
     **/
    public String getInstalledVersion() {
        return installedVersion;
    }

    /**
     * Version of the package available for update
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableVersion")
    private final String availableVersion;

    /**
     * Version of the package available for update
     * @return the value
     **/
    public String getAvailableVersion() {
        return availableVersion;
    }

    /**
     * The architecture for which this package was built
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture for which this package was built
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    /**
     * List of errata containing this update
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errata")
    private final java.util.List<Id> errata;

    /**
     * List of errata containing this update
     * @return the value
     **/
    public java.util.List<Id> getErrata() {
        return errata;
    }

    /**
     * List of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * List of CVEs applicable to this erratum
     * @return the value
     **/
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
    }

    /**
     * list of software sources that provide the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceId> softwareSources;

    /**
     * list of software sources that provide the software package
     * @return the value
     **/
    public java.util.List<SoftwareSourceId> getSoftwareSources() {
        return softwareSources;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AvailableUpdateSummary(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", installedVersion=").append(String.valueOf(this.installedVersion));
        sb.append(", availableVersion=").append(String.valueOf(this.availableVersion));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", errata=").append(String.valueOf(this.errata));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableUpdateSummary)) {
            return false;
        }

        AvailableUpdateSummary other = (AvailableUpdateSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.installedVersion, other.installedVersion)
                && java.util.Objects.equals(this.availableVersion, other.availableVersion)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.errata, other.errata)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.installedVersion == null ? 43 : this.installedVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.availableVersion == null ? 43 : this.availableVersion.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.errata == null ? 43 : this.errata.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
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

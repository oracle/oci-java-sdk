/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailableUpdateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AvailableUpdateSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateTypes updateType;

        public Builder updateType(UpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
        private String installedVersion;

        public Builder installedVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            this.__explicitlySet__.add("installedVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableVersion")
        private String availableVersion;

        public Builder availableVersion(String availableVersion) {
            this.availableVersion = availableVersion;
            this.__explicitlySet__.add("availableVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errata")
        private java.util.List<Id> errata;

        public Builder errata(java.util.List<Id> errata) {
            this.errata = errata;
            this.__explicitlySet__.add("errata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceId> softwareSources;

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

    /**
     * Package name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Unique identifier for the package available for update. NOTE - This is not an OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The purpose of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    UpdateTypes updateType;

    /**
     * Type of the package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * Version of the installed package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
    String installedVersion;

    /**
     * Version of the package available for update
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableVersion")
    String availableVersion;

    /**
     * The architecture for which this package was built
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    String architecture;

    /**
     * List of errata containing this update
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errata")
    java.util.List<Id> errata;

    /**
     * List of CVEs applicable to this erratum
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    java.util.List<String> relatedCves;

    /**
     * list of software sources that provide the software package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    java.util.List<SoftwareSourceId> softwareSources;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

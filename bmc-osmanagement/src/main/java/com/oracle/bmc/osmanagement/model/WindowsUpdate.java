/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * An update available for a Windows managed instance.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WindowsUpdate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WindowsUpdate {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateTypes updateType;

        public Builder updateType(UpdateTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
        private IsEligibleForInstallation isEligibleForInstallation;

        public Builder isEligibleForInstallation(
                IsEligibleForInstallation isEligibleForInstallation) {
            this.isEligibleForInstallation = isEligibleForInstallation;
            this.__explicitlySet__.add("isEligibleForInstallation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
        private java.util.List<InstallationRequirements> installationRequirements;

        public Builder installationRequirements(
                java.util.List<InstallationRequirements> installationRequirements) {
            this.installationRequirements = installationRequirements;
            this.__explicitlySet__.add("installationRequirements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
        private Boolean isRebootRequiredForInstallation;

        public Builder isRebootRequiredForInstallation(Boolean isRebootRequiredForInstallation) {
            this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
            this.__explicitlySet__.add("isRebootRequiredForInstallation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
        private java.util.List<String> kbArticleIds;

        public Builder kbArticleIds(java.util.List<String> kbArticleIds) {
            this.kbArticleIds = kbArticleIds;
            this.__explicitlySet__.add("kbArticleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WindowsUpdate build() {
            WindowsUpdate __instance__ =
                    new WindowsUpdate(
                            displayName,
                            name,
                            description,
                            updateType,
                            sizeInBytes,
                            isEligibleForInstallation,
                            installationRequirements,
                            isRebootRequiredForInstallation,
                            kbArticleIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WindowsUpdate o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .name(o.getName())
                            .description(o.getDescription())
                            .updateType(o.getUpdateType())
                            .sizeInBytes(o.getSizeInBytes())
                            .isEligibleForInstallation(o.getIsEligibleForInstallation())
                            .installationRequirements(o.getInstallationRequirements())
                            .isRebootRequiredForInstallation(o.getIsRebootRequiredForInstallation())
                            .kbArticleIds(o.getKbArticleIds());

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
     * Windows Update name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Unique identifier for the Windows update. NOTE - This is not an OCID,
     * but is a unique identifier assigned by Microsoft.
     * Example: `6981d463-cd91-4a26-b7c4-ea4ded9183ed`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Information about the Windows Update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The purpose of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    UpdateTypes updateType;

    /**
     * size of the package in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    Long sizeInBytes;

    /**
     * Indicates whether the update can be installed using OSMS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEligibleForInstallation")
    IsEligibleForInstallation isEligibleForInstallation;

    /**
     * List of requirements forinstalling on a managed instances
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
    java.util.List<InstallationRequirements> installationRequirements;

    /**
     * Indicates whether a reboot may be required to complete installation of this update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
    Boolean isRebootRequiredForInstallation;

    /**
     * List of the Microsoft Knowledge Base Article Ids related to this Windows Update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
    java.util.List<String> kbArticleIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

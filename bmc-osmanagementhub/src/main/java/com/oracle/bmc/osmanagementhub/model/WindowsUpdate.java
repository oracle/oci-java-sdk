/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that provides information about an update for a Windows instance. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WindowsUpdate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WindowsUpdate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "updateId",
        "description",
        "updateType",
        "sizeInBytes",
        "installable",
        "installationRequirements",
        "isRebootRequiredForInstallation",
        "kbArticleIds"
    })
    public WindowsUpdate(
            String name,
            String updateId,
            String description,
            ClassificationTypes updateType,
            Long sizeInBytes,
            Installable installable,
            java.util.List<InstallationRequirements> installationRequirements,
            Boolean isRebootRequiredForInstallation,
            java.util.List<String> kbArticleIds) {
        super();
        this.name = name;
        this.updateId = updateId;
        this.description = description;
        this.updateType = updateType;
        this.sizeInBytes = sizeInBytes;
        this.installable = installable;
        this.installationRequirements = installationRequirements;
        this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
        this.kbArticleIds = kbArticleIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the Windows update. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Windows update.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateId")
        private String updateId;

        /**
         * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
         * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
         *
         * @param updateId the value to set
         * @return this builder
         */
        public Builder updateId(String updateId) {
            this.updateId = updateId;
            this.__explicitlySet__.add("updateId");
            return this;
        }
        /** Description of the update. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the update.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The type of Windows update. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private ClassificationTypes updateType;

        /**
         * The type of Windows update.
         *
         * @param updateType the value to set
         * @return this builder
         */
        public Builder updateType(ClassificationTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /** size of the package in bytes */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * size of the package in bytes
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** Indicates whether the update can be installed using the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("installable")
        private Installable installable;

        /**
         * Indicates whether the update can be installed using the service.
         *
         * @param installable the value to set
         * @return this builder
         */
        public Builder installable(Installable installable) {
            this.installable = installable;
            this.__explicitlySet__.add("installable");
            return this;
        }
        /** List of requirements for installing the update on the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
        private java.util.List<InstallationRequirements> installationRequirements;

        /**
         * List of requirements for installing the update on the managed instance.
         *
         * @param installationRequirements the value to set
         * @return this builder
         */
        public Builder installationRequirements(
                java.util.List<InstallationRequirements> installationRequirements) {
            this.installationRequirements = installationRequirements;
            this.__explicitlySet__.add("installationRequirements");
            return this;
        }
        /** Indicates whether a reboot is required to complete the installation of this update. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
        private Boolean isRebootRequiredForInstallation;

        /**
         * Indicates whether a reboot is required to complete the installation of this update.
         *
         * @param isRebootRequiredForInstallation the value to set
         * @return this builder
         */
        public Builder isRebootRequiredForInstallation(Boolean isRebootRequiredForInstallation) {
            this.isRebootRequiredForInstallation = isRebootRequiredForInstallation;
            this.__explicitlySet__.add("isRebootRequiredForInstallation");
            return this;
        }
        /** List of the Microsoft Knowledge Base Article Ids related to this Windows Update. */
        @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
        private java.util.List<String> kbArticleIds;

        /**
         * List of the Microsoft Knowledge Base Article Ids related to this Windows Update.
         *
         * @param kbArticleIds the value to set
         * @return this builder
         */
        public Builder kbArticleIds(java.util.List<String> kbArticleIds) {
            this.kbArticleIds = kbArticleIds;
            this.__explicitlySet__.add("kbArticleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WindowsUpdate build() {
            WindowsUpdate model =
                    new WindowsUpdate(
                            this.name,
                            this.updateId,
                            this.description,
                            this.updateType,
                            this.sizeInBytes,
                            this.installable,
                            this.installationRequirements,
                            this.isRebootRequiredForInstallation,
                            this.kbArticleIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WindowsUpdate model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("updateId")) {
                this.updateId(model.getUpdateId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("installable")) {
                this.installable(model.getInstallable());
            }
            if (model.wasPropertyExplicitlySet("installationRequirements")) {
                this.installationRequirements(model.getInstallationRequirements());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequiredForInstallation")) {
                this.isRebootRequiredForInstallation(model.getIsRebootRequiredForInstallation());
            }
            if (model.wasPropertyExplicitlySet("kbArticleIds")) {
                this.kbArticleIds(model.getKbArticleIds());
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

    /** Name of the Windows update. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Windows update.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateId")
    private final String updateId;

    /**
     * Unique identifier for the Windows update. Note that this is not an OCID, but is a unique
     * identifier assigned by Microsoft. Example: '6981d463-cd91-4a26-b7c4-ea4ded9183ed'
     *
     * @return the value
     */
    public String getUpdateId() {
        return updateId;
    }

    /** Description of the update. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the update.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The type of Windows update. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final ClassificationTypes updateType;

    /**
     * The type of Windows update.
     *
     * @return the value
     */
    public ClassificationTypes getUpdateType() {
        return updateType;
    }

    /** size of the package in bytes */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * size of the package in bytes
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** Indicates whether the update can be installed using the service. */
    public enum Installable implements com.oracle.bmc.http.internal.BmcEnum {
        Installable("INSTALLABLE"),
        NotInstallable("NOT_INSTALLABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Installable.class);

        private final String value;
        private static java.util.Map<String, Installable> map;

        static {
            map = new java.util.HashMap<>();
            for (Installable v : Installable.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Installable(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Installable create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Installable', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the update can be installed using the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("installable")
    private final Installable installable;

    /**
     * Indicates whether the update can be installed using the service.
     *
     * @return the value
     */
    public Installable getInstallable() {
        return installable;
    }

    /** List of requirements for installing the update on the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("installationRequirements")
    private final java.util.List<InstallationRequirements> installationRequirements;

    /**
     * List of requirements for installing the update on the managed instance.
     *
     * @return the value
     */
    public java.util.List<InstallationRequirements> getInstallationRequirements() {
        return installationRequirements;
    }

    /** Indicates whether a reboot is required to complete the installation of this update. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequiredForInstallation")
    private final Boolean isRebootRequiredForInstallation;

    /**
     * Indicates whether a reboot is required to complete the installation of this update.
     *
     * @return the value
     */
    public Boolean getIsRebootRequiredForInstallation() {
        return isRebootRequiredForInstallation;
    }

    /** List of the Microsoft Knowledge Base Article Ids related to this Windows Update. */
    @com.fasterxml.jackson.annotation.JsonProperty("kbArticleIds")
    private final java.util.List<String> kbArticleIds;

    /**
     * List of the Microsoft Knowledge Base Article Ids related to this Windows Update.
     *
     * @return the value
     */
    public java.util.List<String> getKbArticleIds() {
        return kbArticleIds;
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
        sb.append("WindowsUpdate(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", updateId=").append(String.valueOf(this.updateId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", installable=").append(String.valueOf(this.installable));
        sb.append(", installationRequirements=")
                .append(String.valueOf(this.installationRequirements));
        sb.append(", isRebootRequiredForInstallation=")
                .append(String.valueOf(this.isRebootRequiredForInstallation));
        sb.append(", kbArticleIds=").append(String.valueOf(this.kbArticleIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WindowsUpdate)) {
            return false;
        }

        WindowsUpdate other = (WindowsUpdate) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.updateId, other.updateId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.installable, other.installable)
                && java.util.Objects.equals(
                        this.installationRequirements, other.installationRequirements)
                && java.util.Objects.equals(
                        this.isRebootRequiredForInstallation, other.isRebootRequiredForInstallation)
                && java.util.Objects.equals(this.kbArticleIds, other.kbArticleIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.installable == null ? 43 : this.installable.hashCode());
        result =
                (result * PRIME)
                        + (this.installationRequirements == null
                                ? 43
                                : this.installationRequirements.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequiredForInstallation == null
                                ? 43
                                : this.isRebootRequiredForInstallation.hashCode());
        result = (result * PRIME) + (this.kbArticleIds == null ? 43 : this.kbArticleIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

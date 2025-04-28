/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for updating a model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateModelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "freeformTags",
        "definedTags",
        "customMetadataList",
        "definedMetadataList",
        "modelVersionSetId",
        "versionLabel",
        "retentionSetting",
        "backupSetting"
    })
    public UpdateModelDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<Metadata> customMetadataList,
            java.util.List<Metadata> definedMetadataList,
            String modelVersionSetId,
            String versionLabel,
            RetentionSetting retentionSetting,
            BackupSetting backupSetting) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.customMetadataList = customMetadataList;
        this.definedMetadataList = definedMetadataList;
        this.modelVersionSetId = modelVersionSetId;
        this.versionLabel = versionLabel;
        this.retentionSetting = retentionSetting;
        this.backupSetting = backupSetting;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be
         * modified. Avoid entering confidential information. Example: {@code My Model}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the resource. It does not have to be unique and can be
         * modified. Avoid entering confidential information. Example: {@code My Model}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the model.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** An array of custom metadata details for the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("customMetadataList")
        private java.util.List<Metadata> customMetadataList;

        /**
         * An array of custom metadata details for the model.
         *
         * @param customMetadataList the value to set
         * @return this builder
         */
        public Builder customMetadataList(java.util.List<Metadata> customMetadataList) {
            this.customMetadataList = customMetadataList;
            this.__explicitlySet__.add("customMetadataList");
            return this;
        }
        /** An array of defined metadata details for the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("definedMetadataList")
        private java.util.List<Metadata> definedMetadataList;

        /**
         * An array of defined metadata details for the model.
         *
         * @param definedMetadataList the value to set
         * @return this builder
         */
        public Builder definedMetadataList(java.util.List<Metadata> definedMetadataList) {
            this.definedMetadataList = definedMetadataList;
            this.__explicitlySet__.add("definedMetadataList");
            return this;
        }
        /** The OCID of the model version set that the model is associated to. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersionSetId")
        private String modelVersionSetId;

        /**
         * The OCID of the model version set that the model is associated to.
         *
         * @param modelVersionSetId the value to set
         * @return this builder
         */
        public Builder modelVersionSetId(String modelVersionSetId) {
            this.modelVersionSetId = modelVersionSetId;
            this.__explicitlySet__.add("modelVersionSetId");
            return this;
        }
        /**
         * The version label can add an additional description of the lifecycle state of the model
         * or the application using/training the model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionLabel")
        private String versionLabel;

        /**
         * The version label can add an additional description of the lifecycle state of the model
         * or the application using/training the model.
         *
         * @param versionLabel the value to set
         * @return this builder
         */
        public Builder versionLabel(String versionLabel) {
            this.versionLabel = versionLabel;
            this.__explicitlySet__.add("versionLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionSetting")
        private RetentionSetting retentionSetting;

        public Builder retentionSetting(RetentionSetting retentionSetting) {
            this.retentionSetting = retentionSetting;
            this.__explicitlySet__.add("retentionSetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSetting")
        private BackupSetting backupSetting;

        public Builder backupSetting(BackupSetting backupSetting) {
            this.backupSetting = backupSetting;
            this.__explicitlySet__.add("backupSetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateModelDetails build() {
            UpdateModelDetails model =
                    new UpdateModelDetails(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.customMetadataList,
                            this.definedMetadataList,
                            this.modelVersionSetId,
                            this.versionLabel,
                            this.retentionSetting,
                            this.backupSetting);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("customMetadataList")) {
                this.customMetadataList(model.getCustomMetadataList());
            }
            if (model.wasPropertyExplicitlySet("definedMetadataList")) {
                this.definedMetadataList(model.getDefinedMetadataList());
            }
            if (model.wasPropertyExplicitlySet("modelVersionSetId")) {
                this.modelVersionSetId(model.getModelVersionSetId());
            }
            if (model.wasPropertyExplicitlySet("versionLabel")) {
                this.versionLabel(model.getVersionLabel());
            }
            if (model.wasPropertyExplicitlySet("retentionSetting")) {
                this.retentionSetting(model.getRetentionSetting());
            }
            if (model.wasPropertyExplicitlySet("backupSetting")) {
                this.backupSetting(model.getBackupSetting());
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

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be
     * modified. Avoid entering confidential information. Example: {@code My Model}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the resource. It does not have to be unique and can be
     * modified. Avoid entering confidential information. Example: {@code My Model}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the model.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** An array of custom metadata details for the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("customMetadataList")
    private final java.util.List<Metadata> customMetadataList;

    /**
     * An array of custom metadata details for the model.
     *
     * @return the value
     */
    public java.util.List<Metadata> getCustomMetadataList() {
        return customMetadataList;
    }

    /** An array of defined metadata details for the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("definedMetadataList")
    private final java.util.List<Metadata> definedMetadataList;

    /**
     * An array of defined metadata details for the model.
     *
     * @return the value
     */
    public java.util.List<Metadata> getDefinedMetadataList() {
        return definedMetadataList;
    }

    /** The OCID of the model version set that the model is associated to. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersionSetId")
    private final String modelVersionSetId;

    /**
     * The OCID of the model version set that the model is associated to.
     *
     * @return the value
     */
    public String getModelVersionSetId() {
        return modelVersionSetId;
    }

    /**
     * The version label can add an additional description of the lifecycle state of the model or
     * the application using/training the model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionLabel")
    private final String versionLabel;

    /**
     * The version label can add an additional description of the lifecycle state of the model or
     * the application using/training the model.
     *
     * @return the value
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("retentionSetting")
    private final RetentionSetting retentionSetting;

    public RetentionSetting getRetentionSetting() {
        return retentionSetting;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupSetting")
    private final BackupSetting backupSetting;

    public BackupSetting getBackupSetting() {
        return backupSetting;
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
        sb.append("UpdateModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", customMetadataList=").append(String.valueOf(this.customMetadataList));
        sb.append(", definedMetadataList=").append(String.valueOf(this.definedMetadataList));
        sb.append(", modelVersionSetId=").append(String.valueOf(this.modelVersionSetId));
        sb.append(", versionLabel=").append(String.valueOf(this.versionLabel));
        sb.append(", retentionSetting=").append(String.valueOf(this.retentionSetting));
        sb.append(", backupSetting=").append(String.valueOf(this.backupSetting));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDetails)) {
            return false;
        }

        UpdateModelDetails other = (UpdateModelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.customMetadataList, other.customMetadataList)
                && java.util.Objects.equals(this.definedMetadataList, other.definedMetadataList)
                && java.util.Objects.equals(this.modelVersionSetId, other.modelVersionSetId)
                && java.util.Objects.equals(this.versionLabel, other.versionLabel)
                && java.util.Objects.equals(this.retentionSetting, other.retentionSetting)
                && java.util.Objects.equals(this.backupSetting, other.backupSetting)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.customMetadataList == null
                                ? 43
                                : this.customMetadataList.hashCode());
        result =
                (result * PRIME)
                        + (this.definedMetadataList == null
                                ? 43
                                : this.definedMetadataList.hashCode());
        result =
                (result * PRIME)
                        + (this.modelVersionSetId == null ? 43 : this.modelVersionSetId.hashCode());
        result = (result * PRIME) + (this.versionLabel == null ? 43 : this.versionLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionSetting == null ? 43 : this.retentionSetting.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSetting == null ? 43 : this.backupSetting.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

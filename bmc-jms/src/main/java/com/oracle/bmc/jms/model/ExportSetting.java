/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * An export settings for JMS fleets. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportSetting extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exportSettingKey",
        "fleetId",
        "exportDuration",
        "exportResources",
        "isCrossRegionAcknowledged",
        "targetBucketName",
        "targetBucketNamespace",
        "targetBucketRegion",
        "exportFrequency",
        "isEnabled",
        "timeCreated",
        "timeLastModified"
    })
    public ExportSetting(
            String exportSettingKey,
            String fleetId,
            ExportDuration exportDuration,
            ExportResources exportResources,
            Boolean isCrossRegionAcknowledged,
            String targetBucketName,
            String targetBucketNamespace,
            String targetBucketRegion,
            ExportFrequency exportFrequency,
            Boolean isEnabled,
            java.util.Date timeCreated,
            java.util.Date timeLastModified) {
        super();
        this.exportSettingKey = exportSettingKey;
        this.fleetId = fleetId;
        this.exportDuration = exportDuration;
        this.exportResources = exportResources;
        this.isCrossRegionAcknowledged = isCrossRegionAcknowledged;
        this.targetBucketName = targetBucketName;
        this.targetBucketNamespace = targetBucketNamespace;
        this.targetBucketRegion = targetBucketRegion;
        this.exportFrequency = exportFrequency;
        this.isEnabled = isEnabled;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The internal identifier of the export setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportSettingKey")
        private String exportSettingKey;

        /**
         * The internal identifier of the export setting.
         *
         * @param exportSettingKey the value to set
         * @return this builder
         */
        public Builder exportSettingKey(String exportSettingKey) {
            this.exportSettingKey = exportSettingKey;
            this.__explicitlySet__.add("exportSettingKey");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The duration of data to be exported for fleets. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportDuration")
        private ExportDuration exportDuration;

        /**
         * The duration of data to be exported for fleets.
         *
         * @param exportDuration the value to set
         * @return this builder
         */
        public Builder exportDuration(ExportDuration exportDuration) {
            this.exportDuration = exportDuration;
            this.__explicitlySet__.add("exportDuration");
            return this;
        }
        /** Resource to export data associated from the fleets. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportResources")
        private ExportResources exportResources;

        /**
         * Resource to export data associated from the fleets.
         *
         * @param exportResources the value to set
         * @return this builder
         */
        public Builder exportResources(ExportResources exportResources) {
            this.exportResources = exportResources;
            this.__explicitlySet__.add("exportResources");
            return this;
        }
        /** Acknowledgement for cross region target bucket configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCrossRegionAcknowledged")
        private Boolean isCrossRegionAcknowledged;

        /**
         * Acknowledgement for cross region target bucket configuration.
         *
         * @param isCrossRegionAcknowledged the value to set
         * @return this builder
         */
        public Builder isCrossRegionAcknowledged(Boolean isCrossRegionAcknowledged) {
            this.isCrossRegionAcknowledged = isCrossRegionAcknowledged;
            this.__explicitlySet__.add("isCrossRegionAcknowledged");
            return this;
        }
        /** The name of the bucket where data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketName")
        private String targetBucketName;

        /**
         * The name of the bucket where data will be exported.
         *
         * @param targetBucketName the value to set
         * @return this builder
         */
        public Builder targetBucketName(String targetBucketName) {
            this.targetBucketName = targetBucketName;
            this.__explicitlySet__.add("targetBucketName");
            return this;
        }
        /** The namespace of the bucket where data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketNamespace")
        private String targetBucketNamespace;

        /**
         * The namespace of the bucket where data will be exported.
         *
         * @param targetBucketNamespace the value to set
         * @return this builder
         */
        public Builder targetBucketNamespace(String targetBucketNamespace) {
            this.targetBucketNamespace = targetBucketNamespace;
            this.__explicitlySet__.add("targetBucketNamespace");
            return this;
        }
        /** The namespace of the bucket where data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetBucketRegion")
        private String targetBucketRegion;

        /**
         * The namespace of the bucket where data will be exported.
         *
         * @param targetBucketRegion the value to set
         * @return this builder
         */
        public Builder targetBucketRegion(String targetBucketRegion) {
            this.targetBucketRegion = targetBucketRegion;
            this.__explicitlySet__.add("targetBucketRegion");
            return this;
        }
        /** Schedule at which data will be exported. */
        @com.fasterxml.jackson.annotation.JsonProperty("exportFrequency")
        private ExportFrequency exportFrequency;

        /**
         * Schedule at which data will be exported.
         *
         * @param exportFrequency the value to set
         * @return this builder
         */
        public Builder exportFrequency(ExportFrequency exportFrequency) {
            this.exportFrequency = exportFrequency;
            this.__explicitlySet__.add("exportFrequency");
            return this;
        }
        /** ExportSetting flag to store enabled or disabled status. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * ExportSetting flag to store enabled or disabled status.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The creation date and time of the export setting (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The creation date and time of the export setting (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The update date and time of the export setting (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * The update date and time of the export setting (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastModified the value to set
         * @return this builder
         */
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportSetting build() {
            ExportSetting model =
                    new ExportSetting(
                            this.exportSettingKey,
                            this.fleetId,
                            this.exportDuration,
                            this.exportResources,
                            this.isCrossRegionAcknowledged,
                            this.targetBucketName,
                            this.targetBucketNamespace,
                            this.targetBucketRegion,
                            this.exportFrequency,
                            this.isEnabled,
                            this.timeCreated,
                            this.timeLastModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportSetting model) {
            if (model.wasPropertyExplicitlySet("exportSettingKey")) {
                this.exportSettingKey(model.getExportSettingKey());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("exportDuration")) {
                this.exportDuration(model.getExportDuration());
            }
            if (model.wasPropertyExplicitlySet("exportResources")) {
                this.exportResources(model.getExportResources());
            }
            if (model.wasPropertyExplicitlySet("isCrossRegionAcknowledged")) {
                this.isCrossRegionAcknowledged(model.getIsCrossRegionAcknowledged());
            }
            if (model.wasPropertyExplicitlySet("targetBucketName")) {
                this.targetBucketName(model.getTargetBucketName());
            }
            if (model.wasPropertyExplicitlySet("targetBucketNamespace")) {
                this.targetBucketNamespace(model.getTargetBucketNamespace());
            }
            if (model.wasPropertyExplicitlySet("targetBucketRegion")) {
                this.targetBucketRegion(model.getTargetBucketRegion());
            }
            if (model.wasPropertyExplicitlySet("exportFrequency")) {
                this.exportFrequency(model.getExportFrequency());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
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

    /** The internal identifier of the export setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportSettingKey")
    private final String exportSettingKey;

    /**
     * The internal identifier of the export setting.
     *
     * @return the value
     */
    public String getExportSettingKey() {
        return exportSettingKey;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The duration of data to be exported for fleets. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportDuration")
    private final ExportDuration exportDuration;

    /**
     * The duration of data to be exported for fleets.
     *
     * @return the value
     */
    public ExportDuration getExportDuration() {
        return exportDuration;
    }

    /** Resource to export data associated from the fleets. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportResources")
    private final ExportResources exportResources;

    /**
     * Resource to export data associated from the fleets.
     *
     * @return the value
     */
    public ExportResources getExportResources() {
        return exportResources;
    }

    /** Acknowledgement for cross region target bucket configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossRegionAcknowledged")
    private final Boolean isCrossRegionAcknowledged;

    /**
     * Acknowledgement for cross region target bucket configuration.
     *
     * @return the value
     */
    public Boolean getIsCrossRegionAcknowledged() {
        return isCrossRegionAcknowledged;
    }

    /** The name of the bucket where data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketName")
    private final String targetBucketName;

    /**
     * The name of the bucket where data will be exported.
     *
     * @return the value
     */
    public String getTargetBucketName() {
        return targetBucketName;
    }

    /** The namespace of the bucket where data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketNamespace")
    private final String targetBucketNamespace;

    /**
     * The namespace of the bucket where data will be exported.
     *
     * @return the value
     */
    public String getTargetBucketNamespace() {
        return targetBucketNamespace;
    }

    /** The namespace of the bucket where data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetBucketRegion")
    private final String targetBucketRegion;

    /**
     * The namespace of the bucket where data will be exported.
     *
     * @return the value
     */
    public String getTargetBucketRegion() {
        return targetBucketRegion;
    }

    /** Schedule at which data will be exported. */
    @com.fasterxml.jackson.annotation.JsonProperty("exportFrequency")
    private final ExportFrequency exportFrequency;

    /**
     * Schedule at which data will be exported.
     *
     * @return the value
     */
    public ExportFrequency getExportFrequency() {
        return exportFrequency;
    }

    /** ExportSetting flag to store enabled or disabled status. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * ExportSetting flag to store enabled or disabled status.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The creation date and time of the export setting (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The creation date and time of the export setting (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The update date and time of the export setting (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * The update date and time of the export setting (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
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
        sb.append("ExportSetting(");
        sb.append("super=").append(super.toString());
        sb.append("exportSettingKey=").append(String.valueOf(this.exportSettingKey));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", exportDuration=").append(String.valueOf(this.exportDuration));
        sb.append(", exportResources=").append(String.valueOf(this.exportResources));
        sb.append(", isCrossRegionAcknowledged=")
                .append(String.valueOf(this.isCrossRegionAcknowledged));
        sb.append(", targetBucketName=").append(String.valueOf(this.targetBucketName));
        sb.append(", targetBucketNamespace=").append(String.valueOf(this.targetBucketNamespace));
        sb.append(", targetBucketRegion=").append(String.valueOf(this.targetBucketRegion));
        sb.append(", exportFrequency=").append(String.valueOf(this.exportFrequency));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportSetting)) {
            return false;
        }

        ExportSetting other = (ExportSetting) o;
        return java.util.Objects.equals(this.exportSettingKey, other.exportSettingKey)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.exportDuration, other.exportDuration)
                && java.util.Objects.equals(this.exportResources, other.exportResources)
                && java.util.Objects.equals(
                        this.isCrossRegionAcknowledged, other.isCrossRegionAcknowledged)
                && java.util.Objects.equals(this.targetBucketName, other.targetBucketName)
                && java.util.Objects.equals(this.targetBucketNamespace, other.targetBucketNamespace)
                && java.util.Objects.equals(this.targetBucketRegion, other.targetBucketRegion)
                && java.util.Objects.equals(this.exportFrequency, other.exportFrequency)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exportSettingKey == null ? 43 : this.exportSettingKey.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDuration == null ? 43 : this.exportDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.exportResources == null ? 43 : this.exportResources.hashCode());
        result =
                (result * PRIME)
                        + (this.isCrossRegionAcknowledged == null
                                ? 43
                                : this.isCrossRegionAcknowledged.hashCode());
        result =
                (result * PRIME)
                        + (this.targetBucketName == null ? 43 : this.targetBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetBucketNamespace == null
                                ? 43
                                : this.targetBucketNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.targetBucketRegion == null
                                ? 43
                                : this.targetBucketRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.exportFrequency == null ? 43 : this.exportFrequency.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

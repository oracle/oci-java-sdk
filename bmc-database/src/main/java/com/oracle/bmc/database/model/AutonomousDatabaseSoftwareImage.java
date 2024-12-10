/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Database Software Images created from Autonomous Container Database
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseSoftwareImage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseSoftwareImage
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "databaseVersion",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "releaseUpdate",
        "freeformTags",
        "definedTags",
        "autonomousDsiOneOffPatches",
        "imageShapeFamily",
        "dstFileVersion"
    })
    public AutonomousDatabaseSoftwareImage(
            String id,
            String compartmentId,
            String databaseVersion,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            String releaseUpdate,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> autonomousDsiOneOffPatches,
            ImageShapeFamily imageShapeFamily,
            String dstFileVersion) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.databaseVersion = databaseVersion;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.releaseUpdate = releaseUpdate;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.autonomousDsiOneOffPatches = autonomousDsiOneOffPatches;
        this.imageShapeFamily = imageShapeFamily;
        this.dstFileVersion = dstFileVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database Software Image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database Software Image.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The database version with which the Autonomous Database Software Image is to be built.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version with which the Autonomous Database Software Image is to be built.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Database Software Image. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Database Software Image. The name does not have to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current state of the Autonomous Database Software Image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous Database Software Image.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Detailed message for the lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed message for the lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the Autonomous Database Software Image was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Autonomous Database Software Image was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The Release Updates.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseUpdate")
        private String releaseUpdate;

        /**
         * The Release Updates.
         * @param releaseUpdate the value to set
         * @return this builder
         **/
        public Builder releaseUpdate(String releaseUpdate) {
            this.releaseUpdate = releaseUpdate;
            this.__explicitlySet__.add("releaseUpdate");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * One-off patches included in the Autonomous Database Software Image
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDsiOneOffPatches")
        private java.util.List<String> autonomousDsiOneOffPatches;

        /**
         * One-off patches included in the Autonomous Database Software Image
         * @param autonomousDsiOneOffPatches the value to set
         * @return this builder
         **/
        public Builder autonomousDsiOneOffPatches(
                java.util.List<String> autonomousDsiOneOffPatches) {
            this.autonomousDsiOneOffPatches = autonomousDsiOneOffPatches;
            this.__explicitlySet__.add("autonomousDsiOneOffPatches");
            return this;
        }
        /**
         * To what shape the image is meant for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
        private ImageShapeFamily imageShapeFamily;

        /**
         * To what shape the image is meant for.
         * @param imageShapeFamily the value to set
         * @return this builder
         **/
        public Builder imageShapeFamily(ImageShapeFamily imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            this.__explicitlySet__.add("imageShapeFamily");
            return this;
        }
        /**
         * DST Time-Zone File version of the Autonomous Container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dstFileVersion")
        private String dstFileVersion;

        /**
         * DST Time-Zone File version of the Autonomous Container Database.
         * @param dstFileVersion the value to set
         * @return this builder
         **/
        public Builder dstFileVersion(String dstFileVersion) {
            this.dstFileVersion = dstFileVersion;
            this.__explicitlySet__.add("dstFileVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseSoftwareImage build() {
            AutonomousDatabaseSoftwareImage model =
                    new AutonomousDatabaseSoftwareImage(
                            this.id,
                            this.compartmentId,
                            this.databaseVersion,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.releaseUpdate,
                            this.freeformTags,
                            this.definedTags,
                            this.autonomousDsiOneOffPatches,
                            this.imageShapeFamily,
                            this.dstFileVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseSoftwareImage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("releaseUpdate")) {
                this.releaseUpdate(model.getReleaseUpdate());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("autonomousDsiOneOffPatches")) {
                this.autonomousDsiOneOffPatches(model.getAutonomousDsiOneOffPatches());
            }
            if (model.wasPropertyExplicitlySet("imageShapeFamily")) {
                this.imageShapeFamily(model.getImageShapeFamily());
            }
            if (model.wasPropertyExplicitlySet("dstFileVersion")) {
                this.dstFileVersion(model.getDstFileVersion());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database Software Image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database Software Image.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The database version with which the Autonomous Database Software Image is to be built.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version with which the Autonomous Database Software Image is to be built.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The user-friendly name for the Autonomous Database Software Image. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database Software Image. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the Autonomous Database Software Image.
     **/
    public enum LifecycleState {
        Available("AVAILABLE"),
        Failed("FAILED"),
        Provisioning("PROVISIONING"),
        Expired("EXPIRED"),
        Terminated("TERMINATED"),
        Terminating("TERMINATING"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the Autonomous Database Software Image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous Database Software Image.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Detailed message for the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed message for the lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the Autonomous Database Software Image was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Autonomous Database Software Image was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The Release Updates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseUpdate")
    private final String releaseUpdate;

    /**
     * The Release Updates.
     * @return the value
     **/
    public String getReleaseUpdate() {
        return releaseUpdate;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * One-off patches included in the Autonomous Database Software Image
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDsiOneOffPatches")
    private final java.util.List<String> autonomousDsiOneOffPatches;

    /**
     * One-off patches included in the Autonomous Database Software Image
     * @return the value
     **/
    public java.util.List<String> getAutonomousDsiOneOffPatches() {
        return autonomousDsiOneOffPatches;
    }

    /**
     * To what shape the image is meant for.
     **/
    public enum ImageShapeFamily {
        ExaccShape("EXACC_SHAPE"),
        ExadataShape("EXADATA_SHAPE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ImageShapeFamily.class);

        private final String value;
        private static java.util.Map<String, ImageShapeFamily> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageShapeFamily v : ImageShapeFamily.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ImageShapeFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageShapeFamily create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ImageShapeFamily', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * To what shape the image is meant for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
    private final ImageShapeFamily imageShapeFamily;

    /**
     * To what shape the image is meant for.
     * @return the value
     **/
    public ImageShapeFamily getImageShapeFamily() {
        return imageShapeFamily;
    }

    /**
     * DST Time-Zone File version of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dstFileVersion")
    private final String dstFileVersion;

    /**
     * DST Time-Zone File version of the Autonomous Container Database.
     * @return the value
     **/
    public String getDstFileVersion() {
        return dstFileVersion;
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
        sb.append("AutonomousDatabaseSoftwareImage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", releaseUpdate=").append(String.valueOf(this.releaseUpdate));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", autonomousDsiOneOffPatches=")
                .append(String.valueOf(this.autonomousDsiOneOffPatches));
        sb.append(", imageShapeFamily=").append(String.valueOf(this.imageShapeFamily));
        sb.append(", dstFileVersion=").append(String.valueOf(this.dstFileVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseSoftwareImage)) {
            return false;
        }

        AutonomousDatabaseSoftwareImage other = (AutonomousDatabaseSoftwareImage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.releaseUpdate, other.releaseUpdate)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.autonomousDsiOneOffPatches, other.autonomousDsiOneOffPatches)
                && java.util.Objects.equals(this.imageShapeFamily, other.imageShapeFamily)
                && java.util.Objects.equals(this.dstFileVersion, other.dstFileVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseUpdate == null ? 43 : this.releaseUpdate.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDsiOneOffPatches == null
                                ? 43
                                : this.autonomousDsiOneOffPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeFamily == null ? 43 : this.imageShapeFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.dstFileVersion == null ? 43 : this.dstFileVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

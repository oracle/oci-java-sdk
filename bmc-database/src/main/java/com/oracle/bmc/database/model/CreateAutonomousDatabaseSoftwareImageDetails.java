/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for creating a Autonomous Database Software Image <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutonomousDatabaseSoftwareImageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousDatabaseSoftwareImageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "sourceCdbId",
        "imageShapeFamily",
        "freeformTags",
        "definedTags"
    })
    public CreateAutonomousDatabaseSoftwareImageDetails(
            String compartmentId,
            String displayName,
            String sourceCdbId,
            ImageShapeFamily imageShapeFamily,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.sourceCdbId = sourceCdbId;
        this.imageShapeFamily = imageShapeFamily;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Database Software Image. The name does not have
         * to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Database Software Image. The name does not have
         * to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The source Autonomous Container Database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) from which
         * to create Autonomous Database Software Image.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceCdbId")
        private String sourceCdbId;

        /**
         * The source Autonomous Container Database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) from which
         * to create Autonomous Database Software Image.
         *
         * @param sourceCdbId the value to set
         * @return this builder
         */
        public Builder sourceCdbId(String sourceCdbId) {
            this.sourceCdbId = sourceCdbId;
            this.__explicitlySet__.add("sourceCdbId");
            return this;
        }
        /** To what shape the image is meant for. */
        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
        private ImageShapeFamily imageShapeFamily;

        /**
         * To what shape the image is meant for.
         *
         * @param imageShapeFamily the value to set
         * @return this builder
         */
        public Builder imageShapeFamily(ImageShapeFamily imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            this.__explicitlySet__.add("imageShapeFamily");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousDatabaseSoftwareImageDetails build() {
            CreateAutonomousDatabaseSoftwareImageDetails model =
                    new CreateAutonomousDatabaseSoftwareImageDetails(
                            this.compartmentId,
                            this.displayName,
                            this.sourceCdbId,
                            this.imageShapeFamily,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousDatabaseSoftwareImageDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceCdbId")) {
                this.sourceCdbId(model.getSourceCdbId());
            }
            if (model.wasPropertyExplicitlySet("imageShapeFamily")) {
                this.imageShapeFamily(model.getImageShapeFamily());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the Autonomous Database Software Image. The name does not have to
     * be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database Software Image. The name does not have to
     * be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The source Autonomous Container Database
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) from which to
     * create Autonomous Database Software Image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCdbId")
    private final String sourceCdbId;

    /**
     * The source Autonomous Container Database
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) from which to
     * create Autonomous Database Software Image.
     *
     * @return the value
     */
    public String getSourceCdbId() {
        return sourceCdbId;
    }

    /** To what shape the image is meant for. */
    public enum ImageShapeFamily implements com.oracle.bmc.http.internal.BmcEnum {
        ExadataShape("EXADATA_SHAPE"),
        ExaccShape("EXACC_SHAPE"),
        ;

        private final String value;
        private static java.util.Map<String, ImageShapeFamily> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageShapeFamily v : ImageShapeFamily.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ImageShapeFamily: " + key);
        }
    };
    /** To what shape the image is meant for. */
    @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
    private final ImageShapeFamily imageShapeFamily;

    /**
     * To what shape the image is meant for.
     *
     * @return the value
     */
    public ImageShapeFamily getImageShapeFamily() {
        return imageShapeFamily;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateAutonomousDatabaseSoftwareImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sourceCdbId=").append(String.valueOf(this.sourceCdbId));
        sb.append(", imageShapeFamily=").append(String.valueOf(this.imageShapeFamily));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseSoftwareImageDetails)) {
            return false;
        }

        CreateAutonomousDatabaseSoftwareImageDetails other =
                (CreateAutonomousDatabaseSoftwareImageDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sourceCdbId, other.sourceCdbId)
                && java.util.Objects.equals(this.imageShapeFamily, other.imageShapeFamily)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sourceCdbId == null ? 43 : this.sourceCdbId.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeFamily == null ? 43 : this.imageShapeFamily.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

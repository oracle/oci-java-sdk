/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for creating a database software image in the specified compartment.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
    builder = CreateDatabaseSoftwareImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDatabaseSoftwareImageDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "databaseVersion",
        "displayName",
        "imageShapeFamily",
        "imageType",
        "patchSet",
        "databaseSoftwareImageOneOffPatches",
        "lsInventory",
        "freeformTags",
        "definedTags",
        "sourceDbHomeId"
    })
    public CreateDatabaseSoftwareImageDetails(
            String compartmentId,
            String databaseVersion,
            String displayName,
            ImageShapeFamily imageShapeFamily,
            ImageType imageType,
            String patchSet,
            java.util.List<String> databaseSoftwareImageOneOffPatches,
            String lsInventory,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String sourceDbHomeId) {
        super();
        this.compartmentId = compartmentId;
        this.databaseVersion = databaseVersion;
        this.displayName = displayName;
        this.imageShapeFamily = imageShapeFamily;
        this.imageType = imageType;
        this.patchSet = patchSet;
        this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
        this.lsInventory = lsInventory;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.sourceDbHomeId = sourceDbHomeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the database software image  belongs in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the database software image  belongs in.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The database version with which the database software image is to be built.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The database version with which the database software image is to be built.
         * @param databaseVersion the value to set
         * @return this builder
         **/
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The user-friendly name for the database software image. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the database software image. The name does not have to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
         * The type of software image. Can be grid or database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageType")
        private ImageType imageType;

        /**
         * The type of software image. Can be grid or database.
         * @param imageType the value to set
         * @return this builder
         **/
        public Builder imageType(ImageType imageType) {
            this.imageType = imageType;
            this.__explicitlySet__.add("imageType");
            return this;
        }
        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
        private String patchSet;

        /**
         * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
         * @param patchSet the value to set
         * @return this builder
         **/
        public Builder patchSet(String patchSet) {
            this.patchSet = patchSet;
            this.__explicitlySet__.add("patchSet");
            return this;
        }
        /**
         * List of one-off patches for Database Homes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
        private java.util.List<String> databaseSoftwareImageOneOffPatches;

        /**
         * List of one-off patches for Database Homes.
         * @param databaseSoftwareImageOneOffPatches the value to set
         * @return this builder
         **/
        public Builder databaseSoftwareImageOneOffPatches(
                java.util.List<String> databaseSoftwareImageOneOffPatches) {
            this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
            this.__explicitlySet__.add("databaseSoftwareImageOneOffPatches");
            return this;
        }
        /**
         * The output from the OPatch lsInventory command, which is passed as a string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
        private String lsInventory;

        /**
         * The output from the OPatch lsInventory command, which is passed as a string.
         * @param lsInventory the value to set
         * @return this builder
         **/
        public Builder lsInventory(String lsInventory) {
            this.lsInventory = lsInventory;
            this.__explicitlySet__.add("lsInventory");
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbHomeId")
        private String sourceDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
         * @param sourceDbHomeId the value to set
         * @return this builder
         **/
        public Builder sourceDbHomeId(String sourceDbHomeId) {
            this.sourceDbHomeId = sourceDbHomeId;
            this.__explicitlySet__.add("sourceDbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseSoftwareImageDetails build() {
            CreateDatabaseSoftwareImageDetails __instance__ =
                    new CreateDatabaseSoftwareImageDetails(
                            compartmentId,
                            databaseVersion,
                            displayName,
                            imageShapeFamily,
                            imageType,
                            patchSet,
                            databaseSoftwareImageOneOffPatches,
                            lsInventory,
                            freeformTags,
                            definedTags,
                            sourceDbHomeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseSoftwareImageDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .databaseVersion(o.getDatabaseVersion())
                            .displayName(o.getDisplayName())
                            .imageShapeFamily(o.getImageShapeFamily())
                            .imageType(o.getImageType())
                            .patchSet(o.getPatchSet())
                            .databaseSoftwareImageOneOffPatches(
                                    o.getDatabaseSoftwareImageOneOffPatches())
                            .lsInventory(o.getLsInventory())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .sourceDbHomeId(o.getSourceDbHomeId());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the database software image  belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the database software image  belongs in.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The database version with which the database software image is to be built.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The database version with which the database software image is to be built.
     * @return the value
     **/
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * To what shape the image is meant for.
     **/
    public enum ImageShapeFamily {
        VmBmShape("VM_BM_SHAPE"),
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
     * The type of software image. Can be grid or database.
     **/
    public enum ImageType {
        GridImage("GRID_IMAGE"),
        DatabaseImage("DATABASE_IMAGE"),
        ;

        private final String value;
        private static java.util.Map<String, ImageType> map;

        static {
            map = new java.util.HashMap<>();
            for (ImageType v : ImageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ImageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ImageType: " + key);
        }
    };
    /**
     * The type of software image. Can be grid or database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageType")
    private final ImageType imageType;

    /**
     * The type of software image. Can be grid or database.
     * @return the value
     **/
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
    private final String patchSet;

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     * @return the value
     **/
    public String getPatchSet() {
        return patchSet;
    }

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
    private final java.util.List<String> databaseSoftwareImageOneOffPatches;

    /**
     * List of one-off patches for Database Homes.
     * @return the value
     **/
    public java.util.List<String> getDatabaseSoftwareImageOneOffPatches() {
        return databaseSoftwareImageOneOffPatches;
    }

    /**
     * The output from the OPatch lsInventory command, which is passed as a string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
    private final String lsInventory;

    /**
     * The output from the OPatch lsInventory command, which is passed as a string.
     * @return the value
     **/
    public String getLsInventory() {
        return lsInventory;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbHomeId")
    private final String sourceDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
     * @return the value
     **/
    public String getSourceDbHomeId() {
        return sourceDbHomeId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDatabaseSoftwareImageDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", imageShapeFamily=").append(String.valueOf(this.imageShapeFamily));
        sb.append(", imageType=").append(String.valueOf(this.imageType));
        sb.append(", patchSet=").append(String.valueOf(this.patchSet));
        sb.append(", databaseSoftwareImageOneOffPatches=")
                .append(String.valueOf(this.databaseSoftwareImageOneOffPatches));
        sb.append(", lsInventory=").append(String.valueOf(this.lsInventory));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", sourceDbHomeId=").append(String.valueOf(this.sourceDbHomeId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseSoftwareImageDetails)) {
            return false;
        }

        CreateDatabaseSoftwareImageDetails other = (CreateDatabaseSoftwareImageDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.imageShapeFamily, other.imageShapeFamily)
                && java.util.Objects.equals(this.imageType, other.imageType)
                && java.util.Objects.equals(this.patchSet, other.patchSet)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageOneOffPatches,
                        other.databaseSoftwareImageOneOffPatches)
                && java.util.Objects.equals(this.lsInventory, other.lsInventory)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.sourceDbHomeId, other.sourceDbHomeId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.imageShapeFamily == null ? 43 : this.imageShapeFamily.hashCode());
        result = (result * PRIME) + (this.imageType == null ? 43 : this.imageType.hashCode());
        result = (result * PRIME) + (this.patchSet == null ? 43 : this.patchSet.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageOneOffPatches == null
                                ? 43
                                : this.databaseSoftwareImageOneOffPatches.hashCode());
        result = (result * PRIME) + (this.lsInventory == null ? 43 : this.lsInventory.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDbHomeId == null ? 43 : this.sourceDbHomeId.hashCode());
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

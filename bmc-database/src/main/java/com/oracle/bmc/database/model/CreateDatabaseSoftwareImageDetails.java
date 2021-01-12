/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDatabaseSoftwareImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDatabaseSoftwareImageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageShapeFamily")
        private ImageShapeFamily imageShapeFamily;

        public Builder imageShapeFamily(ImageShapeFamily imageShapeFamily) {
            this.imageShapeFamily = imageShapeFamily;
            this.__explicitlySet__.add("imageShapeFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageType")
        private ImageType imageType;

        public Builder imageType(ImageType imageType) {
            this.imageType = imageType;
            this.__explicitlySet__.add("imageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
        private String patchSet;

        public Builder patchSet(String patchSet) {
            this.patchSet = patchSet;
            this.__explicitlySet__.add("patchSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
        private java.util.List<String> databaseSoftwareImageOneOffPatches;

        public Builder databaseSoftwareImageOneOffPatches(
                java.util.List<String> databaseSoftwareImageOneOffPatches) {
            this.databaseSoftwareImageOneOffPatches = databaseSoftwareImageOneOffPatches;
            this.__explicitlySet__.add("databaseSoftwareImageOneOffPatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
        private String lsInventory;

        public Builder lsInventory(String lsInventory) {
            this.lsInventory = lsInventory;
            this.__explicitlySet__.add("lsInventory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
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
                            definedTags);
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
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the database software image  belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The database version with which the database software image is to be built.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    String databaseVersion;

    /**
     * The user-friendly name for the database software image. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * To what shape the image is meant for.
     **/
    public enum ImageShapeFamily {
        VmBmShape("VM_BM_SHAPE"),
        ExadataShape("EXADATA_SHAPE"),
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
    ImageShapeFamily imageShapeFamily;
    /**
     * List of the Fault Domains in which this DB system is provisioned.
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
     * List of the Fault Domains in which this DB system is provisioned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageType")
    ImageType imageType;

    /**
     * The PSU or PBP or Release Updates. To get a list of supported versions, use the {@link #listDbVersions(ListDbVersionsRequest) listDbVersions} operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchSet")
    String patchSet;

    /**
     * List of one-off patches for Database Homes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageOneOffPatches")
    java.util.List<String> databaseSoftwareImageOneOffPatches;

    /**
     * output from lsinventory which will get passed as a string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lsInventory")
    String lsInventory;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

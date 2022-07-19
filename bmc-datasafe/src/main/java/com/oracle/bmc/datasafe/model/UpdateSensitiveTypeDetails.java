/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update a sensitive type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType",
    defaultImpl = UpdateSensitiveTypeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateSensitiveCategoryDetails.class,
        name = "SENSITIVE_CATEGORY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateSensitiveTypePatternDetails.class,
        name = "SENSITIVE_TYPE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateSensitiveTypeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "shortName",
        "description",
        "parentCategoryId",
        "freeformTags",
        "definedTags"
    })
    protected UpdateSensitiveTypeDetails(
            String displayName,
            String shortName,
            String description,
            String parentCategoryId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.shortName = shortName;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * The display name of the sensitive type. The name does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the sensitive type. The name does not have to be unique, and it's changeable.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The short name of the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortName")
    private final String shortName;

    /**
     * The short name of the sensitive type.
     * @return the value
     **/
    public String getShortName() {
        return shortName;
    }

    /**
     * The description of the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the sensitive type.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the parent sensitive category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCategoryId")
    private final String parentCategoryId;

    /**
     * The OCID of the parent sensitive category.
     * @return the value
     **/
    public String getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateSensitiveTypeDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", shortName=").append(String.valueOf(this.shortName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parentCategoryId=").append(String.valueOf(this.parentCategoryId));
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
        if (!(o instanceof UpdateSensitiveTypeDetails)) {
            return false;
        }

        UpdateSensitiveTypeDetails other = (UpdateSensitiveTypeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shortName, other.shortName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parentCategoryId, other.parentCategoryId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.shortName == null ? 43 : this.shortName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.parentCategoryId == null ? 43 : this.parentCategoryId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        return result;
    }
}

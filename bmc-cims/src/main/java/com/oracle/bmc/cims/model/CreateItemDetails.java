/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details gathered during item creation.
 * <p>
 **Caution:** Avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CreateItemDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateTechSupportItemDetails.class,
        name = "tech"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateLimitItemDetails.class,
        name = "limit"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateItemDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"category", "subCategory", "issueType", "name"})
    protected CreateItemDetails(
            CreateCategoryDetails category,
            CreateSubCategoryDetails subCategory,
            CreateIssueTypeDetails issueType,
            String name) {
        super();
        this.category = category;
        this.subCategory = subCategory;
        this.issueType = issueType;
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final CreateCategoryDetails category;

    public CreateCategoryDetails getCategory() {
        return category;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
    private final CreateSubCategoryDetails subCategory;

    public CreateSubCategoryDetails getSubCategory() {
        return subCategory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("issueType")
    private final CreateIssueTypeDetails issueType;

    public CreateIssueTypeDetails getIssueType() {
        return issueType;
    }

    /**
     * The display name of the item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The display name of the item.
     * @return the value
     **/
    public String getName() {
        return name;
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
        sb.append("CreateItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", subCategory=").append(String.valueOf(this.subCategory));
        sb.append(", issueType=").append(String.valueOf(this.issueType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateItemDetails)) {
            return false;
        }

        CreateItemDetails other = (CreateItemDetails) o;
        return java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.subCategory, other.subCategory)
                && java.util.Objects.equals(this.issueType, other.issueType)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.subCategory == null ? 43 : this.subCategory.hashCode());
        result = (result * PRIME) + (this.issueType == null ? 43 : this.issueType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

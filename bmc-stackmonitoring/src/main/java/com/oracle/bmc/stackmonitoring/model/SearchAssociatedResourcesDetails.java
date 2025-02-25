/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The criteria for searching associated monitored resources.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchAssociatedResourcesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchAssociatedResourcesDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "resourceType",
        "resourceId",
        "limitLevel",
        "associationTypes"
    })
    public SearchAssociatedResourcesDetails(
            String compartmentId,
            String resourceType,
            String resourceId,
            Integer limitLevel,
            java.util.List<String> associationTypes) {
        super();
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.limitLevel = limitLevel;
        this.associationTypes = associationTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A filter to return associated resources that match resources of type.
         * Either resourceId or resourceType should be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * A filter to return associated resources that match resources of type.
         * Either resourceId or resourceType should be provided.
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Monitored resource identifier for which the associated resources should be fetched.
         * Either resourceId or resourceType should be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Monitored resource identifier for which the associated resources should be fetched.
         * Either resourceId or resourceType should be provided.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The field which determines the depth of hierarchy while searching for associated resources.
         * Possible values - 0 for all levels. And positive number to indicate different levels.
         * Default value is 1, which indicates 1st level associations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitLevel")
        private Integer limitLevel;

        /**
         * The field which determines the depth of hierarchy while searching for associated resources.
         * Possible values - 0 for all levels. And positive number to indicate different levels.
         * Default value is 1, which indicates 1st level associations.
         *
         * @param limitLevel the value to set
         * @return this builder
         **/
        public Builder limitLevel(Integer limitLevel) {
            this.limitLevel = limitLevel;
            this.__explicitlySet__.add("limitLevel");
            return this;
        }
        /**
         * Association types filter to be searched for finding associated resources.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associationTypes")
        private java.util.List<String> associationTypes;

        /**
         * Association types filter to be searched for finding associated resources.
         *
         * @param associationTypes the value to set
         * @return this builder
         **/
        public Builder associationTypes(java.util.List<String> associationTypes) {
            this.associationTypes = associationTypes;
            this.__explicitlySet__.add("associationTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchAssociatedResourcesDetails build() {
            SearchAssociatedResourcesDetails model =
                    new SearchAssociatedResourcesDetails(
                            this.compartmentId,
                            this.resourceType,
                            this.resourceId,
                            this.limitLevel,
                            this.associationTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchAssociatedResourcesDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("limitLevel")) {
                this.limitLevel(model.getLimitLevel());
            }
            if (model.wasPropertyExplicitlySet("associationTypes")) {
                this.associationTypes(model.getAssociationTypes());
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
     * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A filter to return associated resources that match resources of type.
     * Either resourceId or resourceType should be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * A filter to return associated resources that match resources of type.
     * Either resourceId or resourceType should be provided.
     *
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Monitored resource identifier for which the associated resources should be fetched.
     * Either resourceId or resourceType should be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Monitored resource identifier for which the associated resources should be fetched.
     * Either resourceId or resourceType should be provided.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The field which determines the depth of hierarchy while searching for associated resources.
     * Possible values - 0 for all levels. And positive number to indicate different levels.
     * Default value is 1, which indicates 1st level associations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitLevel")
    private final Integer limitLevel;

    /**
     * The field which determines the depth of hierarchy while searching for associated resources.
     * Possible values - 0 for all levels. And positive number to indicate different levels.
     * Default value is 1, which indicates 1st level associations.
     *
     * @return the value
     **/
    public Integer getLimitLevel() {
        return limitLevel;
    }

    /**
     * Association types filter to be searched for finding associated resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationTypes")
    private final java.util.List<String> associationTypes;

    /**
     * Association types filter to be searched for finding associated resources.
     *
     * @return the value
     **/
    public java.util.List<String> getAssociationTypes() {
        return associationTypes;
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
        sb.append("SearchAssociatedResourcesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", limitLevel=").append(String.valueOf(this.limitLevel));
        sb.append(", associationTypes=").append(String.valueOf(this.associationTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchAssociatedResourcesDetails)) {
            return false;
        }

        SearchAssociatedResourcesDetails other = (SearchAssociatedResourcesDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.limitLevel, other.limitLevel)
                && java.util.Objects.equals(this.associationTypes, other.associationTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.limitLevel == null ? 43 : this.limitLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.associationTypes == null ? 43 : this.associationTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

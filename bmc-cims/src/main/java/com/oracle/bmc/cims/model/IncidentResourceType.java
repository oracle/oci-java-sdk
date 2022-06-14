/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the resource associated with the support request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IncidentResourceType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IncidentResourceType {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceTypeKey",
        "name",
        "label",
        "description",
        "serviceCategoryList"
    })
    public IncidentResourceType(
            String resourceTypeKey,
            String name,
            String label,
            String description,
            java.util.List<ServiceCategory> serviceCategoryList) {
        super();
        this.resourceTypeKey = resourceTypeKey;
        this.name = name;
        this.label = label;
        this.description = description;
        this.serviceCategoryList = serviceCategoryList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeKey")
        private String resourceTypeKey;

        /**
         * Unique identifier of the resource.
         * @param resourceTypeKey the value to set
         * @return this builder
         **/
        public Builder resourceTypeKey(String resourceTypeKey) {
            this.resourceTypeKey = resourceTypeKey;
            this.__explicitlySet__.add("resourceTypeKey");
            return this;
        }
        /**
         * The display name of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The display name of the resource.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The label associated with the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * The label associated with the resource.
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * The description of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the resource.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The service category list.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCategoryList")
        private java.util.List<ServiceCategory> serviceCategoryList;

        /**
         * The service category list.
         * @param serviceCategoryList the value to set
         * @return this builder
         **/
        public Builder serviceCategoryList(java.util.List<ServiceCategory> serviceCategoryList) {
            this.serviceCategoryList = serviceCategoryList;
            this.__explicitlySet__.add("serviceCategoryList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncidentResourceType build() {
            IncidentResourceType __instance__ =
                    new IncidentResourceType(
                            resourceTypeKey, name, label, description, serviceCategoryList);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncidentResourceType o) {
            Builder copiedBuilder =
                    resourceTypeKey(o.getResourceTypeKey())
                            .name(o.getName())
                            .label(o.getLabel())
                            .description(o.getDescription())
                            .serviceCategoryList(o.getServiceCategoryList());

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
     * Unique identifier of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeKey")
    private final String resourceTypeKey;

    /**
     * Unique identifier of the resource.
     * @return the value
     **/
    public String getResourceTypeKey() {
        return resourceTypeKey;
    }

    /**
     * The display name of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The display name of the resource.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The label associated with the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * The label associated with the resource.
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * The description of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the resource.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The service category list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategoryList")
    private final java.util.List<ServiceCategory> serviceCategoryList;

    /**
     * The service category list.
     * @return the value
     **/
    public java.util.List<ServiceCategory> getServiceCategoryList() {
        return serviceCategoryList;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IncidentResourceType(");
        sb.append("resourceTypeKey=").append(String.valueOf(this.resourceTypeKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", serviceCategoryList=").append(String.valueOf(this.serviceCategoryList));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncidentResourceType)) {
            return false;
        }

        IncidentResourceType other = (IncidentResourceType) o;
        return java.util.Objects.equals(this.resourceTypeKey, other.resourceTypeKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.serviceCategoryList, other.serviceCategoryList)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceTypeKey == null ? 43 : this.resourceTypeKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCategoryList == null
                                ? 43
                                : this.serviceCategoryList.hashCode());
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

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public final class IncidentResourceType extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceTypeKey",
        "name",
        "label",
        "description",
        "isSubscriptionsSupported",
        "serviceCategoryList",
        "service",
        "services"
    })
    public IncidentResourceType(
            String resourceTypeKey,
            String name,
            String label,
            String description,
            Boolean isSubscriptionsSupported,
            java.util.List<ServiceCategory> serviceCategoryList,
            java.util.Map<String, String> service,
            java.util.List<Services> services) {
        super();
        this.resourceTypeKey = resourceTypeKey;
        this.name = name;
        this.label = label;
        this.description = description;
        this.isSubscriptionsSupported = isSubscriptionsSupported;
        this.serviceCategoryList = serviceCategoryList;
        this.service = service;
        this.services = services;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeKey")
        private String resourceTypeKey;

        /**
         * A unique identifier for the resource.
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
         * Indicates whether multi-subscription is supported
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSubscriptionsSupported")
        private Boolean isSubscriptionsSupported;

        /**
         * Indicates whether multi-subscription is supported
         * @param isSubscriptionsSupported the value to set
         * @return this builder
         **/
        public Builder isSubscriptionsSupported(Boolean isSubscriptionsSupported) {
            this.isSubscriptionsSupported = isSubscriptionsSupported;
            this.__explicitlySet__.add("isSubscriptionsSupported");
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
        /**
         * The map of services for MOS Taxonomy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private java.util.Map<String, String> service;

        /**
         * The map of services for MOS Taxonomy.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(java.util.Map<String, String> service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The service categories list for MOS Taxonomy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<Services> services;

        /**
         * The service categories list for MOS Taxonomy.
         * @param services the value to set
         * @return this builder
         **/
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncidentResourceType build() {
            IncidentResourceType model =
                    new IncidentResourceType(
                            this.resourceTypeKey,
                            this.name,
                            this.label,
                            this.description,
                            this.isSubscriptionsSupported,
                            this.serviceCategoryList,
                            this.service,
                            this.services);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncidentResourceType model) {
            if (model.wasPropertyExplicitlySet("resourceTypeKey")) {
                this.resourceTypeKey(model.getResourceTypeKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isSubscriptionsSupported")) {
                this.isSubscriptionsSupported(model.getIsSubscriptionsSupported());
            }
            if (model.wasPropertyExplicitlySet("serviceCategoryList")) {
                this.serviceCategoryList(model.getServiceCategoryList());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
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
     * A unique identifier for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeKey")
    private final String resourceTypeKey;

    /**
     * A unique identifier for the resource.
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
     * Indicates whether multi-subscription is supported
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSubscriptionsSupported")
    private final Boolean isSubscriptionsSupported;

    /**
     * Indicates whether multi-subscription is supported
     * @return the value
     **/
    public Boolean getIsSubscriptionsSupported() {
        return isSubscriptionsSupported;
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

    /**
     * The map of services for MOS Taxonomy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final java.util.Map<String, String> service;

    /**
     * The map of services for MOS Taxonomy.
     * @return the value
     **/
    public java.util.Map<String, String> getService() {
        return service;
    }

    /**
     * The service categories list for MOS Taxonomy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<Services> services;

    /**
     * The service categories list for MOS Taxonomy.
     * @return the value
     **/
    public java.util.List<Services> getServices() {
        return services;
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
        sb.append("IncidentResourceType(");
        sb.append("super=").append(super.toString());
        sb.append("resourceTypeKey=").append(String.valueOf(this.resourceTypeKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSubscriptionsSupported=")
                .append(String.valueOf(this.isSubscriptionsSupported));
        sb.append(", serviceCategoryList=").append(String.valueOf(this.serviceCategoryList));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", services=").append(String.valueOf(this.services));
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
                && java.util.Objects.equals(
                        this.isSubscriptionsSupported, other.isSubscriptionsSupported)
                && java.util.Objects.equals(this.serviceCategoryList, other.serviceCategoryList)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.services, other.services)
                && super.equals(other);
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
                        + (this.isSubscriptionsSupported == null
                                ? 43
                                : this.isSubscriptionsSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCategoryList == null
                                ? 43
                                : this.serviceCategoryList.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

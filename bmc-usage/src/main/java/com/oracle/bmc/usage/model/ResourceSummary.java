/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.model;

/**
 * The details of a resource under a service.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dailyUnitDisplayName",
        "hourlyUnitDisplayName",
        "rawUnitDisplayName",
        "usageDataType",
        "name",
        "servicename",
        "description",
        "instanceType",
        "isPurchased",
        "childResources",
        "skus"
    })
    public ResourceSummary(
            String dailyUnitDisplayName,
            String hourlyUnitDisplayName,
            String rawUnitDisplayName,
            UsageDataType usageDataType,
            String name,
            String servicename,
            String description,
            String instanceType,
            Boolean isPurchased,
            java.util.List<String> childResources,
            java.util.List<SkuProducts> skus) {
        super();
        this.dailyUnitDisplayName = dailyUnitDisplayName;
        this.hourlyUnitDisplayName = hourlyUnitDisplayName;
        this.rawUnitDisplayName = rawUnitDisplayName;
        this.usageDataType = usageDataType;
        this.name = name;
        this.servicename = servicename;
        this.description = description;
        this.instanceType = instanceType;
        this.isPurchased = isPurchased;
        this.childResources = childResources;
        this.skus = skus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Units to be used for daily aggregated data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dailyUnitDisplayName")
        private String dailyUnitDisplayName;

        /**
         * Units to be used for daily aggregated data.
         * @param dailyUnitDisplayName the value to set
         * @return this builder
         **/
        public Builder dailyUnitDisplayName(String dailyUnitDisplayName) {
            this.dailyUnitDisplayName = dailyUnitDisplayName;
            this.__explicitlySet__.add("dailyUnitDisplayName");
            return this;
        }
        /**
         * Units to be used for hourly aggregated data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hourlyUnitDisplayName")
        private String hourlyUnitDisplayName;

        /**
         * Units to be used for hourly aggregated data.
         * @param hourlyUnitDisplayName the value to set
         * @return this builder
         **/
        public Builder hourlyUnitDisplayName(String hourlyUnitDisplayName) {
            this.hourlyUnitDisplayName = hourlyUnitDisplayName;
            this.__explicitlySet__.add("hourlyUnitDisplayName");
            return this;
        }
        /**
         * Default units to use when unspecified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rawUnitDisplayName")
        private String rawUnitDisplayName;

        /**
         * Default units to use when unspecified.
         * @param rawUnitDisplayName the value to set
         * @return this builder
         **/
        public Builder rawUnitDisplayName(String rawUnitDisplayName) {
            this.rawUnitDisplayName = rawUnitDisplayName;
            this.__explicitlySet__.add("rawUnitDisplayName");
            return this;
        }
        /**
         * Usage data type of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageDataType")
        private UsageDataType usageDataType;

        /**
         * Usage data type of the resource.
         * @param usageDataType the value to set
         * @return this builder
         **/
        public Builder usageDataType(UsageDataType usageDataType) {
            this.usageDataType = usageDataType;
            this.__explicitlySet__.add("usageDataType");
            return this;
        }
        /**
         * Name of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the resource.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Name of the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("servicename")
        private String servicename;

        /**
         * Name of the service.
         * @param servicename the value to set
         * @return this builder
         **/
        public Builder servicename(String servicename) {
            this.servicename = servicename;
            this.__explicitlySet__.add("servicename");
            return this;
        }
        /**
         * Description of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the resource.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Instance type for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
        private String instanceType;

        /**
         * Instance type for the resource.
         * @param instanceType the value to set
         * @return this builder
         **/
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            this.__explicitlySet__.add("instanceType");
            return this;
        }
        /**
         * Indicates if the SKU was purchased
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPurchased")
        private Boolean isPurchased;

        /**
         * Indicates if the SKU was purchased
         * @param isPurchased the value to set
         * @return this builder
         **/
        public Builder isPurchased(Boolean isPurchased) {
            this.isPurchased = isPurchased;
            this.__explicitlySet__.add("isPurchased");
            return this;
        }
        /**
         * The details of any child resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childResources")
        private java.util.List<String> childResources;

        /**
         * The details of any child resources.
         * @param childResources the value to set
         * @return this builder
         **/
        public Builder childResources(java.util.List<String> childResources) {
            this.childResources = childResources;
            this.__explicitlySet__.add("childResources");
            return this;
        }
        /**
         * The details of resource Skus.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<SkuProducts> skus;

        /**
         * The details of resource Skus.
         * @param skus the value to set
         * @return this builder
         **/
        public Builder skus(java.util.List<SkuProducts> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceSummary build() {
            ResourceSummary model =
                    new ResourceSummary(
                            this.dailyUnitDisplayName,
                            this.hourlyUnitDisplayName,
                            this.rawUnitDisplayName,
                            this.usageDataType,
                            this.name,
                            this.servicename,
                            this.description,
                            this.instanceType,
                            this.isPurchased,
                            this.childResources,
                            this.skus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceSummary model) {
            if (model.wasPropertyExplicitlySet("dailyUnitDisplayName")) {
                this.dailyUnitDisplayName(model.getDailyUnitDisplayName());
            }
            if (model.wasPropertyExplicitlySet("hourlyUnitDisplayName")) {
                this.hourlyUnitDisplayName(model.getHourlyUnitDisplayName());
            }
            if (model.wasPropertyExplicitlySet("rawUnitDisplayName")) {
                this.rawUnitDisplayName(model.getRawUnitDisplayName());
            }
            if (model.wasPropertyExplicitlySet("usageDataType")) {
                this.usageDataType(model.getUsageDataType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("servicename")) {
                this.servicename(model.getServicename());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("instanceType")) {
                this.instanceType(model.getInstanceType());
            }
            if (model.wasPropertyExplicitlySet("isPurchased")) {
                this.isPurchased(model.getIsPurchased());
            }
            if (model.wasPropertyExplicitlySet("childResources")) {
                this.childResources(model.getChildResources());
            }
            if (model.wasPropertyExplicitlySet("skus")) {
                this.skus(model.getSkus());
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
     * Units to be used for daily aggregated data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dailyUnitDisplayName")
    private final String dailyUnitDisplayName;

    /**
     * Units to be used for daily aggregated data.
     * @return the value
     **/
    public String getDailyUnitDisplayName() {
        return dailyUnitDisplayName;
    }

    /**
     * Units to be used for hourly aggregated data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hourlyUnitDisplayName")
    private final String hourlyUnitDisplayName;

    /**
     * Units to be used for hourly aggregated data.
     * @return the value
     **/
    public String getHourlyUnitDisplayName() {
        return hourlyUnitDisplayName;
    }

    /**
     * Default units to use when unspecified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rawUnitDisplayName")
    private final String rawUnitDisplayName;

    /**
     * Default units to use when unspecified.
     * @return the value
     **/
    public String getRawUnitDisplayName() {
        return rawUnitDisplayName;
    }

    /**
     * Usage data type of the resource.
     **/
    public enum UsageDataType {
        Interval("INTERVAL"),
        PointData("POINT_DATA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UsageDataType.class);

        private final String value;
        private static java.util.Map<String, UsageDataType> map;

        static {
            map = new java.util.HashMap<>();
            for (UsageDataType v : UsageDataType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UsageDataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UsageDataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UsageDataType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Usage data type of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageDataType")
    private final UsageDataType usageDataType;

    /**
     * Usage data type of the resource.
     * @return the value
     **/
    public UsageDataType getUsageDataType() {
        return usageDataType;
    }

    /**
     * Name of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the resource.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Name of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicename")
    private final String servicename;

    /**
     * Name of the service.
     * @return the value
     **/
    public String getServicename() {
        return servicename;
    }

    /**
     * Description of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the resource.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Instance type for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
    private final String instanceType;

    /**
     * Instance type for the resource.
     * @return the value
     **/
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * Indicates if the SKU was purchased
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPurchased")
    private final Boolean isPurchased;

    /**
     * Indicates if the SKU was purchased
     * @return the value
     **/
    public Boolean getIsPurchased() {
        return isPurchased;
    }

    /**
     * The details of any child resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childResources")
    private final java.util.List<String> childResources;

    /**
     * The details of any child resources.
     * @return the value
     **/
    public java.util.List<String> getChildResources() {
        return childResources;
    }

    /**
     * The details of resource Skus.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<SkuProducts> skus;

    /**
     * The details of resource Skus.
     * @return the value
     **/
    public java.util.List<SkuProducts> getSkus() {
        return skus;
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
        sb.append("ResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dailyUnitDisplayName=").append(String.valueOf(this.dailyUnitDisplayName));
        sb.append(", hourlyUnitDisplayName=").append(String.valueOf(this.hourlyUnitDisplayName));
        sb.append(", rawUnitDisplayName=").append(String.valueOf(this.rawUnitDisplayName));
        sb.append(", usageDataType=").append(String.valueOf(this.usageDataType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", servicename=").append(String.valueOf(this.servicename));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", instanceType=").append(String.valueOf(this.instanceType));
        sb.append(", isPurchased=").append(String.valueOf(this.isPurchased));
        sb.append(", childResources=").append(String.valueOf(this.childResources));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceSummary)) {
            return false;
        }

        ResourceSummary other = (ResourceSummary) o;
        return java.util.Objects.equals(this.dailyUnitDisplayName, other.dailyUnitDisplayName)
                && java.util.Objects.equals(this.hourlyUnitDisplayName, other.hourlyUnitDisplayName)
                && java.util.Objects.equals(this.rawUnitDisplayName, other.rawUnitDisplayName)
                && java.util.Objects.equals(this.usageDataType, other.usageDataType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.servicename, other.servicename)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.instanceType, other.instanceType)
                && java.util.Objects.equals(this.isPurchased, other.isPurchased)
                && java.util.Objects.equals(this.childResources, other.childResources)
                && java.util.Objects.equals(this.skus, other.skus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dailyUnitDisplayName == null
                                ? 43
                                : this.dailyUnitDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.hourlyUnitDisplayName == null
                                ? 43
                                : this.hourlyUnitDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.rawUnitDisplayName == null
                                ? 43
                                : this.rawUnitDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.usageDataType == null ? 43 : this.usageDataType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.servicename == null ? 43 : this.servicename.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.instanceType == null ? 43 : this.instanceType.hashCode());
        result = (result * PRIME) + (this.isPurchased == null ? 43 : this.isPurchased.hashCode());
        result =
                (result * PRIME)
                        + (this.childResources == null ? 43 : this.childResources.hashCode());
        result = (result * PRIME) + (this.skus == null ? 43 : this.skus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

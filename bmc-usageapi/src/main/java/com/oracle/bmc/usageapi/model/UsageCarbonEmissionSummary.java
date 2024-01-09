/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The usage carbon emission store result. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UsageCarbonEmissionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageCarbonEmissionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "tenantName",
        "compartmentId",
        "compartmentPath",
        "compartmentName",
        "service",
        "resourceName",
        "resourceId",
        "region",
        "ad",
        "skuPartNumber",
        "skuName",
        "platform",
        "timeUsageStarted",
        "timeUsageEnded",
        "computedCarbonEmission",
        "emissionCalculationMethod",
        "subscriptionId",
        "tags"
    })
    public UsageCarbonEmissionSummary(
            String tenantId,
            String tenantName,
            String compartmentId,
            String compartmentPath,
            String compartmentName,
            String service,
            String resourceName,
            String resourceId,
            String region,
            String ad,
            String skuPartNumber,
            String skuName,
            String platform,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            Double computedCarbonEmission,
            String emissionCalculationMethod,
            String subscriptionId,
            java.util.List<Tag> tags) {
        super();
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.compartmentId = compartmentId;
        this.compartmentPath = compartmentPath;
        this.compartmentName = compartmentName;
        this.service = service;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.region = region;
        this.ad = ad;
        this.skuPartNumber = skuPartNumber;
        this.skuName = skuName;
        this.platform = platform;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.computedCarbonEmission = computedCarbonEmission;
        this.emissionCalculationMethod = emissionCalculationMethod;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The tenancy OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The tenancy OCID.
         *
         * @param tenantId the value to set
         * @return this builder
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /** The tenancy name. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        /**
         * The tenancy name.
         *
         * @param tenantName the value to set
         * @return this builder
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }
        /** The compartment OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The compartment path, starting from root. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
        private String compartmentPath;

        /**
         * The compartment path, starting from root.
         *
         * @param compartmentPath the value to set
         * @return this builder
         */
        public Builder compartmentPath(String compartmentPath) {
            this.compartmentPath = compartmentPath;
            this.__explicitlySet__.add("compartmentPath");
            return this;
        }
        /** The compartment name. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The compartment name.
         *
         * @param compartmentName the value to set
         * @return this builder
         */
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /** The service name that is incurring the cost. */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The service name that is incurring the cost.
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /** The resource name that is incurring the cost. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource name that is incurring the cost.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The resource OCID that is incurring the cost. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The resource OCID that is incurring the cost.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The region of the usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region of the usage.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The availability domain of the usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private String ad;

        /**
         * The availability domain of the usage.
         *
         * @param ad the value to set
         * @return this builder
         */
        public Builder ad(String ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }
        /** The SKU part number. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
        private String skuPartNumber;

        /**
         * The SKU part number.
         *
         * @param skuPartNumber the value to set
         * @return this builder
         */
        public Builder skuPartNumber(String skuPartNumber) {
            this.skuPartNumber = skuPartNumber;
            this.__explicitlySet__.add("skuPartNumber");
            return this;
        }
        /** The SKU friendly name. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuName")
        private String skuName;

        /**
         * The SKU friendly name.
         *
         * @param skuName the value to set
         * @return this builder
         */
        public Builder skuName(String skuName) {
            this.skuName = skuName;
            this.__explicitlySet__.add("skuName");
            return this;
        }
        /** Platform for the cost. */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * Platform for the cost.
         *
         * @param platform the value to set
         * @return this builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /** The usage start time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The usage start time.
         *
         * @param timeUsageStarted the value to set
         * @return this builder
         */
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /** The usage end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The usage end time.
         *
         * @param timeUsageEnded the value to set
         * @return this builder
         */
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }
        /** The carbon emission in MTCO2 unit. */
        @com.fasterxml.jackson.annotation.JsonProperty("computedCarbonEmission")
        private Double computedCarbonEmission;

        /**
         * The carbon emission in MTCO2 unit.
         *
         * @param computedCarbonEmission the value to set
         * @return this builder
         */
        public Builder computedCarbonEmission(Double computedCarbonEmission) {
            this.computedCarbonEmission = computedCarbonEmission;
            this.__explicitlySet__.add("computedCarbonEmission");
            return this;
        }
        /** The method used to calculate carbon emission. */
        @com.fasterxml.jackson.annotation.JsonProperty("emissionCalculationMethod")
        private String emissionCalculationMethod;

        /**
         * The method used to calculate carbon emission.
         *
         * @param emissionCalculationMethod the value to set
         * @return this builder
         */
        public Builder emissionCalculationMethod(String emissionCalculationMethod) {
            this.emissionCalculationMethod = emissionCalculationMethod;
            this.__explicitlySet__.add("emissionCalculationMethod");
            return this;
        }
        /** The subscription ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The subscription ID.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** For grouping, a tag definition. For filtering, a definition and key. */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * For grouping, a tag definition. For filtering, a definition and key.
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageCarbonEmissionSummary build() {
            UsageCarbonEmissionSummary model =
                    new UsageCarbonEmissionSummary(
                            this.tenantId,
                            this.tenantName,
                            this.compartmentId,
                            this.compartmentPath,
                            this.compartmentName,
                            this.service,
                            this.resourceName,
                            this.resourceId,
                            this.region,
                            this.ad,
                            this.skuPartNumber,
                            this.skuName,
                            this.platform,
                            this.timeUsageStarted,
                            this.timeUsageEnded,
                            this.computedCarbonEmission,
                            this.emissionCalculationMethod,
                            this.subscriptionId,
                            this.tags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageCarbonEmissionSummary model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("tenantName")) {
                this.tenantName(model.getTenantName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentPath")) {
                this.compartmentPath(model.getCompartmentPath());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
            }
            if (model.wasPropertyExplicitlySet("skuPartNumber")) {
                this.skuPartNumber(model.getSkuPartNumber());
            }
            if (model.wasPropertyExplicitlySet("skuName")) {
                this.skuName(model.getSkuName());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
            }
            if (model.wasPropertyExplicitlySet("computedCarbonEmission")) {
                this.computedCarbonEmission(model.getComputedCarbonEmission());
            }
            if (model.wasPropertyExplicitlySet("emissionCalculationMethod")) {
                this.emissionCalculationMethod(model.getEmissionCalculationMethod());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
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

    /** The tenancy OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The tenancy OCID.
     *
     * @return the value
     */
    public String getTenantId() {
        return tenantId;
    }

    /** The tenancy name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    /**
     * The tenancy name.
     *
     * @return the value
     */
    public String getTenantName() {
        return tenantName;
    }

    /** The compartment OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The compartment path, starting from root. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
    private final String compartmentPath;

    /**
     * The compartment path, starting from root.
     *
     * @return the value
     */
    public String getCompartmentPath() {
        return compartmentPath;
    }

    /** The compartment name. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The compartment name.
     *
     * @return the value
     */
    public String getCompartmentName() {
        return compartmentName;
    }

    /** The service name that is incurring the cost. */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The service name that is incurring the cost.
     *
     * @return the value
     */
    public String getService() {
        return service;
    }

    /** The resource name that is incurring the cost. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource name that is incurring the cost.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The resource OCID that is incurring the cost. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The resource OCID that is incurring the cost.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The region of the usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region of the usage.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The availability domain of the usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final String ad;

    /**
     * The availability domain of the usage.
     *
     * @return the value
     */
    public String getAd() {
        return ad;
    }

    /** The SKU part number. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
    private final String skuPartNumber;

    /**
     * The SKU part number.
     *
     * @return the value
     */
    public String getSkuPartNumber() {
        return skuPartNumber;
    }

    /** The SKU friendly name. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuName")
    private final String skuName;

    /**
     * The SKU friendly name.
     *
     * @return the value
     */
    public String getSkuName() {
        return skuName;
    }

    /** Platform for the cost. */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * Platform for the cost.
     *
     * @return the value
     */
    public String getPlatform() {
        return platform;
    }

    /** The usage start time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The usage start time.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /** The usage end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The usage end time.
     *
     * @return the value
     */
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /** The carbon emission in MTCO2 unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("computedCarbonEmission")
    private final Double computedCarbonEmission;

    /**
     * The carbon emission in MTCO2 unit.
     *
     * @return the value
     */
    public Double getComputedCarbonEmission() {
        return computedCarbonEmission;
    }

    /** The method used to calculate carbon emission. */
    @com.fasterxml.jackson.annotation.JsonProperty("emissionCalculationMethod")
    private final String emissionCalculationMethod;

    /**
     * The method used to calculate carbon emission.
     *
     * @return the value
     */
    public String getEmissionCalculationMethod() {
        return emissionCalculationMethod;
    }

    /** The subscription ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The subscription ID.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** For grouping, a tag definition. For filtering, a definition and key. */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * For grouping, a tag definition. For filtering, a definition and key.
     *
     * @return the value
     */
    public java.util.List<Tag> getTags() {
        return tags;
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
        sb.append("UsageCarbonEmissionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentPath=").append(String.valueOf(this.compartmentPath));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", ad=").append(String.valueOf(this.ad));
        sb.append(", skuPartNumber=").append(String.valueOf(this.skuPartNumber));
        sb.append(", skuName=").append(String.valueOf(this.skuName));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", computedCarbonEmission=").append(String.valueOf(this.computedCarbonEmission));
        sb.append(", emissionCalculationMethod=")
                .append(String.valueOf(this.emissionCalculationMethod));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageCarbonEmissionSummary)) {
            return false;
        }

        UsageCarbonEmissionSummary other = (UsageCarbonEmissionSummary) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.tenantName, other.tenantName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentPath, other.compartmentPath)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.skuPartNumber, other.skuPartNumber)
                && java.util.Objects.equals(this.skuName, other.skuName)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(
                        this.computedCarbonEmission, other.computedCarbonEmission)
                && java.util.Objects.equals(
                        this.emissionCalculationMethod, other.emissionCalculationMethod)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.tags, other.tags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.tenantName == null ? 43 : this.tenantName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentPath == null ? 43 : this.compartmentPath.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result =
                (result * PRIME)
                        + (this.skuPartNumber == null ? 43 : this.skuPartNumber.hashCode());
        result = (result * PRIME) + (this.skuName == null ? 43 : this.skuName.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.computedCarbonEmission == null
                                ? 43
                                : this.computedCarbonEmission.hashCode());
        result =
                (result * PRIME)
                        + (this.emissionCalculationMethod == null
                                ? 43
                                : this.emissionCalculationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

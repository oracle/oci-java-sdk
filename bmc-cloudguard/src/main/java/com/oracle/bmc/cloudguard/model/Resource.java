/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of cloud guard resource <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Resource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Resource extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "resourceName",
        "resourceType",
        "compartmentId",
        "targetId",
        "targetName",
        "region",
        "riskLevel",
        "timeFirstMonitored",
        "timeLastMonitored",
        "problemCount",
        "vulnerabilityCount",
        "openPortsCount",
        "additionalDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Resource(
            String id,
            String resourceName,
            String resourceType,
            String compartmentId,
            String targetId,
            String targetName,
            String region,
            CveRiskLevel riskLevel,
            java.util.Date timeFirstMonitored,
            java.util.Date timeLastMonitored,
            Integer problemCount,
            Integer vulnerabilityCount,
            Integer openPortsCount,
            ResourceAdditionalDetails additionalDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.targetName = targetName;
        this.region = region;
        this.riskLevel = riskLevel;
        this.timeFirstMonitored = timeFirstMonitored;
        this.timeLastMonitored = timeLastMonitored;
        this.problemCount = problemCount;
        this.vulnerabilityCount = vulnerabilityCount;
        this.openPortsCount = openPortsCount;
        this.additionalDetails = additionalDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ocid for CG resource */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Ocid for CG resource
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Name for the CG resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Name for the CG resource
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** resource type of the CG resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resource type of the CG resource
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** CompartmentId of CG Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * CompartmentId of CG Resource
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** TargetId of CG Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * TargetId of CG Resource
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Target name for the CG Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * Target name for the CG Resource
         *
         * @param targetName the value to set
         * @return this builder
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /** region of CG Resource */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * region of CG Resource
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The Risk Level */
        @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
        private CveRiskLevel riskLevel;

        /**
         * The Risk Level
         *
         * @param riskLevel the value to set
         * @return this builder
         */
        public Builder riskLevel(CveRiskLevel riskLevel) {
            this.riskLevel = riskLevel;
            this.__explicitlySet__.add("riskLevel");
            return this;
        }
        /** First monitored time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstMonitored")
        private java.util.Date timeFirstMonitored;

        /**
         * First monitored time
         *
         * @param timeFirstMonitored the value to set
         * @return this builder
         */
        public Builder timeFirstMonitored(java.util.Date timeFirstMonitored) {
            this.timeFirstMonitored = timeFirstMonitored;
            this.__explicitlySet__.add("timeFirstMonitored");
            return this;
        }
        /** Last monitored time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastMonitored")
        private java.util.Date timeLastMonitored;

        /**
         * Last monitored time
         *
         * @param timeLastMonitored the value to set
         * @return this builder
         */
        public Builder timeLastMonitored(java.util.Date timeLastMonitored) {
            this.timeLastMonitored = timeLastMonitored;
            this.__explicitlySet__.add("timeLastMonitored");
            return this;
        }
        /** Count of existing problems for a resource */
        @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
        private Integer problemCount;

        /**
         * Count of existing problems for a resource
         *
         * @param problemCount the value to set
         * @return this builder
         */
        public Builder problemCount(Integer problemCount) {
            this.problemCount = problemCount;
            this.__explicitlySet__.add("problemCount");
            return this;
        }
        /** Count of existing number of vulnerabilities in the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilityCount")
        private Integer vulnerabilityCount;

        /**
         * Count of existing number of vulnerabilities in the resource
         *
         * @param vulnerabilityCount the value to set
         * @return this builder
         */
        public Builder vulnerabilityCount(Integer vulnerabilityCount) {
            this.vulnerabilityCount = vulnerabilityCount;
            this.__explicitlySet__.add("vulnerabilityCount");
            return this;
        }
        /** Number of open ports in a resource */
        @com.fasterxml.jackson.annotation.JsonProperty("openPortsCount")
        private Integer openPortsCount;

        /**
         * Number of open ports in a resource
         *
         * @param openPortsCount the value to set
         * @return this builder
         */
        public Builder openPortsCount(Integer openPortsCount) {
            this.openPortsCount = openPortsCount;
            this.__explicitlySet__.add("openPortsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private ResourceAdditionalDetails additionalDetails;

        public Builder additionalDetails(ResourceAdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Resource build() {
            Resource model =
                    new Resource(
                            this.id,
                            this.resourceName,
                            this.resourceType,
                            this.compartmentId,
                            this.targetId,
                            this.targetName,
                            this.region,
                            this.riskLevel,
                            this.timeFirstMonitored,
                            this.timeLastMonitored,
                            this.problemCount,
                            this.vulnerabilityCount,
                            this.openPortsCount,
                            this.additionalDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Resource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("riskLevel")) {
                this.riskLevel(model.getRiskLevel());
            }
            if (model.wasPropertyExplicitlySet("timeFirstMonitored")) {
                this.timeFirstMonitored(model.getTimeFirstMonitored());
            }
            if (model.wasPropertyExplicitlySet("timeLastMonitored")) {
                this.timeLastMonitored(model.getTimeLastMonitored());
            }
            if (model.wasPropertyExplicitlySet("problemCount")) {
                this.problemCount(model.getProblemCount());
            }
            if (model.wasPropertyExplicitlySet("vulnerabilityCount")) {
                this.vulnerabilityCount(model.getVulnerabilityCount());
            }
            if (model.wasPropertyExplicitlySet("openPortsCount")) {
                this.openPortsCount(model.getOpenPortsCount());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Ocid for CG resource */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Ocid for CG resource
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name for the CG resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Name for the CG resource
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** resource type of the CG resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resource type of the CG resource
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** CompartmentId of CG Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * CompartmentId of CG Resource
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** TargetId of CG Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * TargetId of CG Resource
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Target name for the CG Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * Target name for the CG Resource
     *
     * @return the value
     */
    public String getTargetName() {
        return targetName;
    }

    /** region of CG Resource */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * region of CG Resource
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The Risk Level */
    @com.fasterxml.jackson.annotation.JsonProperty("riskLevel")
    private final CveRiskLevel riskLevel;

    /**
     * The Risk Level
     *
     * @return the value
     */
    public CveRiskLevel getRiskLevel() {
        return riskLevel;
    }

    /** First monitored time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstMonitored")
    private final java.util.Date timeFirstMonitored;

    /**
     * First monitored time
     *
     * @return the value
     */
    public java.util.Date getTimeFirstMonitored() {
        return timeFirstMonitored;
    }

    /** Last monitored time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastMonitored")
    private final java.util.Date timeLastMonitored;

    /**
     * Last monitored time
     *
     * @return the value
     */
    public java.util.Date getTimeLastMonitored() {
        return timeLastMonitored;
    }

    /** Count of existing problems for a resource */
    @com.fasterxml.jackson.annotation.JsonProperty("problemCount")
    private final Integer problemCount;

    /**
     * Count of existing problems for a resource
     *
     * @return the value
     */
    public Integer getProblemCount() {
        return problemCount;
    }

    /** Count of existing number of vulnerabilities in the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("vulnerabilityCount")
    private final Integer vulnerabilityCount;

    /**
     * Count of existing number of vulnerabilities in the resource
     *
     * @return the value
     */
    public Integer getVulnerabilityCount() {
        return vulnerabilityCount;
    }

    /** Number of open ports in a resource */
    @com.fasterxml.jackson.annotation.JsonProperty("openPortsCount")
    private final Integer openPortsCount;

    /**
     * Number of open ports in a resource
     *
     * @return the value
     */
    public Integer getOpenPortsCount() {
        return openPortsCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final ResourceAdditionalDetails additionalDetails;

    public ResourceAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Resource(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", riskLevel=").append(String.valueOf(this.riskLevel));
        sb.append(", timeFirstMonitored=").append(String.valueOf(this.timeFirstMonitored));
        sb.append(", timeLastMonitored=").append(String.valueOf(this.timeLastMonitored));
        sb.append(", problemCount=").append(String.valueOf(this.problemCount));
        sb.append(", vulnerabilityCount=").append(String.valueOf(this.vulnerabilityCount));
        sb.append(", openPortsCount=").append(String.valueOf(this.openPortsCount));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Resource)) {
            return false;
        }

        Resource other = (Resource) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.riskLevel, other.riskLevel)
                && java.util.Objects.equals(this.timeFirstMonitored, other.timeFirstMonitored)
                && java.util.Objects.equals(this.timeLastMonitored, other.timeLastMonitored)
                && java.util.Objects.equals(this.problemCount, other.problemCount)
                && java.util.Objects.equals(this.vulnerabilityCount, other.vulnerabilityCount)
                && java.util.Objects.equals(this.openPortsCount, other.openPortsCount)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.riskLevel == null ? 43 : this.riskLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstMonitored == null
                                ? 43
                                : this.timeFirstMonitored.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastMonitored == null ? 43 : this.timeLastMonitored.hashCode());
        result = (result * PRIME) + (this.problemCount == null ? 43 : this.problemCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityCount == null
                                ? 43
                                : this.vulnerabilityCount.hashCode());
        result =
                (result * PRIME)
                        + (this.openPortsCount == null ? 43 : this.openPortsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

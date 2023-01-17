/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Sighting Impacted Resource summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SightingImpactedResourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SightingImpactedResourceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "resourceId",
        "sightingId",
        "problemId",
        "compartmentId",
        "resourceName",
        "resourceType",
        "region",
        "timeIdentified"
    })
    public SightingImpactedResourceSummary(
            String id,
            String resourceId,
            String sightingId,
            String problemId,
            String compartmentId,
            String resourceName,
            String resourceType,
            String region,
            java.util.Date timeIdentified) {
        super();
        this.id = id;
        this.resourceId = resourceId;
        this.sightingId = sightingId;
        this.problemId = problemId;
        this.compartmentId = compartmentId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.region = region;
        this.timeIdentified = timeIdentified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for impacted resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for impacted resource
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Impacted resource Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Impacted resource Id
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Sighting Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
        private String sightingId;

        /**
         * Sighting Id
         * @param sightingId the value to set
         * @return this builder
         **/
        public Builder sightingId(String sightingId) {
            this.sightingId = sightingId;
            this.__explicitlySet__.add("sightingId");
            return this;
        }
        /**
         * Problem Id for impacted resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem Id for impacted resource
         * @param problemId the value to set
         * @return this builder
         **/
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /**
         * Compartment Id for impacted resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Id for impacted resource
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Resource name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Resource name
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * Resource type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Resource type
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Region for impacted resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region for impacted resource
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Time when the impacted resource is identified for given sighting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
        private java.util.Date timeIdentified;

        /**
         * Time when the impacted resource is identified for given sighting.
         * @param timeIdentified the value to set
         * @return this builder
         **/
        public Builder timeIdentified(java.util.Date timeIdentified) {
            this.timeIdentified = timeIdentified;
            this.__explicitlySet__.add("timeIdentified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SightingImpactedResourceSummary build() {
            SightingImpactedResourceSummary model =
                    new SightingImpactedResourceSummary(
                            this.id,
                            this.resourceId,
                            this.sightingId,
                            this.problemId,
                            this.compartmentId,
                            this.resourceName,
                            this.resourceType,
                            this.region,
                            this.timeIdentified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SightingImpactedResourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("sightingId")) {
                this.sightingId(model.getSightingId());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("timeIdentified")) {
                this.timeIdentified(model.getTimeIdentified());
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
     * Unique identifier for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for impacted resource
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Impacted resource Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Impacted resource Id
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sighting Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
    private final String sightingId;

    /**
     * Sighting Id
     * @return the value
     **/
    public String getSightingId() {
        return sightingId;
    }

    /**
     * Problem Id for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem Id for impacted resource
     * @return the value
     **/
    public String getProblemId() {
        return problemId;
    }

    /**
     * Compartment Id for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Id for impacted resource
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Resource name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Resource name
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Resource type
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Region for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region for impacted resource
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Time when the impacted resource is identified for given sighting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
    private final java.util.Date timeIdentified;

    /**
     * Time when the impacted resource is identified for given sighting.
     * @return the value
     **/
    public java.util.Date getTimeIdentified() {
        return timeIdentified;
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
        sb.append("SightingImpactedResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", sightingId=").append(String.valueOf(this.sightingId));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", timeIdentified=").append(String.valueOf(this.timeIdentified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SightingImpactedResourceSummary)) {
            return false;
        }

        SightingImpactedResourceSummary other = (SightingImpactedResourceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.sightingId, other.sightingId)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.timeIdentified, other.timeIdentified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.sightingId == null ? 43 : this.sightingId.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIdentified == null ? 43 : this.timeIdentified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

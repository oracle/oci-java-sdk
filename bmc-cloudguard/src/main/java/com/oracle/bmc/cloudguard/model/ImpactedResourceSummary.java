/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary of information on a resource that\u2019s been impacted by a detected problem. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImpactedResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImpactedResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "resourceId",
        "problemId",
        "compartmentId",
        "sightingType",
        "sightingTypeDisplayName",
        "resourceName",
        "resourceType",
        "region",
        "timeIdentified"
    })
    public ImpactedResourceSummary(
            String id,
            String resourceId,
            String problemId,
            String compartmentId,
            String sightingType,
            String sightingTypeDisplayName,
            String resourceName,
            String resourceType,
            String region,
            java.util.Date timeIdentified) {
        super();
        this.id = id;
        this.resourceId = resourceId;
        this.problemId = problemId;
        this.compartmentId = compartmentId;
        this.sightingType = sightingType;
        this.sightingTypeDisplayName = sightingTypeDisplayName;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.region = region;
        this.timeIdentified = timeIdentified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for finding event */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for finding event
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique identifier of the impacted resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique identifier of the impacted resource
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Problem ID associated with the Impacted resource */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem ID associated with the Impacted resource
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** Compartment OCID where the impacted resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID where the impacted resource is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Sighting type involved */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
        private String sightingType;

        /**
         * Sighting type involved
         *
         * @param sightingType the value to set
         * @return this builder
         */
        public Builder sightingType(String sightingType) {
            this.sightingType = sightingType;
            this.__explicitlySet__.add("sightingType");
            return this;
        }
        /** Display name of the sighting type */
        @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
        private String sightingTypeDisplayName;

        /**
         * Display name of the sighting type
         *
         * @param sightingTypeDisplayName the value to set
         * @return this builder
         */
        public Builder sightingTypeDisplayName(String sightingTypeDisplayName) {
            this.sightingTypeDisplayName = sightingTypeDisplayName;
            this.__explicitlySet__.add("sightingTypeDisplayName");
            return this;
        }
        /** Name of the impacted resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Name of the impacted resource
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Type of the impacted resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the impacted resource
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Region where the resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region where the resource is created
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Date and time when the problem was identified */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
        private java.util.Date timeIdentified;

        /**
         * Date and time when the problem was identified
         *
         * @param timeIdentified the value to set
         * @return this builder
         */
        public Builder timeIdentified(java.util.Date timeIdentified) {
            this.timeIdentified = timeIdentified;
            this.__explicitlySet__.add("timeIdentified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImpactedResourceSummary build() {
            ImpactedResourceSummary model =
                    new ImpactedResourceSummary(
                            this.id,
                            this.resourceId,
                            this.problemId,
                            this.compartmentId,
                            this.sightingType,
                            this.sightingTypeDisplayName,
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
        public Builder copy(ImpactedResourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sightingType")) {
                this.sightingType(model.getSightingType());
            }
            if (model.wasPropertyExplicitlySet("sightingTypeDisplayName")) {
                this.sightingTypeDisplayName(model.getSightingTypeDisplayName());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique identifier for finding event */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for finding event
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique identifier of the impacted resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique identifier of the impacted resource
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Problem ID associated with the Impacted resource */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem ID associated with the Impacted resource
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** Compartment OCID where the impacted resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID where the impacted resource is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Sighting type involved */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingType")
    private final String sightingType;

    /**
     * Sighting type involved
     *
     * @return the value
     */
    public String getSightingType() {
        return sightingType;
    }

    /** Display name of the sighting type */
    @com.fasterxml.jackson.annotation.JsonProperty("sightingTypeDisplayName")
    private final String sightingTypeDisplayName;

    /**
     * Display name of the sighting type
     *
     * @return the value
     */
    public String getSightingTypeDisplayName() {
        return sightingTypeDisplayName;
    }

    /** Name of the impacted resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Name of the impacted resource
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Type of the impacted resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the impacted resource
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** Region where the resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region where the resource is created
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Date and time when the problem was identified */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
    private final java.util.Date timeIdentified;

    /**
     * Date and time when the problem was identified
     *
     * @return the value
     */
    public java.util.Date getTimeIdentified() {
        return timeIdentified;
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
        sb.append("ImpactedResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sightingType=").append(String.valueOf(this.sightingType));
        sb.append(", sightingTypeDisplayName=")
                .append(String.valueOf(this.sightingTypeDisplayName));
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
        if (!(o instanceof ImpactedResourceSummary)) {
            return false;
        }

        ImpactedResourceSummary other = (ImpactedResourceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sightingType, other.sightingType)
                && java.util.Objects.equals(
                        this.sightingTypeDisplayName, other.sightingTypeDisplayName)
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
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sightingType == null ? 43 : this.sightingType.hashCode());
        result =
                (result * PRIME)
                        + (this.sightingTypeDisplayName == null
                                ? 43
                                : this.sightingTypeDisplayName.hashCode());
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

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of dblm registered and unregistered resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalResourcesCount",
        "registeredResourcesCount",
        "notRegisteredResourcesCount",
        "vulnerableResourcesCount",
        "cleanResourcesCount",
        "errorResourcesCount"
    })
    public ResourceSummary(
            Integer totalResourcesCount,
            Integer registeredResourcesCount,
            Integer notRegisteredResourcesCount,
            Integer vulnerableResourcesCount,
            Integer cleanResourcesCount,
            Integer errorResourcesCount) {
        super();
        this.totalResourcesCount = totalResourcesCount;
        this.registeredResourcesCount = registeredResourcesCount;
        this.notRegisteredResourcesCount = notRegisteredResourcesCount;
        this.vulnerableResourcesCount = vulnerableResourcesCount;
        this.cleanResourcesCount = cleanResourcesCount;
        this.errorResourcesCount = errorResourcesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalResourcesCount")
        private Integer totalResourcesCount;

        /**
         * The total number of resources.
         *
         * @param totalResourcesCount the value to set
         * @return this builder
         */
        public Builder totalResourcesCount(Integer totalResourcesCount) {
            this.totalResourcesCount = totalResourcesCount;
            this.__explicitlySet__.add("totalResourcesCount");
            return this;
        }
        /** The total number of registered resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("registeredResourcesCount")
        private Integer registeredResourcesCount;

        /**
         * The total number of registered resources.
         *
         * @param registeredResourcesCount the value to set
         * @return this builder
         */
        public Builder registeredResourcesCount(Integer registeredResourcesCount) {
            this.registeredResourcesCount = registeredResourcesCount;
            this.__explicitlySet__.add("registeredResourcesCount");
            return this;
        }
        /** The total number of resources that are not registered. */
        @com.fasterxml.jackson.annotation.JsonProperty("notRegisteredResourcesCount")
        private Integer notRegisteredResourcesCount;

        /**
         * The total number of resources that are not registered.
         *
         * @param notRegisteredResourcesCount the value to set
         * @return this builder
         */
        public Builder notRegisteredResourcesCount(Integer notRegisteredResourcesCount) {
            this.notRegisteredResourcesCount = notRegisteredResourcesCount;
            this.__explicitlySet__.add("notRegisteredResourcesCount");
            return this;
        }
        /** Total number of resources that have 1 or more vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("vulnerableResourcesCount")
        private Integer vulnerableResourcesCount;

        /**
         * Total number of resources that have 1 or more vulnerabilities.
         *
         * @param vulnerableResourcesCount the value to set
         * @return this builder
         */
        public Builder vulnerableResourcesCount(Integer vulnerableResourcesCount) {
            this.vulnerableResourcesCount = vulnerableResourcesCount;
            this.__explicitlySet__.add("vulnerableResourcesCount");
            return this;
        }
        /** Total number of resources that have 0 vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("cleanResourcesCount")
        private Integer cleanResourcesCount;

        /**
         * Total number of resources that have 0 vulnerabilities.
         *
         * @param cleanResourcesCount the value to set
         * @return this builder
         */
        public Builder cleanResourcesCount(Integer cleanResourcesCount) {
            this.cleanResourcesCount = cleanResourcesCount;
            this.__explicitlySet__.add("cleanResourcesCount");
            return this;
        }
        /** Total number of resources that contain an error. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorResourcesCount")
        private Integer errorResourcesCount;

        /**
         * Total number of resources that contain an error.
         *
         * @param errorResourcesCount the value to set
         * @return this builder
         */
        public Builder errorResourcesCount(Integer errorResourcesCount) {
            this.errorResourcesCount = errorResourcesCount;
            this.__explicitlySet__.add("errorResourcesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceSummary build() {
            ResourceSummary model =
                    new ResourceSummary(
                            this.totalResourcesCount,
                            this.registeredResourcesCount,
                            this.notRegisteredResourcesCount,
                            this.vulnerableResourcesCount,
                            this.cleanResourcesCount,
                            this.errorResourcesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceSummary model) {
            if (model.wasPropertyExplicitlySet("totalResourcesCount")) {
                this.totalResourcesCount(model.getTotalResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("registeredResourcesCount")) {
                this.registeredResourcesCount(model.getRegisteredResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("notRegisteredResourcesCount")) {
                this.notRegisteredResourcesCount(model.getNotRegisteredResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("vulnerableResourcesCount")) {
                this.vulnerableResourcesCount(model.getVulnerableResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("cleanResourcesCount")) {
                this.cleanResourcesCount(model.getCleanResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("errorResourcesCount")) {
                this.errorResourcesCount(model.getErrorResourcesCount());
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

    /** The total number of resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalResourcesCount")
    private final Integer totalResourcesCount;

    /**
     * The total number of resources.
     *
     * @return the value
     */
    public Integer getTotalResourcesCount() {
        return totalResourcesCount;
    }

    /** The total number of registered resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("registeredResourcesCount")
    private final Integer registeredResourcesCount;

    /**
     * The total number of registered resources.
     *
     * @return the value
     */
    public Integer getRegisteredResourcesCount() {
        return registeredResourcesCount;
    }

    /** The total number of resources that are not registered. */
    @com.fasterxml.jackson.annotation.JsonProperty("notRegisteredResourcesCount")
    private final Integer notRegisteredResourcesCount;

    /**
     * The total number of resources that are not registered.
     *
     * @return the value
     */
    public Integer getNotRegisteredResourcesCount() {
        return notRegisteredResourcesCount;
    }

    /** Total number of resources that have 1 or more vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("vulnerableResourcesCount")
    private final Integer vulnerableResourcesCount;

    /**
     * Total number of resources that have 1 or more vulnerabilities.
     *
     * @return the value
     */
    public Integer getVulnerableResourcesCount() {
        return vulnerableResourcesCount;
    }

    /** Total number of resources that have 0 vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("cleanResourcesCount")
    private final Integer cleanResourcesCount;

    /**
     * Total number of resources that have 0 vulnerabilities.
     *
     * @return the value
     */
    public Integer getCleanResourcesCount() {
        return cleanResourcesCount;
    }

    /** Total number of resources that contain an error. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorResourcesCount")
    private final Integer errorResourcesCount;

    /**
     * Total number of resources that contain an error.
     *
     * @return the value
     */
    public Integer getErrorResourcesCount() {
        return errorResourcesCount;
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
        sb.append("ResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("totalResourcesCount=").append(String.valueOf(this.totalResourcesCount));
        sb.append(", registeredResourcesCount=")
                .append(String.valueOf(this.registeredResourcesCount));
        sb.append(", notRegisteredResourcesCount=")
                .append(String.valueOf(this.notRegisteredResourcesCount));
        sb.append(", vulnerableResourcesCount=")
                .append(String.valueOf(this.vulnerableResourcesCount));
        sb.append(", cleanResourcesCount=").append(String.valueOf(this.cleanResourcesCount));
        sb.append(", errorResourcesCount=").append(String.valueOf(this.errorResourcesCount));
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
        return java.util.Objects.equals(this.totalResourcesCount, other.totalResourcesCount)
                && java.util.Objects.equals(
                        this.registeredResourcesCount, other.registeredResourcesCount)
                && java.util.Objects.equals(
                        this.notRegisteredResourcesCount, other.notRegisteredResourcesCount)
                && java.util.Objects.equals(
                        this.vulnerableResourcesCount, other.vulnerableResourcesCount)
                && java.util.Objects.equals(this.cleanResourcesCount, other.cleanResourcesCount)
                && java.util.Objects.equals(this.errorResourcesCount, other.errorResourcesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalResourcesCount == null
                                ? 43
                                : this.totalResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.registeredResourcesCount == null
                                ? 43
                                : this.registeredResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.notRegisteredResourcesCount == null
                                ? 43
                                : this.notRegisteredResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerableResourcesCount == null
                                ? 43
                                : this.vulnerableResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.cleanResourcesCount == null
                                ? 43
                                : this.cleanResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.errorResourcesCount == null
                                ? 43
                                : this.errorResourcesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

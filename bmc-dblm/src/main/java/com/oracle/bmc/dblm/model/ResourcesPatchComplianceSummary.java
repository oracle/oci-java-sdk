/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of resources and their patch compliance. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourcesPatchComplianceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourcesPatchComplianceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalResourcesCount",
        "upToDateResourcesCount",
        "nonCompliantResourcesCount",
        "notSubscribedResourcesCount",
        "notDblmRegisteredResourcesCount"
    })
    public ResourcesPatchComplianceSummary(
            Integer totalResourcesCount,
            Integer upToDateResourcesCount,
            Integer nonCompliantResourcesCount,
            Integer notSubscribedResourcesCount,
            Integer notDblmRegisteredResourcesCount) {
        super();
        this.totalResourcesCount = totalResourcesCount;
        this.upToDateResourcesCount = upToDateResourcesCount;
        this.nonCompliantResourcesCount = nonCompliantResourcesCount;
        this.notSubscribedResourcesCount = notSubscribedResourcesCount;
        this.notDblmRegisteredResourcesCount = notDblmRegisteredResourcesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalResourcesCount")
        private Integer totalResourcesCount;

        /**
         * Total number of resources.
         *
         * @param totalResourcesCount the value to set
         * @return this builder
         */
        public Builder totalResourcesCount(Integer totalResourcesCount) {
            this.totalResourcesCount = totalResourcesCount;
            this.__explicitlySet__.add("totalResourcesCount");
            return this;
        }
        /** Total number of resources that are up to date. */
        @com.fasterxml.jackson.annotation.JsonProperty("upToDateResourcesCount")
        private Integer upToDateResourcesCount;

        /**
         * Total number of resources that are up to date.
         *
         * @param upToDateResourcesCount the value to set
         * @return this builder
         */
        public Builder upToDateResourcesCount(Integer upToDateResourcesCount) {
            this.upToDateResourcesCount = upToDateResourcesCount;
            this.__explicitlySet__.add("upToDateResourcesCount");
            return this;
        }
        /** Total number of non-compliant resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantResourcesCount")
        private Integer nonCompliantResourcesCount;

        /**
         * Total number of non-compliant resources.
         *
         * @param nonCompliantResourcesCount the value to set
         * @return this builder
         */
        public Builder nonCompliantResourcesCount(Integer nonCompliantResourcesCount) {
            this.nonCompliantResourcesCount = nonCompliantResourcesCount;
            this.__explicitlySet__.add("nonCompliantResourcesCount");
            return this;
        }
        /** Total number of resources that are not subscribed. */
        @com.fasterxml.jackson.annotation.JsonProperty("notSubscribedResourcesCount")
        private Integer notSubscribedResourcesCount;

        /**
         * Total number of resources that are not subscribed.
         *
         * @param notSubscribedResourcesCount the value to set
         * @return this builder
         */
        public Builder notSubscribedResourcesCount(Integer notSubscribedResourcesCount) {
            this.notSubscribedResourcesCount = notSubscribedResourcesCount;
            this.__explicitlySet__.add("notSubscribedResourcesCount");
            return this;
        }
        /** Total number of resources that are not registered to DBLM. */
        @com.fasterxml.jackson.annotation.JsonProperty("notDblmRegisteredResourcesCount")
        private Integer notDblmRegisteredResourcesCount;

        /**
         * Total number of resources that are not registered to DBLM.
         *
         * @param notDblmRegisteredResourcesCount the value to set
         * @return this builder
         */
        public Builder notDblmRegisteredResourcesCount(Integer notDblmRegisteredResourcesCount) {
            this.notDblmRegisteredResourcesCount = notDblmRegisteredResourcesCount;
            this.__explicitlySet__.add("notDblmRegisteredResourcesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcesPatchComplianceSummary build() {
            ResourcesPatchComplianceSummary model =
                    new ResourcesPatchComplianceSummary(
                            this.totalResourcesCount,
                            this.upToDateResourcesCount,
                            this.nonCompliantResourcesCount,
                            this.notSubscribedResourcesCount,
                            this.notDblmRegisteredResourcesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcesPatchComplianceSummary model) {
            if (model.wasPropertyExplicitlySet("totalResourcesCount")) {
                this.totalResourcesCount(model.getTotalResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("upToDateResourcesCount")) {
                this.upToDateResourcesCount(model.getUpToDateResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("nonCompliantResourcesCount")) {
                this.nonCompliantResourcesCount(model.getNonCompliantResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("notSubscribedResourcesCount")) {
                this.notSubscribedResourcesCount(model.getNotSubscribedResourcesCount());
            }
            if (model.wasPropertyExplicitlySet("notDblmRegisteredResourcesCount")) {
                this.notDblmRegisteredResourcesCount(model.getNotDblmRegisteredResourcesCount());
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

    /** Total number of resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalResourcesCount")
    private final Integer totalResourcesCount;

    /**
     * Total number of resources.
     *
     * @return the value
     */
    public Integer getTotalResourcesCount() {
        return totalResourcesCount;
    }

    /** Total number of resources that are up to date. */
    @com.fasterxml.jackson.annotation.JsonProperty("upToDateResourcesCount")
    private final Integer upToDateResourcesCount;

    /**
     * Total number of resources that are up to date.
     *
     * @return the value
     */
    public Integer getUpToDateResourcesCount() {
        return upToDateResourcesCount;
    }

    /** Total number of non-compliant resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("nonCompliantResourcesCount")
    private final Integer nonCompliantResourcesCount;

    /**
     * Total number of non-compliant resources.
     *
     * @return the value
     */
    public Integer getNonCompliantResourcesCount() {
        return nonCompliantResourcesCount;
    }

    /** Total number of resources that are not subscribed. */
    @com.fasterxml.jackson.annotation.JsonProperty("notSubscribedResourcesCount")
    private final Integer notSubscribedResourcesCount;

    /**
     * Total number of resources that are not subscribed.
     *
     * @return the value
     */
    public Integer getNotSubscribedResourcesCount() {
        return notSubscribedResourcesCount;
    }

    /** Total number of resources that are not registered to DBLM. */
    @com.fasterxml.jackson.annotation.JsonProperty("notDblmRegisteredResourcesCount")
    private final Integer notDblmRegisteredResourcesCount;

    /**
     * Total number of resources that are not registered to DBLM.
     *
     * @return the value
     */
    public Integer getNotDblmRegisteredResourcesCount() {
        return notDblmRegisteredResourcesCount;
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
        sb.append("ResourcesPatchComplianceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("totalResourcesCount=").append(String.valueOf(this.totalResourcesCount));
        sb.append(", upToDateResourcesCount=").append(String.valueOf(this.upToDateResourcesCount));
        sb.append(", nonCompliantResourcesCount=")
                .append(String.valueOf(this.nonCompliantResourcesCount));
        sb.append(", notSubscribedResourcesCount=")
                .append(String.valueOf(this.notSubscribedResourcesCount));
        sb.append(", notDblmRegisteredResourcesCount=")
                .append(String.valueOf(this.notDblmRegisteredResourcesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcesPatchComplianceSummary)) {
            return false;
        }

        ResourcesPatchComplianceSummary other = (ResourcesPatchComplianceSummary) o;
        return java.util.Objects.equals(this.totalResourcesCount, other.totalResourcesCount)
                && java.util.Objects.equals(
                        this.upToDateResourcesCount, other.upToDateResourcesCount)
                && java.util.Objects.equals(
                        this.nonCompliantResourcesCount, other.nonCompliantResourcesCount)
                && java.util.Objects.equals(
                        this.notSubscribedResourcesCount, other.notSubscribedResourcesCount)
                && java.util.Objects.equals(
                        this.notDblmRegisteredResourcesCount, other.notDblmRegisteredResourcesCount)
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
                        + (this.upToDateResourcesCount == null
                                ? 43
                                : this.upToDateResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCompliantResourcesCount == null
                                ? 43
                                : this.nonCompliantResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.notSubscribedResourcesCount == null
                                ? 43
                                : this.notSubscribedResourcesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.notDblmRegisteredResourcesCount == null
                                ? 43
                                : this.notDblmRegisteredResourcesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

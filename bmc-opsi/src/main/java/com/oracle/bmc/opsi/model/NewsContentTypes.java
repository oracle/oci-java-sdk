/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Content types that the news report can handle. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NewsContentTypes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NewsContentTypes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capacityPlanningResources"})
    public NewsContentTypes(java.util.List<NewsContentTypesResource> capacityPlanningResources) {
        super();
        this.capacityPlanningResources = capacityPlanningResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Supported resources for capacity planning content type. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityPlanningResources")
        private java.util.List<NewsContentTypesResource> capacityPlanningResources;

        /**
         * Supported resources for capacity planning content type.
         *
         * @param capacityPlanningResources the value to set
         * @return this builder
         */
        public Builder capacityPlanningResources(
                java.util.List<NewsContentTypesResource> capacityPlanningResources) {
            this.capacityPlanningResources = capacityPlanningResources;
            this.__explicitlySet__.add("capacityPlanningResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NewsContentTypes build() {
            NewsContentTypes model = new NewsContentTypes(this.capacityPlanningResources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewsContentTypes model) {
            if (model.wasPropertyExplicitlySet("capacityPlanningResources")) {
                this.capacityPlanningResources(model.getCapacityPlanningResources());
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

    /** Supported resources for capacity planning content type. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityPlanningResources")
    private final java.util.List<NewsContentTypesResource> capacityPlanningResources;

    /**
     * Supported resources for capacity planning content type.
     *
     * @return the value
     */
    public java.util.List<NewsContentTypesResource> getCapacityPlanningResources() {
        return capacityPlanningResources;
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
        sb.append("NewsContentTypes(");
        sb.append("super=").append(super.toString());
        sb.append("capacityPlanningResources=")
                .append(String.valueOf(this.capacityPlanningResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewsContentTypes)) {
            return false;
        }

        NewsContentTypes other = (NewsContentTypes) o;
        return java.util.Objects.equals(
                        this.capacityPlanningResources, other.capacityPlanningResources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.capacityPlanningResources == null
                                ? 43
                                : this.capacityPlanningResources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

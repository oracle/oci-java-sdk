/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Flex Components for a DB system. The Flex Component determines resources to allocate to the
 * DB system - CPU cores, memory and storage for Flex shapes.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FlexComponentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FlexComponentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "minimumCoreCount",
        "availableCoreCount",
        "availableDbStorageInGBs"
    })
    public FlexComponentSummary(
            String name,
            Integer minimumCoreCount,
            Integer availableCoreCount,
            Integer availableDbStorageInGBs) {
        super();
        this.name = name;
        this.minimumCoreCount = minimumCoreCount;
        this.availableCoreCount = availableCoreCount;
        this.availableDbStorageInGBs = availableDbStorageInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the Flex Component used for the DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Flex Component used for the DB system.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The minimum number of CPU cores that can be enabled on the DB Server for this Flex
         * Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
        private Integer minimumCoreCount;

        /**
         * The minimum number of CPU cores that can be enabled on the DB Server for this Flex
         * Component.
         *
         * @param minimumCoreCount the value to set
         * @return this builder
         */
        public Builder minimumCoreCount(Integer minimumCoreCount) {
            this.minimumCoreCount = minimumCoreCount;
            this.__explicitlySet__.add("minimumCoreCount");
            return this;
        }
        /**
         * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
         * Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
        private Integer availableCoreCount;

        /**
         * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
         * Component.
         *
         * @param availableCoreCount the value to set
         * @return this builder
         */
        public Builder availableCoreCount(Integer availableCoreCount) {
            this.availableCoreCount = availableCoreCount;
            this.__explicitlySet__.add("availableCoreCount");
            return this;
        }
        /**
         * The maximum storage that can be enabled on the Storage Server for this Flex Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDbStorageInGBs")
        private Integer availableDbStorageInGBs;

        /**
         * The maximum storage that can be enabled on the Storage Server for this Flex Component.
         *
         * @param availableDbStorageInGBs the value to set
         * @return this builder
         */
        public Builder availableDbStorageInGBs(Integer availableDbStorageInGBs) {
            this.availableDbStorageInGBs = availableDbStorageInGBs;
            this.__explicitlySet__.add("availableDbStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlexComponentSummary build() {
            FlexComponentSummary model =
                    new FlexComponentSummary(
                            this.name,
                            this.minimumCoreCount,
                            this.availableCoreCount,
                            this.availableDbStorageInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlexComponentSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("minimumCoreCount")) {
                this.minimumCoreCount(model.getMinimumCoreCount());
            }
            if (model.wasPropertyExplicitlySet("availableCoreCount")) {
                this.availableCoreCount(model.getAvailableCoreCount());
            }
            if (model.wasPropertyExplicitlySet("availableDbStorageInGBs")) {
                this.availableDbStorageInGBs(model.getAvailableDbStorageInGBs());
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

    /** The name of the Flex Component used for the DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Flex Component used for the DB system.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The minimum number of CPU cores that can be enabled on the DB Server for this Flex Component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
    private final Integer minimumCoreCount;

    /**
     * The minimum number of CPU cores that can be enabled on the DB Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getMinimumCoreCount() {
        return minimumCoreCount;
    }

    /**
     * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
     * Component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
    private final Integer availableCoreCount;

    /**
     * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
     * Component.
     *
     * @return the value
     */
    public Integer getAvailableCoreCount() {
        return availableCoreCount;
    }

    /** The maximum storage that can be enabled on the Storage Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbStorageInGBs")
    private final Integer availableDbStorageInGBs;

    /**
     * The maximum storage that can be enabled on the Storage Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getAvailableDbStorageInGBs() {
        return availableDbStorageInGBs;
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
        sb.append("FlexComponentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", minimumCoreCount=").append(String.valueOf(this.minimumCoreCount));
        sb.append(", availableCoreCount=").append(String.valueOf(this.availableCoreCount));
        sb.append(", availableDbStorageInGBs=")
                .append(String.valueOf(this.availableDbStorageInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlexComponentSummary)) {
            return false;
        }

        FlexComponentSummary other = (FlexComponentSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.minimumCoreCount, other.minimumCoreCount)
                && java.util.Objects.equals(this.availableCoreCount, other.availableCoreCount)
                && java.util.Objects.equals(
                        this.availableDbStorageInGBs, other.availableDbStorageInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumCoreCount == null ? 43 : this.minimumCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCoreCount == null
                                ? 43
                                : this.availableCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDbStorageInGBs == null
                                ? 43
                                : this.availableDbStorageInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

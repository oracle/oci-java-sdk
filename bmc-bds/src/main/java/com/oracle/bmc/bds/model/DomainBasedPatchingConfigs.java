/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * This patching config will patch all nodes in one AD/FD at a time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DomainBasedPatchingConfigs.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "patchingConfigStrategy")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DomainBasedPatchingConfigs extends PatchingConfigs {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The wait time between AD/FD in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenDomainInSeconds")
        private Integer waitTimeBetweenDomainInSeconds;

        /**
         * The wait time between AD/FD in seconds.
         *
         * @param waitTimeBetweenDomainInSeconds the value to set
         * @return this builder
         */
        public Builder waitTimeBetweenDomainInSeconds(Integer waitTimeBetweenDomainInSeconds) {
            this.waitTimeBetweenDomainInSeconds = waitTimeBetweenDomainInSeconds;
            this.__explicitlySet__.add("waitTimeBetweenDomainInSeconds");
            return this;
        }
        /**
         * Acceptable number of failed-to-be-patched nodes in each domain. The maximum number of
         * failed-to-patch nodes cannot exceed 20% of the number of nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("toleranceThresholdPerDomain")
        private Integer toleranceThresholdPerDomain;

        /**
         * Acceptable number of failed-to-be-patched nodes in each domain. The maximum number of
         * failed-to-patch nodes cannot exceed 20% of the number of nodes.
         *
         * @param toleranceThresholdPerDomain the value to set
         * @return this builder
         */
        public Builder toleranceThresholdPerDomain(Integer toleranceThresholdPerDomain) {
            this.toleranceThresholdPerDomain = toleranceThresholdPerDomain;
            this.__explicitlySet__.add("toleranceThresholdPerDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainBasedPatchingConfigs build() {
            DomainBasedPatchingConfigs model =
                    new DomainBasedPatchingConfigs(
                            this.waitTimeBetweenDomainInSeconds, this.toleranceThresholdPerDomain);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainBasedPatchingConfigs model) {
            if (model.wasPropertyExplicitlySet("waitTimeBetweenDomainInSeconds")) {
                this.waitTimeBetweenDomainInSeconds(model.getWaitTimeBetweenDomainInSeconds());
            }
            if (model.wasPropertyExplicitlySet("toleranceThresholdPerDomain")) {
                this.toleranceThresholdPerDomain(model.getToleranceThresholdPerDomain());
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

    @Deprecated
    public DomainBasedPatchingConfigs(
            Integer waitTimeBetweenDomainInSeconds, Integer toleranceThresholdPerDomain) {
        super();
        this.waitTimeBetweenDomainInSeconds = waitTimeBetweenDomainInSeconds;
        this.toleranceThresholdPerDomain = toleranceThresholdPerDomain;
    }

    /** The wait time between AD/FD in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenDomainInSeconds")
    private final Integer waitTimeBetweenDomainInSeconds;

    /**
     * The wait time between AD/FD in seconds.
     *
     * @return the value
     */
    public Integer getWaitTimeBetweenDomainInSeconds() {
        return waitTimeBetweenDomainInSeconds;
    }

    /**
     * Acceptable number of failed-to-be-patched nodes in each domain. The maximum number of
     * failed-to-patch nodes cannot exceed 20% of the number of nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("toleranceThresholdPerDomain")
    private final Integer toleranceThresholdPerDomain;

    /**
     * Acceptable number of failed-to-be-patched nodes in each domain. The maximum number of
     * failed-to-patch nodes cannot exceed 20% of the number of nodes.
     *
     * @return the value
     */
    public Integer getToleranceThresholdPerDomain() {
        return toleranceThresholdPerDomain;
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
        sb.append("DomainBasedPatchingConfigs(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", waitTimeBetweenDomainInSeconds=")
                .append(String.valueOf(this.waitTimeBetweenDomainInSeconds));
        sb.append(", toleranceThresholdPerDomain=")
                .append(String.valueOf(this.toleranceThresholdPerDomain));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DomainBasedPatchingConfigs)) {
            return false;
        }

        DomainBasedPatchingConfigs other = (DomainBasedPatchingConfigs) o;
        return java.util.Objects.equals(
                        this.waitTimeBetweenDomainInSeconds, other.waitTimeBetweenDomainInSeconds)
                && java.util.Objects.equals(
                        this.toleranceThresholdPerDomain, other.toleranceThresholdPerDomain)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.waitTimeBetweenDomainInSeconds == null
                                ? 43
                                : this.waitTimeBetweenDomainInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.toleranceThresholdPerDomain == null
                                ? 43
                                : this.toleranceThresholdPerDomain.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * This patching config will patch all nodes in one AD/FD at a time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DomainBasedOdhPatchingConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "patchingConfigStrategy"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DomainBasedOdhPatchingConfig extends OdhPatchingConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The wait time between AD/FD in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenDomainInSeconds")
        private Integer waitTimeBetweenDomainInSeconds;

        /**
         * The wait time between AD/FD in seconds.
         * @param waitTimeBetweenDomainInSeconds the value to set
         * @return this builder
         **/
        public Builder waitTimeBetweenDomainInSeconds(Integer waitTimeBetweenDomainInSeconds) {
            this.waitTimeBetweenDomainInSeconds = waitTimeBetweenDomainInSeconds;
            this.__explicitlySet__.add("waitTimeBetweenDomainInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainBasedOdhPatchingConfig build() {
            DomainBasedOdhPatchingConfig model =
                    new DomainBasedOdhPatchingConfig(this.waitTimeBetweenDomainInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainBasedOdhPatchingConfig model) {
            if (model.wasPropertyExplicitlySet("waitTimeBetweenDomainInSeconds")) {
                this.waitTimeBetweenDomainInSeconds(model.getWaitTimeBetweenDomainInSeconds());
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

    @Deprecated
    public DomainBasedOdhPatchingConfig(Integer waitTimeBetweenDomainInSeconds) {
        super();
        this.waitTimeBetweenDomainInSeconds = waitTimeBetweenDomainInSeconds;
    }

    /**
     * The wait time between AD/FD in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waitTimeBetweenDomainInSeconds")
    private final Integer waitTimeBetweenDomainInSeconds;

    /**
     * The wait time between AD/FD in seconds.
     * @return the value
     **/
    public Integer getWaitTimeBetweenDomainInSeconds() {
        return waitTimeBetweenDomainInSeconds;
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
        sb.append("DomainBasedOdhPatchingConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", waitTimeBetweenDomainInSeconds=")
                .append(String.valueOf(this.waitTimeBetweenDomainInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DomainBasedOdhPatchingConfig)) {
            return false;
        }

        DomainBasedOdhPatchingConfig other = (DomainBasedOdhPatchingConfig) o;
        return java.util.Objects.equals(
                        this.waitTimeBetweenDomainInSeconds, other.waitTimeBetweenDomainInSeconds)
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
        return result;
    }
}

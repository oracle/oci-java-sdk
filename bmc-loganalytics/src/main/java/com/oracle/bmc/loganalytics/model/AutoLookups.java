/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AutoLookups
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AutoLookups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutoLookups {
    @Deprecated
    @java.beans.ConstructorProperties({"canonicalLink", "totalCount"})
    public AutoLookups(String canonicalLink, Long totalCount) {
        super();
        this.canonicalLink = canonicalLink;
        this.totalCount = totalCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
        private String canonicalLink;

        public Builder canonicalLink(String canonicalLink) {
            this.canonicalLink = canonicalLink;
            this.__explicitlySet__.add("canonicalLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Long totalCount;

        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoLookups build() {
            AutoLookups __instance__ = new AutoLookups(canonicalLink, totalCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoLookups o) {
            Builder copiedBuilder =
                    canonicalLink(o.getCanonicalLink()).totalCount(o.getTotalCount());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The canonical link.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
    private final String canonicalLink;

    public String getCanonicalLink() {
        return canonicalLink;
    }

    /**
     * The total count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Long totalCount;

    public Long getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutoLookups(");
        sb.append("canonicalLink=").append(String.valueOf(this.canonicalLink));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoLookups)) {
            return false;
        }

        AutoLookups other = (AutoLookups) o;
        return java.util.Objects.equals(this.canonicalLink, other.canonicalLink)
                && java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canonicalLink == null ? 43 : this.canonicalLink.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

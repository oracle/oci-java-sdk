/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AutoLookups <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AutoLookups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AutoLookups extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"canonicalLink", "totalCount"})
    public AutoLookups(String canonicalLink, Long totalCount) {
        super();
        this.canonicalLink = canonicalLink;
        this.totalCount = totalCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The canonical link. */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
        private String canonicalLink;

        /**
         * The canonical link.
         *
         * @param canonicalLink the value to set
         * @return this builder
         */
        public Builder canonicalLink(String canonicalLink) {
            this.canonicalLink = canonicalLink;
            this.__explicitlySet__.add("canonicalLink");
            return this;
        }
        /** The total count. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Long totalCount;

        /**
         * The total count.
         *
         * @param totalCount the value to set
         * @return this builder
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoLookups build() {
            AutoLookups model = new AutoLookups(this.canonicalLink, this.totalCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoLookups model) {
            if (model.wasPropertyExplicitlySet("canonicalLink")) {
                this.canonicalLink(model.getCanonicalLink());
            }
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
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

    /** The canonical link. */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
    private final String canonicalLink;

    /**
     * The canonical link.
     *
     * @return the value
     */
    public String getCanonicalLink() {
        return canonicalLink;
    }

    /** The total count. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Long totalCount;

    /**
     * The total count.
     *
     * @return the value
     */
    public Long getTotalCount() {
        return totalCount;
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
        sb.append("AutoLookups(");
        sb.append("super=").append(super.toString());
        sb.append("canonicalLink=").append(String.valueOf(this.canonicalLink));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canonicalLink == null ? 43 : this.canonicalLink.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

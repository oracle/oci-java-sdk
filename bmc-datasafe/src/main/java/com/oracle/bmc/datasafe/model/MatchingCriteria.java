/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Criteria to either include or exclude target databases from the target database group. These
 * criteria can be based on compartments or tags or a list of target databases. See examples below
 * for more details. Include: Target databases will be added to the target database group if they
 * match at least one of the include criteria. Exclude: Target databases that will be excluded from
 * the target database group (even if they match any of the include criteria). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MatchingCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MatchingCriteria
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"include", "exclude"})
    public MatchingCriteria(Include include, Exclude exclude) {
        super();
        this.include = include;
        this.exclude = exclude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("include")
        private Include include;

        public Builder include(Include include) {
            this.include = include;
            this.__explicitlySet__.add("include");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exclude")
        private Exclude exclude;

        public Builder exclude(Exclude exclude) {
            this.exclude = exclude;
            this.__explicitlySet__.add("exclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MatchingCriteria build() {
            MatchingCriteria model = new MatchingCriteria(this.include, this.exclude);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MatchingCriteria model) {
            if (model.wasPropertyExplicitlySet("include")) {
                this.include(model.getInclude());
            }
            if (model.wasPropertyExplicitlySet("exclude")) {
                this.exclude(model.getExclude());
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

    @com.fasterxml.jackson.annotation.JsonProperty("include")
    private final Include include;

    public Include getInclude() {
        return include;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    private final Exclude exclude;

    public Exclude getExclude() {
        return exclude;
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
        sb.append("MatchingCriteria(");
        sb.append("super=").append(super.toString());
        sb.append("include=").append(String.valueOf(this.include));
        sb.append(", exclude=").append(String.valueOf(this.exclude));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchingCriteria)) {
            return false;
        }

        MatchingCriteria other = (MatchingCriteria) o;
        return java.util.Objects.equals(this.include, other.include)
                && java.util.Objects.equals(this.exclude, other.exclude)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.include == null ? 43 : this.include.hashCode());
        result = (result * PRIME) + (this.exclude == null ? 43 : this.exclude.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Optional pool-level launch override policy for future instance launches.
 *
 * <p>The policy is evaluated only after placement is resolved for a launch. In V1, provide between
 * 1 and 3 availability domain-scoped statements and no more than one statement for the same
 * availability domain.
 *
 * <p>For a matched availability domain, request order defines the canonical override candidate
 * sequence. Preferred-candidate reuse may try one current option once as a fast path. If that fast
 * path misses, canonical evaluation restarts from option 1. During canonical evaluation, the worker
 * advances to the next option only for {@code out-of-host-capacity}, {@code LimitExceeded}, and
 * {@code QuotaExceeded}, and only after same-option retries are exhausted. Other failures are
 * terminal for that launch attempt.
 *
 * <p>When used on create, omitting {@code overridePolicy} preserves the existing
 * base-plus-placement behavior. When used on update, omitting {@code overridePolicy} leaves the
 * stored policy unchanged, a non-null value replaces the stored policy, and {@code null} clears it.
 * Read surfaces omit {@code overridePolicy} when no policy is stored on the pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolLaunchOverridePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolLaunchOverridePolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"overrideStatements"})
    public InstancePoolLaunchOverridePolicy(
            java.util.List<InstancePoolLaunchOverrideStatement> overrideStatements) {
        super();
        this.overrideStatements = overrideStatements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ordered set of availability domain-scoped override statements for this policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("overrideStatements")
        private java.util.List<InstancePoolLaunchOverrideStatement> overrideStatements;

        /**
         * The ordered set of availability domain-scoped override statements for this policy.
         *
         * @param overrideStatements the value to set
         * @return this builder
         */
        public Builder overrideStatements(
                java.util.List<InstancePoolLaunchOverrideStatement> overrideStatements) {
            this.overrideStatements = overrideStatements;
            this.__explicitlySet__.add("overrideStatements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolLaunchOverridePolicy build() {
            InstancePoolLaunchOverridePolicy model =
                    new InstancePoolLaunchOverridePolicy(this.overrideStatements);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolLaunchOverridePolicy model) {
            if (model.wasPropertyExplicitlySet("overrideStatements")) {
                this.overrideStatements(model.getOverrideStatements());
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

    /** The ordered set of availability domain-scoped override statements for this policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("overrideStatements")
    private final java.util.List<InstancePoolLaunchOverrideStatement> overrideStatements;

    /**
     * The ordered set of availability domain-scoped override statements for this policy.
     *
     * @return the value
     */
    public java.util.List<InstancePoolLaunchOverrideStatement> getOverrideStatements() {
        return overrideStatements;
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
        sb.append("InstancePoolLaunchOverridePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("overrideStatements=").append(String.valueOf(this.overrideStatements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolLaunchOverridePolicy)) {
            return false;
        }

        InstancePoolLaunchOverridePolicy other = (InstancePoolLaunchOverridePolicy) o;
        return java.util.Objects.equals(this.overrideStatements, other.overrideStatements)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.overrideStatements == null
                                ? 43
                                : this.overrideStatements.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

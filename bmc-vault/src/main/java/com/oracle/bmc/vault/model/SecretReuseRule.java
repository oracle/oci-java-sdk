/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * A rule that disallows reuse of previously used secret content by the specified secret.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretReuseRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecretReuseRule extends SecretRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A property indicating whether the rule is applied even if the secret version with the content you are trying to reuse was deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedOnDeletedSecretVersions")
        private Boolean isEnforcedOnDeletedSecretVersions;

        /**
         * A property indicating whether the rule is applied even if the secret version with the content you are trying to reuse was deleted.
         *
         * @param isEnforcedOnDeletedSecretVersions the value to set
         * @return this builder
         **/
        public Builder isEnforcedOnDeletedSecretVersions(
                Boolean isEnforcedOnDeletedSecretVersions) {
            this.isEnforcedOnDeletedSecretVersions = isEnforcedOnDeletedSecretVersions;
            this.__explicitlySet__.add("isEnforcedOnDeletedSecretVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretReuseRule build() {
            SecretReuseRule model = new SecretReuseRule(this.isEnforcedOnDeletedSecretVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretReuseRule model) {
            if (model.wasPropertyExplicitlySet("isEnforcedOnDeletedSecretVersions")) {
                this.isEnforcedOnDeletedSecretVersions(
                        model.getIsEnforcedOnDeletedSecretVersions());
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
    public SecretReuseRule(Boolean isEnforcedOnDeletedSecretVersions) {
        super();
        this.isEnforcedOnDeletedSecretVersions = isEnforcedOnDeletedSecretVersions;
    }

    /**
     * A property indicating whether the rule is applied even if the secret version with the content you are trying to reuse was deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedOnDeletedSecretVersions")
    private final Boolean isEnforcedOnDeletedSecretVersions;

    /**
     * A property indicating whether the rule is applied even if the secret version with the content you are trying to reuse was deleted.
     *
     * @return the value
     **/
    public Boolean getIsEnforcedOnDeletedSecretVersions() {
        return isEnforcedOnDeletedSecretVersions;
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
        sb.append("SecretReuseRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isEnforcedOnDeletedSecretVersions=")
                .append(String.valueOf(this.isEnforcedOnDeletedSecretVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretReuseRule)) {
            return false;
        }

        SecretReuseRule other = (SecretReuseRule) o;
        return java.util.Objects.equals(
                        this.isEnforcedOnDeletedSecretVersions,
                        other.isEnforcedOnDeletedSecretVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isEnforcedOnDeletedSecretVersions == null
                                ? 43
                                : this.isEnforcedOnDeletedSecretVersions.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretReuseRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SecretReuseRule extends SecretRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedOnDeletedSecretVersions")
        private Boolean isEnforcedOnDeletedSecretVersions;

        public Builder isEnforcedOnDeletedSecretVersions(
                Boolean isEnforcedOnDeletedSecretVersions) {
            this.isEnforcedOnDeletedSecretVersions = isEnforcedOnDeletedSecretVersions;
            this.__explicitlySet__.add("isEnforcedOnDeletedSecretVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretReuseRule build() {
            SecretReuseRule __instance__ = new SecretReuseRule(isEnforcedOnDeletedSecretVersions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretReuseRule o) {
            Builder copiedBuilder =
                    isEnforcedOnDeletedSecretVersions(o.getIsEnforcedOnDeletedSecretVersions());

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
    Boolean isEnforcedOnDeletedSecretVersions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

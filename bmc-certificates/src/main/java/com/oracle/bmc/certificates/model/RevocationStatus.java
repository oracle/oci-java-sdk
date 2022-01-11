/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The current revocation status of the certificate or certificate authority (CA).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RevocationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RevocationStatus {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
        private java.util.Date timeRevoked;

        public Builder timeRevoked(java.util.Date timeRevoked) {
            this.timeRevoked = timeRevoked;
            this.__explicitlySet__.add("timeRevoked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
        private RevocationReason revocationReason;

        public Builder revocationReason(RevocationReason revocationReason) {
            this.revocationReason = revocationReason;
            this.__explicitlySet__.add("revocationReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RevocationStatus build() {
            RevocationStatus __instance__ = new RevocationStatus(timeRevoked, revocationReason);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevocationStatus o) {
            Builder copiedBuilder =
                    timeRevoked(o.getTimeRevoked()).revocationReason(o.getRevocationReason());

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

    /**
     * The time when the certificate or CA was revoked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
    java.util.Date timeRevoked;

    /**
     * The reason that the certificate or CA was revoked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
    RevocationReason revocationReason;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

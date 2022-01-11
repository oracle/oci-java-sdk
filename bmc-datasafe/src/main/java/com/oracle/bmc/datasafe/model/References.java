/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * References to the sections of STIG, CIS, and/or GDPR relevant to the current finding.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = References.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class References {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stig")
        private String stig;

        public Builder stig(String stig) {
            this.stig = stig;
            this.__explicitlySet__.add("stig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cis")
        private String cis;

        public Builder cis(String cis) {
            this.cis = cis;
            this.__explicitlySet__.add("cis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
        private String gdpr;

        public Builder gdpr(String gdpr) {
            this.gdpr = gdpr;
            this.__explicitlySet__.add("gdpr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public References build() {
            References __instance__ = new References(stig, cis, gdpr);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(References o) {
            Builder copiedBuilder = stig(o.getStig()).cis(o.getCis()).gdpr(o.getGdpr());

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
     * Relevant section from STIG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stig")
    String stig;

    /**
     * Relevant section from CIS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cis")
    String cis;

    /**
     * Relevant section from GDPR.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
    String gdpr;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Match criteria used in Decryption Rule used on the firewall policy rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DecryptionRuleMatchCriteria.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DecryptionRuleMatchCriteria {
    @Deprecated
    @java.beans.ConstructorProperties({"sources", "destinations"})
    public DecryptionRuleMatchCriteria(
            java.util.List<String> sources, java.util.List<String> destinations) {
        super();
        this.sources = sources;
        this.destinations = destinations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of IP address list names to be evaluated against the traffic source address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<String> sources;

        /**
         * An array of IP address list names to be evaluated against the traffic source address.
         * @param sources the value to set
         * @return this builder
         **/
        public Builder sources(java.util.List<String> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }
        /**
         * An array of IP address list names to be evaluated against the traffic destination address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<String> destinations;

        /**
         * An array of IP address list names to be evaluated against the traffic destination address.
         * @param destinations the value to set
         * @return this builder
         **/
        public Builder destinations(java.util.List<String> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DecryptionRuleMatchCriteria build() {
            DecryptionRuleMatchCriteria __instance__ =
                    new DecryptionRuleMatchCriteria(sources, destinations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptionRuleMatchCriteria o) {
            Builder copiedBuilder = sources(o.getSources()).destinations(o.getDestinations());

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
     * An array of IP address list names to be evaluated against the traffic source address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<String> sources;

    /**
     * An array of IP address list names to be evaluated against the traffic source address.
     * @return the value
     **/
    public java.util.List<String> getSources() {
        return sources;
    }

    /**
     * An array of IP address list names to be evaluated against the traffic destination address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<String> destinations;

    /**
     * An array of IP address list names to be evaluated against the traffic destination address.
     * @return the value
     **/
    public java.util.List<String> getDestinations() {
        return destinations;
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
        sb.append("DecryptionRuleMatchCriteria(");
        sb.append("sources=").append(String.valueOf(this.sources));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DecryptionRuleMatchCriteria)) {
            return false;
        }

        DecryptionRuleMatchCriteria other = (DecryptionRuleMatchCriteria) o;
        return java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
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

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Criteria to evaluate against network traffic.
 * A match occurs when at least one item in the array associated with each specified property corresponds with the relevant aspect of the traffic.
 *
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
    builder = SecurityRuleMatchCriteria.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityRuleMatchCriteria
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sources", "destinations", "applications", "urls"})
    public SecurityRuleMatchCriteria(
            java.util.List<String> sources,
            java.util.List<String> destinations,
            java.util.List<String> applications,
            java.util.List<String> urls) {
        super();
        this.sources = sources;
        this.destinations = destinations;
        this.applications = applications;
        this.urls = urls;
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
        /**
         * An array of application list names to be evaluated against the traffic protocol and protocol-specific parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applications")
        private java.util.List<String> applications;

        /**
         * An array of application list names to be evaluated against the traffic protocol and protocol-specific parameters.
         * @param applications the value to set
         * @return this builder
         **/
        public Builder applications(java.util.List<String> applications) {
            this.applications = applications;
            this.__explicitlySet__.add("applications");
            return this;
        }
        /**
         * An array of URL pattern list names to be evaluated against the HTTP(S) request target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("urls")
        private java.util.List<String> urls;

        /**
         * An array of URL pattern list names to be evaluated against the HTTP(S) request target.
         * @param urls the value to set
         * @return this builder
         **/
        public Builder urls(java.util.List<String> urls) {
            this.urls = urls;
            this.__explicitlySet__.add("urls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityRuleMatchCriteria build() {
            SecurityRuleMatchCriteria model =
                    new SecurityRuleMatchCriteria(
                            this.sources, this.destinations, this.applications, this.urls);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityRuleMatchCriteria model) {
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
            }
            if (model.wasPropertyExplicitlySet("destinations")) {
                this.destinations(model.getDestinations());
            }
            if (model.wasPropertyExplicitlySet("applications")) {
                this.applications(model.getApplications());
            }
            if (model.wasPropertyExplicitlySet("urls")) {
                this.urls(model.getUrls());
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

    /**
     * An array of application list names to be evaluated against the traffic protocol and protocol-specific parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applications")
    private final java.util.List<String> applications;

    /**
     * An array of application list names to be evaluated against the traffic protocol and protocol-specific parameters.
     * @return the value
     **/
    public java.util.List<String> getApplications() {
        return applications;
    }

    /**
     * An array of URL pattern list names to be evaluated against the HTTP(S) request target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urls")
    private final java.util.List<String> urls;

    /**
     * An array of URL pattern list names to be evaluated against the HTTP(S) request target.
     * @return the value
     **/
    public java.util.List<String> getUrls() {
        return urls;
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
        sb.append("SecurityRuleMatchCriteria(");
        sb.append("super=").append(super.toString());
        sb.append("sources=").append(String.valueOf(this.sources));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(", applications=").append(String.valueOf(this.applications));
        sb.append(", urls=").append(String.valueOf(this.urls));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityRuleMatchCriteria)) {
            return false;
        }

        SecurityRuleMatchCriteria other = (SecurityRuleMatchCriteria) o;
        return java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && java.util.Objects.equals(this.applications, other.applications)
                && java.util.Objects.equals(this.urls, other.urls)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        result = (result * PRIME) + (this.applications == null ? 43 : this.applications.hashCode());
        result = (result * PRIME) + (this.urls == null ? 43 : this.urls.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

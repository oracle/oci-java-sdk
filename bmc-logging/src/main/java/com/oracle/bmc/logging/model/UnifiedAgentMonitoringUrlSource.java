/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Kubernetes source object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentMonitoringUrlSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentMonitoringUrlSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "scrapeTargets"})
    public UnifiedAgentMonitoringUrlSource(
            String name, java.util.List<UnifiedAgentUrlScrapeTarget> scrapeTargets) {
        super();
        this.name = name;
        this.scrapeTargets = scrapeTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique name for the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name for the source.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** List of UnifiedAgentKubernetesScrapeTarget. */
        @com.fasterxml.jackson.annotation.JsonProperty("scrapeTargets")
        private java.util.List<UnifiedAgentUrlScrapeTarget> scrapeTargets;

        /**
         * List of UnifiedAgentKubernetesScrapeTarget.
         *
         * @param scrapeTargets the value to set
         * @return this builder
         */
        public Builder scrapeTargets(java.util.List<UnifiedAgentUrlScrapeTarget> scrapeTargets) {
            this.scrapeTargets = scrapeTargets;
            this.__explicitlySet__.add("scrapeTargets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMonitoringUrlSource build() {
            UnifiedAgentMonitoringUrlSource model =
                    new UnifiedAgentMonitoringUrlSource(this.name, this.scrapeTargets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMonitoringUrlSource model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("scrapeTargets")) {
                this.scrapeTargets(model.getScrapeTargets());
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

    /** Unique name for the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name for the source.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** List of UnifiedAgentKubernetesScrapeTarget. */
    @com.fasterxml.jackson.annotation.JsonProperty("scrapeTargets")
    private final java.util.List<UnifiedAgentUrlScrapeTarget> scrapeTargets;

    /**
     * List of UnifiedAgentKubernetesScrapeTarget.
     *
     * @return the value
     */
    public java.util.List<UnifiedAgentUrlScrapeTarget> getScrapeTargets() {
        return scrapeTargets;
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
        sb.append("UnifiedAgentMonitoringUrlSource(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", scrapeTargets=").append(String.valueOf(this.scrapeTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentMonitoringUrlSource)) {
            return false;
        }

        UnifiedAgentMonitoringUrlSource other = (UnifiedAgentMonitoringUrlSource) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.scrapeTargets, other.scrapeTargets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.scrapeTargets == null ? 43 : this.scrapeTargets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

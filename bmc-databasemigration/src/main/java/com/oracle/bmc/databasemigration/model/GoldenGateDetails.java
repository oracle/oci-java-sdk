/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate Microservices.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GoldenGateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GoldenGateDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"hub", "settings"})
    public GoldenGateDetails(GoldenGateHub hub, GoldenGateSettings settings) {
        super();
        this.hub = hub;
        this.settings = settings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("hub")
        private GoldenGateHub hub;

        public Builder hub(GoldenGateHub hub) {
            this.hub = hub;
            this.__explicitlySet__.add("hub");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("settings")
        private GoldenGateSettings settings;

        public Builder settings(GoldenGateSettings settings) {
            this.settings = settings;
            this.__explicitlySet__.add("settings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GoldenGateDetails build() {
            GoldenGateDetails __instance__ = new GoldenGateDetails(hub, settings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GoldenGateDetails o) {
            Builder copiedBuilder = hub(o.getHub()).settings(o.getSettings());

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

    @com.fasterxml.jackson.annotation.JsonProperty("hub")
    private final GoldenGateHub hub;

    public GoldenGateHub getHub() {
        return hub;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("settings")
    private final GoldenGateSettings settings;

    public GoldenGateSettings getSettings() {
        return settings;
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
        sb.append("GoldenGateDetails(");
        sb.append("hub=").append(String.valueOf(this.hub));
        sb.append(", settings=").append(String.valueOf(this.settings));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoldenGateDetails)) {
            return false;
        }

        GoldenGateDetails other = (GoldenGateDetails) o;
        return java.util.Objects.equals(this.hub, other.hub)
                && java.util.Objects.equals(this.settings, other.settings)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hub == null ? 43 : this.hub.hashCode());
        result = (result * PRIME) + (this.settings == null ? 43 : this.settings.hashCode());
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

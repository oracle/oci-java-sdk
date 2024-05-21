/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about Oracle GoldenGate Microservices. Required for online logical migration.
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
    builder = CreateGoldenGateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGoldenGateDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hub", "settings"})
    public CreateGoldenGateDetails(CreateGoldenGateHub hub, CreateGoldenGateSettings settings) {
        super();
        this.hub = hub;
        this.settings = settings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("hub")
        private CreateGoldenGateHub hub;

        public Builder hub(CreateGoldenGateHub hub) {
            this.hub = hub;
            this.__explicitlySet__.add("hub");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("settings")
        private CreateGoldenGateSettings settings;

        public Builder settings(CreateGoldenGateSettings settings) {
            this.settings = settings;
            this.__explicitlySet__.add("settings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGoldenGateDetails build() {
            CreateGoldenGateDetails model = new CreateGoldenGateDetails(this.hub, this.settings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGoldenGateDetails model) {
            if (model.wasPropertyExplicitlySet("hub")) {
                this.hub(model.getHub());
            }
            if (model.wasPropertyExplicitlySet("settings")) {
                this.settings(model.getSettings());
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

    @com.fasterxml.jackson.annotation.JsonProperty("hub")
    private final CreateGoldenGateHub hub;

    public CreateGoldenGateHub getHub() {
        return hub;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("settings")
    private final CreateGoldenGateSettings settings;

    public CreateGoldenGateSettings getSettings() {
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
        sb.append("CreateGoldenGateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hub=").append(String.valueOf(this.hub));
        sb.append(", settings=").append(String.valueOf(this.settings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGoldenGateDetails)) {
            return false;
        }

        CreateGoldenGateDetails other = (CreateGoldenGateDetails) o;
        return java.util.Objects.equals(this.hub, other.hub)
                && java.util.Objects.equals(this.settings, other.settings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hub == null ? 43 : this.hub.hashCode());
        result = (result * PRIME) + (this.settings == null ? 43 : this.settings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

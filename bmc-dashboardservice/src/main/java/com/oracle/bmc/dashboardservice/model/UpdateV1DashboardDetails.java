/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.model;

/**
 * Details for updating a version 1 dashboard. The interpretation of the {@code config} and {@code
 * widgets} fields depends on the runtime behavior of the Oracle Cloud Infrastructure Console. The
 * sum of the {@code config} and {@code widget} fields JSON text representation cannot exceed 200
 * KB. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateV1DashboardDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "schemaVersion")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateV1DashboardDetails extends UpdateDashboardDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The layout and widget placement for the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private Object config;

        /**
         * The layout and widget placement for the dashboard.
         *
         * @param config the value to set
         * @return this builder
         */
        public Builder config(Object config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }
        /** The basic visualization building blocks of a dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("widgets")
        private java.util.List<Object> widgets;

        /**
         * The basic visualization building blocks of a dashboard.
         *
         * @param widgets the value to set
         * @return this builder
         */
        public Builder widgets(java.util.List<Object> widgets) {
            this.widgets = widgets;
            this.__explicitlySet__.add("widgets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateV1DashboardDetails build() {
            UpdateV1DashboardDetails model =
                    new UpdateV1DashboardDetails(
                            this.displayName,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.config,
                            this.widgets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateV1DashboardDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("widgets")) {
                this.widgets(model.getWidgets());
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

    @Deprecated
    public UpdateV1DashboardDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Object config,
            java.util.List<Object> widgets) {
        super(displayName, description, freeformTags, definedTags);
        this.config = config;
        this.widgets = widgets;
    }

    /** The layout and widget placement for the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final Object config;

    /**
     * The layout and widget placement for the dashboard.
     *
     * @return the value
     */
    public Object getConfig() {
        return config;
    }

    /** The basic visualization building blocks of a dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("widgets")
    private final java.util.List<Object> widgets;

    /**
     * The basic visualization building blocks of a dashboard.
     *
     * @return the value
     */
    public java.util.List<Object> getWidgets() {
        return widgets;
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
        sb.append("UpdateV1DashboardDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", widgets=").append(String.valueOf(this.widgets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateV1DashboardDetails)) {
            return false;
        }

        UpdateV1DashboardDetails other = (UpdateV1DashboardDetails) o;
        return java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.widgets, other.widgets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.widgets == null ? 43 : this.widgets.hashCode());
        return result;
    }
}

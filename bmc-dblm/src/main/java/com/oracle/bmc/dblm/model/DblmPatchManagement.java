/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Description of PatchManagement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DblmPatchManagement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DblmPatchManagement
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "resources",
        "message",
        "timeEnabled",
        "lifecycleState",
        "patchOperationsSummary",
        "imagesPatchRecommendationSummary",
        "resourcesPatchComplianceSummary",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DblmPatchManagement(
            String compartmentId,
            java.util.List<ResourceInfo> resources,
            String message,
            java.util.Date timeEnabled,
            LifecycleState lifecycleState,
            Object patchOperationsSummary,
            Object imagesPatchRecommendationSummary,
            Object resourcesPatchComplianceSummary,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.compartmentId = compartmentId;
        this.resources = resources;
        this.message = message;
        this.timeEnabled = timeEnabled;
        this.lifecycleState = lifecycleState;
        this.patchOperationsSummary = patchOperationsSummary;
        this.imagesPatchRecommendationSummary = imagesPatchRecommendationSummary;
        this.resourcesPatchComplianceSummary = resourcesPatchComplianceSummary;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** resources objects */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<ResourceInfo> resources;

        /**
         * resources objects
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<ResourceInfo> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /** A message describing the status of the feature's state */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A message describing the status of the feature's state
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The time the Vulnerability was enabled. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
        private java.util.Date timeEnabled;

        /**
         * The time the Vulnerability was enabled. An RFC3339 formatted datetime string.
         *
         * @param timeEnabled the value to set
         * @return this builder
         */
        public Builder timeEnabled(java.util.Date timeEnabled) {
            this.timeEnabled = timeEnabled;
            this.__explicitlySet__.add("timeEnabled");
            return this;
        }
        /** The current state of the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the feature.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Summary of patch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchOperationsSummary")
        private Object patchOperationsSummary;

        /**
         * Summary of patch operations.
         *
         * @param patchOperationsSummary the value to set
         * @return this builder
         */
        public Builder patchOperationsSummary(Object patchOperationsSummary) {
            this.patchOperationsSummary = patchOperationsSummary;
            this.__explicitlySet__.add("patchOperationsSummary");
            return this;
        }
        /** Summary of image patches recommended to install. */
        @com.fasterxml.jackson.annotation.JsonProperty("imagesPatchRecommendationSummary")
        private Object imagesPatchRecommendationSummary;

        /**
         * Summary of image patches recommended to install.
         *
         * @param imagesPatchRecommendationSummary the value to set
         * @return this builder
         */
        public Builder imagesPatchRecommendationSummary(Object imagesPatchRecommendationSummary) {
            this.imagesPatchRecommendationSummary = imagesPatchRecommendationSummary;
            this.__explicitlySet__.add("imagesPatchRecommendationSummary");
            return this;
        }
        /** Summary of image patches to be compliant to install. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcesPatchComplianceSummary")
        private Object resourcesPatchComplianceSummary;

        /**
         * Summary of image patches to be compliant to install.
         *
         * @param resourcesPatchComplianceSummary the value to set
         * @return this builder
         */
        public Builder resourcesPatchComplianceSummary(Object resourcesPatchComplianceSummary) {
            this.resourcesPatchComplianceSummary = resourcesPatchComplianceSummary;
            this.__explicitlySet__.add("resourcesPatchComplianceSummary");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DblmPatchManagement build() {
            DblmPatchManagement model =
                    new DblmPatchManagement(
                            this.compartmentId,
                            this.resources,
                            this.message,
                            this.timeEnabled,
                            this.lifecycleState,
                            this.patchOperationsSummary,
                            this.imagesPatchRecommendationSummary,
                            this.resourcesPatchComplianceSummary,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DblmPatchManagement model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("timeEnabled")) {
                this.timeEnabled(model.getTimeEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("patchOperationsSummary")) {
                this.patchOperationsSummary(model.getPatchOperationsSummary());
            }
            if (model.wasPropertyExplicitlySet("imagesPatchRecommendationSummary")) {
                this.imagesPatchRecommendationSummary(model.getImagesPatchRecommendationSummary());
            }
            if (model.wasPropertyExplicitlySet("resourcesPatchComplianceSummary")) {
                this.resourcesPatchComplianceSummary(model.getResourcesPatchComplianceSummary());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** resources objects */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<ResourceInfo> resources;

    /**
     * resources objects
     *
     * @return the value
     */
    public java.util.List<ResourceInfo> getResources() {
        return resources;
    }

    /** A message describing the status of the feature's state */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A message describing the status of the feature's state
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The time the Vulnerability was enabled. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnabled")
    private final java.util.Date timeEnabled;

    /**
     * The time the Vulnerability was enabled. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEnabled() {
        return timeEnabled;
    }

    /** The current state of the feature. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Failed("FAILED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the feature.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Summary of patch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchOperationsSummary")
    private final Object patchOperationsSummary;

    /**
     * Summary of patch operations.
     *
     * @return the value
     */
    public Object getPatchOperationsSummary() {
        return patchOperationsSummary;
    }

    /** Summary of image patches recommended to install. */
    @com.fasterxml.jackson.annotation.JsonProperty("imagesPatchRecommendationSummary")
    private final Object imagesPatchRecommendationSummary;

    /**
     * Summary of image patches recommended to install.
     *
     * @return the value
     */
    public Object getImagesPatchRecommendationSummary() {
        return imagesPatchRecommendationSummary;
    }

    /** Summary of image patches to be compliant to install. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcesPatchComplianceSummary")
    private final Object resourcesPatchComplianceSummary;

    /**
     * Summary of image patches to be compliant to install.
     *
     * @return the value
     */
    public Object getResourcesPatchComplianceSummary() {
        return resourcesPatchComplianceSummary;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("DblmPatchManagement(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timeEnabled=").append(String.valueOf(this.timeEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", patchOperationsSummary=").append(String.valueOf(this.patchOperationsSummary));
        sb.append(", imagesPatchRecommendationSummary=")
                .append(String.valueOf(this.imagesPatchRecommendationSummary));
        sb.append(", resourcesPatchComplianceSummary=")
                .append(String.valueOf(this.resourcesPatchComplianceSummary));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DblmPatchManagement)) {
            return false;
        }

        DblmPatchManagement other = (DblmPatchManagement) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timeEnabled, other.timeEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.patchOperationsSummary, other.patchOperationsSummary)
                && java.util.Objects.equals(
                        this.imagesPatchRecommendationSummary,
                        other.imagesPatchRecommendationSummary)
                && java.util.Objects.equals(
                        this.resourcesPatchComplianceSummary, other.resourcesPatchComplianceSummary)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timeEnabled == null ? 43 : this.timeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.patchOperationsSummary == null
                                ? 43
                                : this.patchOperationsSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.imagesPatchRecommendationSummary == null
                                ? 43
                                : this.imagesPatchRecommendationSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcesPatchComplianceSummary == null
                                ? 43
                                : this.resourcesPatchComplianceSummary.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

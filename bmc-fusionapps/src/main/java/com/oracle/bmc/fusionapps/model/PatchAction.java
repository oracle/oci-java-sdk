/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Monthly patch details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("referenceKey")
        private String referenceKey;

        public Builder referenceKey(String referenceKey) {
            this.referenceKey = referenceKey;
            this.__explicitlySet__.add("referenceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A string that describes whether the change is applied hot or cold */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * A string that describes whether the change is applied hot or cold
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** patch artifact category */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * patch artifact category
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** patch bundle name */
        @com.fasterxml.jackson.annotation.JsonProperty("artifact")
        private String artifact;

        /**
         * patch bundle name
         *
         * @param artifact the value to set
         * @return this builder
         */
        public Builder artifact(String artifact) {
            this.artifact = artifact;
            this.__explicitlySet__.add("artifact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchAction build() {
            PatchAction model =
                    new PatchAction(
                            this.referenceKey,
                            this.state,
                            this.description,
                            this.mode,
                            this.category,
                            this.artifact);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchAction model) {
            if (model.wasPropertyExplicitlySet("referenceKey")) {
                this.referenceKey(model.getReferenceKey());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("artifact")) {
                this.artifact(model.getArtifact());
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
    public PatchAction(
            String referenceKey,
            State state,
            String description,
            Mode mode,
            Category category,
            String artifact) {
        super(referenceKey, state, description);
        this.mode = mode;
        this.category = category;
        this.artifact = artifact;
    }

    /** A string that describes whether the change is applied hot or cold */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Hot("HOT"),
        Cold("COLD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** A string that describes whether the change is applied hot or cold */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * A string that describes whether the change is applied hot or cold
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
    }

    /** patch artifact category */
    public enum Category implements com.oracle.bmc.http.internal.BmcEnum {
        Monthly("MONTHLY"),
        Weekly("WEEKLY"),
        Oneoff("ONEOFF"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** patch artifact category */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * patch artifact category
     *
     * @return the value
     */
    public Category getCategory() {
        return category;
    }

    /** patch bundle name */
    @com.fasterxml.jackson.annotation.JsonProperty("artifact")
    private final String artifact;

    /**
     * patch bundle name
     *
     * @return the value
     */
    public String getArtifact() {
        return artifact;
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
        sb.append("PatchAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", artifact=").append(String.valueOf(this.artifact));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchAction)) {
            return false;
        }

        PatchAction other = (PatchAction) o;
        return java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.artifact, other.artifact)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.artifact == null ? 43 : this.artifact.hashCode());
        return result;
    }
}

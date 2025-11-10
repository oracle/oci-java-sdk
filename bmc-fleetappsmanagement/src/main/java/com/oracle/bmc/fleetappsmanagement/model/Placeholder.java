/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Place Holder. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Placeholder.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Placeholder extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName", "key", "placeholder"})
    public Placeholder(String stepName, String key, String placeholder) {
        super();
        this.stepName = stepName;
        this.key = key;
        this.placeholder = placeholder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Step name for placeholder. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Step name for placeholder.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** key for placeholder. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * key for placeholder.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** placeholder value . */
        @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
        private String placeholder;

        /**
         * placeholder value .
         *
         * @param placeholder the value to set
         * @return this builder
         */
        public Builder placeholder(String placeholder) {
            this.placeholder = placeholder;
            this.__explicitlySet__.add("placeholder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Placeholder build() {
            Placeholder model = new Placeholder(this.stepName, this.key, this.placeholder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Placeholder model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("placeholder")) {
                this.placeholder(model.getPlaceholder());
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

    /** Step name for placeholder. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Step name for placeholder.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** key for placeholder. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * key for placeholder.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** placeholder value . */
    @com.fasterxml.jackson.annotation.JsonProperty("placeholder")
    private final String placeholder;

    /**
     * placeholder value .
     *
     * @return the value
     */
    public String getPlaceholder() {
        return placeholder;
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
        sb.append("Placeholder(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", placeholder=").append(String.valueOf(this.placeholder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Placeholder)) {
            return false;
        }

        Placeholder other = (Placeholder) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.placeholder, other.placeholder)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.placeholder == null ? 43 : this.placeholder.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

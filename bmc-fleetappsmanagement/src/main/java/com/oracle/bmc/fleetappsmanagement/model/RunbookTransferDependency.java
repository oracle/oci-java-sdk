/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook transfer dependency. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookTransferDependency.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookTransferDependency
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"prompt", "placeholders", "associationsFound"})
    public RunbookTransferDependency(
            Prompt prompt,
            java.util.List<Placeholder> placeholders,
            java.util.List<Association> associationsFound) {
        super();
        this.prompt = prompt;
        this.placeholders = placeholders;
        this.associationsFound = associationsFound;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("prompt")
        private Prompt prompt;

        public Builder prompt(Prompt prompt) {
            this.prompt = prompt;
            this.__explicitlySet__.add("prompt");
            return this;
        }
        /** List of placeholders. */
        @com.fasterxml.jackson.annotation.JsonProperty("placeholders")
        private java.util.List<Placeholder> placeholders;

        /**
         * List of placeholders.
         *
         * @param placeholders the value to set
         * @return this builder
         */
        public Builder placeholders(java.util.List<Placeholder> placeholders) {
            this.placeholders = placeholders;
            this.__explicitlySet__.add("placeholders");
            return this;
        }
        /** List of associations found. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationsFound")
        private java.util.List<Association> associationsFound;

        /**
         * List of associations found.
         *
         * @param associationsFound the value to set
         * @return this builder
         */
        public Builder associationsFound(java.util.List<Association> associationsFound) {
            this.associationsFound = associationsFound;
            this.__explicitlySet__.add("associationsFound");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookTransferDependency build() {
            RunbookTransferDependency model =
                    new RunbookTransferDependency(
                            this.prompt, this.placeholders, this.associationsFound);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookTransferDependency model) {
            if (model.wasPropertyExplicitlySet("prompt")) {
                this.prompt(model.getPrompt());
            }
            if (model.wasPropertyExplicitlySet("placeholders")) {
                this.placeholders(model.getPlaceholders());
            }
            if (model.wasPropertyExplicitlySet("associationsFound")) {
                this.associationsFound(model.getAssociationsFound());
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

    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final Prompt prompt;

    public Prompt getPrompt() {
        return prompt;
    }

    /** List of placeholders. */
    @com.fasterxml.jackson.annotation.JsonProperty("placeholders")
    private final java.util.List<Placeholder> placeholders;

    /**
     * List of placeholders.
     *
     * @return the value
     */
    public java.util.List<Placeholder> getPlaceholders() {
        return placeholders;
    }

    /** List of associations found. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationsFound")
    private final java.util.List<Association> associationsFound;

    /**
     * List of associations found.
     *
     * @return the value
     */
    public java.util.List<Association> getAssociationsFound() {
        return associationsFound;
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
        sb.append("RunbookTransferDependency(");
        sb.append("super=").append(super.toString());
        sb.append("prompt=").append(String.valueOf(this.prompt));
        sb.append(", placeholders=").append(String.valueOf(this.placeholders));
        sb.append(", associationsFound=").append(String.valueOf(this.associationsFound));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookTransferDependency)) {
            return false;
        }

        RunbookTransferDependency other = (RunbookTransferDependency) o;
        return java.util.Objects.equals(this.prompt, other.prompt)
                && java.util.Objects.equals(this.placeholders, other.placeholders)
                && java.util.Objects.equals(this.associationsFound, other.associationsFound)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        result = (result * PRIME) + (this.placeholders == null ? 43 : this.placeholders.hashCode());
        result =
                (result * PRIME)
                        + (this.associationsFound == null ? 43 : this.associationsFound.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
